import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class PhoneBook {
    ConcurrentHashMap<String,Integer> names= new ConcurrentHashMap<>();
    ConcurrentHashMap<Integer,String> numbers= new ConcurrentHashMap<>();
    public int add(String name,int num){
        numbers.put(num,name);
        names.put(name,num);
        return numbers.size();}

    public String findByNumber(int number){
        return numbers.get(number);

    }
    public int findByName(String name){
        return names.get(name);
    }

}
