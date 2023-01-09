
import java.io.File;
import Models.Root;

import com.fasterxml.jackson.databind.ObjectMapper; 

public class Main {
       public static void main(String args[]) {
    	   try {
    		   ObjectMapper om=new ObjectMapper();
    		   Root root = om.readValue(new File("test-json.json"),Root.class);
    		   System.out.println(root);
    	   }catch (Exception e) {
    		   e.printStackTrace();
    	   }
       }
}
