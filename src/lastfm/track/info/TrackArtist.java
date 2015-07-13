package lastfm.track.info;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TrackArtist {

	@JsonProperty private String name;
	@JsonProperty private String mbid;
	@JsonProperty private String url;
	
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return name;
	}
	public void setMbid(String mbid){
		this.mbid = mbid;
	}
	public String getMbid(){
		return mbid;
	}
	public void setUrl(String url){
		this.url = url;
	}
	public String getUrl(){
		return url;
	}
}
