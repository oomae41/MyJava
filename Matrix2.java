import java.util.*;

public class Matrix2 extends Matrix {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        //List<Integer> matrix = new List<Integer>(); はNG(Listはコレクションクラスであって実装がないため)
        ArrayList<ArrayList<Integer>> matrix = new ArrayList<ArrayList<Integer>>();
        
        System.out.println("行方向に成分を入力");
        System.out.println("enterで次の行へ移動");


        String line;
        while(true){
            line = sc.nextLine();
            if(line.length() == 0){
                break;
            }else{
                ArrayList<Integer> sub = new ArrayList<Integer>();
                for(String s : line.split(" ")){
                    sub.add(Integer.valueOf(s));
                }
                matrix.add(sub);
            }
        }

        System.out.println("↓入力された行列↓");
        for(ArrayList<Integer> row : matrix){
            for(Integer j : row){
                System.out.print(j + " ");
            }
            System.out.println();
        }


    }
    
}
