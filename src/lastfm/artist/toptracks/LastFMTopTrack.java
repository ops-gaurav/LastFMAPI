package lastfm.artist.toptracks;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import lastfm.types.Image;

/**
 * POJO representing the Track facade contained in top tracks list.This
 * pojo represents an individual track in top tracks list
 * @author gaurav
 *
 */
public class LastFMTopTrack {

	
	@JsonProperty private String name;
	@JsonProperty private int duration;
	@JsonProperty private long playcount;
	@JsonProperty private long listeners;
	@JsonProperty private String mbid;
	@JsonProperty private String url;
	@JsonProperty private LastFMStreamable streamable;
	@JsonProperty private LastFMTopTracksArtist artist;
	@JsonProperty private List<Image> image;
	@JsonProperty("@attr") private LastFMRankAttr rankAttr;
	
	public void setName(String name){
		this.name = name;
	}
	/**
	 * get the name of the track
	 * @return name as string
	 */
	public String getName(){
		return name;
	}
	public void setDuration(int duration){
		this.duration = duration;
	}
	/**
	 * get the duration of track in seconds
	 * @return duration of track in seconds
	 */
	public int getDuration(){
		return duration;
	}
	public void setPlaycount(long playcount){
		this.playcount = playcount;
	}
	/**
	 * get the playcount property
	 * @return times played as integer
	 */
	public long getPlaycount(){
		return playcount;
	}
	public void setListeners(long listeners){
		this.listeners = listeners;
	}
	/**
	 * get the listeners of tracks
	 * @return total listeners as int
	 */
	public long getListeners(){
		return listeners;
	}
	public void setMbid(String mbid){
		this.mbid = mbid;
	}
	/**
	 * get the mbid of the track
	 * @return mbid as String
	 */
	public String getMbid(){
		return mbid;
	}
	public void setUrl(String url){
		this.url = url;
	}
	/**
	 * get the url of the track
	 * @return url of the track as String
	 */
	public String getUrl(){
		return url;
	}
	public void setStreamable(LastFMStreamable streamable){
		this.streamable = streamable;
	}
	/**
	 * return the <code>lastfm.artist.topalbums.Streamable</code> POJO representing
	 * the POJO Streaming properties
	 * @return Streamable POJO
	 */
	public LastFMStreamable getStreamable(){
		return streamable;
	}
	public void setArtist(LastFMTopTracksArtist artist){
		this.artist = artist;
	}
	/**
	 * get this tracks artist POJO
	 * @return artist as <code>lastfm.artist.toptracks.TopTracksArtist</code>
	 */
	public LastFMTopTracksArtist getArtist(){
		return artist;
	}
	public void setImage(List<Image> image){
		this.image = image;
	}
	/**
	 * get the list of images of varying sizes
	 * @return list of images of varying sizes as <code>java.util.List&lt;lastfm.util.Image&gt;</code>
	 */
	public List<Image> getImage(){
		return image;
	}
	public void setRankAttr(LastFMRankAttr rankAttr){
		this.rankAttr = rankAttr;
	}
	/**
	 * get the rank POJO
	 * @return rank property as <code>lastfm.artist.toptracks.RankAttr</code>
	 */
	public LastFMRankAttr getRankAttr(){
		return rankAttr;
	}
}
