package GUI;

import javax.swing.*;
import java.awt.*;

public class PokerGame extends JFrame {

    public PokerGame() {
          setLayout(new GridLayout(4,13,8,2));
    }                    

     //private ImageIcon icon;
    private String tempFile = "C:/Users/IT/IdeaProjects/Poker//src//GUI/";//CHANGE DIRECTORY AS YOURS
    private String fileType = ".png"; String file = "";


    private void loadImage() {
        for (int i = 0; i < 52; i++) {
            file = tempFile + i + fileType;
            ImageIcon Card = new ImageIcon(file);

            add(new JLabel(Card.));
        }
    }
    //NOT IN USE YET
     private void randImage() {
         int max = 52, min = 1, range = max - min + 1, randPoker = (int) (Math.random() * range) + min;
         System.out.println(randPoker);
     }

    public static void main(String[] args) {
        PokerGame obj = new PokerGame();
            obj.setTitle("Cards");
            obj.setSize(1280,800);
            obj.loadImage();
            obj.setLocationRelativeTo(null);
            obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            obj.setVisible(true);
       //new PokerGame().randImage();    //Testing random int generator
    }
}






