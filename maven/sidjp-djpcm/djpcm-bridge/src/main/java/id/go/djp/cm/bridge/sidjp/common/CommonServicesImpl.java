package id.go.djp.cm.bridge.sidjp.common;

import id.go.djp.cm.bridge.sidjp.mapper.CommonMapper;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import org.apache.log4j.Logger;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.lang.reflect.Field;
import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * Created with IntelliJ IDEA.
 * User: Josescalia
 * Date: 10/31/13
 * Time: 2:22 PM
 * To change this template use File | Settings | File Templates.
 */
public abstract class CommonServicesImpl<T, PK> implements CommonService<T, PK> {

    static Logger logger = Logger.getLogger(CommonServicesImpl.class.getName());

    private CommonMapper commonMapper;
    private Class<T> clazz;

    public void setClazz(final Class<T> classToSet) {
        clazz = classToSet;

    }

    public void setCommonMapper(CommonMapper commonMapper) {
        this.commonMapper = commonMapper;
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("count")
    public String getNum() {
        logger.info("getNumInvoked");
        int jumlahJenisPeriksa = 0;
        try {
            T t = clazz.newInstance();
            jumlahJenisPeriksa = commonMapper.countByExample(t);
        } catch (Exception e) {
            e.printStackTrace();
        }

        Map map = new HashMap();
        map.put("count", jumlahJenisPeriksa);
        JSONObject jsonObject = JSONObject.fromObject(map);
        return jsonObject.toString();
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("get")
    public String getList() {
        //TODO: harus bisa di filter via url contoh:id=22&type=content dan lain-lain
        logger.info("getList Invoked");
        List<T> rResult = new ArrayList<T>();
        try {
            T t = clazz.newInstance();
            /*System.out.println("Filtered By : " + filteredBy);
            if (filteredBy != null) {
                t = constructFilter(filteredBy, clazz);
            }*/
            rResult = commonMapper.selectByExample(t);
        } catch (Exception e) {
            e.printStackTrace();
        }
        JSONArray jsonArray = JSONArray.fromObject(rResult);

        return jsonArray.toString();
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("get/{id}")
    public String getById(@PathParam("id") PK pk) {
        logger.info("getById Invoked");
        T result = null;
        try {
            result = (T) commonMapper.selectByPrimaryKey(pk);
        } catch (Exception e) {
            e.printStackTrace();
        }
        JSONObject jsonObject = JSONObject.fromObject(result);

        return jsonObject.toString();
    }


    private T constructFilter(String filtered, Class<T> classModel) throws ParseException {
        Map<String, Object> filter = new HashMap<String, Object>();
        String[] filterArr = filtered.split("&");
        if (filterArr.length > 1) {
            for (int i = 0; i < filterArr.length; i++) {
                String[] sArr = filterArr[i].split("=");
                filter.put(sArr[0], sArr[1]);
            }
        }else{
            String[] sArr = filtered.split("=");
            filter.put(sArr[0], sArr[1]);
        }


        try {
            T model = clazz.newInstance();
            for (Map.Entry<String, Object> entry : filter.entrySet()) {
                String fieldName = entry.getKey();
                Object fieldValue = entry.getValue();
                for (Field field : classModel.getDeclaredFields()) {
                    field.setAccessible(true);
                    if (field.getName().equals(fieldName)) {
                        if (field.getType().equals(Integer.class)) {
                            field.set(model, fieldValue);
                        } else if (field.getType().equals(Date.class)) {
                            field.set(model, new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(fieldValue.toString()));
                        } else if (field.getType().equals(String.class)) {
                            field.set(model, fieldValue);
                        } else if (field.getType().equals(BigDecimal.class)) {
                            field.set(model, fieldValue);
                        } else if (field.getType().equals(Long.class)) {
                            field.set(model, fieldValue);
                        } else {
                            field.set(model, fieldValue);
                        }
                    }
                }

            }
            return model;
        } catch (InstantiationException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
            return null;
        } catch (IllegalAccessException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
            return null;
        }

    }
}
