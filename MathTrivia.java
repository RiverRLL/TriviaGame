//Import Library
import javax.swing.JOptionPane;
public class MathTrivia {
//Method for guessing numbers 
    public void math(){
        //Declare variables
        String message = "What is 2(6+4): 1) 20 , 2) 16 , 3) 12 , 4) 10:";
        String title = "ENTER GUESS HERE";
        int math = Integer.parseInt(JOptionPane.showInputDialog(message, title));
            
        while (math != 1) {
            message = "Incorrect, Try again: What is 2(6+4): 1) 20 , 2) 16 , 3) 12 , 4) 10:";
            math = Integer.parseInt(JOptionPane.showInputDialog(message ,title));
            }
        
    message = "Congrats you got the correct answer! 2(6+4) = 20!";
    JOptionPane.showMessageDialog(null, message);
    }
        
        
    }
    

