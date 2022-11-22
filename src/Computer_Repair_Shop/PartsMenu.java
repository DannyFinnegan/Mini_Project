package Computer_Repair_Shop;

import javax.swing.*;

public class PartsMenu extends JFrame{
    private JButton addPartButton;
    private JButton deletePartButton;
    private JButton updatePartButton;
    private JButton queryPartButton;
    private JLabel Welcome;
    private JPanel PartsPanel;

    public PartsMenu()
    {
        setContentPane(PartsPanel);
        setSize(900,600);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }
    public static void main(String[] args) {
        PartsMenu PartsMenu = new PartsMenu();
    }

}
