package edu.sandiego.comp305.sp24;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class FootballTeamTest {

    @Test
    void compareRankHigherPoints() {
    }

    @Test
    void compareRankAllSameWinCoinFlip() {
        Coin quarter = Mockito.mock(Coin.class);
        when(quarter.flipCoin()).thenReturn(true);
        FootballTeam ourTeam = new FootballTeam(1,2,1,6,3);
        FootballTeam otherTeam = new FootballTeam(1,2,1,6,3);
        int result = ourTeam.compareRank(otherTeam, quarter);
        verify(quarter,times(2)).flipCoin();
        assertEquals(1,result, "Teams should be same rank but we win the coin flip and have a higher rank");
    }

    @Test
    void calculatePoints() {
    }

    @Test
    void getPointDifferential() {
    }
}