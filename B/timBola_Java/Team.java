public class Team {

	// class attribute
	private String teamName;
	private String country;
	private String since;
	private String[] player;

	private Stadium st;

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

	public void setSt(String stadiumName, int capacity, String stadiumLocation) {
		st = new Stadium();
		st.setStadiumLocation(stadiumLocation);
		st.setcapacity(capacity);
		st.setStadiumName(stadiumName);
	}

	public Stadium getSt() {
		return st;
	}

	public void setPlayer(String[] player) {
		this.player = player;
	}

	public String[] getPlayer() {
		return player;
	}

	class Stadium {

		// stadiumclass attribute
		public String stadiumName;
		public int capacity;
		public String stadiumLocation;

		// constructors
		Stadium() {

		}

		Stadium(String stadiumName, int capacity, String stadiumLocation) {
			this.stadiumLocation = stadiumLocation;
			this.capacity = capacity;
			this.stadiumName = stadiumName;
		}

		// setter and getter
		public void setStadiumLocation(String stadiumLocation) {
			this.stadiumLocation = stadiumLocation;
		}

		public String getStadiumLocation() {
			return stadiumLocation;
		}

		public void setStadiumName(String stadiumName) {
			this.stadiumName = stadiumName;
		}

		public String getStadiumName() {
			return stadiumName;
		}

		public void setcapacity(int capacity) {
			this.capacity = capacity;
		}

		public int getcapacity() {
			return capacity;
		}

		// method for show the stadium class result
		public void ShowStadium() {
			System.out.println("      --------");
			System.out.println("      HOMEBASE");
			System.out.println("      --------");
			System.out.println("Stadium Name: " + this.getStadiumName());
			System.out.println("Capacity: " + this.getcapacity());
			System.out.println("Location: " + this.getStadiumLocation());
		}

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
