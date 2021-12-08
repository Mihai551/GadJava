package lab8.ex1;

import java.awt.*;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ex1 {
    static int getTopStudent(List<Student> students) {
        Optional o = students.stream()
                .filter((Student s) -> {
                    System.out.println(s.getScore());
                    return s.getGradYear() == 2011;
                })
                .map((Student s) -> s.getScore())
                .max(Integer::compareTo);
        return (Integer)o.get();
    }



    public static void main(String[] args) {
    List<Student> students = Arrays.asList(
            new Student("S1",2011, 9),
            new Student("S2",2011, 8),
            new Student("S3",2011, 10)

    );

    System.out.println(ex1.getTopStudent(students));

    }
}
