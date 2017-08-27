package util;
 
import java.lang.reflect.Type;

import com.google.gson.Gson;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;

import entity.Account;


public class AccountDeserializer implements JsonDeserializer<Account>{

	    public Account deserialize(JsonElement je, Type type, JsonDeserializationContext jdc)
	        throws JsonParseException
	    {
	    	JsonElement account = null;
	    	Account a = null;
	    	try{
		    	// Get the "content" element from the parsed JSON
		        account = je.getAsJsonObject().get("account");
	
		         
		        // Deserialize it. You use a new instance of Gson to avoid infinite recursion
		        // to this deserializer
		        a= new Gson().fromJson(account, Account.class);

	    	}catch(Exception e){
		    	System.out.println("e: " + e);
	    	}
	    return a;
	    }
	    
		 
 	}
	
	
	

