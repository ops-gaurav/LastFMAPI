package lastfm.artist.info;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class BandMembers {

	@JsonProperty("member") private List<BandMember> members;
	
	public void setMembers(List<BandMember> members){
		this.members = members;
	}
	public List<BandMember> getMembers(){
		return members;
	}
}
