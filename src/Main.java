import java.util.Collection;
import java.util.HashMap;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static HashMap<String, Integer> username= new HashMap<>();

    public static boolean checkAvailability(String name){
        if(username.containsKey(name)){
            username.put(name, username.getOrDefault(name, 0)+1);
            return false;
        }
        else{
            username.put(name, username.getOrDefault(name, 0)+1);
        }
        return true;
    }

//    public static String getMostAttempted(){
//        Collection<Integer> values = username.values();
//        int maxAttempted = Integer.MIN_VALUE;
//        for(int value: values){
//            if(value > maxAttempted){
//                maxAttempted = value;
//            }
//        }
//        return username.getKey(maxAttempted);
//    }

    public static void main(String[] args) {

        username.put("user3", 1);
        username.put("applebee", 1);
        username.put("user28", 1);
        System.out.print(checkAvailability("applebee"));
    }
}