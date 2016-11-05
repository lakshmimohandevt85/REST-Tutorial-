import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;

public class TestClient {

	public static void main(String[] args) {
		
	     Client c = Client.create();

	     WebResource resources1 = c.resource("http://localhost:8080/RestJerseyImplementation/rest/helloService/sayHello/?name1=venkat&age=32");
	     
	    
		 
		  String res = resources1.get(String.class);
		  
		  
		  System.out.println(res);
		 
	}
}
	  
	

