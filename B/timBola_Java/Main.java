public class Main {

	public static void main(String[] args) {
		// arsenals player array
		String[] arsPlayer = { "Mesut Ozil", "Olivier Giroud", "Kieran Tierny" };
		// create new instance of team
		Team arsenal = new Team("Arsenal", "English", "1886", arsPlayer);

		arsenal.setSt("Emirates Stadium", 60260, "London, UK");

		// print arsenal team
		arsenal.ShowTeam();
		arsenal.getSt().ShowStadium();

		// persibs player array
		String[] psbPlayer = { "Febry Hariyadi", "Beckham Putra", "Marc Kloc", "Teja Paku" };

		// create new instance of team
		Team persib = new Team();
		persib.setTeamName("Persib");
		persib.setCountry("Indonesia");
		persib.setSince("1933");
		persib.setPlayer(psbPlayer);

		persib.setSt("GBLA", 40157, "Bandung, Indonesia");

		// print persib team
		System.out.println("\n=================================\n");
		persib.ShowTeam();
		persib.getSt().ShowStadium();

	}

}
