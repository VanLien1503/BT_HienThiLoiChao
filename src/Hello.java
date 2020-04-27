import java.sql.SQLOutput;
import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        Scanner name=new Scanner(System.in);
        System.out.println("enter Your Name");
        String yourName=name.nextLine();
        System.out.println("Hello "+ yourName);

    }
}
