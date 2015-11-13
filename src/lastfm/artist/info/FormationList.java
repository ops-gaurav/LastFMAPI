package lastfm.artist.info;

import com.fasterxml.jackson.annotation.JsonProperty;

public class FormationList {

	@JsonProperty private Formation formation;
	
	public void setFormation(Formation formation){
		this.formation = formation;
	}
	
	public Formation getFormation(){
		return formation;
	}
	
}
