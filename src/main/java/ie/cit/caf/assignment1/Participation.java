package ie.cit.caf.assignment1;

public class Participation {

	private int person_id;
	private int role_id;
	private String person_name;
	private String person_date;
	private String role_name;
	private String role_display_name;
	private String person_url;
	private String role_url;
	
	@Override
	public String toString() {
		return "Participation [person_id=" + person_id + ", role_id=" + role_id
				+ ", person_name=" + person_name + ", person_date="
				+ person_date + ", role_name=" + role_name
				+ ", role_display_name=" + role_display_name + ", person_url="
				+ person_url + ", role_url=" + role_url + "]";
	}

	public int getPerson_id() {
		return person_id;
	}

	public void setPerson_id(int person_id) {
		this.person_id = person_id;
	}

	public int getRole_id() {
		return role_id;
	}

	public void setRole_id(int role_id) {
		this.role_id = role_id;
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

	public String getRole_name() {
		return role_name;
	}

	public void setRole_name(String role_name) {
		this.role_name = role_name;
	}

	public String getRole_display_name() {
		return role_display_name;
	}

	public void setRole_display_name(String role_display_name) {
		this.role_display_name = role_display_name;
	}

	public String getPerson_url() {
		return person_url;
	}

	public void setPerson_url(String person_url) {
		this.person_url = person_url;
	}

	public String getRole_url() {
		return role_url;
	}

	public void setRole_url(String role_url) {
		this.role_url = role_url;
	}
	
}