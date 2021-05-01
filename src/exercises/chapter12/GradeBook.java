package exercises.chapter12;

import java.util.HashMap;
import java.util.Map;

public class GradeBook {

    public static void main(String[] args){
        grading();
        gradingTeacherSolution();
    }

    public static void grading(){
        Map<String, Integer> originalGrades = TestResults.getOriginalGrades();
        Map<String, Integer> makeUpGrades = TestResults.getMakeUpGrades();
        Map<String, Integer> finalGrades = new HashMap<>();

        System.out.println("Original Grades: " + originalGrades);
        originalGrades.forEach((key, originalGrade) -> {
            Integer makeUpGrade = makeUpGrades.get(key);
            if (makeUpGrade > originalGrade){
                finalGrades.put(key, makeUpGrade);
            } else {
                finalGrades.put(key, originalGrade);
            }
        });
        System.out.println("Final Grades: " + finalGrades);
    }

    public static void gradingTeacherSolution(){
        Map<String, Integer> gradeBook = TestResults.getOriginalGrades();
        Map<String, Integer> test2 = TestResults.getMakeUpGrades();
        System.out.println("Original Grades: " + gradeBook);

        for(var student : test2.entrySet()){
            Integer firstGrade = gradeBook.get(student.getKey());
            Integer secondGrade = test2.get(student.getKey());

            if(secondGrade > firstGrade){
                gradeBook.put(student.getKey(), secondGrade);
            }
        }
        System.out.println("Updated Grades: " + gradeBook);

        /*
            The forEach is used here to demonstrate another approach to looping.
            However, in reality, I would have added a print statement inside of
            the loop above so that the program does not have to loop over this map
            for a second time. This would be a more efficient approach:
            System.out.println("Student: " + student.getKey() + ", Grade:" + gradeBook.get(student.getKey()));
        */
        System.out.println("Final Grades:");
        gradeBook.forEach(
                (k,v)->System.out.println("Student: " + k + ", Grade: " + v));
    }
}
