//see how fast you can press enter. Do it too slow you lose

import java.time.Duration;
import java.time.Instant;
import java.util.Random;
import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        
            Random rndm=new Random();
            
            JOptionPane.showMessageDialog(null, "Get ready to click 'OK' after the countdown hits 1");
    
            JOptionPane.showMessageDialog(null,"3...", null ,JOptionPane.INFORMATION_MESSAGE);
            Thread.sleep(1000);

            JOptionPane.showMessageDialog(null,"2...", null ,JOptionPane.INFORMATION_MESSAGE);
            Thread.sleep(1000);

            JOptionPane.showMessageDialog(null,"1...", null ,JOptionPane.INFORMATION_MESSAGE);
            Thread.sleep(rndm.nextInt(10000)); //remember to change back to higher digit


            //-----------------------------------------------------------------------------------------------------------------------------------
            
                Instant starts = Instant.now();
                
                JOptionPane.showMessageDialog(null,"Click!", null ,JOptionPane.INFORMATION_MESSAGE);
        
                Instant ends = Instant.now();

                Duration duration = java.time.Duration.between(starts, ends);

                JOptionPane.showMessageDialog(null, "Your reaction time was " + duration.toMillis() + " milliseconds");



                long score = 10000 - duration.toMillis()*5;
                    if(score<0)
                    {
                        JOptionPane.showMessageDialog(null, "You were too slow! Try again next time.");
                    }

                    else
                    {
                        JOptionPane.showMessageDialog(null, "Your score was " + score + " points!");
                    }

                
                
                
                
    }
}
