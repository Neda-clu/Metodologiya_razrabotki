import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.*;

public class PhoneBookTest {
    @Test
    void test_add(){
        PhoneBook bookki=new PhoneBook();
        String name= "Asiri";
        int num = 8970;
        int expected=1;
        int result= bookki.add(name,num);
        Assertions.assertEquals(expected,result);

    }
    @Test
    void test_findByNumber(){
        PhoneBook bookki=new PhoneBook();
        int number=1122;
        String expected="Lulu";
        bookki.add("Lulu",number);
        String result= bookki.findByNumber(number);
        Assertions.assertEquals(expected,result);
    }

    @Test
    void test_findByName(){
        PhoneBook bookki=new PhoneBook();
        String name="Gera";
        bookki.add(name,8990);
        int expected=8990;
        int result= bookki.findByName(name);
        Assertions.assertEquals(expected,result);
    }
    @Test
    void test_printAllNames(){
        PhoneBook bookki=new PhoneBook();
        bookki.add("Asiri",8990);
        bookki.add("Lulu",1122);
        bookki.add("Gera",3245);
        HashSet<String> result=bookki.printAllNames();
        HashSet<String> expected=new HashSet<>();
        expected.add("Lulu");
        expected.add("Asiri");
        expected.add("Gera");
        Assertions.assertEquals(expected,result);
    }
}
