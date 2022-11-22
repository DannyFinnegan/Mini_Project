package Computer_Repair_Shop;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RepairMenu extends JFrame{
    private JPanel RepairMenuPanel;
    private JButton logRepairButton;
    private JButton estimateRepairButton;
    private JButton confirmRepairButton;
    private JButton completeRepairButton;
    private JButton returnRepairButton;
    private JButton backButton;

    public RepairMenu() {

        setContentPane(RepairMenuPanel);
        setSize(900, 600);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);


        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new MainMenu();
                setVisible(false);
            }
        });
    }

    public static void main(String[] args) {
        RepairMenu repairmenu = new RepairMenu();
    }
}

