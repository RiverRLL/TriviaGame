//Import Library
import javax.swing.JOptionPane;
public class MusicTrivia {
//Method for guessing numbers 
    public void music(){
        //Declare variables
        String message = "Which of these songs has the most steams?: 1) God's Plan by Drake , 2) Shape of You by Ed Sheeran 3) Blinding Lights by the Weeknd , 4) Radioactive by Imagine Dragons: ";
        String title = "TRIVIA GAME";
        int music = Integer.parseInt(JOptionPane.showInputDialog(message, title));

        //if (music == 4){

            //message = "Which of these songs has the most steams?: 1) God's Plan by Drake , 2) Shape of You by Ed Sheeran 3) Blinding Lights by the Weeknd , 4) Radioactive by Imagine Dragons:";
            //music = Integer.parseInt(JOptionPane.showInputDialog(message ,title));
            
        while (music != 3) {
            message = "Incorrect, Try again: Which of these songs has the most steams?: 1) God's Plan by Drake , 2) Shape of You by Ed Sheeran 3) Blinding Lights by the Weeknd , 4) Radioactive by Imagine Dragons:";
            music = Integer.parseInt(JOptionPane.showInputDialog(message ,title));
            }
        
    message = "Congrats you got the correct answer! Blinding Lights has 4 billion steams!";
    JOptionPane.showMessageDialog(null, message);
    }
        
        
    }
    
