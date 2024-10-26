package Lab01;
import javax.swing.JOptionPane;

public class Sum {
    public static void main(String[] args){
        String Num1, Num2;

        Num1 = JOptionPane.showInputDialog(null, "Enter the first number: ", JOptionPane.INFORMATION_MESSAGE);
        double num1 = Double.parseDouble(Num1);

        Num2 = JOptionPane.showInputDialog(null, "Enter the second number: ", JOptionPane.INFORMATION_MESSAGE);
        double num2 = Double.parseDouble(Num2);

        double sum = num1 + num2;
        double diff = num1 - num2;
        double prd = num1 * num2;
        
        double quo = (num2 != 0) ? (num1 / num2) : Double.NaN; 
        
        JOptionPane.showMessageDialog(null, "Sum: " + sum + "\n" 
                                                        +  "Difference: " + diff + "\n"
                                                        +  "Product: " + prd + "\n"
                                                        +  "Quotient: " + quo, "Result", 0);

     }
}
