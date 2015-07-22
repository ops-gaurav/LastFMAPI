package lastfm.artist.events;

import com.fasterxml.jackson.annotation.JsonProperty;

public class LastFMGeoPoint {

	@JsonProperty("geo:lat") private String latitude;
	@JsonProperty("geo:long") private String longitude;
	
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
