
//Code	for	calculating	simple	interest	taking	input	from	user
import java.util.Scanner;

public class prob4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double si, principal, rate, time;
        principal = input.nextDouble();
        rate = input.nextDouble();
        time = input.nextDouble();
        si = (principal * rate * time) / 100;
        System.out.println("Simple	Interest= " + si);
    }
}