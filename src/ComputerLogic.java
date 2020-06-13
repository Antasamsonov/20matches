public class ComputerLogic {
    public int computerMove(int playerMove){
        if (playerMove == 3) return 1;
        if (playerMove == 2) return 2;
        if (playerMove == 1) return 3;
        return 0;
    }

}
