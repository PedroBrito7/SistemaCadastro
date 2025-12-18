package Service;

import Model.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentSystem {
       private List<Student> listOfStudent = new ArrayList<>();

    public void addItem(Student student) {
        listOfStudent.add(student);
    }

    public boolean removeByRegistration(int registration) {
        for (Student s : listOfStudent) {
            if (s.getRegistration() == registration) {
                listOfStudent.remove(s);
                return true;
            }
        }
        return false;
    }

    public void listItem() {
       if(listOfStudent.isEmpty()){
           System.out.println("No students registered.");
           return;
       }
        for (Student  s : listOfStudent ) {
            System.out.println(s);
        }
    }


}
