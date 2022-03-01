import java.util.*;

public class Mobius {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        System.out.println("μ" + "(" + input + ")" + " = " + mobius(input));
        
    }


    public static int mobius(int n){
        int cnt = 0; //約数の個数
        int dum = n;

        for (int i = 2;; i++) {
            while (dum % i == 0) {
                //System.out.print(i + " ");
                dum = dum / i;
                cnt++;
            }
            if (dum == 1)
                break;
        }

        if(n == 1){
            return 1;
        }else if(Squarefree.squareFree(n)){
            return 0;
        }else{
            return (int)Math.pow(-1, cnt);
        }
        
        
    }
    
}
