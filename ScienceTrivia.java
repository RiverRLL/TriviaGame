//Import Library
import javax.swing.JOptionPane;
public class ScienceTrivia {
//Method for guessing numbers 
    public void science(){
        //Declare variables
        String message = "What does Ca stand for on the periodic table?: 1) Chlorine , 2) Calcium , 3) Carbon , 4) Copper:";
        String title = "ENTER GUESS HERE";
        int science = Integer.parseInt(JOptionPane.showInputDialog(message, title));
        while (science != 2) {
            message = "Incorrect, Try again: What does Ca stand for on the periodic table?: 1) Chlorine , 2) Calcium , 3) Carbon , 4) Copper:";
            science = Integer.parseInt(JOptionPane.showInputDialog(message ,title));
            }
        
    message = "Congrats you got the correct answer! Ca stands for Calcium!";
    JOptionPane.showMessageDialog(null, message);
    }
        
        
    }
    
