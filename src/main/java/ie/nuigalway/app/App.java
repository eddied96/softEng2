package ie.nuigalway.app;

import java.time.LocalDate;
import java.time.Month;
import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Student student1=new Student("John",LocalDate.of(1994, Month.JULY, 29));
        Student student2=new Student("Joe",LocalDate.of(1962, Month.APRIL, 28));
        Student student3=new Student("Joseph",LocalDate.of(1946, Month.JUNE, 27));
        Student student4=new Student("Johnathon",LocalDate.of(1993, Month.DECEMBER, 26));
        Student student5=new Student("Johan",LocalDate.of(1955, Month.MAY, 25));
        Student student6=new Student("Jose",LocalDate.of(1956, Month.AUGUST, 24));
        
        Module module1=new Module("Science", "CS69");
        Module module2=new Module("Maths", "MA22");
        Module module3=new Module("Physics", "PY27");
        
        Course course1=new Course("Arts", DateTime.parse("07/01/2018", DateTimeFormat.forPattern("dd/mm/yyyy")), DateTime.parse("07/12/2022", DateTimeFormat.forPattern("dd/mm/yyyy")));
        
        course1.addModule(module1);
        course1.addModule(module2);
        course1.addModule(module3);
        
        course1.addStudent(student1);
        course1.addStudent(student2);
        course1.addStudent(student3);
        course1.addStudent(student4);
        course1.addStudent(student5);
        course1.addStudent(student6);
        
        module1.addCourse(course1);
        module2.addCourse(course1);
        module3.addCourse(course1);
        
        module1.addStudent(student1);
        module1.addStudent(student2);
        module2.addStudent(student3);
        module2.addStudent(student4);
        module3.addStudent(student5);
        module3.addStudent(student6);
 
        student1.addCourse(course1);
        student2.addCourse(course1);
        student3.addCourse(course1);
        student4.addCourse(course1);
        student5.addCourse(course1);
        student6.addCourse(course1);
        
        student1.addModule(module1);
        student2.addModule(module1);
        student3.addModule(module2);
        student4.addModule(module2);
        student5.addModule(module3);
        student6.addModule(module3);
        
        System.out.println(course1.getCourseName() + course1.getStartDate() + course1.getEndDate());
                for(Module m : course1.getModules()){
                System.out.println(m.getModuleName());}
                for(Student s : course1.getStudents()){
                System.out.println("Name: \t" + s.getName() + " \nUsername: "+s.getUsername());
                for(Module m : s.getModules()){
                System.out.println("\tModule: " + m.getModuleName());}
                for(Course c : s.getCourses() ){
                System.out.println("\tCourse: " + c.getCourseName());}}
                
        
    }
}
