/**
 * 
 */
package id.go.djp.cm.bridge.test.rest;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import id.go.djp.cm.bridge.sidjp.model.MasterJenisPemeriksaan;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import org.junit.BeforeClass;
import org.junit.Test;
import org.restlet.representation.Representation;
import org.restlet.resource.ClientResource;

/**
 * @author arkenoid
 *
 */
public class SampleTest {
	private static final String REST_URI = "http://localhost:9090/djpcm-bridge/webapi";

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@Test
	public void test() throws IOException {
	    String uri = REST_URI + "/test/greet";
		ClientResource clientResource = new ClientResource(uri);
	    Representation response = clientResource.get();
	    String result = response.getText();
		System.out.println(result);
	    assertTrue(result.length()>0);
	}

	@Test
	public void itungJenisPeriksa() throws IOException {
	    String uri = REST_URI + "/test/itungJenisPeriksa";
		ClientResource clientResource = new ClientResource(uri);
	    Representation response = clientResource.get();
	    String result = response.getText();
		System.out.println(result);
		
		JSONObject jsonObject = JSONObject.fromObject(result);  
		 
		int jumlah = (Integer) jsonObject.get( "jumlahJenisPeriksa" );
		System.out.println(jumlah);
			
		
	    assertTrue(jumlah>0);
	}

	@Test
	public void listJenisPeriksa() throws IOException {
	    String uri = REST_URI + "/test/getJenisPeriksa";
		ClientResource clientResource = new ClientResource(uri);
	    Representation response = clientResource.get();
	    String result = response.getText();
		System.out.println(result);
		
		JSONArray jsonArray = JSONArray.fromObject(result);
		
		List<MasterJenisPemeriksaan> pemeriksaans = new ArrayList<MasterJenisPemeriksaan>();
		
		for (int i = 0; i < jsonArray.size(); i++) {
			JSONObject jsonObj = (JSONObject) jsonArray.get(i);
			System.out.println(jsonObj);
			MasterJenisPemeriksaan masterJenisPemeriksaan = (MasterJenisPemeriksaan) JSONObject.toBean(jsonObj, MasterJenisPemeriksaan.class);
			System.out.println(masterJenisPemeriksaan.getId() + " - " + masterJenisPemeriksaan.getNamaJenisPemeriksaan());
			pemeriksaans.add(masterJenisPemeriksaan);
		}
		
		assertEquals(jsonArray.size(), pemeriksaans.size());
		
	}
	
	@Test
	public void getJenisPeriksaById() throws IOException {
	    String uri = REST_URI + "/test/getJenisPeriksa/44";
		ClientResource clientResource = new ClientResource(uri);
	    Representation response = clientResource.get();
	    String result = response.getText();
		System.out.println(result);
		
		JSONArray jsonArray = JSONArray.fromObject(result);
		
		List<MasterJenisPemeriksaan> pemeriksaans = new ArrayList<MasterJenisPemeriksaan>();
		
		for (int i = 0; i < jsonArray.size(); i++) {
			JSONObject jsonObj = (JSONObject) jsonArray.get(i);
			System.out.println(jsonObj);
			MasterJenisPemeriksaan masterJenisPemeriksaan = (MasterJenisPemeriksaan) JSONObject.toBean(jsonObj, MasterJenisPemeriksaan.class);
			System.out.println(masterJenisPemeriksaan.getId() + " - " + masterJenisPemeriksaan.getNamaJenisPemeriksaan());
			pemeriksaans.add(masterJenisPemeriksaan);
		}
		
		assertEquals(1, pemeriksaans.size());		
	}

//	http://localhost:9090/djpcm-bridge/webapi/test/tambahJenisPeriksa/id/99/kode/12/nama/dodol
	@Test
	public void tambahJenisPeriksa() throws IOException {
	    String uri = REST_URI + "/test/tambahJenisPeriksa/id/99/kode/12/nama/dodol";
		ClientResource clientResource = new ClientResource(uri);
	    Representation response = clientResource.get();
	    String result = response.getText();
		System.out.println(result);
		
		JSONObject jsonObj = JSONObject.fromObject(result);
		System.out.println(jsonObj);	
	}

	@Test
	public void hapusPeriksaById() throws IOException {
	    String uri = REST_URI + "/test/hapusJenisPeriksa/99";
		ClientResource clientResource = new ClientResource(uri);
	    Representation response = clientResource.get();
	    String result = response.getText();
		System.out.println(result);

		JSONObject jsonObj = JSONObject.fromObject(result);
		
		assertEquals("success", jsonObj.get("status"));		
	}

	@Test
	public void gantiJenisPeriksa() throws IOException {
	    String uri = REST_URI + "/test/gantiJenisPeriksa/id/99/kode/31/nama/kodok";
		ClientResource clientResource = new ClientResource(uri);
	    Representation response = clientResource.get();
	    String result = response.getText();
		System.out.println(result);
		
		JSONObject jsonObj = JSONObject.fromObject(result);
		System.out.println(jsonObj);	
	}
}
