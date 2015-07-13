package lastfm.artist.events;

import java.util.List;
import com.google.gson.annotations.Expose;
import lastfm.types.Image;

public class Venue {

	@Expose private int id;
	@Expose private String name;
	@Expose private Location location;
	@Expose private String url;
	@Expose private String website;
	@Expose private String phonenumber;
	@Expose private List<Image> image;
	
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
