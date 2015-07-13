package lastfm.artist.info;

import com.fasterxml.jackson.annotation.JsonProperty;

public class BandMember {

	@JsonProperty private String name;
	@JsonProperty("yearfrom") private int fromYear;
	@JsonProperty("yearto") private int yearTo;
	
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return name;
	}
	public void setFromYear(int year){
		this.fromYear = year;
	}
	public int getFromYear(){
		return fromYear;
	}
	public void setYearTo(int yearTo){
		this.yearTo = yearTo;
	}
	public int getYearTo(){
		return yearTo;
	}
}
