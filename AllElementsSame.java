import java.util.*;

public class AllElementsSame {
    public static void main(String[] args){
        List<Integer> test = new ArrayList<>(Arrays.asList(1, 1, 1));
        System.out.println(allElementsSame(test));

    }

    public static boolean allElementsSame(List<Integer> list){
        for(int i = 1;i < list.size();i++){
            if(list.get(i) != list.get(i-1)){
                return false;
            }
        }
        return true;
    }
    
}
