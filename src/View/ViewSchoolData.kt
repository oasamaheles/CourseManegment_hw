package view

import Model.School
import Model.Student
import Model.Teacher

object ViewSchoolData {

    fun displayStudentInformation(student: Student) {
        println("Student Information:")
        student.printInformation()
        println("===================================")

    }

    fun displayTeacherInformation(teacher: Teacher) {
        println("Teacher Information:")
        teacher.printInformation()
        println("===================================\n")


    }

    fun displaySchoolInformation(school: School) {
        println("School Name: ${school.name}")
        println("Total Students: ${school.students.size}")
        println("Total Teachers: ${school.teachers.size}")
        val (passing, failing) = school.countPassingAndFailingStudents()
        println("Number of Passing Students: $passing ")
        println("Number of Failing Students:$failing")
        println("Average Student Performance: ${school.calculateStudentAverage()}")
    }
}
