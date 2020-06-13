import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Messages messages = new Messages();
        ComputerLogic computerLogic = new ComputerLogic();

    int numOfMatchers = 17;

    messages.start();

    while (numOfMatchers != 1) {
        messages.playerMove();
        int playerMove = Integer.parseInt(reader.readLine());
        while (playerMove != 1 && playerMove != 2 &&
                playerMove != 3){
            messages.error();
            playerMove = Integer.parseInt(reader.readLine());
        }
        numOfMatchers -= playerMove;
        messages.howMuch(numOfMatchers);
        messages.compMove(playerMove);
        numOfMatchers -= computerLogic.computerMove(playerMove);
        messages.howMuch(numOfMatchers);
    }
    messages.end();
    }
}
