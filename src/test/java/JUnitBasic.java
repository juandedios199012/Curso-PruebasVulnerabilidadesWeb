import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class JUnitBasic {

    @Before
    public void setup(){
        System.out.println("BEFORE");
    }

    @After
    public void cleanup(){
        System.out.println("AFTER");
    }


    @Test
    public void verifySomeThing(){
        System.out.println("Este es mi test");

    }

    @Test
    public void verifySomeThing2(){
        System.out.println("Este es mi test 2");

    }

}