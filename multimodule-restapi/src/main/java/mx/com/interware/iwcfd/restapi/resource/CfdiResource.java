package mx.com.interware.iwcfd.restapi.resource;

//import mx.com.interware.iwcfd.domain.service.CfdiSummaryService;

import javax.inject.Inject;
import javax.json.Json;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Application;
import static javax.ws.rs.core.MediaType.TEXT_PLAIN;

/**
 * Created by j49u4r on 10/13/16.
 */
@Path("iwcfd")
public class CfdiResource {

    //@Inject
    //CfdiSummaryService service;

    public CfdiResource() {
    }

    @GET
    @Produces(TEXT_PLAIN)
    public Object all() {

        return Json.createObjectBuilder()
                .add("rfc", "ERDF3456781W3")
                .add("name", "Ernesto")
                .build()
                .toString();
    }
}
