package Model


class Student(
    fullName: String,
    age: Int,
    val id: Int,
    val courses: MutableList<Course> = mutableListOf(),
    val marks: MutableMap<Course, Double?> = mutableMapOf()
) : Person(fullName, age) {
    fun printInformation() {
        println("Student ID: $id, Name: $fullName, Age: $age")
        println("Courses:")
        for (course in this.courses){
            course.printInformation()
        }
        println("Marks:")

        for ((course, mark) in marks) {
            println("Course: ${course.name}, Mark: $mark")
        }
        println("Cumulative Average: ${calculateCumulativeAverage()}")
    }

    fun calculateCumulativeAverage(): Double {
        if (courses.isEmpty()) return 0.0
        var totalHours = 0
        var weightedSum = 0.0
        for (course in courses) {
            val mark = marks[course] ?: 0.0
            totalHours += course.numberCourseHours
            weightedSum += mark * course.numberCourseHours
        }
        return if (totalHours > 0) weightedSum / totalHours else 0.0
    }
}
