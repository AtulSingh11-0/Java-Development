package OOPsJava.oops.ISCquestions;

import java.util.Scanner;

public class Library {
    String name, author; // to store name of book and authors name
    double pric; // price of the book in decimals
    int d; // no.of days taken in returning the book
    int r; // to store the fine of excess days
    double total_amt; // to store the actual fine amount to be paid

    public Library() { // default constructor
        name = author = "";
        pric = total_amt = 0.0;
        d = r = 0;
    }

    void accept () {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name of the Book >> ");
        name = sc.nextLine();
        System.out.print("Enter the author's name >> ");
        author = sc.nextLine();
        System.out.print("Enter cost of the Book >> ");
        pric = sc.nextDouble();
        System.out.print("Enter number of days taken in returning the Book >> ");
        d = sc.nextInt();
    }

    void compute () {
        if ( d > 0 && d <= 5 )
            r = d * 2;
        else if ( d > 5 && d <= 10 )
            r = 5 * 2 + (d - 5) * 3;
        else
            r = 5 * 2 + 5 * 3 + (d - 10) * 5;
        total_amt = ( (0.02 * pric) * d) + r;
    }

    void show () {
        System.out.println("Name of the Book >> " + name);
        System.out.println("Name of the Author >> " + author);
        System.out.println("Cost of the Book >> " + pric);
        System.out.println("Number of days taken in returning the Book >> " + d);
        System.out.println("Fine for excess days >> " + r);
        System.out.println("TOTAL AMOUNT to be paid incl. fine >> " + total_amt);
    }

    public static void main(String[] args) {
        Library obj = new Library();
        obj.accept();
        obj.compute();
        obj.show();
    }
}
