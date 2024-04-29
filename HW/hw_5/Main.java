import java.util.stream.Collectors;

import model.Student;
import model.Group;
import model.Teacher;
import model.User;
import view.StudentView;
import view.GroupView;

public class Main {
    public static void main(String[] args) {
        User student1 = new Student("Петров Максим", 1);
        User student2 = new Student("Легкова Марина", 2);
        User student3 = new Student("Фисенко Маша", 3);
        User student4 = new Student("Матвеев Иван", 4);
        User student5 = new Student("Иванов Алексей", 5);
        User student6 = new Student("Петрова Екатерина", 6);
        User student7 = new Student("Смирнов Дмитрий", 7);
        User student8 = new Student("Полуян Ольга", 8);
        User student9 = new Student("Васильев Андрей", 9);
        User student10 = new Student("Николаева Анна", 10);
        User student11 = new Student("Лебедев Артем", 11);
        User student12 = new Student("Морозова Мария", 12);
        User student13 = new Student("Соколов Павел",13);
    
        
        StudentView studentView1 = new StudentView();
        studentView1.userList(student1);
        studentView1.userList(student2);
        studentView1.userList(student3);
        studentView1.userList(student4);

        StudentView studentView2 = new StudentView();
        studentView2.userList(student5);
        studentView2.userList(student6);
        studentView2.userList(student7);
        studentView2.userList(student8);
       

        StudentView studentView3 = new StudentView();
        studentView3.userList(student9);
        studentView3.userList(student10);
        studentView3.userList(student11);
        studentView3.userList(student12);
        studentView3.userList(student13);
       
        System.out.println("----------------------------------------------------------");

       
        System.out.println(studentView1.getUserList()); 
        System.out.println(studentView2.getUserList());
        System.out.println(studentView3.getUserList());
        System.out.println();
        System.out.println();

        Teacher teacher1 = new Teacher("Акопян Геворг Арутюнович", "Информатика");
        Teacher teacher2 = new Teacher("Власова Марина Сергеевна", "Математика");
        Teacher teacher3 = new Teacher("Попов Виталий Ильич", "Python");

        GroupView view = new GroupView();

        //Здесь мы используем stream() для перебора списка, map(s -> (Student) s) для приведения каждого элемента к типу Student,
        // и collect(Collectors.toList()) для сбора результата в новый список List<Student>.


        Group group1 = view.createStudyGroup(teacher1, studentView1.getUserList().stream()
                                                   .map(s -> (Student) s)
                                                   .collect(Collectors.toList()));
        Group group2 = view.createStudyGroup(teacher2, studentView2.getUserList().stream()
                                                   .map(s -> (Student) s)
                                                   .collect(Collectors.toList()));
        Group group3 = view.createStudyGroup(teacher3, studentView3.getUserList().stream()
                                                   .map(s -> (Student) s)
                                                   .collect(Collectors.toList()));
    

        view.addGroup(teacher1.getName(), group1);
        view.addGroup(teacher2.getName(), group2);
        view.addGroup(teacher3.getName(), group3);
        System.out.println("----------------------------------------------------------");
        
        Group targetGroup1 = view.getGroupByTeacher(teacher1.getName());
        System.out.println(targetGroup1);
        System.out.println("----------------------------------------------------------");

        Group targetGroup2 = view.getGroupByTeacher(teacher2.getName());
        System.out.println(targetGroup2);
        System.out.println("----------------------------------------------------------");

        Group targetGroup3 = view.getGroupByTeacher(teacher3.getName());        
        System.out.println(targetGroup3);
        System.out.println("----------------------------------------------------------");
    
    }
}