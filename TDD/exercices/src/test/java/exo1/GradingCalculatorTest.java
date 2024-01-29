package exo1;

import org.example.exo1.GradingCalculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GradingCalculatorTest {

    //Score : 95%, Présence : 90 => Note: A
    //Score : 85%, Présence : 90 => Note: B
    //Score : 65%, Présence : 90 => Note: C
    //Score : 95%, Présence : 65 => Note: B
    //Score : 95%, Présence : 55 => Note: F
    //Score : 65%, Présence : 55 => Note: F
    //Score : 50%, Présence : 90 => Note: F

    @Test
    void givenAttendance90AndScore95WhenGetGradeThenGradeIsA() {
        GradingCalculator gradingCalculator = new GradingCalculator();
        gradingCalculator.setScore(95);
        gradingCalculator.setAttendancePercentage(90);

        char grade = gradingCalculator.getGrade();

        Assertions.assertEquals('A', grade);
    }

    @Test
    void givenAttendance90AndScore85WhenGetGradeThenGradeIsB() {
        GradingCalculator gradingCalculator = new GradingCalculator();
        gradingCalculator.setScore(85);
        gradingCalculator.setAttendancePercentage(90);

        char grade = gradingCalculator.getGrade();

        Assertions.assertEquals('B', grade);
    }

    @Test
    void givenAttendance90AndScore65WhenGetGradeThenGradeIsC() {
        GradingCalculator gradingCalculator = new GradingCalculator();
        gradingCalculator.setScore(65);
        gradingCalculator.setAttendancePercentage(90);

        char grade = gradingCalculator.getGrade();

        Assertions.assertEquals('C', grade);
    }

    @Test
    void givenAttendance65AndScore95WhenGetGradeThenGradeIsB() {
        GradingCalculator gradingCalculator = new GradingCalculator();
        gradingCalculator.setScore(95);
        gradingCalculator.setAttendancePercentage(65);

        char grade = gradingCalculator.getGrade();

        Assertions.assertEquals('B', grade);
    }

    @Test
    void givenAttendance55AndScore95WhenGetGradeThenGradeIsF() {
        GradingCalculator gradingCalculator = new GradingCalculator();
        gradingCalculator.setScore(95);
        gradingCalculator.setAttendancePercentage(55);

        char grade = gradingCalculator.getGrade();

        Assertions.assertEquals('F', grade);
    }

    @Test
    void givenAttendance55AndScore65WhenGetGradeThenGradeIsF() {
        GradingCalculator gradingCalculator = new GradingCalculator();
        gradingCalculator.setScore(65);
        gradingCalculator.setAttendancePercentage(55);

        char grade = gradingCalculator.getGrade();

        Assertions.assertEquals('F', grade);
    }

    @Test
    void givenAttendance90AndScore50WhenGetGradeThenGradeIsA() {
        GradingCalculator gradingCalculator = new GradingCalculator();
        gradingCalculator.setScore(50);
        gradingCalculator.setAttendancePercentage(90);

        char grade = gradingCalculator.getGrade();

        Assertions.assertEquals('F', grade);
    }
}
