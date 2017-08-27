package entity;

import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
 
public class Account {

@SerializedName("id")
@Expose
private Integer id;
@SerializedName("username")
@Expose
private String username;
@SerializedName("first_name")
@Expose
private String firstName;
@SerializedName("last_name")
@Expose
private String lastName;
@SerializedName("middle_initial")
@Expose
private String middleInitial;
@SerializedName("phone_number")
@Expose
private String phoneNumber;
@SerializedName("city")
@Expose
private String city;
@SerializedName("state")
@Expose
private String state;
@SerializedName("country")
@Expose
private String country;
@SerializedName("last_login")
@Expose
private String lastLogin;
@SerializedName("about_me")
@Expose
private String aboutMe;
@SerializedName("address")
@Expose
private String address;
@SerializedName("zip")
@Expose
private String zip;
@SerializedName("email")
@Expose
private String email;
@SerializedName("profile_responses")
@Expose
private List<ProfileResponse> profileResponses = new ArrayList<ProfileResponse>();
@SerializedName("classifications")
@Expose
private List<Classification> classifications = new ArrayList<Classification>();
@SerializedName("pic_url")
@Expose
private String picUrl;
@SerializedName("org_ids")
@Expose
private List<Integer> orgIds = new ArrayList<Integer>();

/**
* No args constructor for use in serialization
* 
*/
public Account() {
}

/**
* 
* @param classifications
* @param zip
* @param lastName
* @param picUrl
* @param state
* @param aboutMe
* @param city
* @param country
* @param id
* @param orgIds
* @param username
* @param lastLogin
* @param phoneNumber
* @param email
* @param address
* @param middleInitial
* @param profileResponses
* @param firstName
*/
public Account(Integer id, String username, String firstName, String lastName, String middleInitial, String phoneNumber, String city, String state, String country, String lastLogin, String aboutMe, String address, String zip, String email, List<ProfileResponse> profileResponses, List<Classification> classifications, String picUrl, List<Integer> orgIds) {
super();
this.id = id;
this.username = username;
this.firstName = firstName;
this.lastName = lastName;
this.middleInitial = middleInitial;
this.phoneNumber = phoneNumber;
this.city = city;
this.state = state;
this.country = country;
this.lastLogin = lastLogin;
this.aboutMe = aboutMe;
this.address = address;
this.zip = zip;
this.email = email;
this.profileResponses = profileResponses;
this.classifications = classifications;
this.picUrl = picUrl;
this.orgIds = orgIds;
}

public Integer getId() {
return id;
}

public void setId(Integer id) {
this.id = id;
}

public Account withId(Integer id) {
this.id = id;
return this;
}

public String getUsername() {
return username;
}

public void setUsername(String username) {
this.username = username;
}

public Account withUsername(String username) {
this.username = username;
return this;
}

public String getFirstName() {
return firstName;
}

public void setFirstName(String firstName) {
this.firstName = firstName;
}

public Account withFirstName(String firstName) {
this.firstName = firstName;
return this;
}

public String getLastName() {
return lastName;
}

public void setLastName(String lastName) {
this.lastName = lastName;
}

public Account withLastName(String lastName) {
this.lastName = lastName;
return this;
}

public String getMiddleInitial() {
return middleInitial;
}

public void setMiddleInitial(String middleInitial) {
this.middleInitial = middleInitial;
}

public Account withMiddleInitial(String middleInitial) {
this.middleInitial = middleInitial;
return this;
}

public String getPhoneNumber() {
return phoneNumber;
}

public void setPhoneNumber(String phoneNumber) {
this.phoneNumber = phoneNumber;
}

public Account withPhoneNumber(String phoneNumber) {
this.phoneNumber = phoneNumber;
return this;
}

public String getCity() {
return city;
}

public void setCity(String city) {
this.city = city;
}

public Account withCity(String city) {
this.city = city;
return this;
}

public String getState() {
return state;
}

public void setState(String state) {
this.state = state;
}

public Account withState(String state) {
this.state = state;
return this;
}

public String getCountry() {
return country;
}

public void setCountry(String country) {
this.country = country;
}

public Account withCountry(String country) {
this.country = country;
return this;
}

public String getLastLogin() {
return lastLogin;
}

public void setLastLogin(String lastLogin) {
this.lastLogin = lastLogin;
}

public Account withLastLogin(String lastLogin) {
this.lastLogin = lastLogin;
return this;
}

public String getAboutMe() {
return aboutMe;
}

public void setAboutMe(String aboutMe) {
this.aboutMe = aboutMe;
}

public Account withAboutMe(String aboutMe) {
this.aboutMe = aboutMe;
return this;
}

public String getAddress() {
return address;
}

public void setAddress(String address) {
this.address = address;
}

public Account withAddress(String address) {
this.address = address;
return this;
}

public String getZip() {
return zip;
}

public void setZip(String zip) {
this.zip = zip;
}

public Account withZip(String zip) {
this.zip = zip;
return this;
}

public String getEmail() {
return email;
}

public void setEmail(String email) {
this.email = email;
}

public Account withEmail(String email) {
this.email = email;
return this;
}

public List<ProfileResponse> getProfileResponses() {
return profileResponses;
}

public void setProfileResponses(List<ProfileResponse> profileResponses) {
this.profileResponses = profileResponses;
}

public Account withProfileResponses(List<ProfileResponse> profileResponses) {
this.profileResponses = profileResponses;
return this;
}

public List<Classification> getClassifications() {
return classifications;
}

public void setClassifications(List<Classification> classifications) {
this.classifications = classifications;
}

public Account withClassifications(List<Classification> classifications) {
this.classifications = classifications;
return this;
}

public String getPicUrl() {
return picUrl;
}

public void setPicUrl(String picUrl) {
this.picUrl = picUrl;
}

public Account withPicUrl(String picUrl) {
this.picUrl = picUrl;
return this;
}

public List<Integer> getOrgIds() {
return orgIds;
}

public void setOrgIds(List<Integer> orgIds) {
this.orgIds = orgIds;
}

public Account withOrgIds(List<Integer> orgIds) {
this.orgIds = orgIds;
return this;
}

 
}