import java.util.*;

public class VonMangoldt {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print("Λ(" + n + ") = ");
        double t = vonMangoldt(n);
        if(t != 0){
            System.out.println("log" + Math.round(Math.exp(t)) + " = " + t);
        }else{
            System.out.println(0);
        }
        

    }

    public static double vonMangoldt(int input){
        if(input == 1){
            return 0;
        }else if(PrimeOrNot.primeOrNot(input)){
            //System.out.print("log" + input + " = ");
            return Math.log(input);
        }else{
            List<Integer> primes = new ArrayList<Integer>();
            int d = input;

            for (int i = 2;; i++) {
                while (d % i == 0) {
                    //System.out.print(i + " ");
                    primes.add(i);
                    d = d / i;
                }
                if (d == 1)
                    break;
            }

            if(AllElementsSame.allElementsSame(primes)){
                //System.out.print("log" + primes.get(0) + " = ");
                return Math.log(primes.get(0));
            }else{
                return (int)0;
            }
        }
    }
    
}
