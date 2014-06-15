package id.go.djp.cm.bridge;

import id.go.djp.cm.bridge.sidjp.mapper.MasterJenisPemeriksaanMapper;
import id.go.djp.cm.bridge.sidjp.model.MasterJenisPemeriksaan;
import id.go.djp.cm.bridge.sidjp.model.MasterJenisPemeriksaanExample;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * Root resource (exposed at "test" path)
 * 
 * @author arkenoid
 * 
 */
@Path("test")
public class Test {

	@Autowired
	private MasterJenisPemeriksaanMapper masterJenisPemeriksaanMapper;
	
//	@Autowired
//	private MasterJenisSuratMapper masterJenisSuratMapper;
	
	/**
	 * Method handling HTTP GET requests. The returned object will be sent to
	 * the client as "text/plain" media type.
	 * 
	 * @return String that will be returned as a text/plain response.
	 */
	@GET
	@Path("greet")
	@Produces(MediaType.APPLICATION_JSON)
	public String welcomeStranger() {
		
		Map map = new HashMap();
		map.put("message", "Welcome World");
		
		JSONObject jsonObject = JSONObject.fromObject( map );
			
		return jsonObject.toString();
	}

	/**
	 * coba itung jumlah master jenis pemeriksaan
	 * 
	 * @return String that will be returned as a text/plain response.
	 */
	@GET
	@Path("itungJenisPeriksa")
	@Produces(MediaType.APPLICATION_JSON)
	public String itungJenisPeriksa() {
		MasterJenisPemeriksaanExample example = new MasterJenisPemeriksaanExample();
		int jumlahJenisPeriksa =  masterJenisPemeriksaanMapper.countByExample(example);

		Map map = new HashMap();
		map.put("jumlahJenisPeriksa", jumlahJenisPeriksa);
		
		JSONObject jsonObject = JSONObject.fromObject( map );
			
		return jsonObject.toString();
	}

	/**
	 * coba itung jumlah master jenis pemeriksaan
	 * 
	 * @return String that will be returned as a text/plain response.
	 */
	@GET
	@Path("getJenisPeriksa")
	@Produces(MediaType.APPLICATION_JSON)
	public String getJenisPeriksa() {
		MasterJenisPemeriksaanExample example = new MasterJenisPemeriksaanExample();
		List<MasterJenisPemeriksaan> listJenisPeriksa =  masterJenisPemeriksaanMapper.selectByExample(example);
		
		JSONArray jsonArray = JSONArray.fromObject( listJenisPeriksa );

		return "{\"dataList\":" + jsonArray.toString() +"}";
	}
	
	/**
	 * coba itung jumlah master jenis pemeriksaan
	 * 
	 * @return String that will be returned as a text/plain response.
	 */
	@GET
	@Path("getJenisPeriksa/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public String getJenisPeriksa(@PathParam("id") BigDecimal id) {
		MasterJenisPemeriksaanExample example = new MasterJenisPemeriksaanExample();
		example.createCriteria().andIdEqualTo(id);
		List<MasterJenisPemeriksaan> listJenisPeriksa =  masterJenisPemeriksaanMapper.selectByExample(example);
		//List<MasterJenisPemeriksaan> listJenisPeriksa =  masterJenisPemeriksaanMapper.selectByPrimaryKey(example);

		JSONArray jsonArray = JSONArray.fromObject( listJenisPeriksa );

		return jsonArray.toString();
	}

	/**
	 * coba itung jumlah master jenis pemeriksaan
	 * 
	 * @return String that will be returned as a text/plain response.
	 */
	@GET
	@Path("hapusJenisPeriksa/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public String hapusJenisPeriksa(@PathParam("id") BigDecimal id) {
		MasterJenisPemeriksaanExample example = new MasterJenisPemeriksaanExample();
		example.createCriteria().andIdEqualTo(id);
		int listJenisPeriksa =  masterJenisPemeriksaanMapper.deleteByPrimaryKey(id);

		Map map = new HashMap();
		map.put("status", "success");
		
		JSONObject jsonObj = JSONObject.fromObject(map);

		return jsonObj.toString();
	}
	
	/**
	 * coba itung jumlah master jenis pemeriksaan
	 * 
	 * @return String that will be returned as a text/plain response.
	 */
	@GET//@POST
	@Path("tambahJenisPeriksa/id/{id}/kode/{kode}/nama/{nama}")
	@Produces(MediaType.APPLICATION_JSON)
	public String tambahJenisPeriksa(
			@PathParam("id") BigDecimal id,
			@PathParam("kode") BigDecimal kode,
			@PathParam("nama") String nama) {
		MasterJenisPemeriksaan jenisPemeriksaan = new MasterJenisPemeriksaan();
		jenisPemeriksaan.setId(id);
		jenisPemeriksaan.setIsActive((short) 1);
		jenisPemeriksaan.setVersion(new BigDecimal(0));
		jenisPemeriksaan.setKodeJenisPemeriksaan(kode);
		jenisPemeriksaan.setNamaJenisPemeriksaan(nama);
		int listJenisPeriksa =  masterJenisPemeriksaanMapper.insert(jenisPemeriksaan);

		Map map = new HashMap();
		map.put("status", "success");
		
		JSONObject jsonObj = JSONObject.fromObject(map);

		return jsonObj.toString();
	}

	/**
	 * coba itung jumlah master jenis pemeriksaan
	 * 
	 * @return String that will be returned as a text/plain response.
	 */
	@GET//@POST
	@Path("gantiJenisPeriksa/id/{id}/kode/{kode}/nama/{nama}")
	@Produces(MediaType.APPLICATION_JSON)
	public String gantiJenisPeriksa(
			@PathParam("id") BigDecimal id,
			@PathParam("kode") BigDecimal kode,
			@PathParam("nama") String nama) {

		MasterJenisPemeriksaanExample example = new MasterJenisPemeriksaanExample();
		example.createCriteria().andIdEqualTo(id);
		MasterJenisPemeriksaan jenisPeriksa =  masterJenisPemeriksaanMapper.selectByExample(example).get(0);
		
		MasterJenisPemeriksaan jenisPemeriksaan = new MasterJenisPemeriksaan();
		jenisPemeriksaan.setId(id);
		jenisPemeriksaan.setIsActive(jenisPeriksa.getIsActive());
		jenisPemeriksaan.setVersion(jenisPeriksa.getVersion());
		jenisPemeriksaan.setKodeJenisPemeriksaan(kode);
		jenisPemeriksaan.setNamaJenisPemeriksaan(nama);
		int listJenisPeriksa =  masterJenisPemeriksaanMapper.updateByPrimaryKey(jenisPemeriksaan);

		Map map = new HashMap();
		map.put("status", "success");
		
		JSONObject jsonObj = JSONObject.fromObject(map);

		return jsonObj.toString();
	}
}
