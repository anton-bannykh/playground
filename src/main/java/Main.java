import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] mas = new int[n];
    for (int i = 0; i < n; i++) {
      mas[i] = sc.nextInt();
    }
    if (foo(mas)) {
      System.out.println("Yes");
    }
    else {
      System.out.println("No");
    }
  }
  public static boolean foo(int[] mas) {
    int s = 0;
    for (int i = 0; i < mas.length; i++) {
      s ^= mas[i];
    }
    return ((s & 1) == 0);
  }
}
