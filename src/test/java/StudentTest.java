import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StudentTest {
    Student studentOne;
    Student studentTwo;
    Student studentThree;


    @Before
    public void setUp() throws Exception {
        studentOne = new Student(1,"John");
        studentOne.addGrade(90);
        studentOne.addGrade(100);
        studentTwo = new Student(2, "James");
        studentTwo.addGrade(50);
        studentTwo.addGrade(100);
        studentThree = new Student(3, "Tiffany");

    }



    @Test
    public void testConstructor() {
        Student s1 = new Student(1,"name");
        assertEquals("name", s1.getName());
        assertEquals(1,s1.getId());
        assertTrue(s1.getGrades().isEmpty());
    }

    @Test
    public void testGetId(){
        assertEquals(1,studentOne.getId());
        assertEquals(2, studentTwo.getId());
    }

    @Test
    public void testGetName(){
        assertEquals("John", studentOne.getName());
        assertEquals("James", studentTwo.getName());
    }

    @Test
    public void testAddGrade(){
        assertTrue(studentThree.getGrades().isEmpty());
        studentThree.addGrade(98);
        assertFalse(studentThree.getGrades().isEmpty());
    }

    @Test
    public void testGetGrades(){
        assertSame(90,studentOne.getGrades().get(0));
        assertSame(100,studentTwo.getGrades().get(1));
    }

    @Test
    public void testGetGradeAverage(){
        assertEquals(75, studentTwo.getGradeAverage(),0);
    }


}
