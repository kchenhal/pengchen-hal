package org.odata4j.producer.resources;


import java.net.URI;

import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.Providers;

/**
 * 
 * @author <a href="mailto:peng.chen@halliburton.com">Kevin Chen</a>
 *
 */
public abstract class ODataBatchUnit {
	public abstract Response execute(HttpHeaders httpHeaders, Providers providers, URI baseUrI) throws Exception;

	public abstract String getBatchUnitContentType();
}
