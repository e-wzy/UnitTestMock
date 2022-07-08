import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.*;

//Create a mock class named ToDoBusinessMock and
//verify the specified method deleteTodos() is invoked or not
//but not verify result of the invoked method.
public class ToDoBusinessMock {

    @Test
    public void test_BDD() {

        ToDoService doService = mock(ToDoService.class);

        List<String> combinedlist = Arrays.asList("Use Hibernate Java", "Use Hibernate Core", "Use Hibernate", "Use Spring MVC");

        //---- Gherkin Syntax: given -> When->Then -----//
        //Given
        given(doService.getTodos("Dummy")).willReturn(combinedlist);
        //when(doService.getTodos("Dummy")).thenReturn(combinedlist); //okay if use when instead.

        ToDoBusiness business = new ToDoBusiness(doService);

        //When
        business.deleteTodosNotRelatedToHibernate("Dummy"); //'Dummy' must be the same as above

        //Then
        //Note: if not successful, will display:
        //"Wanted but not invoked:
        // toDoService.deleteTodos("Use Spring MVC");"
        verify(doService).deleteTodos("Use Spring MVC");
        System.out.println("'doService.deleteTodos' is invoked.");

        //Check how many times a specific method is called.
        verify(doService, times(1)).deleteTodos("Use Spring MVC");
        System.out.println("'doService.deleteTodos' is invoked once.");

        //Check a method is never called.
        verify(doService, never()).deleteTodos("Use Hibernate");
        System.out.println("'doService.deleteTodos(\"Use Hibernate\")' is never invoked.");

        System.out.println("Mock.verify method is working correctly...!!");
    }
}