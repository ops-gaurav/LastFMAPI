package lastfm.album;

import lastfm.album.info.Album;
import lastfm.album.info.AlbumWrapper;
import lastfm.util.FetchJSON;
import lastfm.util.DeserializeObject;
import lastfm.apimethods.AlbumAPIMethods;

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
	public AlbumInfo(String apiKey){
		
		this.genMethod = method;
		genMethod += "&api_key="+ apiKey;
		genMethod += "&format=json";
		genMethod += "&autocorrect=1";
		
		System.out.println(genMethod);
	}
	
	/**
	 * method to get the Album instance that holds the information about 
	 * an album. It holds the album information represented in POJO
	 * @return <code>lastfm.album.facades.Album</code> that holds the album info
	 * @param artist
	 * @param album
	 */
	public Album getAlbumInfo(String artist, String album){
		
		genMethod += "&artist="+ artist;
		genMethod += "&album="+ album;
		
		String jsonData = FetchJSON.fetchJSONFrom(genMethod);
		if(jsonData != null){
			
			DeserializeObject<AlbumWrapper> wrapperDeserializer = new DeserializeObject<>();
			AlbumWrapper wrapper = wrapperDeserializer.deserealize(jsonData, AlbumWrapper.class);
			
			return wrapper.getAlbum();
		}
		return null;
	}
	
	
}
