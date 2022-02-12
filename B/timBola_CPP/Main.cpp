#include <iostream>
#include <string>
#include <vector>
#include "Team.cpp"

using namespace std;

int main()
{
	// create new instance of Team class
	Team arsenal;
	// arsenal player array
	vector<string> arsPlayer = {"Mesut Ozil", "Olivier Giroud", "Kieran Tierny"};
	arsenal.setTeamName("Arsenal");
	arsenal.setCountry("England");
	arsenal.setSince("1886");
	arsenal.setPlayer(arsPlayer);

	arsenal.setStadium("Emirates Stadium", 60260, "London, UK");

	// print result
	arsenal.ShowTeam();
	arsenal.getStadium().ShowStadium();

	cout << "\n=========================\n"
		 << endl;

	// create new instance of Team class
	Team persib;
	vector<string> psbPlayer = {"Febry Hariyadi", "Beckham Putra", "Marc Kloc", "Teja Paku"};
	persib.setTeamName("Persib");
	persib.setCountry("Indonesia");
	persib.setSince("1933");
	persib.setPlayer(psbPlayer);
	persib.setStadium("GBLA", 40157, "Bandung, Indonesia");
	persib.ShowTeam();
	persib.getStadium().ShowStadium();
}