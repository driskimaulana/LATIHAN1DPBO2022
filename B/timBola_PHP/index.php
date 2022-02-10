<?php

include "Team.php";

// arsenals player array
$arsenalPlayer = array("Mesut Ozil", "Olivier Giroud", "Kieran Tierny");

// create new Team instance named Arsenal
$arsenal = new Team("Arsenal", "England", "1886", $arsenalPlayer);
// show the team
$arsenal->ShowTeam();
echo "<br>";
echo "<br>";
// persib player array
$persibPlayer = array("Febry Haryadi", "Teja Paku", "Beckham Putra", "Marc Klok");
// create new Team instance named Persib
$persib = new Team("Persib", "Indonesia", "1993", $persibPlayer);
// show the persib team
$persib->ShowTeam();
