package util;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import entity.Account;
import entity.Data; 
public class AccountTypeAdapter extends TypeAdapter<Account> {

  @Override
  public Account read(final JsonReader in) throws IOException {
    final Account account = new Account();

    in.beginObject();
    
    while (in.hasNext()) {
    	in.setLenient(true);
    	String name = in.nextName();
    	System.out.println("name: " + name ); 
    	
	    switch (name) {
	      case "id":
	        account.setId(new Integer(in.nextInt()).intValue());
	        break;
	      case "username":
	        account.setUsername(in.nextString());
	        break;
	
	      case "first_name":
	        account.setFirstName(in.nextString());
	        break;
	
	      case "last_name":
	        account.setLastName(in.nextString());
	        break;
	      
	      case "middle_initial":
	          account.setMiddleInitial(in.nextString());
	          break;
	      
	      case "phone_number":
	          account.setPhoneNumber(in.nextString());
	          break;
	      
	      case "city":
	          account.setCity(in.nextString());
	          break;
	      
	      case "state":
	          account.setState(in.nextString());
	          break;
	      
	      case "country":
	          account.setCountry(in.nextString());
	          break;
	      
	      case "last_login":
	          account.setLastLogin(in.nextString());
	          break;    
	      
	      case "about_me":
	          account.setAboutMe(in.nextString());
	          break;    
	      
	      case "address":
	          account.setAddress(in.nextString());
	          break;    
	      
	      case "zip":
	          account.setZip(in.nextString());
	          break;    
	      
	      case "email":
	          account.setEmail(in.nextString());
	          break;    
	      
	      case "profile_responses":
	    	  
	    	  System.out.println("need to parse profile_response" + in.nextString());
	    	   
	          break;    
 	      }
	    
    	
    }
    in.endObject();

    return account;
  }
/*
  @Override
  public void write(final JsonWriter out, final Data data) throws IOException {
    out.beginObject();
    out.name("id").value(data.getId());
    out.name("name").value(data.getName());
    out.endObject();
  }
*/
   
@Override
public void write(JsonWriter arg0, Account arg1) throws IOException {
	// TODO Auto-generated method stub
	
}

}