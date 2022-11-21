import java.util.Scanner;

public class Main {
    public static int largest(int a, int b, int c) {
        int largest = c > (a > b ? a : b) ? c : ((a > b) ? a : b);
        return largest;
    }
    public static int smallest(int a,int b,int c) {

        int smallest = c < (a < b ? a : b) ? c : ((a < b) ? a : b);
        return smallest;
    }
    public static void prime(int j) {
        int flag = 0;
        for (int i = 1; i <= j; i++) {
            if (j % i == 0) {
                flag++;
            }
        }
        if (flag == 2) {
            System.out.println("Prime");
        } else {
            System.out.println("Not prime");
        }
    }
    public static void reverse(int i){
        int rev =0;
        int rem;
        while (i != 0) {
            rem = i % 10;
            rev = rev * 10 + rem;
            i /= 10;
        }
        System.out.println(rev);
    }


    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter any number:");
        int num=scan.nextInt();
        scan.close();
}}