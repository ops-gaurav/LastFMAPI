package lastfm.artist.info;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class LastFMBandMembers {

	@JsonProperty("member") private List<LastFMBandMember> members;
	
	public void setMembers(List<LastFMBandMember> members){
		this.members = members;
	}
	public List<LastFMBandMember> getMembers(){
		return members;
	}
}
