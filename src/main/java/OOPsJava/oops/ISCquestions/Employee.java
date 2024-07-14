package OOPsJava.oops.ISCquestions;

import java.util.Scanner;

public class Employee {
    String empname; // to store name of employee
    int empcode; // to store the employee code
    double basicpay; // to store the basic pay of the employee

    Employee () { // default constructor
        empname = "";
        empcode = 0;
        basicpay = 0.0;
    }
    Employee (String n, int p, double q) { // parameterized constructor
        empname = n;
        empcode = p;
        basicpay = q;
    }
    double salarycal () {
        double HRA, DA, salary, TOTAL_SALARY;
        HRA = 0.30 * basicpay;
        DA = 0.40 * basicpay;
        salary = basicpay + HRA + DA;

        if( empcode <= 15) {
            double max = 0.20 * salary;
            if( max <= 2500 ) {
                TOTAL_SALARY = salary + max;
            } else {
                TOTAL_SALARY = salary + 2500;
            }
        } else {
            TOTAL_SALARY = salary + 1000;
        }
        return TOTAL_SALARY;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name of the Employee >> ");
        String n = sc.nextLine();
        System.out.print("Enter the Employee code >> ");
        int p = sc.nextInt();
        System.out.print("Enter Basic Pay of the Employee >> ");
        double q = sc.nextDouble();

        Employee obj1 = new Employee();
        Employee obj2 = new Employee(n, p, q);
        System.out.println("Total Salary of the Employee is >> " + obj2.salarycal());
    }
}
