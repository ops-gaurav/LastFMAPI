package lastfm.artist.info;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * this class is a POJO representing the artist formation info
 * the "from" property tells the formation year of 
 * artist and "to" property tells about the end of 
 * formation (usually when the artist died). So, "to" property 
 * will be empty in case the artist is dead :'( 
 * @author gaurav
 *
 */

public class Formation {

	@JsonProperty("yearfrom") private String from;
	@JsonProperty("yearto") private String to;
	
	public void setFrom(String from){
		this.from = from;
	}
	public String getFrom(){
		return from;
	}
	public void setTo(String to){
		this.to = to;
	}
	public String getTo(){
		return to;
	}
}
