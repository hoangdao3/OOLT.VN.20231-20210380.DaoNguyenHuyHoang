import javax.swing.JOptionPane;

public class Bai_2_2_6 {
    public static void main(String[] args) {
        String[] options = {"First-Degree Equation", "Linear System", "Second-Degree Equation"};
        int choice = JOptionPane.showOptionDialog(null, "Select the type of equation to solve:",
                "Equation Solver", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);

        if (choice == 0) {
            solveFirstDegreeEquation();
        } else if (choice == 1) {
            solveLinearSystem();
        } else if (choice == 2) {
            solveSecondDegreeEquation();
        } else {
            JOptionPane.showMessageDialog(null, "Program exited.");
        }
    }

    public static void solveFirstDegreeEquation() {
        double a, b;

        a = Double.parseDouble(JOptionPane.showInputDialog("Enter the coefficient 'a' (must be non-zero):"));
        if (a == 0) {
            JOptionPane.showMessageDialog(null, "Invalid input. 'a' must be non-zero.");
            return;
        }

        b = Double.parseDouble(JOptionPane.showInputDialog("Enter the constant 'b':"));

        double x = -b / a;
        JOptionPane.showMessageDialog(null, "The solution for the equation " + a + "x + " + b + " = 0 is x = " + x);
    }

    public static void solveLinearSystem() {
        double a, b, c, d, e, f;

        a = Double.parseDouble(JOptionPane.showInputDialog("Enter the coefficient 'a' for the first equation:"));
        b = Double.parseDouble(JOptionPane.showInputDialog("Enter the coefficient 'b' for the first equation:"));
        c = Double.parseDouble(JOptionPane.showInputDialog("Enter the constant 'c' for the first equation:"));
        d = Double.parseDouble(JOptionPane.showInputDialog("Enter the coefficient 'd' for the second equation:"));
        e = Double.parseDouble(JOptionPane.showInputDialog("Enter the coefficient 'e' for the second equation:"));
        f = Double.parseDouble(JOptionPane.showInputDialog("Enter the constant 'f' for the second equation:"));

        double determinant = a * e - b * d;
        if (determinant == 0) {
            if (a * f - c * e == 0 && b * f - c * d == 0) {
                JOptionPane.showMessageDialog(null, "The system has infinitely many solutions.");
            } else {
                JOptionPane.showMessageDialog(null, "The system has no solution.");
            }
        } else {
            double x = (c * e - b * f) / determinant;
            double y = (a * f - c * d) / determinant;
            JOptionPane.showMessageDialog(null, "The solutions for the system are: x = " + x + " and y = " + y);
        }
    }

    public static void solveSecondDegreeEquation() {
        double a, b, c;

        a = Double.parseDouble(JOptionPane.showInputDialog("Enter the coefficient 'a' (must be non-zero):"));
        if (a == 0) {
            JOptionPane.showMessageDialog(null, "Invalid input. 'a' must be non-zero.");
            return;
        }

        b = Double.parseDouble(JOptionPane.showInputDialog("Enter the coefficient 'b':"));
        c = Double.parseDouble(JOptionPane.showInputDialog("Enter the coefficient 'c':"));

        double discriminant = b * b - 4 * a * c;

        if (discriminant > 0) {
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            JOptionPane.showMessageDialog(null, "The roots of the equation " + a + "x^2 + " + b + "x + " + c + " = 0 are: x1 = " + root1 + " and x2 = " + root2);
        } else if (discriminant == 0) {
            double root = -b / (2 * a);
            JOptionPane.showMessageDialog(null, "The equation has a double root: x = " + root);
        } else {
            JOptionPane.showMessageDialog(null, "The equation has no real roots.");
        }
    }
}
