

package factoryRequest;

public class RequestInformation {
    private String url;
    private String body;

    public RequestInformation(){}

    public void setUrl(String url){
        this.url=url;
    }
    public void setBody(String body){
        this.body=body;
    }

    public String getUrl(){
        return this.url;
    }

    public String getBody(){
        return this.body;
    }

    public void showInformation(){
        System.out.println("Request URL: "+this.url);
        System.out.println("Request BODY: "+this.body);
    }

}
