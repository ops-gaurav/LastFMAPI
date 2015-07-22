package lastfm.track;

import lastfm.track.info.LastFMTrackInfoWrapper;
import lastfm.track.info.LastFMTrack;
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
	
	public LastFMTrack fetchTrackInfo(){
		String json = FetchJSON.fetchJSONFrom(genMethod);
		if(json != null){
			
			DeserializeObject<LastFMTrackInfoWrapper> deserialize = new DeserializeObject<>();
			LastFMTrackInfoWrapper wrapper = deserialize.deserealize(json, LastFMTrackInfoWrapper.class);
			
			return wrapper.getTrackInfo();
			
		}
		return null;
	}
	
}
