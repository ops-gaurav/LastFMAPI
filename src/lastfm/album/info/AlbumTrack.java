package lastfm.album.info;

import com.fasterxml.jackson.annotation.JsonProperty;
import lastfm.types.Streamable;

public class AlbumTrack {

	@JsonProperty private String name;
	@JsonProperty private int duration;
	@JsonProperty private String mbid;
	@JsonProperty private String url;
	@JsonProperty private AlbumArtist artist;
	@JsonProperty("@attr") private Attribute attr;
	@JsonProperty private Streamable streamable;
	
	/**
	*
	* @Param duration
	*/
	public void setduration(final int duration){
		this.duration = duration;
	}
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
	* @Param url
	*/
	public void seturl(final String url){
		this.url = url;
	}
	/**
	*
	* @return 
	*/
	public int getduration(){
		return duration;
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
	public String geturl(){
		return url;
	}
	
	public void setArtist(AlbumArtist artist){
		this.artist = artist;
	}
	public AlbumArtist getArtist(){
		return artist;
	}
	public void setAttr(Attribute attr){
		this.attr = attr;
	}
	public Attribute getAttr(){
		return attr;
	}
	public void setStreamable(Streamable streamable){
		this.streamable = streamable;
	}
	public Streamable getStreamable(){
		return streamable;
	}
	
}
