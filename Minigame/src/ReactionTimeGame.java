//see how fast you can press enter. Do it too slow you lose

    import java.util.Random;
    import java.util.Scanner;
    import javax.swing.JOptionPane;

public class ReactionTimeGame {
    
        public static void main(String[] args) throws InterruptedException {
            
                Random rndm=new Random();

                JOptionPane.showMessageDialog(null,"3", null ,JOptionPane.INFORMATION_MESSAGE);
                Thread.sleep(1000);
    
                JOptionPane.showMessageDialog(null,"2", null ,JOptionPane.INFORMATION_MESSAGE);
                Thread.sleep(1000);
    
                JOptionPane.showMessageDialog(null,"1", null ,JOptionPane.INFORMATION_MESSAGE);
                Thread.sleep(rndm.nextInt(10000));
        }
    }

