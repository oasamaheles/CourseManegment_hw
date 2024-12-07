package Controller

import Model.Course
import Model.Student
import Model.Teacher


object SchoolController {
    fun addStudent(fullName: String, age: Int, id: Int): Student {
        return Student(fullName, age, id)
    }

    fun addTeacher(id: Int, contractType: String, yearOfWork: Int): Teacher {
        return Teacher(id, contractType, yearOfWork)
    }

    fun countPassingAndFailingStudents(entities: List<Any>, course: Course) {
        for (entity in entities) {
            if (entity is Student) {
                entity.courses.add(course)
            }
            if (entity is Teacher) {
                entity.courses.add(course)
            }
        }
    }


    fun addMark(student: Student, course: Course, mark: Double) {
        student.marks[course] = mark
    }
}
