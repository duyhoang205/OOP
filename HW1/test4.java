import java.util.Scanner;
public class test4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int days = sc.nextInt();
        int people = 0;
        boolean[] hasBirthday = new boolean[days];
        while (true) {
            people++;
            int d = (int) (days * Math.random());
            if (hasBirthday[d]) break;
            hasBirthday[d] = true;
        }

        System.out.println(people);
    }
}
