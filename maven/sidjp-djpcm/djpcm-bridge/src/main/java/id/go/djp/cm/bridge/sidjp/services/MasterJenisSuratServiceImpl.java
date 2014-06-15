package id.go.djp.cm.bridge.sidjp.services;

import id.go.djp.cm.bridge.sidjp.common.CommonServicesImpl;
import id.go.djp.cm.bridge.sidjp.mapper.MasterJenisSuratMapper;
import id.go.djp.cm.bridge.sidjp.model.MasterJenisPemeriksaanExample;
import id.go.djp.cm.bridge.sidjp.model.MasterJenisSuratExample;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.PostConstruct;
import javax.ws.rs.Path;
import java.math.BigDecimal;

/**
 * Created with IntelliJ IDEA.
 * User: Josescalia
 * Date: 11/1/13
 * Time: 10:19 AM
 * To change this template use File | Settings | File Templates.
 */
@Path("masterJenisSurat")
public class MasterJenisSuratServiceImpl extends CommonServicesImpl<MasterJenisSuratExample,BigDecimal> {

    public MasterJenisSuratServiceImpl() {
        setClazz(MasterJenisSuratExample.class);
    }

    @Autowired
    MasterJenisSuratMapper mapper;

    @PostConstruct
    public void construct() {
        setCommonMapper(mapper);
    }
}
