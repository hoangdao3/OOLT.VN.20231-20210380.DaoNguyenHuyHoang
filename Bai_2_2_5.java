import java.lang.reflect.Array;
import java.util.*;
import javax.swing.JOptionPane;
public class Bai_2_2_5 {
	 public static void main(String[] args) {
	        // Input for the first number
	        String strNum1 = JOptionPane.showInputDialog("Enter the first double number:");
	        double num1 = Double.parseDouble(strNum1);
	        String strNum2 = JOptionPane.showInputDialog("Enter the second double number:");
	        double num2 = Double.parseDouble(strNum2);
	        double sum = num1 + num2;
	        JOptionPane.showMessageDialog(null, "The sum of " + num1 + " and " + num2 + " is: " + sum);
	        double diff = num1-num2;
	        JOptionPane.showMessageDialog(null, "The difference of " + num1 + " and " + num2 + " is: " + diff);
	        double product = num1*num2;
	        JOptionPane.showMessageDialog(null, "The product of " + num1 + " and " + num2 + " is: " + product);
	        double quotient = num1/num2;
	        JOptionPane.showMessageDialog(null, "The quotient of " + num1 + " and " + num2 + " is: " + quotient);
	        System.exit(0);
	    }
}
