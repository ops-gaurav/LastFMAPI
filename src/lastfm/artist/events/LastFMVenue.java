package lastfm.artist.events;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import lastfm.types.Image;

public class LastFMVenue {

	@JsonProperty private int id;
	@JsonProperty private String name;
	@JsonProperty private Location location;
	@JsonProperty private String url;
	@JsonProperty private String website;
	@JsonProperty private String phonenumber;
	@JsonProperty private List<Image> image;
	
	public void setId(int id){
		this.id = id;
	}
	public int getId(){
		return id;
	}
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return name;
	}
	public void setLocation(Location location){
		this.location = location;
	}
	public Location getLocation(){
		return location;
	}
	public void settUrl(String url){
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
	public void setPhonenumber(String phonenumber){
		this.phonenumber = phonenumber;
	}
	public String getPhonenumber(){
		return phonenumber;
	}
	public void setImage(List<Image> image){
		this.image = image;
	}
	public List<Image> getImage(){
		return image;
	}
	
}
