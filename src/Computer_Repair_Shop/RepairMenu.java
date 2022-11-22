package Computer_Repair_Shop;

import javax.swing.*;

public class RepairMenu extends JFrame{
    private JPanel RepairMenuPanel;
    private JButton logRepairButton;
    private JButton estimateRepairButton;
    private JButton confirmRepairButton;
    private JButton completeRepairButton;
    private JButton returnRepairButton;

    public RepairMenu() {

        setContentPane(RepairMenuPanel);
        setSize(900, 600);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        RepairMenu repairmenu = new RepairMenu();
    }
}

