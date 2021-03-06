package lk.sliit.lms.api.services;

import lk.sliit.lms.api.models.Teacher;
import lk.sliit.lms.api.repositories.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Handles all the teacher related operations
 * <p>
 * Created by dinukshakandasamanage on 9/23/17.
 */

@Service
public class TeacherService {

    @Autowired
    TeacherRepository teacherRepository;

    /**
     * Retrieves all teachers and maps them to Teacher objects
     *
     * @return all teachers
     */
    public List<Teacher> getAllTeachers() {

        List<Teacher> teachers = new ArrayList<>();

        teacherRepository.findAll().forEach(teacher -> {
            Teacher retrievedTeacher = new Teacher();
            retrievedTeacher.setName(teacher.getName());
            retrievedTeacher.setId(teacher.getId());
            teachers.add(teacher);
        });

        return teachers;
    }
}
