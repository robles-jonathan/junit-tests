import java.util.ArrayList;

public class Student {
    private long id;
    private String name;
    private ArrayList<Integer> grades;

    public Student(long id, String name){
        this.id = id;
        this.name = name;
        this.grades = new ArrayList<>();
    }

    // returns the student's id
    public long getId(){
        return id;
    }

    // returns the student's name
    public String getName(){
        return name;
    }

    // adds the given grade to the grades list
    public void addGrade(int grade){
        grades.add(grade);
    }

    // returns the list of grades
    public ArrayList<Integer> getGrades(){
        return this.grades;
    }

    // returns the average of the students grades
    public double getGradeAverage(){
        double sum = 0;
        double numOfGrades = grades.size();
        for(double grade : grades){
            sum += grade;
        }
        return sum/numOfGrades;
    }

//    // update grade()
//    public int updateGrade(){
//
//    }
//
//    // delete grade()
//    public int deleteGrade(){
//
//    }
}
