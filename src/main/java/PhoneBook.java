import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class PhoneBook {
    Map<String,Integer> numbers=new HashMap();
    public int add(String name,int num){
        numbers.put(name,num);
        return numbers.size();}



}
