package lastfm.artist.events;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Location {


	@JsonProperty("geo:point") private GeoPoint location;
	@JsonProperty private String city;
	@JsonProperty private String country;
	@JsonProperty private String street;
	@JsonProperty private String postalcode;
	
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
