package lastfm.artist.info;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Tag {
	
	@JsonProperty private String name;
	@JsonProperty private String url;
	
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return name;
	}
	public void setUrl(String url){
		this.url = url;
	}
	public String getUrl(){
		return url;
	}
}
