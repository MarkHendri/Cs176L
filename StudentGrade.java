
public class StudentGrade {
    private int grade;
    private String name;

   
    private final int DEFAULT_GRADE = 60;
    private final int MAXIMUM_GRADE = 100;
    private final int MINIMUM_GRADE = 0;
    private final int A_GRADE = 90;
    private final int B_GRADE = 80;
    private final int C_GRADE = 70;

    
    public StudentGrade(String name) {
        this.name = name;
        this.grade = DEFAULT_GRADE;
    }

    public StudentGrade(String name, int grade) {
        this.name = name;
        setGrade(grade);
    }


    public void setGrade(int grade) {
        if (grade >= MINIMUM_GRADE && grade <= MAXIMUM_GRADE) {
            this.grade = grade;
        } else {
            this.grade = DEFAULT_GRADE;
        }
    }

   
    public int getGrade() {
        return grade;
    }

    
    public String retGradeLevel() {
        if (grade > A_GRADE) {
            return "A";
        } else if (grade >= B_GRADE) {
            return "B";
        } else if (grade >= C_GRADE) {
            return "C";
        } else {
            return "D";
        }
    }

    
    public static void main(String[] args) {
      
        StudentGrade Mark = new StudentGrade("Mark");
        StudentGrade Hendri = new StudentGrade("Hendri", 99);

        System.out.println(Mark.getGrade()); 
        System.out.println(Hendri.getGrade()); 

        
        Mark.setGrade(-100);
        System.out.println(Mark.getGrade()); 

        Mark.setGrade(1000);
        System.out.println(Mark.getGrade()); 

        Mark.setGrade(88);
        System.out.println(Mark.getGrade()); 
        
        System.out.println(Hendri.retGradeLevel()); 
        System.out.println(Mark.retGradeLevel()); 

        Mark.setGrade(77);
        System.out.println(Mark.retGradeLevel()); 

        Mark.setGrade(54);
        System.out.println(Mark.retGradeLevel()); // Expect "D"
    }
}
