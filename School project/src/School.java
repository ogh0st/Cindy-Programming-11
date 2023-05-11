import java.util.ArrayList;
public class School {

    //This class represents the school and school object
    //it includes an arraylist for the teachers in the school and one for students in the school
    //it has methods to add teachers and students to the list, set some fields of the school object, print out the names of students and teachers in the arraylists, etc

    ArrayList<Teacher> teachers = new ArrayList<>();
    ArrayList<Student> students = new ArrayList<>();

    //the fields I chose to make
    private String schoolName;
    private String mascot;
    private String address;

    //constructor

    School(String schoolName, String mascot, String address){
        schoolName = schoolName;
        mascot = mascot;
        address = address;
    }

    //array methods

    public void addTeacher(Teacher teacher){ //Adds a teacher to the "teachers" arraylist
        this.teachers.add(teacher);
    }

    public void removeTeacher(Teacher teacher){ //Removes
        this.teachers.remove(teacher);
    }

    public void addStudent(Student student){ //Adds a student to the "students" arraylist
        this.students.add(student);
    }

    public void removeStudent(Student student){ //Removes
        this.students.remove(student);
    }

    //setters and getters

    public String getSchoolName(){
        return schoolName;
    }

    public String getMascot(){
        return mascot;
    }

    public String getAddress(){
        return address;
    }

    public void setSchoolName(String schoolName){
        schoolName = schoolName;
    }

    public void setMascot(String mascot){
        mascot = mascot;
    }

    public void setAddress(String address){
        address = address;
    }

    public ArrayList<Teacher> getTeachers(){
        return teachers;
    }

    public ArrayList<Student> getStudents(){
        return students;
    }

    //printing the lists

    public void showTeachers(){
        System.out.println("\nList of Teachers in Database:");
        for (Teacher teacher : teachers) { //For every teacher object in the teachers arraylist
            System.out.println("- " + teacher.getFirstName() + " " + teacher.getLastName());
        }
    }

    public void showStudents(){
        System.out.println("\nList of Students in Database:");
        for (Student student : students) { //for every student object in the students arraylist
            System.out.println("- " + student.getFirstName() + " " + student.getLastName() + " #" + student.getStudentNum());
        }
    }

    }

