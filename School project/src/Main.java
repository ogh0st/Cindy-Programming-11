public class Main {
    public static void main(String[] args) {

        //Creating a school

        School school = new School("SOG Secondary", "Ragdoll Cat", "1234 420 Ave");

        //Creating the 10 students
        Student student1 = new Student("Cindy", "Huang", 10);
        Student student2 = new Student("Maddy", "Speckmaier", 10);
        Student student3 = new Student("Saa", "Waaz", 11);
        Student student4 = new Student("Anthony", "Italian", 9);
        Student student5 = new Student("Matthew", "Kelekolio", 12);
        Student student6 = new Student("Beese", "Churger", 10);
        Student student7 = new Student("Rowan", "Chow", 10);
        Student student8 = new Student("Amy", "Shumka", 10);
        Student student9 = new Student("Saltied", "Childe", 8);
        Student student10 = new Student("Cate", "Shumka", 8);

        //Creating 3 teachers
        Teacher teacher1 = new Teacher("Whitney", "Elliot", "Art");
        Teacher teacher2 = new Teacher("Kurtis", "Conner", "Theatre");
        Teacher teacher3 = new Teacher("Danny", "Gonzalez", "Math");

        //Adding them to the arraylist

        school.addStudent(student1);
        school.addStudent(student2);
        school.addStudent(student3);
        school.addStudent(student4);
        school.addStudent(student5);
        school.addStudent(student6);
        school.addStudent(student7);
        school.addStudent(student8);
        school.addStudent(student9);
        school.addStudent(student10);

        school.addTeacher(teacher1);
        school.addTeacher(teacher2);
        school.addTeacher(teacher3);

        //Showing the lists

        school.showStudents();
        school.showTeachers();

        //Removing students and teachers

        school.removeStudent(student4);
        school.removeStudent(student7);
        school.removeTeacher(teacher3);

        //Showing the lists again

        System.out.println("\n\nLists after changes");
        school.showStudents();
        school.showTeachers();

    }}