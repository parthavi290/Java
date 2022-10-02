
//Code	for	adding	two	integers	entered	by	the	user
import java.util.Scanner;

class prob3 {
    public static void main(String args[]) {
        int a, b, c;
        System.out.println("Enter	two	integers	to	calculate	their	sum:");
        // Create a Scanner
        Scanner s = new Scanner(System.in);
        a = s.nextInt();
        b = s.nextInt();
        c = a + b;
        System.out.println("Sum	of	entered	integers	=	" + c);
    }
}