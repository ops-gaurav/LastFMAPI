package lastfm.chart;

import lastfm.apimethods.ChartAPIMethods;
import lastfm.chart.topartists.ChartTopArtists;
import lastfm.chart.topartists.ChartTopArtistsWrapper;
import lastfm.util.DeserializeObject;
import lastfm.util.FetchJSON;

public class LastFMChartTopArtists {
	
	private String genMethod;
	private int limit;
	
	/**
	 * the default constructor
	 * @param key the last.fm developer API key
	 */
	public LastFMChartTopArtists (String key) {
		genMethod = "";
		genMethod += ChartAPIMethods.CHART_TOP_ARTISTS+"&format=json";
		genMethod += "&api_key="+ key;
		limit = 10;
	}
	
	/**
	 * set the number of results limit
	 * @param limit
	 */
	public void setLimit (int limit) {
		this.limit = limit;
	}
	
	/**
	 * fetch the top artists
	 * @return
	 */
	public ChartTopArtists fetchChartTopArtists () {
		
		genMethod += "&limit="+limit;
		
		String json = FetchJSON.fetchJSONFrom(genMethod);
		if (json != null) {
			
			DeserializeObject<ChartTopArtistsWrapper> deserializer = new DeserializeObject<>();
			ChartTopArtistsWrapper wrapper = deserializer.deserialize(json, ChartTopArtistsWrapper.class);
			
			return wrapper.artists;
			
		}
		return null;
		
		
	}
	
}
