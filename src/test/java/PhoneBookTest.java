import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

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
}
