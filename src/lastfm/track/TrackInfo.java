package lastfm.track;

import lastfm.track.info.TrackInfoWrapper;
import lastfm.track.info.Track;
import lastfm.util.DeserializeObject;
import lastfm.util.FetchJSON;
import lastfm.apimethods.TrackAPIMethods;

public class TrackInfo {

	private String genMethod = "";
	
	public TrackInfo(String apiKey){
		genMethod += TrackAPIMethods.TRACK_INFO;
		genMethod += "&api_key="+ apiKey;
	}
	
	public Track fetchTrackInfo (String artist, String track){
		
		genMethod += "&artist="+ artist;
		genMethod += "&track="+ track;
		
		String json = FetchJSON.fetchJSONFrom(genMethod);
		if(json != null){
			
			DeserializeObject<TrackInfoWrapper> deserialize = new DeserializeObject<>();
			TrackInfoWrapper wrapper = deserialize.deserialize(json, TrackInfoWrapper.class);
			
			return wrapper.getTrackInfo();
			
		}
		return null;
	}
	
}
