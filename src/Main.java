import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Map<String,String> map=new HashMap<String,String>();
        map.put("Ja","Ka");
        map.put("As","Aa");
        map.put("Qw","Sa");
        boolean a =isUnique(map);
        System.out.println(a);

    }
    public static boolean isUnique(Map<String,String> map){
        if(map.isEmpty()) return true;
        Set<String> val=new HashSet<>();
        for(String value: map.values()){
            if(val.contains(value)){
                return false;
            }
            val.add(value);
        }
        return true;
    }
}

