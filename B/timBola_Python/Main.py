from hashlib import new
from Team import Team

# create new team instance called arsenal using setter
arsenal = Team()
arsenal.setTeamName("Arsenal")
arsenal.setSince("1886")
arsenal.setCountry("England")
arsenal.setPlayer(["Mesut Ozil", "Olivier Giroud", "Kieran Tierny"])

arsenal.setStadium("Emirates Stadium", 60260, "London, UK")

arsenal.ShowTeam()
arsenal.getStadium().ShowStadium()


print("\n=========================\n")
# create new Team instance using constructors
persib = Team("Persib", "Indonesia", "1933", ["Febri Hariyadi", "Marc Kloc"])
persib.setStadium("GBLA", 40157, "Bandung, Indonesia")

persib.ShowTeam()
persib.getStadium().ShowStadium()
