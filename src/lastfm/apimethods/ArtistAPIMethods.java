package lastfm.apimethods;

public interface ArtistAPIMethods {
	@Deprecated
	public final String ARTIST_EVENTS = "http://ws.audioscrobbler.com/2.0/?method=artist.getevents";
	public final String ARTIST_INFO = "http://ws.audioscrobbler.com/2.0/?method=artist.getinfo";
	public final String ARTIST_TOP_TRACKS = "http://ws.audioscrobbler.com/2.0/?method=artist.gettoptracks";
}
