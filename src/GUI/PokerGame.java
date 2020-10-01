package GUI;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.Color;



public class PokerGame extends JFrame{

    private JButton unShuffleButton;
    private JPanel mainPanel;
    private JButton shuffleButton;
    private String tempFile = "/Users/cammurriel/Desktop/Java/Lab3updated//src//GUI/";//CHANGE DIRECTORY AS YOURS
    private String fileType = ".png"; String file = "";
    ImageIcon Card = new ImageIcon(file);

    //NEED TO REIMPLEMENT


    //BUTTONS ARE IN HERE AND WHEN PRESSED, IT EITHER SHOWS UNSHUFFLED OR SHUFFLED DECK
    public PokerGame() {

            setLayout(new GridLayout(4,13,6,2));
            unShuffleButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                PokerGame obj = new PokerGame();
                obj.setTitle("Unshuffled Cards");
                Dimension DimMax = Toolkit.getDefaultToolkit().getScreenSize(); //ADJUST TO THE MAX SIZE OF SCREEN
                obj.setMaximumSize(DimMax);
                obj.setExtendedState(JFrame.MAXIMIZED_BOTH);
                obj.getContentPane().setBackground(new Color(0,100,0));
                obj.showUnshuffledDeck();
                obj.setLocationRelativeTo(null);
                obj.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
                obj.setVisible(true);
            }
        });
            //SECOND BUTTON "SHOW DECK OF SHUFFLED CARDS"
       shuffleButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                PokerGame obj = new PokerGame();
                JPanel p = new JPanel();
                obj.setTitle("Shuffled Cards");
                obj.getContentPane().setBackground(new Color(0,100,0));
                Dimension DimMax = Toolkit.getDefaultToolkit().getScreenSize(); //ADJUST TO THE MAX SIZE OF SCREEN
                obj.setMaximumSize(DimMax);
                obj.setExtendedState(JFrame.MAXIMIZED_BOTH);
                obj.showShuffleDeck();
                obj.setLocationRelativeTo(null);
                obj.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
                obj.setVisible(true);
            }
        });
    }                    

//-----------------------------------LOGIC READING A FILE | DISPLAYING UN|SHUFFLED CARDS
    private void loadImage(String file) {
            Card = new ImageIcon(file);
            add(new JLabel(Card));
    }
    private void showUnshuffledDeck() {
            for (int i = 0; i < 52; i++) {
                file = tempFile + i + fileType;
                loadImage(file);
            }
        }

     private void showShuffleDeck() {
         int randPoker;
         Integer[] arr = new Integer[52];

         for (int i = 0; i < arr.length; i++) {
             arr[i] = i;
         }

         Collections.shuffle(Arrays.asList(arr)); //SHUFFLES ARRAY, HAS NO DUPLICATES

         for (int j = 0; j < 52; j++) {
             randPoker = arr[j];
             file = tempFile + randPoker + fileType; //CONCATENATION
             loadImage(file);
         }
     }
     //---------------NEED TO IMPLEMENT-----------------------------------------------------



    public static void main(String[] args) {

        //SHOWS TWO BUTTONS
        JFrame frame = new JFrame("Dialog");
        JPanel panel = new JPanel();
        panel.setBackground(Color.GREEN);
        frame.setContentPane(new PokerGame().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setLocationRelativeTo(null); //PLACES FRAME IN THE CENTER OF THE SCREEN
        frame.setVisible(true);
        frame.setSize(1280,800);


    }
}






