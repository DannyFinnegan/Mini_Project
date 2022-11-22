package Computer_Repair_Shop;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainMenu extends JFrame{
    private JButton partsButton;
    private JLabel Label;
    private JPanel panel;
    private JButton Butoon2;
    private JButton butoon3Button;


    public MainMenu(){

        setContentPane(panel);
        partsButton.setSize(50,25);
        setSize(450,300);
        setVisible(true);


        partsButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                new PartsMenu();
                setVisible(false);
            }
        });
    }

    public static void main(String[] args) {
        MainMenu gui = new MainMenu();
    }
}
