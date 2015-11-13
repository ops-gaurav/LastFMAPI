package lastfm.album.info;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AlbumWrapper {

	@JsonProperty private Album album;
	
	public void setAlbum(Album album){
		this.album = album;
	}
	public Album getAlbum(){
		return album;
	}
}
