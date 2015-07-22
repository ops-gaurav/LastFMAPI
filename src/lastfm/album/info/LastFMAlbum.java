package lastfm.album.info;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import lastfm.types.Tags;
import lastfm.types.Image;

/**
 * POJO representing the album info as raw types and sub-pojo that contains
 * other pojo or raw types to hold the album information
 * @author gaurav
 *
 */
public class LastFMAlbum {
	
	@JsonProperty private String name;
	@JsonProperty private String artist;
	@JsonProperty private int id;
	@JsonProperty private String mbid;
	@JsonProperty private String url;
	@JsonProperty private String 	releasedate;
	@JsonProperty private List<Image> image;
	@JsonProperty private int listeners;
	@JsonProperty private int playcount;
	@JsonProperty private LastFMAlbumTracks tracks;
	@JsonProperty private Tags toptags;
	@JsonProperty private LastFMAlbumWiki wiki;
	

	/**
	*
	* @Param mbid
	*/
	public void setmbid(final String mbid){
		this.mbid = mbid;
	}
	/**
	*
	* @Param listeners
	*/
	public void setlisteners(final int listeners){
		this.listeners = listeners;
	}
	/**
	*
	* @Param artist
	*/
	public void setartist(final String artist){
		this.artist = artist;
	}
	/**
	*
	* @Param playcount
	*/
	public void setplaycount(final int playcount){
		this.playcount = playcount;
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
	* @Param id
	*/
	public void setid(final int id){
		this.id = id;
	}
	/**
	*
	* @Param releasedate
	*/
	public void setreleasedate(final String releasedate){
		this.releasedate = releasedate;
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
	public int getlisteners(){
		return listeners;
	}
	/**
	*
	* @return 
	*/
	public String getartist(){
		return artist;
	}
	/**
	*
	* @return 
	*/
	public int getplaycount(){
		return playcount;
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
	public int getid(){
		return id;
	}
	/**
	*
	* @return 
	*/
	public String getreleasedate(){
		return releasedate;
	}
	/**
	*
	* @return 
	*/
	public String geturl(){
		return url;
	}
	
	public void setImage(List<Image> image){
		this.image = image;
	}
	public List<Image> getImage(){
		return image;
	}
	public void setTracks(LastFMAlbumTracks tracks){
		this.tracks = tracks;
	}
	public LastFMAlbumTracks getTracks(){
		return tracks;
	}
	public void setTopTags(Tags toptags){
		this.toptags = toptags;
	}
	public Tags getTopTags(){
		return toptags;
	}
	
	public void setWiki(LastFMAlbumWiki wiki){
		this.wiki = wiki;
	}
	public LastFMAlbumWiki getWiki(){
		return wiki;
	}
}
