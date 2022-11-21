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



    public static void main(String[] args) {
        System.out.println("hi");
}}