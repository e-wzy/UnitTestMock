import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ToDoBusinessMock {

    @Test
    public void test() {

        ToDoService doService = mock(ToDoService.class);

        List<String> combinedlist = Arrays.asList(" Use Core Java ", " Use Spring Core ", " Use w3eHibernate ", " Use Spring MVC ");
        when(doService.getTodos("Dummy")).thenReturn(combinedlist);

        ToDoBusiness business = new ToDoBusiness(doService);

        //The passed in parameter must be exactly the same as above mocked one.
        List<String> retrievedtodos = business.getTodosforSpring("Dummy");

        System.out.println("got list is:"+retrievedtodos);
        assertEquals(2, retrievedtodos.size());
        System.out.println("Mock is working correctly...!!");
    }
}