public class Teacher {

    //represents the teacher object
    //includes the first name, last name, and subject + can get and set these fields and stuff
    //includes a method to print the information of a teacher

    //fields
    private String firstName;
    private String lastName;
    private String subject;

    //constructor

    Teacher(String firstName, String lastName, String subject) { // need a first name, last name, and subject to create a new teacher
        this.firstName = firstName; //making the names and subjects of the teacher into what is put in the ()
        this.lastName = lastName;
        this.subject = subject;
    }

    //setters and getters
    public String getFirstName(){
        return this.firstName;
    }
    public String getLastName(){
        return this.lastName;
    }

    public String getSubject(){
        return this.subject;
    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public void setSubject(String subject){
        this.subject = subject;
    }

    public String toString(){    //not sure if you wanted it to return the text or just print out the text
        return "Staff Name: " + this.firstName + " " + this.lastName + " | Subject: " + this.subject;
    }

}

