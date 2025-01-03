import java.util.ArrayList;

public class Team<T extends Player> {

    private String name;
    private ArrayList<T> members = new ArrayList();

    public Team(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean addPlayer(T player) {
        if(members.contains(player)) {
            System.out.println(player.getName() + " is already on the team");
            return false;
        }else {
            members.add(player);
            System.out.println(player.getName() + " has been added");
            return true;
        }
    }

    public int numPlayers() {
        return this.members.size();
    }
}
