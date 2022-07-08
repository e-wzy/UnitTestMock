import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;

/*In this example, the ToDoBusinessStub depends on the ToDoService interface,
 so we have created a stub named ToDoServiceStub that returns dummy values.*/
public class ToDoBusinessStub {

    @Test
    public void test() {

        ToDoService doServiceStub = new ToDoServiceStub();

        ToDoBusiness business = new ToDoBusiness(doServiceStub);

        List<String> retrievedtodos = business.getTodosforSpring(" Dummy ");

        System.out.println("got list is:"+retrievedtodos);
        assertEquals(2, retrievedtodos.size());
        System.out.println("Stub is working correctly...!!");
    }
}