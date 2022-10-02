
//	code to	read	a	character	as	input:
import java.util.Scanner;

public class prob5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        char ch = s.next().charAt(0); // character input
        System.out.println("input	character =	" + ch);
    }
}