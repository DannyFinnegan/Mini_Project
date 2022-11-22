package Computer_Repair_Shop;

import com.sun.tools.javac.Main;

import java.awt.*;
import javax.swing.*;

public class OOP_Mini_Project {

    private static void Main_Menu()
    {
        JFrame Main_Menu=new JFrame("Computer Repairs");
        JFrame MainMenu = new JFrame();
        MainMenu.setSize(600,800);
        MainMenu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        MainMenu.setTitle("Create JFrame Example");
        MainMenu.setLocationRelativeTo(null);
        JLabel Heading = new JLabel("Welcome To the computer Repair Shop");
        JButton Add_Part = new JButton("Add Part");
        Add_Part.setSize(25, 50);
        MainMenu.add(Heading);
        MainMenu.add(Add_Part);
        MainMenu.setVisible(true);
    }

    public static void main(String[] args) {
        Main_Menu();
    }


}
