public class TeamTest {

    public static void main(String[] args) {
        FootballPlayer joe = new FootballPlayer("Joe");
        BaseballPlayer pat = new BaseballPlayer("Pat");
        SoccerPlayer david = new SoccerPlayer("David");

        //Team liverpool = new Team("Liverpool");

        Team<SoccerPlayer> liverpool = new Team("Liverpool");

        //liverpool.addPlayer(joe);
       // liverpool.addPlayer(pat);
        liverpool.addPlayer(david);


    }
}
