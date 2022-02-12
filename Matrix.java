import java.util.*;

public class Matrix {
    public static void main(String[] args){   //M_(m, n)(Z)の元を表示
        Scanner sc = new Scanner(System.in);
        System.out.println("サイズを入力");
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] matrix = new int[m][n];
        System.out.println(m + "*" + n + "行列の成分を行方向に入力");

        for(int i = 0;i < m;i++){
            for(int j = 0;j < n;j++){
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("↓入力された行列↓");

        for(int i = 0;i < m;i++){
            for(int j = 0;j < n;j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }


    }

    
    
}
