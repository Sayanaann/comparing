import java.util.Scanner;

public class Main {
    public static int largest(int a, int b, int c) {
        int largest = c > (a > b ? a : b) ? c : ((a > b) ? a : b);
        return largest;
    }



    public static void main(String[] args) {
        System.out.println("hi");
}}