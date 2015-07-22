package lastfm.artist.events;

import java.util.List;
import lastfm.types.Image;
import com.fasterxml.jackson.annotation.JsonProperty;

public class LastFMEvent {

	@JsonProperty private int id;
	@JsonProperty private String title;
	@JsonProperty private LastFMEventArtists artists;
	@JsonProperty private LastFMVenue venue;
	@JsonProperty private String startDate;
	@JsonProperty private String endDate;
	@JsonProperty private String description;
	@JsonProperty private List<Image> image;
	@JsonProperty private String attendance;
	@JsonProperty private String reviews;
	@JsonProperty private String tag;
	@JsonProperty private String url;
	@JsonProperty private String website;
	@JsonProperty private String tickets;
	@JsonProperty private String cancelled;
	@JsonProperty private LastFMEventTags tags;
	
	public void setId(int id){
		this.id = id;
	}
	
	public int getId(){
		return id;
	}
	
	public void setTitle(String title){
		this.title = title;
	}
	
	public String getTitle(){
		return title;
	}
	
	public void setArtists(LastFMEventArtists artists){
		this.artists = artists;
	}
	
	public LastFMEventArtists getArtists(){
		return artists;
	}
	public void setVenue(LastFMVenue venue){
		this.venue = venue;
	}
	public LastFMVenue getVenue(){
		return venue;
	}
	public void setStartDate(String startDate){
		this.startDate = startDate;
	}
	public String getStartDate(){
		return startDate;
	}
	public void setEndDate(String endDate){
		this.endDate = endDate;
	}
	public String getEndDate(){
		return endDate;
	}
	public void setDescription(String description){
		this.description = description;
	}
	public String getDescription(){
		return description;
	}
	public void setImage(List<Image> image){
		this.image = image;
	}
	public List<Image> getImage(){
		return image;
	}
	public void setAttendance(String attendance){
		this.attendance = attendance;
	}
	public String getAttendance(){
		return attendance;
	}
	public void setReviews(String reviews){
		this.reviews = reviews;
	}
	public String getReviews(){
		return reviews;
	}
	public void setTag(String tag){
		this.tag = tag;
	}
	public String getTag(){
		return tag;
	}
	public void setUrl(String url){
		this.url = url;
	}
	public String getUrl(){
		return url;
	}
	public void setWebsite(String website){
		this.website = website;
	}
	public String getWebsite(){
		return website;
	}
	public void setTickets(String tickets){
		this.tickets = tickets;
	}
	public String getTickets(){
		return tickets;
	}
	public void setCancelled(String cancelled){
		this.cancelled = cancelled;
	}
	public String getCancelled(){
		return cancelled;
	}
	public void setTags(LastFMEventTags tags){
		this.tags = tags;
	}
	public LastFMEventTags getTags(){
		return tags;
	}
}
