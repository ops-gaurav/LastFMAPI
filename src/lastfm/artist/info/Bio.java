package lastfm.artist.info;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Bio {
	
	@JsonProperty private Links links;
	@JsonProperty private String published;
	@JsonProperty private String summary;
	@JsonProperty private String content;
	@JsonProperty("placeformed") private String placeFormed;
	@JsonProperty("yearformed") private int yearFormed;
	@JsonProperty("formationlist") private FormationList formationList;
	
	public void setLinks(Links links){
		this.links = links;
	}
	public Links getLinks(){
		return links;
	}
	public void setPublished(String published){
		this.published = published;
	}
	public String getPublished(){
		return published;
	}
	public void setSummary(String summary){
		this.summary = summary;
	}
	public String getSummary(){
		return summary;
	}
	public void setContent(String content){
		this.content = content;
	}
	public String getContent(){
		return content;
	}
	
	public void setPlaceFormed(String placeFormed){
		this.placeFormed = placeFormed;
	}
	public String getPlaceFormed(){
		return placeFormed;
	}
	
	public void setYearFormed(int yearFormed){
		this.yearFormed = yearFormed;
	}
	public int getYearFormed(){
		return yearFormed;
	}
	public void setFormationList(FormationList formationList){
		this.formationList = formationList;
	}
	public FormationList getFormationList(){
		return formationList;
	}
}
