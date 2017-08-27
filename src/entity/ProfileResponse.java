
package entity;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class ProfileResponse {

@SerializedName("element")
@Expose
private Element element;
@SerializedName("data")
@Expose
private Data data;

/**
* No args constructor for use in serialization
* 
*/
public ProfileResponse() {
}

/**
* 
* @param element
* @param data
*/
public ProfileResponse(Element element, Data data) {
super();
this.element = element;
this.data = data;
}

public Element getElement() {
return element;
}

public void setElement(Element element) {
this.element = element;
}

public ProfileResponse withElement(Element element) {
this.element = element;
return this;
}

public Data getData() {
return data;
}

public void setData(Data data) {
this.data = data;
}

public ProfileResponse withData(Data data) {
this.data = data;
return this;
}


}