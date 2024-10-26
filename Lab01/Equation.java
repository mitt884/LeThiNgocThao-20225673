package Lab01; //Le Thi Ngoc Thao 20225673
import javax.swing.JOptionPane;
import java.util.Scanner;


public class Equation {
    public static void LinearEqua(double a, double b){
        if(a==0){
            if(b==0){ System.out.println("Phuong trinh vo so nghiem");
            } else {
                System.out.println("Phuong trinh vo nghiem");
            }
        } else {
            double x = -b/a;
            System.out.println("Nghiem la: " + x);
        }
    }

    public static void Hebacnhat(double a11, double a12, double b1, double a21, double a22, double b2){
        double D = a11*a22 - a21*a12;
        double D1 = b1*a22 - b2*a12;
        double D2 = a11*b2 - a21*b1;

        if(D == 0){
            if(D1 == 0 && D2 == 0){
                System.out.println("Phuong trinh vo so nghiem");
            } else {
                System.out.println("Phuong trinh vo nghiem");
            }
        } else {
           System.err.println("Nghiem cua he la: " + D1/D + " va " + D2/D);
        }
    }

    public static void Ptbachai(double a, double b, double c){
        if(a == 0){
            LinearEqua(b, c); // a=0 tro thanh pt bac nhat
        } else {
            if(b == 0){
                System.out.println("Nghiem kep: " + -b/2*a);
            } else {
            double delta = b*b - 4*a*c;

            double x1 = (-b - Math.sqrt(delta))/2*a;
            double x2 = (-b + Math.sqrt(delta))/2*a;

            System.out.println("Nghiem la: " + x1 + " va " + x2 );
        }
    }
}

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("1.First-degree quation ax + b =0: ");
        System.out.println("2.System of first-degree equations: ");
        System.out.println("3. Second-degree equation ax^2 + bx + c=0: ");
        System.out.println("Choose number to solve the problem: ");

        int choice = sc.nextInt();

        if(choice == 1){
            System.out.println("Enter a: ");
            double a = sc.nextDouble();
            System.out.println("Enter b: ");
            double b = sc. nextDouble();

            Equation eq = new Equation();
            eq.LinearEqua(a, b);
        } else if (choice == 2){
            System.out.println("Enter a11: ");
            double a11 = sc.nextDouble();  
            System.out.println("Enter a12: ");
            double a12 = sc.nextDouble();
            System.out.println("Enter b1: ");
            double b1 = sc.nextDouble();
            System.out.println("Enter a21: ");
            double a21 = sc.nextDouble();
            System.out.println("Enter a22: ");
            double a22 = sc.nextDouble();
            System.out.println("Enter b2: ");
            double b2 = sc.nextDouble();

            Equation eq = new Equation();
            eq.Hebacnhat(a11, a12, b1, a21, a22, b2);
        } else if(choice == 3) {
            System.out.println("Enter a: ");
            double a = sc.nextDouble();
            System.out.println("Enter b: ");
            double b = sc.nextDouble();
            System.out.println("Enter c: ");
            double c = sc.nextDouble();

            Equation eq = new Equation();
            eq.Ptbachai(a, b, c);

        } else {
            System.out.println("Invalid choice");
        }
        sc.close();
    }
}
