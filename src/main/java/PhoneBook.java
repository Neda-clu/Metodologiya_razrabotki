import java.util.*;

public class PhoneBook {
    private Map<String,Integer> names= new HashMap<>();
    private Map<Integer,String> numbers= new HashMap<>();
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

    public HashSet<String> printAllNames(){
        return new HashSet<>(names.keySet());
    }
}
