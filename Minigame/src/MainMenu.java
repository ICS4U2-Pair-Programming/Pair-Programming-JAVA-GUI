import javax.swing.JOptionPane;

public class MainMenu {
    public static void MainMenu() throws InterruptedException{
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
            ReactionTime.ReactionTimeGame(null);
        }
    }
}
