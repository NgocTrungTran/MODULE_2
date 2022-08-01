package BTTennisGame;

public class TennisGame {
    public static String getScore(String player1Name, String player2Name, int scorePlayer1, int scorePlayer2) {
        StringBuilder notifyScore = new StringBuilder ();
        int tempScore;
        boolean equalScore = scorePlayer1 == scorePlayer2;
        boolean advantageScore = scorePlayer1 >= 4 || scorePlayer2 >= 4;
        if ( equalScore ) {
            switch (scorePlayer1) {
                case 0:
                    notifyScore = new StringBuilder ( "Love-All" );
                    break;
                case 1:
                    notifyScore = new StringBuilder ( "Fifteen-All" );
                    break;
                case 2:
                    notifyScore = new StringBuilder ( "Thirty-All" );
                    break;
                case 3:
                    notifyScore = new StringBuilder ( "Forty-All" );
                    break;
                default:
                    notifyScore = new StringBuilder ( "Deuce" );
                    break;
            }
        } else if ( advantageScore ) {
            int scoreDifference = scorePlayer1 - scorePlayer2;
            boolean advantagePlayer1 = scoreDifference == 1;
            boolean advantagePlayer2 = scoreDifference == -1;
            boolean winForPlayer1 = scoreDifference >= 2;

            if (advantagePlayer1) notifyScore = new StringBuilder ( "Advantage for " + player1Name );
            else if ( advantagePlayer2 ) notifyScore = new StringBuilder ( "Advantage for " + player2Name );
            else if ( winForPlayer1 ) notifyScore = new StringBuilder ( "Win for " + player1Name );
            else notifyScore = new StringBuilder ( "Win for " + player2Name );

        } else {
            for (int i = 1; i < 3; i++) {
                boolean player1HasHigherScore = i == 1;
                if ( player1HasHigherScore ) tempScore = scorePlayer1;
                else {
                    notifyScore.append ( "-" );
                    tempScore = scorePlayer2;
                }
                switch (tempScore) {
                    case 0:
                        notifyScore.append ( "Love" );
                        break;
                    case 1:
                        notifyScore.append ( "Fifteen" );
                        break;
                    case 2:
                        notifyScore.append ( "Thirty" );
                        break;
                    case 3:
                        notifyScore.append ( "Forty" );
                        break;
                }
            }
        }
        return notifyScore.toString ();
    }
}
