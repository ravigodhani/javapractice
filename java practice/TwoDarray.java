import java.util.Scanner;

public class TwoDarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int rows = sc.nextInt();
        int cols = sc.nextInt();

        int numbers[][] = new int[rows][cols];

        //input
        //row
        for(int i = 0; i < rows; i++){
            //col
            for(int j = 0; j < cols; j++){
                numbers[i][j] = sc.nextInt();
            }
        }

        int x = sc.nextInt();

        //output
        //row
        for(int i = 0; i < rows; i++){
            //col
            for(int j = 0; j < cols; j++){
                if (numbers[i][j] == x) {
                    System.out.println("x is found at location ("+ i +", "+ j +")");
                }
            }
        }
    }
}