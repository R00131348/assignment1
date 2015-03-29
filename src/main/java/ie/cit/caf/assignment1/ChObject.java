package ie.cit.caf.assignment1;


import java.util.Date;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonUnwrapped;
@JsonIgnoreProperties (ignoreUnknown = true)

public class ChObject {


	private int id;
	private String title;
	private Date date;
	private String medium;
	private String creditline;
	private String description;
	private String gallery_text;
	
	@JsonUnwrapped
	public String Participation;
	
	public String Image;
	
	List<Participation> participations;
	
	List<Map<String,Image>> images;
	
	
	
	public String getParticipation() {
		return Participation;
	}


	public void setParticipation(String participation) {
		Participation = participation;
	}


	@Override
	public String toString() {
		return "ChObject [date=" + date + ", medium=" + medium
				+ ", creditline=" + creditline + ", description=" + description
				+ ", gallery_text=" + gallery_text + Participation + participations + "]";

	}
	
	public int getId() {
		return id;
	}


	public void setId(int id) {
		ChObject.id = id;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		ChObject.title = title;
	}


	public String getMedium() {
		return medium;
	}


	public void setMedium(String medium) {
		this.medium = medium;
	}


	public Date getDate() {
		return date;
	}


	public void setDate(Date date) {
		this.date = date;
	}


	public String getCreditline() {
		return creditline;
	}


	public void setCreditline(String creditline) {
		this.creditline = creditline;
	}


	public String getDescription() {
		return description;
	}


	public List<Participation> getParticipations() {
		return participations;
	}


	public void setParticipations(List<Participation> participations) {
		this.participations = participations;
	}


	public List<Map<String, Image>> getImages() {
		return images;
	}


	public void setImages(List<Map<String, Image>> images) {
		this.images = images;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public String getGallery_text() {
		return gallery_text;
	}


	public void setGallery_text(String gallery_text) {
		this.gallery_text = gallery_text;
	}
	
	


}
