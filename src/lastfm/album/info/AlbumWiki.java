package lastfm.album.info;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AlbumWiki {

	@JsonProperty private String published;
	@JsonProperty private String summary;
	@JsonProperty private String content;
	
	/**
	*
	* @Param summary
	*/
	public void setsummary(final String summary){
		this.summary = summary;
	}
	/**
	*
	* @Param published
	*/
	public void setpublished(final String published){
		this.published = published;
	}
	/**
	*
	* @Param content
	*/
	public void setcontent(final String content){
		this.content = content;
	}
	/**
	*
	* @return 
	*/
	public String getsummary(){
		return summary;
	}
	/**
	*
	* @return 
	*/
	public String getpublished(){
		return published;
	}
	/**
	*
	* @return 
	*/
	public String getcontent(){
		return content;
	}

}
