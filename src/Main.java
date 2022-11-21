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
    public static void evenOrNot(int i){
        if(i%2==0){
            System.out.println("Even no");
        }
        else{
            System.out.println("No Not even");
        }
    }



    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter any number:");
        int num=scan.nextInt();
        scan.close();
}}