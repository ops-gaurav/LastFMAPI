package lastfm.artist.events;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.fasterxml.jackson.annotation.JsonProperty;

public class GeoPoint {

	@SerializedName("geo:lat")
	@JsonProperty("geo:lat")
	@Expose private String latitude;
	@SerializedName("geo:long")
	@JsonProperty("geo:long")
	@Expose private String longitude;
	
	public void setLatitude(String latitude){
		this.latitude = latitude;
	}
	public String getLatitude(){
		return latitude;
	}
	public void setLongitude(String longitude){
		this.longitude = longitude;
	}
	public String getLongitude(){
		return longitude;
	}
}
