package lastfm.track.info;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TrackWiki {

	@JsonProperty private String published;
	@JsonProperty private String summary;
	@JsonProperty private String content;
	
	public void setPublished(String published){
		this.published = published;
	}
	public String getPublished(){
		return published;
	}
	
	public void setContent(String content){
		this.content = content;
	}
	public String getContent(){
		return content;
	}
	
	public void setSummary(String summary){
		this.summary = summary;
	}
	public String getSummary(){
		return summary;
	}
}
