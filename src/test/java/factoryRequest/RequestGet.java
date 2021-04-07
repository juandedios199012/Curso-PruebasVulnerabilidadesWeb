
package factoryRequest;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

public class RequestGet extends Request {
    @Override
    public ResponseInformation send(RequestInformation requestInformation) {
        requestInformation.showInformation();;
        Response response= this.client.target(requestInformation.getUrl()).request(MediaType.APPLICATION_JSON_TYPE).get();
        ResponseInformation responseInformation= new ResponseInformation();
        responseInformation.setCode(response.getStatus());
        responseInformation.setBody(response.readEntity(String.class));
        response.close();
        responseInformation.showInformation();
        return responseInformation;
    }
}
