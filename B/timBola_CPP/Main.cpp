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

	// print result
	arsenal.ShowTeam();

	cout << "=========================" << endl;

	// create new instance of Team class
	Team persib;
	vector<string> psbPlayer = {"Febry Hariyadi", "Beckham Putra", "Marc Kloc", "Teja Paku"};
	persib.setTeamName("Persib");
	persib.setCountry("Indonesia");
	persib.setSince("1933");
	persib.setPlayer(psbPlayer);
	persib.ShowTeam();
}