import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int Num = sc.nextInt();
        int count = 1;

        for(int i = 0; i < Num; i++) {
            count = count * 2;
        }
        System.out.print(count);
    }

}
