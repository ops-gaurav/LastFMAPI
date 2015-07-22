package lastfm.track.info;

import com.fasterxml.jackson.annotation.JsonProperty;
import lastfm.types.Streamable;
import lastfm.types.Tags;

public class LastFMTrack {

	@JsonProperty private String id;
	@JsonProperty private String name;
	@JsonProperty private String mbid;
	@JsonProperty private String url;
	@JsonProperty private int duration;
	@JsonProperty private Streamable streamable;
	@JsonProperty private long listeners;
	@JsonProperty private long playcount;
	@JsonProperty private LastFMTrackArtist artist;
	@JsonProperty private LastFMTrackAlbum album;
	@JsonProperty private Tags toptags;
	@JsonProperty private LastFMTrackWiki wiki;
	
	public void setId(String id){
		this.id = id;
	}
	public String getId(){
		return id;
	}
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
	public void setDuration(int duration){
		this.duration = duration;
	}
	public int getDuration(){
		return duration;
	}
	public void setStreamable(Streamable streamable){
		this.streamable = streamable;
	}
	public Streamable getStreamable(){
		return streamable;
	}
	public void setListeners(long listeners){
		this.listeners = listeners;
	}
	public long getListeners(){
		return listeners;
	}
	public void setPlaycount(long playcount){
		this.playcount = playcount;
	}
	public long getPlaycount(){
		return playcount;
	}
	public void setArtist(LastFMTrackArtist artist){
		this.artist = artist;
	}
	public LastFMTrackArtist getArtist(){
		return artist;
	}
	public void setAlbum(LastFMTrackAlbum album){
		this.album = album;
	}
	public LastFMTrackAlbum getAlbum(){
		return album;
	}
	public void setToptags(Tags toptags){
		this.toptags = toptags;
	}
	public Tags getToptags(){
		return toptags;
	}
	public void setWiki(LastFMTrackWiki wiki){
		this.wiki = wiki;
	}
	public LastFMTrackWiki getWiki(){
		return wiki;
	}
}
