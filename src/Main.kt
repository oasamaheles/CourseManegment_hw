import Controller.SchoolController
import Model.School
import Model.Course
import view.ViewSchoolData

fun main() {
    //  Create Courses
    val math = Course(1, "Math", 2)
    val science = Course(2, "Science", 3)

    // Create Student and Teacher
    val st1 = SchoolController.addStudent(fullName = "Osama Hillis", age =  20, id = 101)
    val st2 = SchoolController.addStudent(fullName = "Yasmeen H", age = 20, id =  102)
    val st3 = SchoolController.addStudent("Ali Ahmed", 19, 202)
    val st4 = SchoolController.addStudent("Sara Ahmed", 18, 202)
    val teacher = SchoolController.addTeacher(8888, "Monthly", 5)
    val teacher2 = SchoolController.addTeacher(4444, "Hourly", 2)

    // Registering Students and Teachers in Courses
    SchoolController.countPassingAndFailingStudents(listOf(st1, st2, st3, st4), math)
    SchoolController.countPassingAndFailingStudents(listOf(st1, st2, st3, st4), science)
    SchoolController.countPassingAndFailingStudents(listOf(teacher), math)
    SchoolController.countPassingAndFailingStudents(listOf(teacher2), math)

    //  Add Mark for Student
    SchoolController.addMark(student = st1, course =  math, mark =  40.0)
    SchoolController.addMark(student = st1, course =  science, mark =  50.0)
    SchoolController.addMark(st2, math, 40.0)
    SchoolController.addMark(st2, science, 100.0)
    SchoolController.addMark(st3, math, 90.0)
    SchoolController.addMark(st3, science, 100.0)
    SchoolController.addMark(st4, math, 84.0)
    SchoolController.addMark(st4, science, 100.0)

    //    Create School and Add Students and Teachers For School
    val school = School("UCAS High School")
    school.students.addAll(listOf(st1, st2, st3, st4))
    school.teachers.addAll(listOf(teacher, teacher2))

    // Show Info
    for (student in school.students) {
        ViewSchoolData.displayStudentInformation(student)
    }
    ViewSchoolData.displayTeacherInformation(teacher)
    ViewSchoolData.displayTeacherInformation(teacher2)
    ViewSchoolData.displaySchoolInformation(school)
}
