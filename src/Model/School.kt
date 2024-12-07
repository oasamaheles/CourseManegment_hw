package Model

class School(val name: String) {
    val teachers = mutableListOf<Teacher>()
    val students = mutableListOf<Student>()

    fun calculateStudentAverage(): Double {
        if (students.isEmpty()) return 0.0
        var totalAverage = 0.0
        for (student in students) {
            totalAverage += student.calculateCumulativeAverage()
        }
        return totalAverage / students.size
    }

    fun countPassingAndFailingStudents(): Pair<Int, Int> {
        var passing = 0
        var failing = 0
        for (student in students) {
            if (student.calculateCumulativeAverage() >= 60) passing++
            else failing++
        }
        return Pair(passing, failing)
    }
}
