import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        

        String message = "Choose A Trivia Catagory : 1) Math. 2) Science. 3) History. 4) Music: ";
        String title = "TRIVIA GAME";
        int guess = Integer.parseInt(JOptionPane.showInputDialog(message, title));

if (guess == 1){;
    MathTrivia mathObject = new MathTrivia();
    mathObject.math();
}
if (guess == 2);
    ScienceTrivia scienceObject = new ScienceTrivia();
    scienceObject.science();

if (guess == 3){;
    HistoryTrivia historyObject = new HistoryTrivia();
    historyObject.history();
}
if (guess == 4){;
    MusicTrivia musicObject = new MusicTrivia();
    musicObject.music();
}

if (guess > 4 ){;
    message = "That does not match the options,Choose A Trivia Catagory : 1) Math. 2) Science. 3) History. 4) Music:";
}
if (guess < 1){;
    message = "That does not match the options,Choose A Trivia Catagory : 1) Math. 2) Science. 3) History. 4) Music:";
}
    }
}
