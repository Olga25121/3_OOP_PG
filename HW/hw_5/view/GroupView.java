package view;

import java.util.List;

import controller.GroupController;
import model.Student;
import model.Group;
import model.Teacher;

public class GroupView {
    private GroupController studyGroupController = new GroupController();

    public Group createStudyGroup(Teacher teacher, List<Student> students) {
        return studyGroupController.createStudyGroup(teacher, students);
        
    }

    public void addGroup(String teacherName, Group group) {
        studyGroupController.addGroup(teacherName, group);
        System.out.println("Добавлена учебная группа преподавателя " + teacherName);
    }
    

    public Group getGroupByTeacher(String teacherName) {
        System.out.println("Группа преподавателя " + teacherName + ":");
        return studyGroupController.getGroupByTeacher(teacherName);
    }

}