import javax.swing.*;

public class OnlineLearningSystem extends JFrame {

    public OnlineLearningSystem() {
        setTitle("Online Learning Management System");
        setSize(600, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        // Add components to the window
        JLabel titleLabel = new JLabel("Welcome to Online Learning System");
        add(titleLabel);

        JTextArea courseListTextArea = new JTextArea();
        courseListTextArea.setEditable(false);
        courseListTextArea.setText("1. Java Programming\n2. Web Development\n3. Data Science\n4. Artificial Intelligence");
        JScrollPane scrollPane = new JScrollPane(courseListTextArea);
        add(scrollPane);

        JButton enrollButton = new JButton("Enroll");
        add(enrollButton);

        JButton resultsButton = new JButton("Results");
        add(resultsButton);

        JButton loginButton = new JButton("Login");
        add(loginButton);

        JButton signupButton = new JButton("Sign Up");
        add(signupButton);
        
        // Set layout for the window
        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));
        
        // Display the window
        setVisible(true);
    }

    public static void main(String[] args) {
        // Create an instance of the OnlineLearningSystem class
        SwingUtilities.invokeLater(() -> new OnlineLearningSystem());
    }
}
