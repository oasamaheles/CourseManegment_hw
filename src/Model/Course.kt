package Model

data class Course(val id: Int, val name: String, val numberCourseHours: Int) {
    fun printInformation() {
        println("Course ID: $id, Name: $name, Number of Hours: $numberCourseHours")
    }
}
