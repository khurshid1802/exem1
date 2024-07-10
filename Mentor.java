package service.exem;

import model.Student;
import service.exem.practice.Practice;
import service.exem.theory.Theory;

import java.util.List;

public class Mentor {
    Practice practice;

    Theory theory;

    ExtraScoreInStudy extraScoreInStudy;

    public Mentor(Practice practice, Theory theory){
        this.practice = practice;
        this.theory = theory;
    }

    public Mentor(Practice practice, Theory theory, ExtraScoreInStudy extraScoreInStudy){
        this.practice = practice;
        this.theory = theory;
        this.extraScoreInStudy = extraScoreInStudy;
    }

    public void practice(List<Student> students){
        practice.practice(students);
    }

    public void theory(List<Student> students){
        theory.theory(students);
    }

    public void extraScoreInStudy(List<Student> students){
        extraScoreInStudy.extraScoreInStudy(students);
    }

}
