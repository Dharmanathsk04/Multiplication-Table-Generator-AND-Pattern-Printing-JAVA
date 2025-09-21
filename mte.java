package project4;


import java.util.*;
public class mte {
    
    public static void main(String args[]) {


        Scanner sc = new Scanner(System.in);

        System.out.println("enter a number to genrate multiplication table : ");

        int num = sc.nextInt();

        System.out.println("up to which multiple(e.g., 10)");

        int limit = sc.nextInt();

        System.out.println("multiplication table of " +num + "up to " + limit + ";");

        for(int i = 0; i < limit; i++) {

            System.out.println(num + "x" + i+ "="+(num * i));
        }


        sc.close();
    }
}
