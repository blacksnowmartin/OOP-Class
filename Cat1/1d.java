import javax.swing.JOptionPane;

public class Greetings {
    public static void main(String[] args) {
        String message = "good morning mwalimu!";
        System.out.println(message);
         // Perform a simple computation
         int num1 = 5;
         int num2 = 3;
         int sum = num1 + num2;
         
         // Print the result of the computation
         System.out.println("The sum of " + num1 + " and " + num2 + " is: " + sum);
         JOptionPane.showMessageDialog(null, "The sum of " + num1 + " and " + num2 + " is: " + sum);
    }
}
