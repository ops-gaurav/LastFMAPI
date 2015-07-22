package lastfm.artist.info;

import com.fasterxml.jackson.annotation.JsonProperty;

public class LastFMFormationList {

	@JsonProperty private LastFMFormation formation;
	
	public void setFormation(LastFMFormation formation){
		this.formation = formation;
	}
	
	public LastFMFormation getFormation(){
		return formation;
	}
	
}
