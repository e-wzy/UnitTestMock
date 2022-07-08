import java.util.Arrays;
import java.util.List;

//This is a stub class for testing purpose
public class ToDoServiceStub implements ToDoService   {

    public List<String> getTodos(String user) {

        return Arrays.asList(" Use Core Java ", " Use Spring Core ", " Use Hibernate ", " Use Spring MVC ");
    }
}