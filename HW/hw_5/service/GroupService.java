package service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import model.Student;
import model.Group;
import model.Teacher;

public class GroupService {   

    private Map<String, Group> studyGroups;
    
    public GroupService(){
        this.studyGroups = new HashMap<>();
    }   
    
    public Group createStudyGroup(Teacher teacher, List<Student> students) {
        return new Group(teacher, students);
    }

    public void addGroup(String teacherName, Group group) {
        studyGroups.put(teacherName, group);
    }

    public Group getGroupByTeacher(String teacherName) {
        return studyGroups.get(teacherName);
    }
}