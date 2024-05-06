import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) throws Exception {

    String name = JOptionPane.showInputDialog("Please enter your name to continue");
    JOptionPane.showMessageDialog(null, "Hello " +name +" and welcome to our GUI minigames!");
    MainMenu.MainMenu(); //calls main menu so that the GUi wont repeat asking your users name
    }
}