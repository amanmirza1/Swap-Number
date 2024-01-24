

import java.util.Scanner;

class Number_Swap{
    public static void main(String[] args) {
    int m ,n,temp;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        m = sc.nextInt();
        System.out.println("Enter the second number");
        n = sc.nextInt();
        temp = m;
        m = n;
        n= temp;
        System.out.println("After Swapping");
        System.out.println("First Number: "+ m);
        System.out.println("Second Number: "+n);
    }

}