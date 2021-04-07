package factoryRequest;

import javax.ws.rs.client.Entity;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

public class RequestPost extends  Request {
    @Override
    public ResponseInformation send(RequestInformation requestInformation) {
        Response response= this.client.target(requestInformation.getUrl()).request(MediaType.APPLICATION_JSON_TYPE).post(Entity.entity(String.class,requestInformation.getBody()));
        ResponseInformation responseInformation= new ResponseInformation();
        responseInformation.setCode(response.getStatus());
        responseInformation.setBody(response.readEntity(String.class));
        response.close();
        return responseInformation;
    }
}
