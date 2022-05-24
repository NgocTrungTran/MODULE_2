package BTTennisGame;

public class TennisGame {
    public static String getScore(String player1Name, String player2Name, int scorePlayer1, int scorePlayer2) {
        String score = "";
        int tempScore = 0;
        if ( scorePlayer1 == scorePlayer2 ) {
            switch (scorePlayer1) {
                case 0:
                    score = "Love-All";
                    break;
                case 1:
                    score = "Fifteen-All";
                    break;
                case 2:
                    score = "Thirty-All";
                    break;
                case 3:
                    score = "Forty-All";
                    break;
                default:
                    score = "Deuce";
                    break;
            }
        } else if ( scorePlayer1 >= 4 || scorePlayer2 >= 4 ) {
            int minusResult = scorePlayer1 - scorePlayer2;
            boolean advantagePlayer1 = minusResult == 1;
            boolean advantagePlayer2 = minusResult == -1;
            boolean winForPlayer1 = minusResult >= 2;

            if (advantagePlayer1) score = "Advantage player1";
            else if ( advantagePlayer2 ) score = "Advantage player2";
            else if ( winForPlayer1 ) score = "Win for player1";
            else score = "Win for player2";

        } else {
            for (int i = 1; i < 3; i++) {
                if ( i == 1 ) tempScore = scorePlayer1;
                else {
                    score += "-";
                    tempScore = scorePlayer2;
                }
                switch (tempScore) {
                    case 0:
                        score += "Love";
                        break;
                    case 1:
                        score += "Fifteen";
                        break;
                    case 2:
                        score += "Thirty";
                        break;
                    case 3:
                        score += "Forty";
                        break;
                }
            }
        }
        return score;
    }
}
