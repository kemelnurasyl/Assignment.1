import java.util.Scanner;

public class Main {

    /* Task 1
    Time Complexity: O(n)
    Explanation: The function calls itself n times
    */
    public static long sumOfSquares(int n) {
        if (n == 0) {
            return 0;
        }
        return (long) n * n + sumOfSquares(n - 1);
    }

    /* Task 2
     Time Complexity: O(n)
     Explanation: The function adds one element in each recursive call.
     */
    public static long sumFirstN(int[] arr, int n) {
        if (n == 0) {
            return 0;
        }
        return arr[n - 1] + sumFirstN(arr, n - 1);
    }

    /* Task 3
     Time Complexity: O(n)
     Explanation: The function multiplies b recursively n times.
     */
    public static long power(int b, int n) {
        if (n == 0) {
            return 1;
        }
        return b * power(b, n - 1);
    }

    /* Task 3
    Time Complexity: O(n^2)
    Explanation: For each step, power(b, n) is called,
    and power itself also works recursively.
     */

    public static long sumOfPowers(int b, int n) {
        if (n == 0) {
            return 1;
        }
        return power(b, n) + sumOfPowers(b, n - 1);
    }

    /* Task 4
     Time Complexity: O(n)
     Explanation: The function reads and prints each number once.
     */
    public static void reversePrint(Scanner sc, int n) {
        if (n == 0) {
            return;
        }
        int x = sc.nextInt();
        reversePrint(sc, n - 1);
        System.out.print(x + " ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Task 1
        int n1 = sc.nextInt();
        System.out.println(sumOfSquares(n1));

        // Task 2
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        int n2 = sc.nextInt();
        System.out.println(sumFirstN(arr, n2));

        // Task 3
        int b = sc.nextInt();
        int n3 = sc.nextInt();
        System.out.println(sumOfPowers(b, n3));

        // Task 4
        int n4 = sc.nextInt();
        reversePrint(sc, n4);
        System.out.println();

        sc.close();
    }
}