package ie.cit.caf.assignment1;

import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
@JsonIgnoreProperties (ignoreUnknown = true)

public class ChObject {

	private static int id;
	private static String title;
	private Date date;
	private String medium;
	private String creditline;
	private String description;
	private String gallery_text;
	
	
			
	@Override
	public String toString() {
		return "ChObject [id=" + id + ", title=" + title + ", date=" + date
				+ ", medium=" + medium + ", creditline=" + creditline
				+ ", description=" + description + ", gallery_text="
				+ gallery_text + "]";
	}


	public static int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public static String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
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


	public void setDescription(String description) {
		this.description = description;
	}


	public String getGallery_text() {
		return gallery_text;
	}


	public void setGallery_text(String gallery_text) {
		this.gallery_text = gallery_text;
	}
	
	

	List<Participation> participations;
	
}
