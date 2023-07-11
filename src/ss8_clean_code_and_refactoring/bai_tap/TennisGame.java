package ss8_clean_code_and_refactoring.bai_tap;


public class TennisGame {
    public static final int ZERO = 0;
    public static final int ONE = 1;
    public static final int TWO = 2;
    public static final int THREE = 3;
    public static final int FOUR = 4;
    public static final int NEGATIVEONE = -1;

    private static boolean isaBoolean(int playerScore1, int playerScore2) {
        return playerScore1 == playerScore2;
    }

    private static boolean isaBoolean1(int playerScore1, int playerScore2) {
        return playerScore1 >= FOUR || playerScore2 >= FOUR;
    }

    public static String getScore(String player1Name, String player2Name, int playerScore1, int playerScore2) {
        String scoreName = "";
        int tennisPoint = 0;
        if (isaBoolean(playerScore1, playerScore2)) {
            switch (playerScore1) {
                case ZERO:
                    scoreName = "Love-All";
                    break;
                case ONE:
                    scoreName = "Fifteen-All";
                    break;
                case TWO:
                    scoreName = "Thirty-All";
                    break;
                case THREE:
                    scoreName = "Forty-All";
                    break;
                default:
                    scoreName = "Deuce";
            }
        } else if (isaBoolean1(playerScore1, playerScore2)) {
            int minusResult = playerScore1 - playerScore2;
            boolean result1 = minusResult == ONE;
            boolean result2 = minusResult == NEGATIVEONE;
            boolean result3 = minusResult >= TWO;
            if (result1) scoreName = "Advantage player1";
            else if (result2) scoreName = "Advantage player2";
            else if (result3) scoreName = "Win for player1";
            else scoreName = "Win for player2";
        } else {
            for (int i = ONE; i < THREE; i++) {
                if (i == ONE) tennisPoint = playerScore1;
                else {
                    scoreName += "-";
                    tennisPoint = playerScore2;
                }
                switch (tennisPoint) {
                    case ZERO:
                        scoreName += "Love";
                        break;
                    case ONE:
                        scoreName += "Fifteen";
                        break;
                    case TWO:
                        scoreName += "Thirty";
                        break;
                    case THREE:
                        scoreName += "Forty";
                        break;
                }
            }
        }
        return scoreName;
    }
}
