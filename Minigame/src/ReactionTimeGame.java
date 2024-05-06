//see how fast you can click 'OK'. Do it too slow you lose

import java.time.Duration;
import java.time.Instant;
import java.util.Random;
import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        
            Random rndm=new Random();
            
            JOptionPane.showMessageDialog(null, "Get ready to click 'OK' after the countdown hits 1. Be careful, if you are too slow you may not get any points!");//briefly explain game
    
            JOptionPane.showMessageDialog(null,"3...", null ,JOptionPane.INFORMATION_MESSAGE);//start countdown with one second intervals
            Thread.sleep(1000);

            JOptionPane.showMessageDialog(null,"2...", null ,JOptionPane.INFORMATION_MESSAGE);
            Thread.sleep(1000);

            JOptionPane.showMessageDialog(null,"1...", null ,JOptionPane.INFORMATION_MESSAGE);//end countdown
            Thread.sleep(rndm.nextInt(10000)); //random delay to make game less predictable and more interesting


            
                Instant starts = Instant.now();//mark starting point of period of time
                
                JOptionPane.showMessageDialog(null,"Click!", null ,JOptionPane.INFORMATION_MESSAGE);
        
                Instant ends = Instant.now();//mark ending point of period of time

                Duration duration = java.time.Duration.between(starts, ends);//calculate total duration

                JOptionPane.showMessageDialog(null, "Your reaction time was " + duration.toMillis() + " milliseconds");



                long score = 10000 - duration.toMillis()*5;//calculate score
                    if(score<0)//determine if player will have a negative score
                    {
                        JOptionPane.showMessageDialog(null, "You were too slow! Try again next time.");//display if player score is negative
                    }

                    else
                    {
                        JOptionPane.showMessageDialog(null, "Your score was " + score + " points!");//point display for player
                    }

                
                
                
                
    }
}
