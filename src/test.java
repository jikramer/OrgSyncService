import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Type;
import java.net.HttpURLConnection;
import java.net.URL;
import java.text.ParseException;
import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonDeserializer;
import com.google.gson.reflect.TypeToken;

import entity.Account;
import util.AccountTypeAdapter;


public class test {

    public static void main(String[] args) throws IOException {
    	try{
		        URL url = new URL("https://api.orgsync.com/api/v2/accounts/email/jkramer@fairfield.edu?key=McxJtIzIzaKOIAt4EfW_KQ");
				HttpURLConnection conn = (HttpURLConnection) url.openConnection();
				conn.setRequestMethod("GET");
				conn.setRequestProperty("Accept", "application/json");

				if (conn.getResponseCode() != 200) {
					throw new RuntimeException("Failed : HTTP error code : "
							+ conn.getResponseCode());
				}

				BufferedReader br = new BufferedReader(new InputStreamReader(
					(conn.getInputStream())));

				StringBuffer buff = new StringBuffer();
				String output;
//				System.out.println("Output from Server .... \n");
				while ((output = br.readLine()) != null) {
					System.out.println(output);
					buff.append(output);
				}


			    //Gson gson = new Gson();
			    
			    String accountString = buff.toString();
			    System.out.println("before: " + accountString);
			    /*    			    accountString = accountString.replace( "\"data\":\"\"", "\"data\":null");
			    System.out.println("after: " + accountString);
			  */   
			    //Account a = gson.fromJson(accountString, Account.class);
			    try{
			     			
			    JSONObject rootJSON = (JSONObject) new JSONParser().parse(accountString);
		         
			    
			    JSONArray dataList = (JSONArray) rootJSON.get("profile_responses");
		        for(Object projectObj: dataList.toArray()){
		            JSONObject project = (JSONObject)projectObj;
		            JSONArray issueList = (JSONArray) project.get("element");
		            for(Object issueObj: issueList.toArray()){
		                JSONObject issue = (JSONObject) issueObj;
		                //do something with the issue
		            }
		        }
		    } catch (Exception e) {
		        //do smth
		        e.printStackTrace();
		    }
			    
			    
				/*	Gson gson = new GsonBuilder()
					    .registerTypeAdapter(Account.class, new AccountTypeAdapter()).create();
 		 			Account a = gson.fromJson(buff.toString(), Account.class);
			    
				System.out.println("a" + a.toString());
				*/
				conn.disconnect();
			
    	}catch(Exception e){
    		System.out.println("e: " + e);
    	}
    	
    }
}