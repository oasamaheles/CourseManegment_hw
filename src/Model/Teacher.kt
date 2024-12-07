package Model


class Teacher(
    val id: Int,
    val contractType: String,
    val yearOfWork: Int,
    val courses: MutableList<Course> = mutableListOf()
) {
    fun printInformation() {
        println("Teacher ID: $id, Contract Type: $contractType, Years of Work: $yearOfWork")
        println("Courses:")
        for (course in courses) {
            course.printInformation()
        }

    }
}
