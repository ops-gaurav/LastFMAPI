package lastfm.track.info;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import lastfm.types.Image;

public class TrackAlbum {

	@JsonProperty private String artist;
	@JsonProperty private String title;
	@JsonProperty private String mbid;
	@JsonProperty private String url;
	@JsonProperty("image") private List<Image> images;
	@JsonProperty("@attr") private TrackAlbumAttr albumAttr;
	
	public void setArtist(String artist){
		this.artist = artist;
	}
	public String getArtist(){
		return artist;
	}
	public void setTitle(String title){
		this.title = title;
	}
	public String getTitle(){
		return title;
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
	public void setImages(List<Image> images){
		this.images = images;
	}
	public List<Image> getImages(){
		return images;
	}
	public void setAlbumAttr(TrackAlbumAttr attr){
		albumAttr = attr;
	}
	public TrackAlbumAttr getAlbumAttr(){
		return albumAttr;
	}
}
