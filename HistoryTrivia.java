//Import Library
import javax.swing.JOptionPane;
public class HistoryTrivia {
//Method for guessing numbers 
    public void history(){
        //Declare variables
        String message = "When did World War 2 Start?: 1) 1938 , 2) 1942 , 3) 1939 , 4) 1945 ";
        String title = "TRIVIA GAME";
        int history = Integer.parseInt(JOptionPane.showInputDialog(message, title));

        

           // string message = "When did World War 2 Start?: 1) 1938 , 2) 1942 , 3) 1939 , 4) 1945";
           // history = Integer.parseInt(JOptionPane.showInputDialog(message ,title));
            
        while (history != 3) {
            message = "Incorrect, Try again: When did World War 2 Start?: 1) 1938 , 2) 1942 , 3) 1939 , 4) 1945";
            history = Integer.parseInt(JOptionPane.showInputDialog(message ,title));
            }
        
    message = "Congrats you got the correct answer! World War 2 started in 1939!";
    JOptionPane.showMessageDialog(null, message);
    }
        
        
    }
    