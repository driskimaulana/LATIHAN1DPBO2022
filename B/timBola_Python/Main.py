from hashlib import new
from Team import Team

# create new team instance called arsenal using setter
arsenal = Team()
arsenal.setTeamName("Arsenal")
arsenal.setSince("1886")
arsenal.setCountry("England")
arsenal.setPlayer(["Mesut Ozil", "Olivier Giroud", "Kieran Tierny"])

arsenal.ShowTeam()

print("=========================")
# create new Team instance using constructors
persib = Team("Persib", "Indonesia", "1886", ["Febri Hariyadi", "Marc Kloc"])

persib.ShowTeam()
