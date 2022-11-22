package Computer_Repair_Shop;

import javax.swing.*;

public class AdminMenu extends JFrame {

    private JButton revenueAnalysisButton;
    private JButton partAnalysisButton;
    private JPanel AdminMenuPanel;

    public AdminMenu() {
        setContentPane(AdminMenuPanel);
        setSize(900, 600);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        AdminMenu adminmenu = new AdminMenu();
    }
}
