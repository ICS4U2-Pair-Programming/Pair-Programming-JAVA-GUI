import javax.swing.JOptionPane;

public class Main {
    @SuppressWarnings("unlikely-arg-type")
    public static void main(String[] args) throws Exception {

        String name = JOptionPane.showInputDialog("Please enter your name to continue");
        JOptionPane.showMessageDialog(null, "Hello " +name +" and welcome to our GUI minigames!");

        Object[] games = {"Guessing Number", "Reaction time"};
        int n = JOptionPane.showOptionDialog(null,
        "Which game do you like to play first?",
        "Choose a colour",
        JOptionPane.DEFAULT_OPTION,
        JOptionPane.QUESTION_MESSAGE,
        null,
        games,
        games[0]);
        
        if("Guessing Number".equals(games)){ 
        GuessNumberGame.GuessingGame();
        System.out.println("The users likes " + games[n]);
        }
    }
}
