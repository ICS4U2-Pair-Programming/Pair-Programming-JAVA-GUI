//Just like what we did last assignment but a larger number
import java.util.Random;
import javax.swing.JOptionPane;
public class GuessNumberGame {
        public static final int ScoreGuess = 0;

        public static void GuessingGame() throws InterruptedException{
            Random rand = new Random();
            int number = rand.nextInt(10); //how large you want the user to guess
            boolean win = false;
            int score = 10000;
            int tries = 0;
            while(win == false){ 
                int guess = Integer.parseInt(JOptionPane.showInputDialog(null,null,"Guess a number between 1 and 6900", JOptionPane.QUESTION_MESSAGE));
                if(number > guess)
                {
                    JOptionPane.showMessageDialog(null,"The number was too low. Guess again", null ,JOptionPane.INFORMATION_MESSAGE);
                    tries++;
                }
                else if(number < guess)
                {
                    JOptionPane.showMessageDialog(null,"The number was too high. Guess again", null ,JOptionPane.INFORMATION_MESSAGE);
                    tries++;
                }
                else{
                    JOptionPane.showMessageDialog(null,"Congrats you win!", null ,JOptionPane.INFORMATION_MESSAGE);
                    win = true;
                }
            }
            int ScoreGuess = score - (tries * 500); // calculates your score
            JOptionPane.showMessageDialog(null, "Your score was " +ScoreGuess);
            ReturnMenu.Return();
        }
    }