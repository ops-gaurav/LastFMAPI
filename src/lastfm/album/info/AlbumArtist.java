package lastfm.album.info;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AlbumArtist {
	
	@JsonProperty private String name;
	@JsonProperty private String mbid;
	@JsonProperty private String url;
	@JsonProperty private int rank;
	
	/**
	*
	* @Param mbid
	*/
	public void setmbid(final String mbid){
		this.mbid = mbid;
	}
	/**
	*
	* @Param name
	*/
	public void setname(final String name){
		this.name = name;
	}
	/**
	*
	* @Param rank
	*/
	public void setrank(final int rank){
		this.rank = rank;
	}
	/**
	*
	* @Param url
	*/
	public void seturl(final String url){
		this.url = url;
	}
	/**
	*
	* @return 
	*/
	public String getmbid(){
		return mbid;
	}
	/**
	*
	* @return 
	*/
	public String getname(){
		return name;
	}
	/**
	*
	* @return 
	*/
	public int getrank(){
		return rank;
	}
	/**
	*
	* @return 
	*/
	public String geturl(){
		return url;
	}
}
