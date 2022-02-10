package Latihan1.B.timBola_Java;

public class Main {

	public static void main(String[] args) {
		// arsenals player array
		String[] arsPlayer = { "Mesut Ozil", "Olivier Giroud", "Kieran Tierny" };
		// create new instance of team
		Team arsenal = new Team("Arsenal", "English", "1886", arsPlayer);

		// print arsenal team
		arsenal.ShowTeam();

		// persibs player array
		String[] psbPlayer = { "Febry Hariyadi", "Beckham Putra", "Marc Kloc", "Teja Paku" };

		// create new instance of team
		Team persib = new Team("Persib", "Indonesia", "1933", psbPlayer);

		// print persib team
		System.out.println("=================================");
		persib.ShowTeam();

	}

}
