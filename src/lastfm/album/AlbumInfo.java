package lastfm.album;

import lastfm.album.info.LastFMAlbum;
import lastfm.album.info.LastFMAlbumWrapper;
import lastfm.util.FetchJSON;
import lastfm.util.DeserializeObject;

/**
 * class to fetch the album info from the last.fm database
 * @author gaurav
 *
 */
public class AlbumInfo {
	
	private final String method = AlbumAPIMethods.INFO_ADDR;
	
	private String genMethod;
	
	/**
	 * the default constructor
	 * @param apiKey represents the last.fm api key for callback
	 * @param artist represents the artist of the album
	 * @param album represents the album name
	 */
	public AlbumInfo(String apiKey, String artist, String album){
		
		this.genMethod = method;
		genMethod += "&api_key="+ apiKey;
		genMethod += "&artist="+ artist;
		genMethod += "&album="+ album;
		genMethod += "&format=json";
		genMethod += "&autocorrect=1";
		
		System.out.println(genMethod);
	}
	
	/**
	 * method to get the Album instance that holds the information about 
	 * an album. It holds the album information represented in POJO
	 * @return <code>lastfm.album.facades.Album</code> that holds the album info
	 */
	public LastFMAlbum getAlbumInfo(){
		String jsonData = FetchJSON.fetchJSONFrom(genMethod);
		if(jsonData != null){
			
			DeserializeObject<LastFMAlbumWrapper> wrapperDeserializer = new DeserializeObject<>();
			LastFMAlbumWrapper wrapper = wrapperDeserializer.deserealize(jsonData, LastFMAlbumWrapper.class);
			
			return wrapper.getAlbum();
		}
		return null;
	}
	
	
}
