import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OnlineLearningSystem extends JFrame implements ActionListener {

    public OnlineLearningSystem() {
        setTitle("Online Learning Management System");
        setSize(600, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        // Create the main menu bar
        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);

        // Create the main menu items
        JMenu fileMenu = new JMenu("File");
        JMenu coursesMenu = new JMenu("Courses");
        JMenu accountMenu = new JMenu("Account");

        // Add main menu items to the menu bar
        menuBar.add(fileMenu);
        menuBar.add(coursesMenu);
        menuBar.add(accountMenu);

        // Create sub-menu items for File menu
        JMenuItem exitMenuItem = new JMenuItem("Exit");
        fileMenu.add(exitMenuItem);

        // Create sub-menu items for Courses menu
        JMenuItem javaMenuItem = new JMenuItem("Java Programming");
        JMenuItem webDevMenuItem = new JMenuItem("Web Development");
        JMenuItem dataScienceMenuItem = new JMenuItem("Data Science");
        JMenuItem aiMenuItem = new JMenuItem("Artificial Intelligence");
        coursesMenu.add(javaMenuItem);
        coursesMenu.add(webDevMenuItem);
        coursesMenu.add(dataScienceMenuItem);
        coursesMenu.add(aiMenuItem);

        // Create sub-menu items for Account menu
        JMenuItem loginMenuItem = new JMenuItem("Login");
        JMenuItem signUpMenuItem = new JMenuItem("Sign Up");
        JMenuItem viewResultsMenuItem = new JMenuItem("View Results");
        accountMenu.add(loginMenuItem);
        accountMenu.add(signUpMenuItem);
        accountMenu.add(viewResultsMenuItem);

        // Add action listeners for menu items
        exitMenuItem.addActionListener(this);
        javaMenuItem.addActionListener(this);
        webDevMenuItem.addActionListener(this);
        dataScienceMenuItem.addActionListener(this);
        aiMenuItem.addActionListener(this);
        loginMenuItem.addActionListener(this);
        signUpMenuItem.addActionListener(this);
        viewResultsMenuItem.addActionListener(this);

        // Set layout for the window
        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));

        // Display the window
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Perform actions based on menu item clicks
        String command = e.getActionCommand();
        switch (command) {
            case "Exit":
                System.exit(0);
                break;
            case "Java Programming":
                JOptionPane.showMessageDialog(this, "You selected Java Programming course.");
                break;
            case "Web Development":
                JOptionPane.showMessageDialog(this, "You selected Web Development course.");
                break;
            case "Data Science":
                JOptionPane.showMessageDialog(this, "You selected Data Science course.");
                break;
            case "Artificial Intelligence":
                JOptionPane.showMessageDialog(this, "You selected Artificial Intelligence course.");
                break;
            case "Login":
                // Implement login functionality
                JOptionPane.showMessageDialog(this, "Login functionality will be implemented soon.");
                break;
            case "Sign Up":
                // Implement sign up functionality
                JOptionPane.showMessageDialog(this, "Sign Up functionality will be implemented soon.");
                break;
            case "View Results":
                // Implement view results functionality
                JOptionPane.showMessageDialog(this, "View Results functionality will be implemented soon.");
                break;
        }
    }

    public static void main(String[] args) {
        // Create an instance of the OnlineLearningSystem class
        SwingUtilities.invokeLater(() -> new OnlineLearningSystem());
    }
}
