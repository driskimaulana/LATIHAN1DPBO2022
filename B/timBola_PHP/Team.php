<?php

class Team
{
	// team attribut
	private $teamName;
	private $country;
	private $since;
	private $player = array();

	// constructors
	public function Team($teamName = "", $country = "", $since = "", $player = "")
	{
		$this->teamName = $teamName;
		$this->country = $country;
		$this->since = $since;
		array_push($this->player, $player);
	}

	// getter and setter for all the attribute
	public function setTeamName($teamName)
	{
		$this->teamName = $teamName;
	}
	public function getTeamName()
	{
		return $this->teamName;
	}

	public function setCountry($country)
	{
		$this->country = $country;
	}

	public function getCountry()
	{
		return $this->country;
	}

	public function setSince($since)
	{
		$this->since = $since;
	}

	public function getSince()
	{
		return $this->since;
	}

	public function setPlayer($player)
	{
		array_push($this->player, $player);
	}

	public function getPlayer()
	{
		return $this->player;
	}

	// method for showing all the attribute
	public function ShowTeam()
	{
		echo "Team Name: " . $this->getTeamName() . "<br>";
		echo "Country: " . $this->getCountry() . "<br>";
		echo "Established: " . $this->getSince() . "<br>";

		$getArsPlayer = $this->getPlayer();

		echo "Player: " . "<br>";

		for ($i = 0; $i < count($getArsPlayer[0]); $i++) {
			echo "&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp- " . $getArsPlayer[0][$i] . "<br>";
		}
	}
}
