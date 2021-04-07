
package factoryRequest;

public class ResponseInformation {
    private String body;
    private int code;

    public ResponseInformation(){}

    public void setBody(String body){
        this.body=body;
    }
    public void setCode(int code){
        this.code=code;
    }
    public String getBody(){
        return this.body;
    }
    public int getCode(){
        return this.code;
    }

    public void showInformation(){
        System.out.println("Response CODE: "+this.code);
        System.out.println("Response BODY: "+this.body);
    }

}