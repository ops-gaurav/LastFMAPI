package lastfm.artist.info;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import lastfm.types.Image;

public class Artist {

	@JsonProperty private String name;
	@JsonProperty private String mbid;
	@JsonProperty private BandMembers bandmembers;
	@JsonProperty private String url;
	@JsonProperty private List<Image> image;
	@JsonProperty private int streamable;
	@JsonProperty private int ontour;
	@JsonProperty private Stats stats;
	@JsonProperty private SimilarArtists similar;
	@JsonProperty private Tags tags;
	@JsonProperty private Bio bio;
	
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
	
	public void setBandmembers(BandMembers bandmembers){
		this.bandmembers = bandmembers;
	}
	public BandMembers getBandmembers(){
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
	public void setStats(Stats stats){
		this.stats = stats;
	}
	public Stats getStats(){
		return stats;
	}
	public void setSimilar(SimilarArtists similar){
		this.similar = similar;
	}
	public SimilarArtists getSimilar(){
		return similar;
	}
	public void setTags(Tags tags){
		this.tags = tags;
	}
	public Tags getTags(){
		return tags;
	}
	public void setBio(Bio bio){
		this.bio = bio;
	}
	public Bio getBio(){
		return bio;
	}
}
