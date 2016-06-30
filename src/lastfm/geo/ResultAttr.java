package lastfm.geo;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ResultAttr {

	@JsonProperty private String country;
	@JsonProperty private int page;
	@JsonProperty private int perPage;
	@JsonProperty private int totalPages;
	@JsonProperty private long total;
	/**
	* this is the getter function for property country
	* @return
	*/
	public String getCountry(){
		return country;
	}
	/**
	* this is the getter function for property country
	* @param country
	* 
	*/
	public void  setcountry(String country){
		this.country=country;
	}
	/**
	* this is the getter function for property page
	* @return
	*/
	public int getPage(){
		return page;
	}
	/**
	* this is the getter function for property page
	* @param page
	* 
	*/
	public void  setpage(int page){
		this.page=page;
	}
	/**
	* this is the getter function for property perPage
	* @return
	*/
	public int getPerPage(){
		return perPage;
	}
	/**
	* this is the getter function for property perPage
	* @param perPage
	* 
	*/
	public void  setperPage(int perPage){
		this.perPage=perPage;
	}
	/**
	* this is the getter function for property totalPages
	* @return
	*/
	public int getTotalPages(){
		return totalPages;
	}
	/**
	* this is the getter function for property totalPages
	* @param totalPages
	* 
	*/
	public void  settotalPages(int totalPages){
		this.totalPages=totalPages;
	}
	/**
	* this is the getter function for property total
	* @return
	*/
	public long getTotal(){
		return total;
	}
	/**
	* this is the getter function for property total
	* @param total
	* 
	*/
	public void  settotal(long total){
		this.total=total;
	}
	
	
	
}
