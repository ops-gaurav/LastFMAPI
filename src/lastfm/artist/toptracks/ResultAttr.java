package lastfm.artist.toptracks;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * this contains the results meta-data about the results being fetched from
 * the last.fm server
 * @author gaurav
 *
 */
public class ResultAttr {

	@JsonProperty private String artist;
	@JsonProperty("page") private int currentPage;
	@JsonProperty("perPage") private int resultPerPage;
	@JsonProperty private int totalPages;
	@JsonProperty("total") private int totalResults;
	
	public void setArtist(String artist){
		this.artist = artist;
	}
	/**
	 * get the name of the artist for which the current query is running
	 * @return name of artist
	 */
	public String getArtist(){
		return artist;
	}
	public void setCurrentPage(int page){
		this.currentPage = page;
	}
	/**
	 * the results are sent as pages. like 5 results per page for 20 results will give
	 * total of 5 pages. This property is used to access the result page number
	 * @return current page number
	 */
	public int getCurrentPage(){
		return currentPage;
	}
	public void setResultPerPage(int resultPerPage){
		this.resultPerPage = resultPerPage;
	}
	/**
	 * get the total number of results displayed per page
	 * @return number of results
	 */
	public int getResultPerPage(){
		return resultPerPage;
	}
	
	public void setTotalPages(int totalPages){
		this.totalPages = totalPages;
	}
	/**
	 * returns the total number of pages containing results
	 * @return number of pages
	 */
	public int getTotalPages(){
		return totalPages;
	}
	
	public void setTotalResults(int totalResults){
		this.totalResults = totalResults;
	}
	/**
	 * returns the total number of results
	 * @return number indicating the results count
	 */
	public int getTotalResults(){
		return totalResults;
	}
}
