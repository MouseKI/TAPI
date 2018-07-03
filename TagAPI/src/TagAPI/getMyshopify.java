package TagAPI;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL; 
import org.json.JSONObject;
public class getMyshopify {
	public static void main(String[] args) {
     try {
         getMyshopify.call_me();
        } catch (Exception e) {
         e.printStackTrace();
       }
     }
	   
public static void call_me() throws Exception {
     String url = "https://470c6de20333b5ff1d6d7aa74bd0caa0:69de03384b8f815663efaa69ad723a81@keliang.myshopify.com/admin/products.json?limit=250&page=1";
     URL obj = new URL(url);
     HttpURLConnection con = (HttpURLConnection) obj.openConnection();
     // optional default is GET
     con.setRequestMethod("GET");
     //add request header
     con.setRequestProperty("User-Agent", "Mozilla/5.0");
     int responseCode = con.getResponseCode();
     System.out.println("\nSending 'GET' request to URL : " + url);
     System.out.println("Response Code : " + responseCode);
     BufferedReader in = new BufferedReader(
             new InputStreamReader(con.getInputStream()));
     String inputLine;
     StringBuffer response = new StringBuffer();
     while ((inputLine = in.readLine()) != null) {
     	response.append(inputLine);
     }
     in.close();
     //print in String
     System.out.println(response.toString());
     //Read JSON response and print
     
   }
}
