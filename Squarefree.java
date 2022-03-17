import java.util.*;

public class Squarefree{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        System.out.println("平方因数があればtrue → " + squareFree(input));
        System.out.println("完全分解すればtrue → " + !(squareFree(input)));
        //完全分解・・・素因数の指数がすべて1

    }

    public static boolean squareFree(int n){
        int cnt = 0;
        int dum = 0;
        boolean heiho = false;

        for (int i = 2;; i++) {
            cnt = 0;
            while (n % i == 0) {
                //System.out.print(i + " ");
                dum = n/i;
                n = dum;
                cnt++;
                if (cnt >= 2)
                heiho = true;
            }
            if(n == 1)
            break;
        }

        return heiho;

    }


    public static boolean perfectFacto(int n){
        int cnt = 0;
        int dum = 0;
        boolean heiho = true;

        for (int i = 2;; i++) {
            cnt = 0;
            while (n % i == 0) {
                //System.out.print(i + " ");
                dum = n/i;
                n = dum;
                cnt++;
                if (cnt >= 2)
                heiho = false;
            }
            if(n == 1)
            break;
        }

        return heiho;
    }
}