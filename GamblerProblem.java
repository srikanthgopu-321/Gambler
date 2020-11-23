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
