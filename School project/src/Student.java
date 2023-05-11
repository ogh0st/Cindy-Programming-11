public class Student {

    //this class represents the student objects
    //contains fields for the name, grade, and student number

    //fields
    private String firstName;
    private String lastName;
    private int grade;
    private int studentNum;
    static private int nextAvailableNum = 0;

    //constructor

    Student(String firstName, String lastName, int grade){ //first name, last name, and grade of the student needed to make the student
        this.firstName = firstName;
        this.lastName = lastName;
        this.grade = grade;
        nextAvailableNum++; //The next available num goes up by one every time, and it is static
        this.studentNum = nextAvailableNum; //the student number is the next available number
    }

    //setters and getters

    public String getFirstName(){
        return this.firstName;
    }

    public String getLastName(){
        return this.lastName;
    }

    public int getGrade(){
        return this.grade;
    }

    public int getStudentNum(){
        return this.studentNum;
    }

    public void setFirstName(){
        this.firstName = firstName;
    }

    public void setLastName(){
        this.lastName = lastName;
    }

    public void setGrade(){
        this.grade = grade;
    }

    public void setStudentNum(int studentNum) {
        this.studentNum = studentNum;
    }

    public String toString(){     //not sure if you wanted it to return the text or just print out the text
        return "Student Name: " + this.firstName + " " + this.lastName + " | Grade: " + this.grade + " | Student Number: " + this.studentNum;
    }
}
