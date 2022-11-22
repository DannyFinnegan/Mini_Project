package Computer_Repair_Shop;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainMenu extends JFrame{
    private JButton partsButton;
    private JLabel Label;
    private JPanel MainMenuPanel;
    private JButton repairButton;
    private JButton adminButton;



    public MainMenu(){

        setContentPane(MainMenuPanel);
        setSize(900,600);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);


        partsButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                new PartsMenu();
                setVisible(false);
            }
        });
        adminButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new AdminMenu();
                setVisible(false);
            }
        });

        repairButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new RepairMenu();
                setVisible(false);
            }
        });
    }

    public static void main(String[] args) {
        MainMenu mainmenu = new MainMenu();
    }
}
