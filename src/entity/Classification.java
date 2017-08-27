package entity;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
 
public class Classification {

@SerializedName("id")
@Expose
private Integer id;
@SerializedName("name")
@Expose
private String name;

/**
* No args constructor for use in serialization
* 
*/
public Classification() {
}

/**
* 
* @param id
* @param name
*/
public Classification(Integer id, String name) {
super();
this.id = id;
this.name = name;
}

public Integer getId() {
return id;
}

public void setId(Integer id) {
this.id = id;
}

public Classification withId(Integer id) {
this.id = id;
return this;
}

public String getName() {
return name;
}

public void setName(String name) {
this.name = name;
}

public Classification withName(String name) {
this.name = name;
return this;
}

 
}