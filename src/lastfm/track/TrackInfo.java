package lastfm.track;

import lastfm.track.info.TrackInfoWrapper;
import lastfm.track.info.Track;
import lastfm.util.DeserializeObject;
import lastfm.util.FetchJSON;

public class TrackInfo {

	private String genMethod = "";
	
	public TrackInfo(String apiKey, String artist, String track){
		genMethod += TrackAPIMethods.TRACK_INFO;
		genMethod += "&api_key="+ apiKey;
		genMethod += "&artist="+ artist;
		genMethod += "&track="+ track;
	}
	
	public Track fetchTrackInfo(){
		String json = FetchJSON.fetchJSONFrom(genMethod);
		if(json != null){
			
			DeserializeObject<TrackInfoWrapper> deserialize = new DeserializeObject<>();
			TrackInfoWrapper wrapper = deserialize.deserealize(json, TrackInfoWrapper.class);
			
			return wrapper.getTrackInfo();
			
		}
		return null;
	}
	
}
