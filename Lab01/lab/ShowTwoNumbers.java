package Lab01.lab;

import javax.swing.JOptionPane;

public class ShowTwoNumbers {
    public static void main(String[] args){
        String strNum1, strNum2;
        String strNotif = "You've just entered: ";

        strNum1 = JOptionPane.showInputDialog(null,"Please input the first number: ", "Input the first number", JOptionPane.INFORMATION_MESSAGE);
        strNotif += strNum1 + " and ";
        strNum2 = JOptionPane.showInputDialog(null, "Please input the second number: ", JOptionPane.INFORMATION_MESSAGE);
        strNotif += strNum2;
        JOptionPane.showMessageDialog(null, strNotif, "Show two numbers", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }
}
