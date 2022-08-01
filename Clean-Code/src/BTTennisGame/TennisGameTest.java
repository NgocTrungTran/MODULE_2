package BTTennisGame;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith (Parameterized.class)
public class TennisGameTest {

    private final int PLAYER_1_SOCER;
    private final int PLAYER_2_SOCER;
    private final String EXPECTED_SCORE;

    public TennisGameTest(int play1Score, int play2Score, String expectedScore) {
        PLAYER_1_SOCER = play1Score;
        PLAYER_2_SOCER = play2Score;
        EXPECTED_SCORE = expectedScore;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> getAllScores() {
        return Arrays.asList ( new Object[][] {
                {0, 0, "Love-All" },
                {1, 1, "Fifteen-All"},
                {2, 2, "Thirty-All"},
                {3, 3, "Forty-All"},
                {4, 4, "Deuce"},

                { 1, 0, "Fifteen-Love"},
                { 0, 1, "Love-Fifteen"},
                { 2, 0, "Thirty-Love"},
                { 0, 2, "Love-Thirty"},
                { 3, 0, "Forty-Love"},
                { 0, 3, "Love-Forty"},
                { 4, 0, "Win for John"},
                { 0, 4, "Win for Bill"},

                { 2, 1, "Thirty-Fifteen"},
                { 1, 2, "Fifteen-Thirty"},
                { 3, 1, "Forty-Fifteen"},
                { 1, 3, "Fifteen-Forty"},
                { 4, 1, "Win for John"},
                { 1, 4, "Win for Bill"},

                { 3, 2, "Forty-Thirty"},
                { 2, 3, "Thirty-Forty"},
                { 4, 2, "Win for John"},
                { 2, 4, "Win for Bill"},

                { 4, 3, "Advantage for John"},
                { 3, 4, "Advantage for Bill"},
                { 5, 4, "Advantage for John"},
                { 4, 5, "Advantage for Bill"},
                { 15, 14, "Advantage for John"},
                { 14, 15, "Advantage for Bill"},

                { 6, 4, "Win for John"},
                { 4, 6, "Win for Bill"},
                { 16, 14, "Win for John"},
                { 14, 16, "Win for Bill"},
        } );
    }

    @Test
    public void checkAllScores() {
        int highestScore = Math.max(PLAYER_1_SOCER, PLAYER_2_SOCER);
        int scorePlayer1 = 0;
        int scorePlayer2 = 0;
        for (int i = 0; i < highestScore; i++) {
            if ( i < PLAYER_1_SOCER )
                scorePlayer1 += 1;
            if ( i < PLAYER_2_SOCER )
                scorePlayer2 += 1;
        }
        assertEquals(EXPECTED_SCORE, TennisGame.getScore ( "John", "Bill", scorePlayer1, scorePlayer2 ));
    }
}
