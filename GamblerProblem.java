public class GamblerProblem {
    public static final int STAKE = 100;
    public static final int BET = 1;

    public static void main(String[] args) {
	checkGame();

      }
	public static int checkGame(){
        Random rand = new Random();
        int result= rand.nextInt(2);
        return result;
	}



	public static void stakeCalculation(){
        int daily_stake = STAKE;
        int daily_bet = BET;

        while(daily_stake >= 50 && daily_stake <= 150){
            int outcome = checkGame();
            if(outcome == 1 ){
                daily_stake+=daily_bet;

            }
            else
                daily_stake-=daily_bet;

            if(daily_stake == 50){
                System.out.println("loose "+daily_stake);
                break;
            }
            if(daily_stake == 150 ){
                System.out.println("Win "+daily_stake);
                break;
            }

        }
    }
}
