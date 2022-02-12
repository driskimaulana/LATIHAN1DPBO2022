#include <string>
#include <vector>
#include <iostream>

using namespace std;

class Team
{
private:
	/* data */
	// attribute class
	string teamName;
	string country;
	string since;
	vector<string> player;

public:
	Team()
	{
	}
	Team(string teamName, string country, string since, vector<string> player)
	{
		this->teamName = teamName;
		this->country = country;
		this->since = since;
		this->player.insert(this->player.end(), player.begin(), player.end());
	};

	// getter and setter for all the attribute
	void setTeamName(string teamName)
	{
		this->teamName = teamName;
	}
	string getTeamName()
	{
		return this->teamName;
	}
	void setCountry(string country)
	{
		this->country = country;
	}
	string getCountry()
	{
		return this->country;
	}
	void setSince(string since)
	{
		this->since = since;
	}
	string getSince()
	{
		return this->since;
	}
	vector<string> getPlayer()
	{
		return this->player;
	}
	void setPlayer(vector<string> player)
	{
		this->player.insert(this->player.end(), player.begin(), player.end());
	}

	class Stadium
	{
	private:
		string stadiumName;
		int capacity;
		string stadiumLocation;

	public:
		void setStadiumName(string stadiumName)
		{
			this->stadiumName = stadiumName;
		};
		string getStadiumName()
		{
			return this->stadiumName;
		};

		void setCapacity(int capacity)
		{
			this->capacity = capacity;
		};

		int getCapacity()
		{
			return this->capacity;
		};

		void setStadiumLocation(string stadiumLocation)
		{
			this->stadiumLocation = stadiumLocation;
		}

		void ShowStadium()
		{
			cout << "      --------" << endl;
			cout << "      HOMEBASE" << endl;
			cout << "      --------" << endl;
			cout << "Stadium Name: " + this->stadiumName << endl;
			cout << "Capacity: " << this->capacity << endl;
			cout << "Stadium Location: " + this->stadiumLocation << endl;
		}
	};

	Stadium st;
	void setStadium(string stadiumName, int capacity, string stadiumLocation)
	{
		st.setStadiumName(stadiumName);
		st.setStadiumLocation(stadiumLocation);
		st.setCapacity(capacity);
	};

	Stadium getStadium()
	{
		return st;
	}

	void ShowTeam()
	{
		cout << "Team Name: " + this->getTeamName() << endl;
		cout << "Country: " + this->getCountry() << endl;
		cout << "Established: " + this->getSince() << endl;
		cout << "Player: " << endl;

		for (auto const &c : this->getPlayer())
		{
			cout << "     - " + c << endl;
		}
	}
};