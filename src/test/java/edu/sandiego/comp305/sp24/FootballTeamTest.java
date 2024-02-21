package edu.sandiego.comp305.sp24;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class FootballTeamTest {
    @Test
    void compareRankHigherPoints() {
    }
    @Test
    void compareRankAllSame() {
        FootballTeam ourTeam = new FootballTeam(1,2,1,6,3);
        FootballTeam otherTeam = new FootballTeam(1,2,1,6,3);
        int result = ourTeam.compareRank(otherTeam);
        assertEquals(0,result,"When the scores and goals are the same, expect the same rank");

    }

    @Test
    void calculatePoints() {
    }

    @Test
    void getPointDifferential() {
    }
}