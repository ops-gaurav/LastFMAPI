package lastfm.artist.events;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Location {

	@SerializedName("geo:point")
	@JsonProperty("geo:point")
	@Expose private GeoPoint location;
	@Expose private String city;
	@Expose private String country;
	@Expose private String street;
	@Expose private String postalcode;
	
	public void setLocation(GeoPoint location){
		this.location = location;
	}
	public GeoPoint getLocation(){
		return location;
	}
	
	public void setCity(String city){
		this.city = city;
	}
	public String getCity(){
		return city;
	}
	public void setCountry(String country){
		this.country = country;
	}
	public String getCountry(){
		return country;
	}
	public void setStreet(String street){
		this.street = street;
	}
	public String getStreet(){
		return street;
	}
	public void setPostalcode(String postalcode){
		this.postalcode = postalcode;
	}
	public String getPostalcode(){
		return postalcode;
	}
	
}
