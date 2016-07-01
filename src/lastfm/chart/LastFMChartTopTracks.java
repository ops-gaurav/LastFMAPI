package lastfm.chart;

import lastfm.apimethods.ChartAPIMethods;
import lastfm.chart.toptracks.ChartTopTracks;
import lastfm.chart.toptracks.ChartTopTracksWrapper;
import lastfm.util.DeserializeObject;
import lastfm.util.FetchJSON;

public class LastFMChartTopTracks {

	private String genMethod;
	private int limit;
	
	/**
	 * the default constructor
	 * @param key last.fm API key
	 */
	public LastFMChartTopTracks (String key) {
		genMethod = "";
		genMethod += ChartAPIMethods.CHART_TOP_TRACKS +"&format=json";
		genMethod += "&api_key="+ key;
		
		limit = 10;
	}
	
	/**
	 * setting the results limit
	 * @param limit
	 */
	public void setLimit (int limit) {
		this.limit = limit;
	}
	
	/**
	 * fetch the chart top tracks
	 * @return
	 */
	public ChartTopTracks fetchChartTopTracks () {
		genMethod += "&limit=" +limit;
		
		String json = FetchJSON.fetchJSONFrom(genMethod);
		if (json != null) {
			
			DeserializeObject<ChartTopTracksWrapper> deserializer = new DeserializeObject<>();
			ChartTopTracksWrapper wrapper = deserializer.deserialize(json, ChartTopTracksWrapper.class);
			
			return wrapper.tracks;
			
		}
		
		return null;
		
	}
	
	
	
}
