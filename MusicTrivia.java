//Import Library
import javax.swing.JOptionPane;
public class MusicTrivia {
//Method for guessing numbers 
    public void music(){
        //Declare variables
        String message = "Which of these songs has the most steams?: 1) God's Plan , 2) Shape of You , 3) Blinding Lights , 4) Radioactive:";
        String title = "ENTER GUESS HERE";
        int music = Integer.parseInt(JOptionPane.showInputDialog(message, title));
            
        while (music != 3) {
            message = "Incorrect, Try again: Which of these songs has the most steams?: 1) God's Plan , 2) Shape of You , 3) Blinding Lights , 4) Radioactive:";
            music = Integer.parseInt(JOptionPane.showInputDialog(message ,title));
            }
        
    message = "Congrats you got the correct answer! Blinding Lights has 4 billion steams!";
    JOptionPane.showMessageDialog(null, message);
    }
        
        
    }
    
