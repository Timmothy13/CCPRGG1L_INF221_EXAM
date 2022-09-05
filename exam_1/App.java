public class App {
    public static void main(String[] args) {

        
        Student student = new Student();

        student.surname= "Lukban";
        student.firstname = "Jan-Timmothy";
        student.middleIntial = 'R';
        student.dateOfBirth = 9/13/2003;
        student.studentNumber = 2022102543;
        student.emailAddress = "lukbanjr@students.national-u.edu.ph" ;
        student.iAmAwesome = true;
        student.sayMyStudentNumber();
        student.sayMyEmailAddress();
        student.sayiAmAwesome();

        
    }
}
