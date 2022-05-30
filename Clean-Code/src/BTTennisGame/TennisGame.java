package BTTennisGame;

public class TennisGame {
    public String getScore(String player1Name, String player2Name, int scorePlayer1, int scorePlayer2) {
        String notifyScore = "";
        int tempScore = 0;
        boolean equalScore = scorePlayer1 == scorePlayer2;
        boolean advantageScore = scorePlayer1 >= 4 || scorePlayer2 >= 4;
        if ( equalScore ) {
            switch (scorePlayer1) {
                case 0:
                    notifyScore = "Love-All";
                    break;
                case 1:
                    notifyScore = "Fifteen-All";
                    break;
                case 2:
                    notifyScore = "Thirty-All";
                    break;
                case 3:
                    notifyScore = "Forty-All";
                    break;
                default:
                    notifyScore = "Deuce";
                    break;
            }
        } else if ( advantageScore ) {
            int scoreDifference = scorePlayer1 - scorePlayer2;
            boolean advantagePlayer1 = scoreDifference == 1;
            boolean advantagePlayer2 = scoreDifference == -1;
            boolean winForPlayer1 = scoreDifference >= 2;

            if (advantagePlayer1) notifyScore = "Advantage for " + player1Name;
            else if ( advantagePlayer2 ) notifyScore = "Advantage for " + player2Name;
            else if ( winForPlayer1 ) notifyScore = "Win for " + player1Name;
            else notifyScore = "Win for " + player2Name;

        } else {
            for (int i = 1; i < 3; i++) {
                boolean player1HasHigherScore = i == 1;
                if ( player1HasHigherScore ) tempScore = scorePlayer1;
                else {
                    notifyScore += " - ";
                    tempScore = scorePlayer2;
                }
                switch (tempScore) {
                    case 0:
                        notifyScore += "Love";
                        break;
                    case 1:
                        notifyScore += "Fifteen";
                        break;
                    case 2:
                        notifyScore += "Thirty";
                        break;
                    case 3:
                        notifyScore += "Forty";
                        break;
                }
            }
        }
        return notifyScore;
    }
}
