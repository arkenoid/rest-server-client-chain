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
@Path("/terimaSMS")
public class TerimaSMS {

	@GET()
	public String terimaSMS() {
		return "ok";
	}
}
