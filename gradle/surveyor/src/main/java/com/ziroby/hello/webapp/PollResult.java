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
@Path("/pollResult")
public class PollResult {

	@GET()
	public String infoResult() {
		return "thanks";
	}
}
