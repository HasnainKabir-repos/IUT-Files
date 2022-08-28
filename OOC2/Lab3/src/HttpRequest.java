
public enum HttpRequest{

    C_400{
        public void requestType(){
            System.out.println("Bad request");
        }
    },

    C_401{
        public void requestType(){
            System.out.println("Unauthorized");
        }
    },

    C_403{
        public void requestType(){
            System.out.println("Forbidden");
        }
    },

    C_404{
        public void requestType(){
            System.out.println("Not Found");
        }
    },

    C_408{
        public void requestType(){
            System.out.println("Request timeout");
        }
    };

    public abstract void requestType();

    public static HttpRequest getReqType(String err){
        for(HttpRequest http: HttpRequest.values()){
            if (http.name().equals(err)) {
                http.requestType();
                return http;
            }
        }
        return null;
    }
}
