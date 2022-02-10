package Latihan1.B.timBola_Java;

public class Team {

	// class attribute
	private String teamName;
	private String country;
	private String since;
	private String[] player;

	// empty consturctors
	Team() {

	}

	// constructors
	Team(String teamName, String country, String since, String[] player) {
		this.teamName = teamName;
		this.country = country;
		this.since = since;
		this.player = player;
	}

	// setter and getter for all the attribute
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	public String getTeamName() {
		return teamName;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getCountry() {
		return country;
	}

	public void setSince(String since) {
		this.since = since;
	}

	public String getSince() {
		return since;
	}

	public void setPlayer(String[] player) {
		this.player = player;
	}

	public String[] getPlayer() {
		return player;
	}

	// method for showing the result
	public void ShowTeam() {
		System.out.println("Team Name: " + this.getTeamName());
		System.out.println("Country: " + this.getCountry());
		System.out.println("Established: " + this.getSince());
		System.out.println("Player:");
		for (String ply : this.getPlayer()) {
			System.out.println("    - " + ply);
		}
	}

}
