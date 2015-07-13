package lastfm.artist.events;

import java.util.List;
import com.google.gson.annotations.Expose;
import lastfm.types.Image;

public class Event {

	@Expose private int id;
	@Expose private String title;
	@Expose private EventArtists artists;
	@Expose private Venue venue;
	@Expose private String startDate;
	@Expose private String endDate;
	@Expose private String description;
	@Expose private List<Image> image;
	@Expose private String attendance;
	@Expose private String reviews;
	@Expose private String tag;
	@Expose private String url;
	@Expose private String website;
	@Expose private String tickets;
	@Expose private String cancelled;
	@Expose private EventTags tags;
	
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
	
	public void setArtists(EventArtists artists){
		this.artists = artists;
	}
	
	public EventArtists getArtists(){
		return artists;
	}
	public void setVenue(Venue venue){
		this.venue = venue;
	}
	public Venue getVenue(){
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
	public void setTags(EventTags tags){
		this.tags = tags;
	}
	public EventTags getTags(){
		return tags;
	}
}
