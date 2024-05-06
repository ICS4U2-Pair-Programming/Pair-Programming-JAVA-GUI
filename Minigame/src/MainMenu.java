import javax.swing.JOptionPane;

public class MainMenu {
    public static void MainMenu(){
        Object[] games = {"Guessing Number", "Reaction time"};
        int n = JOptionPane.showOptionDialog(null,
        "Which game do you like to play?",
        "Choose a game",
        JOptionPane.DEFAULT_OPTION,
        JOptionPane.QUESTION_MESSAGE,
        null,
        games, null);

        if(n == 0){ 
        GuessNumberGame.GuessingGame();
        }
        if(n == 1){ 
            System.out.println("player want to play reaction"); // to be changed when reaction time code is finished
        }
    }
}
