import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HelloWorldTest {
    @Test
    public void expectHelloWorld()
    {
        assertEquals("Hello World", new Greet().sayHelloWorld());
    }
    @Test
    public void expectNameHello()
    {
        String name="Harshit";
        assertEquals("Hello Harshit",new Greet().sayHelloName(name));
    }
}
