package service.exem.practice;

import model.Student;

import java.util.List;
import java.util.Random;

public class TeamPractice implements Practice {

    Random random = new Random();

    @Override
    public void practice(List<Student> students) {
     for (Student student : students){
         student.setBallOfPractice(random.nextInt(36) + 30);
     }
    }
}
