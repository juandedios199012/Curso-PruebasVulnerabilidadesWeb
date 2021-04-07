package factoryRequest;

public class FactoryRequest {
    public static final String GET="get";
    public static final String POST="post";
    public static final String PUT="put";

    public static Request make(String type){
        Request request;
        switch (type){
            case GET:
                request= new RequestGet();
                break;
            case POST:
                request= new RequestPost();
                break;
            case PUT:
                request = new RequestPut();
                break;
            default:
                request= new RequestGet();
                break;
        }
        return request;
    }

}
