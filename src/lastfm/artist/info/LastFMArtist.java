package lastfm.artist.info;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import lastfm.types.Image;

public class LastFMArtist {

	@JsonProperty private String name;
	@JsonProperty private String mbid;
	@JsonProperty private LastFMBandMembers bandmembers;
	@JsonProperty private String url;
	@JsonProperty private List<Image> image;
	@JsonProperty private int streamable;
	@JsonProperty private int ontour;
	@JsonProperty private LastFMStats stats;
	@JsonProperty private LastFMSimilarArtists similar;
	@JsonProperty private LastFMTags tags;
	@JsonProperty private LastFMBio bio;
	
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
	
	public void setBandmembers(LastFMBandMembers bandmembers){
		this.bandmembers = bandmembers;
	}
	public LastFMBandMembers getBandmembers(){
		return bandmembers;
	}
	
	public void setUrl(String url){
		this.url = url;
	}
	public String getUrl(){
		return url;
	}
	public void setImage(List<Image> image){
		this.image = image;
	}
	public List<Image> getImage(){
		return image;
	}
	public void setStreamable(int streamable){
		this.streamable = streamable;
	}
	public int getStreamable(){
		return streamable;
	}
	public void setOntour(int ontour){
		this.ontour = ontour;
	}
	public int getOntour(){
		return ontour;
	}
	public void setStats(LastFMStats stats){
		this.stats = stats;
	}
	public LastFMStats getStats(){
		return stats;
	}
	public void setSimilar(LastFMSimilarArtists similar){
		this.similar = similar;
	}
	public LastFMSimilarArtists getSimilar(){
		return similar;
	}
	public void setTags(LastFMTags tags){
		this.tags = tags;
	}
	public LastFMTags getTags(){
		return tags;
	}
	public void setBio(LastFMBio bio){
		this.bio = bio;
	}
	public LastFMBio getBio(){
		return bio;
	}
}
