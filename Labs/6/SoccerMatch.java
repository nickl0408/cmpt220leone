import java.sql.Date;
import java.util.*;

class Player

{

private String name;
private int goals;
private String team;

	Player() {
		name = team = "";
		goals = 0;

	}

	Player(String name, int goal, String team) {
		this.name = name;
		this.goals = goal;
		this.team = team;

	}

	void setName(String name) {
		this.name = name;

	}
	
	void setTeam(String team) {
		this.team = team;

	}

	void setGoals(int goals) {
		this.goals = goals;

	}

	String getName() {
		return name;

	}

	String getTeam() {
		return team;

	}

	int getGoals() {
		return goals;
	}

	public String toString() {
		return "\n Player Name: " + name + "\t Team: " + team + "\t Goals: " + goals;
	
		}
	}

class Goal {

	private int minute;
	private Player player;

	Goal() {
		minute = 0;
		player = null;

	}
	
	Goal(int min, Player p) {

		minute = min;
		player = p;

	}

	void setMinute(int minute) {
		this.minute = minute;
	}

	void setPlayer(Player player) {
		this.player = player;

	}

	int getMinute() {
		return minute;

	}

	Player getPlayer() {
		return player;

	}

	public String toString() {

		return "\n Minute at which the goal is scored: " + minute +
			   "\n The player scored the goal: " + player.getName();

	}
}


public class SoccerMatch {

	Date startTime;
	Date endTime;
	String venue;
	String home;
	String visitor;
	Player homePlayers[];
	Player visitorPlayers[];
	Goal homeGoals[];
	Goal visitorGoals[];
	int homePlayerNum;
	int homeGoalNum; 
	int visitPlayerNum;
	int visitGoalNum;

	SoccerMatch() {
		startTime = endTime = null;
		venue = home = visitor = null;
		homePlayers = new Player[11];
		visitorPlayers = new Player[11];
		visitorGoals = new Goal[10];
		homeGoals = new Goal[10];
		homePlayerNum = visitPlayerNum = homeGoalNum = visitGoalNum = 0;

		for(int x = 0; x < 11; x++) {
			homePlayers[x] = new Player();
			visitorPlayers[x] = new Player();

		}

		for(int x = 0; x < 10; x++) {
			homeGoals[x] = new Goal();
			visitorGoals[x] = new Goal();

		}
	}



	SoccerMatch(Date start, Date end, String venue, String home, String visit) {
			
			this();
			startTime = start;
			endTime = end;
			venue = venue;
			home = home;
			visitor = visit;
		}

		void addHomePlayer(Player p) {
			homePlayers[homePlayerNum++] = p;
		}

		void addVisitorPlayer(Player p) {
			visitorPlayers[visitPlayerNum++] = p;
		}

		void addHomeGoal(Goal g) {
			homeGoals[homeGoalNum++] = g;
		}
		
		void addVisitorGoal(Goal g) {
			visitorGoals[visitGoalNum++] = g;
		}

		int [] getHomeGoals() {
		int goals[] = new int[10];

		for(int x = 0; x < 10; x++)
		goals[x] = homeGoals[x].getPlayer().getGoals();

			return goals;

		}

		int [] getVisitorGoals() {
		int goals[] = new int[10];

		for(int x = 0; x < 10; x++)
			goals[x] = visitorGoals[x].getPlayer().getGoals();

			return goals;
		}

		String getWinner() {
		String winStatus = "";
			int homeGoals[] = getHomeGoals();
			int visitGoals[] = getVisitorGoals();
			int totalHome = 0, totalVisit = 0;
			for(int x = 0; x < 10; x++) {
				totalHome += homeGoals[x];
				totalVisit += visitGoals[x];
			}

			winStatus = "\n Giants Total Goals: " + totalHome + "\n Penguins Team Total Goals: " + totalVisit;

			if(totalHome > totalVisit)
				winStatus += "\nGiants Win!";
			else if(totalVisit > totalHome)
				winStatus += "\n Penguins Win!";
			else
				winStatus += "\n The Giants and Penguins Tie";
			return winStatus;

			}
		
		public static void main(String[] args) {

			Random rand = new Random();
			Date d1 = new Date(2018, 11, 12);
			Date d2 = new Date(2018, 11, 12);

			SoccerMatch sim = new SoccerMatch(d1, d2, "", "Giants", "Penguins");

			String homePlayerName [] = {"Manning", "Barkley", "Beckham", "Shepard", "Solder", "Engram", "Vernon", "Apple", "Jenkens", "Collins", "Rosas"};
			String visitPlayerName [] = {"Crosby", "Guentzal", "Sprong", "Malkin", "Rust", "Kessel", "Hornqvist", "Brassard", "Letang", "Simon", "Oleksiak"};

			for(int x = 0; x < 11; x++) {

				sim.addHomePlayer(new Player(homePlayerName[x], rand.nextInt(10), "Giants"));
				sim.addVisitorPlayer(new Player(visitPlayerName[x], rand.nextInt(10), "Penguins"));

			}

			for(int x = 0; x < 10; x++) {

				sim.addHomeGoal(new Goal(rand.nextInt(59), sim.homePlayers[x]));
				sim.addVisitorGoal(new Goal(rand.nextInt(59), sim.visitorPlayers[x]));

			}
			
			System.out.print("\n--- Giants Players ---\n ");
			
			for(int x = 0; x < 11; x++)

			System.out.println(sim.homePlayers[x]);

			System.out.print("\n--- Penguins Players ---\n ");

			for(int x = 0; x < 11; x++)
				
			System.out.println(sim.visitorPlayers[x]);

			System.out.print("\n--- Giants Goals ---\n ");

			for(int x = 0; x < 10; x++)

			System.out.println(sim.homeGoals[x]);

			System.out.print("\n--- Penguins Goals ---\n ");

			for(int x = 0; x < 10; x++)

			System.out.println(sim.visitorGoals[x]);

			System.out.print("\n---Finish---\n ");

			System.out.println(sim.getWinner());

		}
	}

