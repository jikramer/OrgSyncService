package entity;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
 
public class Element {

@SerializedName("id")
@Expose
private Integer id;
@SerializedName("name")
@Expose
private String name;
@SerializedName("type")
@Expose
private String type;

/**
* No args constructor for use in serialization
* 
*/
public Element() {
}

/**
* 
* @param id
* @param name
* @param type
*/
public Element(Integer id, String name, String type) {
super();
this.id = id;
this.name = name;
this.type = type;
}

public Integer getId() {
return id;
}

public void setId(Integer id) {
this.id = id;
}

public Element withId(Integer id) {
this.id = id;
return this;
}

public String getName() {
return name;
}

public void setName(String name) {
this.name = name;
}

public Element withName(String name) {
this.name = name;
return this;
}

public String getType() {
return type;
}

public void setType(String type) {
this.type = type;
}

public Element withType(String type) {
this.type = type;
return this;
}

 
}