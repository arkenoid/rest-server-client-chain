package id.go.djp.cm.bridge.sidjp.services;

import id.go.djp.cm.bridge.sidjp.common.CommonService;
import id.go.djp.cm.bridge.sidjp.common.CommonServicesImpl;
import id.go.djp.cm.bridge.sidjp.mapper.MasterJenisPemeriksaanMapper;
import id.go.djp.cm.bridge.sidjp.model.MasterJenisPemeriksaanExample;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.PostConstruct;
import javax.ws.rs.Path;
import java.math.BigDecimal;

/**
 * Created with IntelliJ IDEA.
 * User: Josescalia
 * Date: 10/31/13
 * Time: 2:26 PM
 * To change this template use File | Settings | File Templates.
 */
@Path("masterJenisPemeriksaan")
public class MasterJenisPemeriksaanServiceImpl extends CommonServicesImpl<MasterJenisPemeriksaanExample,BigDecimal> {

//    public MasterJenisPemeriksaanServiceImpl() {
//        setClazz(MasterJenisPemeriksaanExample.class);
//    }
//
//    @Autowired
//    MasterJenisPemeriksaanMapper mapper;
//
//    @PostConstruct
//    public void construct() {
//        setCommonMapper(mapper);
//    }

}
