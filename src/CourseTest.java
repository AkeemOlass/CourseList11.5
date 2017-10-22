import org.junit.Assert;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class CourseTest {
    @org.junit.Test
    public void getStudents() throws Exception {
        Course course1 = new Course("Data Structures");
        course1.addStudent("Peter Jones");
        course1.addStudent("Kim Smith");
        course1.addStudent("Anne Kennedy");
        ArrayList<String> k = new ArrayList<String>();
        k.add("Peter Jones");
        k.add("Kim Smith");
        k.add("Anne Kennedy");
        Assert.assertEquals(k, course1.getStudents());
    }

}