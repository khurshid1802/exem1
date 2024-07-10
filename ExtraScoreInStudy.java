package service.exem;

import model.Student;

import java.util.List;
import java.util.Random;

public class ExtraScoreInStudy {
    Random random = new Random();
    public void extraScoreInStudy(List<Student> students) {
      for (Student student :students){
          student.setBallOfPractice(random.nextInt(10) + 1);
      }
    }
}
