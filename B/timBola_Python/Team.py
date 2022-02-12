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

    class Stadium:
        __stadiumName = ""
        __capacity = 0
        __stadiumLocation = ""

        def __init__(self, stadiumName="", capacity=0, stadiumLocation=""):
            self.__stadiumName = stadiumName
            self.__capacity = capacity
            self.__stadiumLocation = stadiumLocation

        def setStadiumName(self, stadiumName):
            self.__stadiumName = stadiumName

        def getStadiumName(self):
            return self.__stadiumName

        def setCapacity(self, capacity):
            self.__capacity = capacity

        def getCapacity(self):
            return self.__capacity

        def setStadiumLocation(self, stadiumLocation):
            self.__stadiumLocation = stadiumLocation

        def getStadiumLocation(self):
            return self.__stadiumLocation

        def ShowStadium(self):
            print("       --------")
            print("       HOMEBASE")
            print("       --------")
            print("Stadium Name: " + self.__stadiumName)
            print("Capacity: " + str(self.__capacity))
            print("Stadium Location: " + self.__stadiumLocation)

    __st = Stadium()

    def setStadium(self, stadiumName, capacity, stadiumLocation):
        self.__st.setStadiumName(stadiumName)
        self.__st.setStadiumLocation(stadiumLocation)
        self.__st.setCapacity(capacity)

    def getStadium(self):
        return self.__st

        # print method

    def ShowTeam(self):
        print("Team Name: " + self.getTeamName())
        print("Country: " + self.getCountry())
        print("Established: " + self.getSince())
        print("Player:")
        for i in self.getPlayer():
            print("    - " + i)
