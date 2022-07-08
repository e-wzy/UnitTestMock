import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.when;

public class ToDoBusinessMock {

    @Test
    public void test() {

        List spyArrayList = spy(ArrayList.class);
        assertEquals(0, spyArrayList.size());

        // adding an item in the list
        spyArrayList.add("Mockito");

        //when(spyArrayList.size()).thenReturn(0);   //size() is override, the value of size() is 0

        assertEquals(1, spyArrayList.size());
    }
}