package ie.cit.caf.assignment1;

public class Participant extends Participation {
	
	private int person_id;
	private String person_name;
	private String person_date;
	private String person_url;
	public int getPerson_id() {
		return person_id;
	}
	public void setPerson_id(int person_id) {
		this.person_id = person_id;
	}
	public String getPerson_name() {
		return person_name;
	}
	public void setPerson_name(String person_name) {
		this.person_name = person_name;
	}
	public String getPerson_date() {
		return person_date;
	}
	public void setPerson_date(String person_date) {
		this.person_date = person_date;
	}
	public String getPerson_url() {
		return person_url;
	}
	public void setPerson_url(String person_url) {
		this.person_url = person_url;
	}
	@Override
	public String toString() {
		return "Participant [person_id=" + person_id + ", person_name="
				+ person_name + ", person_date=" + person_date
				+ ", person_url=" + person_url + "]";
	}
		
}
