package edu.sandiego.comp305.sp24;

public class FootballTeam {
    private int wins;
    private int ties;
    private int losses;
    private int goalsScored;
    private int goalsAgainst;

    public FootballTeam(int wins, int ties, int losses, int goalsScored, int goalsAgainst) {
        this.wins = wins;
        this.ties = ties;
        this.losses = losses;
        this.goalsScored = goalsScored;
        this.goalsAgainst = goalsAgainst;
    }

    public int compareRank(FootballTeam otherTeam, Coin coinFlip) {
        int ourPoints = this.calculatePoints();
        int otherPoints = otherTeam.calculatePoints();
        if (ourPoints < otherPoints) {
            return -1;
        } else if (ourPoints > otherPoints) {
            return 1;
        } else {
            return checkPointDifferential(otherTeam, coinFlip);
        }

    }

    private int checkPointDifferential(FootballTeam otherTeam, Coin coinFlip) {
        int ourPointDifferential = this.getPointDifferential();
        int otherPointDifferential = otherTeam.getPointDifferential();
        if (ourPointDifferential < otherPointDifferential) {
            return -1;
        } else if (ourPointDifferential > otherPointDifferential) {
            return 1;
        } else {
            return checkGoalsScored(otherTeam, coinFlip);
        }
    }

    private int checkGoalsScored(FootballTeam otherTeam, Coin coinFlip) {
        if (this.goalsScored < otherTeam.getGoalsScored()) {
            return -1;
        } else if (this.goalsScored > otherTeam.getGoalsScored()) {
            return 1;
        } else {
            if (coinFlip.flipCoin()) {
                return 1;
            } else {
                return -1;
            }
        }
    }

    public int calculatePoints() {
        return this.wins * 3 + this.ties * 1 + this.losses * 0;
    }

    public int getPointDifferential() {
        return this.goalsScored - this.goalsAgainst;
    }
    public int getWins() {
        return wins;
    }

    public int getTies() {
        return ties;
    }

    public int getLosses() {
        return losses;
    }

    public int getGoalsScored() {
        return goalsScored;
    }

    public int getGoalsAgainst() {
        return goalsAgainst;
    }





}
