package com.company;

public class SoccerTeam {
    private int wins;
    private int loses;
    private int ties;
    private int numPoints;
    private static int TotalGoals = 0;
    private static int TotalGamesPlayed = 0;
    public SoccerTeam(){
        wins = 0;
        loses = 0;
        ties = 0;
    }
    public void played(SoccerTeam other, int myScore, int otherScore) {

        if (myScore == otherScore) {
            this.numPoints += 1;
            other.numPoints += 1;
            this.ties++;
            other.ties++;
        } else if (myScore > otherScore) {
            this.numPoints +=3;
            this.wins++;
            other.loses++;
        } else {
            other.numPoints += 3;
            other.wins++;
            this.loses++;
        }
        TotalGoals += myScore + otherScore;
        TotalGamesPlayed ++;
    }
      public int getCurrPoints(){
        return numPoints;
    }
    public void reset(){
      this.wins = 0;
      this.loses = 0;
      this.ties = 0;
    }
    public static int getTotalGoals(){
        return TotalGoals;
    }
    public static int getTotalGamesPlayed(){
        return TotalGamesPlayed;
    }
    public static void startTournament(){
        TotalGamesPlayed = 0;
        TotalGoals = 0;
    }
    public static void main(String [] args) {
        startTournament();
        SoccerTeam team1 = new SoccerTeam();
        SoccerTeam team2 = new SoccerTeam();
        SoccerTeam team3 = new SoccerTeam();
        SoccerTeam team4 = new SoccerTeam();
        team1.played(team2, 1,3);
        team1.played(team3, 2,1);
        team1.played(team4, 3,0);
        team2.played(team3, 2,2);
        team2.played(team4, 0,2);
        team3.played(team4, 3,3);
        team1.played(team2, 3,3);
        team2.played(team3, 4,0);
        team4.played(team1, 2,2);
        team1.played(team2, 0,0);
        team4.played(team2,0,3);
//        System.out.println(getTotalGamesPlayed());
//        System.out.println(getTotalGoals());
        System.out.println(team1.getCurrPoints());
        System.out.println(team2.getCurrPoints());
//        System.out.println(team3.getCurrPoints());
//        System.out.println(team4.getCurrPoints());
//        startTournament();
        team1.reset();
        team2.reset();
//        team3.reset();
//        team4.reset();
        team1.played(team2, 2,0);
        team1.played(team3, 3,4);
        team1.played(team4, 1,3);
        team2.played(team3, 0,0);
        team2.played(team4, 1,1);
        team3.played(team4, 2,4);
        team1.played(team2, 0,2);
        team2.played(team3, 2,2);
        team4.played(team1, 4,5);
        team1.played(team2, 6,5);
//        System.out.println(getTotalGamesPlayed());
//        System.out.println(getTotalGoals());
        System.out.println(team1.getCurrPoints());
//        System.out.println(team2.getCurrPoints());
//        System.out.println(team3.getCurrPoints());
//        System.out.println(team4.getCurrPoints());
    }
}
