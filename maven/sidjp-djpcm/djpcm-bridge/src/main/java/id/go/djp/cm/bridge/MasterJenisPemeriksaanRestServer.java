package id.go.djp.cm.bridge;

import id.go.djp.cm.bridge.sidjp.mapper.MasterJenisPemeriksaanMapper;
import id.go.djp.cm.bridge.sidjp.model.MasterJenisPemeriksaan;
import id.go.djp.cm.bridge.sidjp.model.MasterJenisPemeriksaanExample;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: Josescalia
 * Date: 11/19/13
 * Time: 11:37 AM
 * To change this template use File | Settings | File Templates.
 */
@Path("jenisPemeriksaan")
public class MasterJenisPemeriksaanRestServer {
    @Autowired
    private MasterJenisPemeriksaanMapper masterJenisPemeriksaanMapper;

    @GET
    @Path("count")
    @Produces(MediaType.APPLICATION_JSON)
    public String count() {
        MasterJenisPemeriksaanExample example = new MasterJenisPemeriksaanExample();
        int jumlahJenisPeriksa =  masterJenisPemeriksaanMapper.countByExample(example);

        Map map = new HashMap();
        map.put("jumlahJenisPeriksa", jumlahJenisPeriksa);

        JSONObject jsonObject = JSONObject.fromObject( map );

        return jsonObject.toString();
    }

    @GET
    @Path("/")
    @Produces(MediaType.APPLICATION_JSON)
    public String getList() {
        MasterJenisPemeriksaanExample example = new MasterJenisPemeriksaanExample();
        List<MasterJenisPemeriksaan> listJenisPeriksa =  masterJenisPemeriksaanMapper.selectByExample(example);

        JSONArray jsonArray = JSONArray.fromObject( listJenisPeriksa );

        return "{\"dataList\":" + jsonArray.toString() +"}";
    }

    @GET
    @Path("{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public String getById(@PathParam("id") BigDecimal id) {
        MasterJenisPemeriksaanExample example = new MasterJenisPemeriksaanExample();
        example.createCriteria().andIdEqualTo(id);
        List<MasterJenisPemeriksaan> listJenisPeriksa =  masterJenisPemeriksaanMapper.selectByExample(example);
        //List<MasterJenisPemeriksaan> listJenisPeriksa =  masterJenisPemeriksaanMapper.selectByPrimaryKey(example);

        JSONArray jsonArray = JSONArray.fromObject( listJenisPeriksa );

        return jsonArray.toString();
    }
}
