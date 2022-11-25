package Computer_Repair_Shop;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LogRepair extends JFrame{
    private JPanel LogRepairPanel;
    private JButton backButton;
    private JTextField RepairIDText;
    private JLabel RepairID;
    private JLabel CustomerEmail;
    private JTextField CustomerEmailText;
    private JLabel RepairDetails;
    private JTextField RepairDetailsText;
    private JButton submitButton;

    public LogRepair()
    {
        setContentPane(LogRepairPanel);
        setSize(900, 600);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);


        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new RepairMenu();
                setVisible(false);
            }
        });
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String RepairIDAsString = RepairIDText.getText().toLowerCase();
                String CustomerEmailAsString = CustomerEmailText.getText().toLowerCase();
                String RepairDetalsAsString = RepairDetailsText.getText().toLowerCase();

                if (RepairIDAsString.isEmpty())
                {
                    JOptionPane.showMessageDialog(null,"Repair ID Cannot Be Null","Error",JOptionPane.ERROR_MESSAGE);
                }
                if (CustomerEmailAsString.isEmpty())
                {
                    JOptionPane.showMessageDialog(null,"Customer Email Cannot Be Null","Error",JOptionPane.ERROR_MESSAGE);

                }
                if (!CustomerEmailAsString.isEmpty())
                {
                    JOptionPane.showMessageDialog(null,"Email Cannot Be Null","Error",JOptionPane.ERROR_MESSAGE);
                    if (!(CustomerEmailAsString.endsWith("@gmail.com") || CustomerEmailAsString.endsWith(".ie")||CustomerEmailAsString.endsWith("@hotmail.com")))
                    {
                        JOptionPane.showMessageDialog(null,"Email must end with @gmail.com, @hotmail.com, or .ie","Error",JOptionPane.ERROR_MESSAGE);
                    }
                }
                if (RepairDetalsAsString.isEmpty())
                {
                    JOptionPane.showMessageDialog(null,"Repair details cannot be Null","Error",JOptionPane.ERROR_MESSAGE);
                }
                if (!RepairIDAsString.isEmpty() && !CustomerEmailAsString.isEmpty() && !RepairDetalsAsString.isEmpty() && (CustomerEmailAsString.endsWith("@gmail.com") || CustomerEmailAsString.endsWith(".ie")||CustomerEmailAsString.endsWith("@hotmail.com")))
                {
                    JOptionPane.showMessageDialog(null, "The repair has been logged and added to the database","Success",JOptionPane.INFORMATION_MESSAGE);
                    new LogRepair();
                    setVisible(false);
                }
            }
        });
    }
}
