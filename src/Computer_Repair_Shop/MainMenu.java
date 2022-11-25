package Computer_Repair_Shop;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Represents the GUI required to build the main menu
 * @author Daniel Finnegan
 */
public class MainMenu extends JFrame {
    private JButton partsButton;
    private JLabel Label;
    private JPanel MainMenuPanel;
    private JButton repairButton;
    private JButton adminButton;


    /**
     * The constructor used to build the main menu
     */
    public MainMenu() {
/**
 * @paramm MainMenuPanel is the GUI Panel which buuilds the main menu
 */
        setContentPane(MainMenuPanel);
        setSize(900, 600);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);

/**
 * Action Listener used to call the Parts menu
 */
        partsButton.addActionListener(new ActionListener() {
            /**
             * @param e the event to be processed
             */
            @Override
            public void actionPerformed(ActionEvent e) {
                new PartsMenu();
                setVisible(false);
            }
        });
        /**
         * Action Listener used to call the Admin Menu
         */
        adminButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new AdminMenu();
                setVisible(false);
            }
        });

        /**
         * Action Listener used to call the Repair Menu
         */
        repairButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new RepairMenu();
                setVisible(false);
            }
        });
    }
}