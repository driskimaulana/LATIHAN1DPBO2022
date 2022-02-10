from mimetypes import init


class Team:
    # private attribute class
    __teamName = ""
    __country = ""
    __since = ""
    __player = ""

    def __init__(self, teamName="", country="", since="", player=""):
        self.__teamName = teamName
        self.__country = country
        self.__since = since
        self.__player = player

    def setTeamName(self, teamName):
        self.__teamName = teamName

    def getTeamName(self):
        return self.__teamName

    def setCountry(self, country):
        self.__country = country

    def getCountry(self):
        return self.__country

    def setSince(self, since):
        self.__since = since

    def getSince(self):
        return self.__since

    def setPlayer(self, player):
        self.__player = player

    def getPlayer(self):
        return self.__player

        # print method
    def ShowTeam(self):
        print("Team Name: " + self.getTeamName())
        print("Country: " + self.getCountry())
        print("Established: " + self.getSince())
        print("Player:")
        for i in self.getPlayer():
            print("    - " + i)
