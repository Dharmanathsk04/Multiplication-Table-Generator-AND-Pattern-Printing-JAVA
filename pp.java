package project4;


import java.util.*;;

public class pp {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("enetr number of rows for patteren : ");

        int rows = sc.nextInt();

        for(int i = 0; i < rows; i++) {

            for(int j = 1; j <=i; j++) {

                System.out.println("*");
            }

            System.out.println();
        }

        sc.close();
    }

}
