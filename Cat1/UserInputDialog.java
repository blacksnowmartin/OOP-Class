import javax.swing.JOptionPane;

public class UserInputDialog {

    public static void main(String[] args) {
        String input1 = JOptionPane.showInputDialog("Enter a number:");
        String input2 = JOptionPane.showInputDialog("Enter another number:");
        int num3 = Integer.parseInt(input1);
        int num4 = Integer.parseInt(input2);
        int product = num3 * num4;
        JOptionPane.showMessageDialog(null, "Product of the numbers: " + product);
    }
}
