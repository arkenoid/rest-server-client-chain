/**
 * 
 */
package com.ziroby.hello.webapp;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

/**
 * @author arke
 *
 */
@Path("/kirimSMS")
public class KirimSMS {

	@GET()
	public String kirimSMS() {
		return "berhasil";
	}
}
