import static org.junit.Assert.*;
import org.junit.*;

import java.util.ArrayList;
import java.util.List;

public class ListTests{
    @Test
    public void testFilter(){
        List<String> input1 = new ArrayList<>();
        input1.add(0,"s");
        input1.add(0,"s");
        input1.add(0,"n");

        List<String> goalList = new ArrayList<>();
        goalList.add("s");
        goalList.add("s");
        goalList.add("n");

        StringChecker sc = new CompareObject();
        assertEquals(goalList, ListExamples.filter(input1, sc));
    }
}