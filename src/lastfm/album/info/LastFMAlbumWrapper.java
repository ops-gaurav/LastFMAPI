package lastfm.album.info;

import com.fasterxml.jackson.annotation.JsonProperty;

public class LastFMAlbumWrapper {

	@JsonProperty private LastFMAlbum album;
	
	public void setAlbum(LastFMAlbum album){
		this.album = album;
	}
	public LastFMAlbum getAlbum(){
		return album;
	}
}
