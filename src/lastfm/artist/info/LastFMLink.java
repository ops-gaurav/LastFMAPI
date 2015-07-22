package lastfm.artist.info;

import com.fasterxml.jackson.annotation.JsonProperty;

public class LastFMLink {

	@JsonProperty("#text") private String text;
	@JsonProperty("rel") private String type;
	@JsonProperty("href") private String link;
	
	public void setText(String text){
		this.text = text;
	}
	public String getText(){
		return text;
	}
	public void setType(String type){
		this.type= type;
	}
	public String getType(){
		return type;
	}
	public void setLink(String link){
		this.link = link;
	}
	public String getLink(){
		return link;
	}
}
