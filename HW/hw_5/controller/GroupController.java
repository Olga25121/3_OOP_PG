package controller;

import java.util.List;

import model.Student;
import model.Group;
import model.Teacher;
import service.GroupService;

public class GroupController {
    private GroupService studyGroupService = new GroupService();

    public Group createStudyGroup(Teacher teacher, List<Student> students) {
        return studyGroupService.createStudyGroup(teacher, students);
    }

    public void addGroup(String teacherName, Group group) {
        studyGroupService.addGroup(teacherName, group);
    }

    public Group getGroupByTeacher(String teacherName) {
        return studyGroupService.getGroupByTeacher(teacherName);
    }
}