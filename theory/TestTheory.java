package service.exem.theory;

import model.Student;

import java.util.List;
import java.util.Random;

public class TestTheory implements Theory {

    Random random = new Random();

    @Override
    public void theory(List<Student> students) {
    for (Student student : students){
        student.setBallOfPractice(random.nextInt(21) + 25);
    }
    }
}
