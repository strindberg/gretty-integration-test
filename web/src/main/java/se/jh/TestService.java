package se.jh;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;

import org.springframework.stereotype.Service;

@Service("testService")
@Path("/test")
public class TestService {

    @GET
    @Produces({ MediaType.APPLICATION_JSON })
    @Path("status")
    public String getNumberOfCasesPerMonthAsCsv(@Context HttpServletRequest request) {
        return "{\"greeting\": \"hello\"}";
    }

}
