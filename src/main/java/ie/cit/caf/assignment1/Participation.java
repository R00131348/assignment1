package ie.cit.caf.assignment1;



public class Participation {

	

	Participant participant;
	Role role;
	
	
		
	@Override
	public String toString() {
		return "Participation [participant=" + participant + ", role=" + role
				+ "]";
	}
	
	
	public Participant getParticipant() {
		return participant;
	}
	public void setParticipant(Participant participant) {
		this.participant = participant;
	}
	public Role getRole() {
		return role;
	}
	public void setRole(Role role) {
		this.role = role;
	}
	
	
}