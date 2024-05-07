import javax.swing.JOptionPane;

public class ReturnMenu {

    public static void Return() throws InterruptedException{
        int returnmenu = JOptionPane.showConfirmDialog(null, "Would you like to return to the main menu? No to exit the game", "Return to menu", JOptionPane.YES_NO_OPTION);
        
        if (returnmenu == JOptionPane.YES_OPTION){
            MainMenu.MainMenu();
        }
        else if (returnmenu != JOptionPane.YES_OPTION){
            JOptionPane.showMessageDialog(null, "Thank you for playing! Created by Kalen and Aidan", "Thanks for playing", returnmenu);
        }
    }
}
