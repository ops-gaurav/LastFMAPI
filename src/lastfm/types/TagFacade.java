package lastfm.types;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TagFacade {

	@JsonProperty("name") private String tagName;
	@JsonProperty("url") private String tagUrl;
	
	public void setTagName(String name){
		this.tagName = name;
	}
	public String getTagName(){
		return tagName;
	}
	public void setTagUrl(String url){
		this.tagUrl = url;
	}
	public String getTagUrl(){
		return tagUrl;
	}
}
