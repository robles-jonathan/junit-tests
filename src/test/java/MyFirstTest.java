import org.junit.Test;
import org.junit.Assert;

import java.util.ArrayList;
import java.util.List;

public class MyFirstTest {
    @Test
    public void codeupIsNotCodeUp(){
        String correct = "Codeup";
        String commonly = "CodeUp";

        Assert.assertNotEquals(correct, commonly);
    }

    @Test
    public void davidIsDavid(){
        String instructor = "David";
        String testWriter = "David";

        Assert.assertEquals(testWriter, instructor);
    }

    @Test
    public void listsAreDifferent(){
        List<String> languages = new ArrayList<>();
        List <String> names = new ArrayList<>();

        //assertEquals checks to see if the values are the same
        // test fails
//        languages.add("Latin");
//        names.add("Jennifer");
//        Assert.assertEquals(languages, names);

        //assertSame checks if the objects are the same
        // test fails
//        languages.add("Latin");
//        names.add("Latin");
//        Assert.assertSame(languages, names);

    }

    @Test
    public void arraysAreEqual(){
        int[] numbers = {1,2,3};
        int[] otherNumbers = new int[3];
        otherNumbers[0] = 1;
        otherNumbers[1] = 2;
        otherNumbers[2] = 3;

        Assert.assertArrayEquals(numbers, otherNumbers);
    }

    @Test
    public void funWithPHP(){
        String language = "PHP";
        Assert.assertTrue(language.contains("H"));
        Assert.assertFalse(language.contains("J"));
    }
}
