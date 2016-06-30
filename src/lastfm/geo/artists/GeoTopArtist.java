package lastfm.geo.artists;

import com.fasterxml.jackson.annotation.JsonProperty;
import lastfm.types.Image;
import java.util.List;

public class GeoTopArtist {
	@JsonProperty private String name;
	@JsonProperty private long listeners;
	@JsonProperty private String mbid;
	@JsonProperty private String url;
	@JsonProperty private String streamable;
	@JsonProperty private List<Image> image;
	/**
	* this is the getter function for property name
	* @return
	*/
	public String getName(){
		return name;
	}
	/**
	* this is the getter function for property name
	* @param name
	* 
	*/
	public void  setname(String name){
		this.name=name;
	}
	/**
	* this is the getter function for property listeners
	* @return
	*/
	public long getListeners(){
		return listeners;
	}
	/**
	* this is the getter function for property listeners
	* @param listeners
	* 
	*/
	public void  setlisteners(long listeners){
		this.listeners=listeners;
	}
	/**
	* this is the getter function for property mbid
	* @return
	*/
	public String getMbid(){
		return mbid;
	}
	/**
	* this is the getter function for property mbid
	* @param mbid
	* 
	*/
	public void  setmbid(String mbid){
		this.mbid=mbid;
	}
	/**
	* this is the getter function for property url
	* @return
	*/
	public String getUrl(){
		return url;
	}
	/**
	* this is the getter function for property url
	* @param url
	* 
	*/
	public void  seturl(String url){
		this.url=url;
	}
	/**
	* this is the getter function for property streamable
	* @return
	*/
	public String getStreamable(){
		return streamable;
	}
	/**
	* this is the getter function for property streamable
	* @param streamable
	* 
	*/
	public void  setstreamable(String streamable){
		this.streamable=streamable;
	}
	/**
	* this is the getter function for property image
	* @return
	*/
	public List<Image> getImage(){
		return image;
	}
	/**
	* this is the getter function for property image
	* @param image
	* 
	*/
	public void  setimage(List<Image> image){
		this.image=image;
	}
}