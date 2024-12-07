
### **Kotlin Programming Concepts**

#### **Classes to Implement**
1. **Class: Course**
   - **Properties:**
     - `id`: Course ID.
     - `name`: Course name.
     - `numberCourseHours`: Total course hours.
   - **Function:**
     - `printInformation()`: Print all details of the course.

2. **Class: Person**
   - **Properties:**
     - `name`: Full name of the person.
     - `age`: Age of the person.

3. **Class: Student (Inherits from Person)**
   - **Additional Properties:**
     - `id`: Student ID.
     - `courses`: A list of courses associated with the student.
     - `marks`: Grades for each course.
   - **Function:**
     - `printInformation()`: Print all details of the student, including the average grade calculated based on the total hours.

4. **Class: Teachers (Inherits from Person)**
   - **Additional Properties:**
     - `id`: Teacher ID.
     - `courses`: A list of courses the teacher is responsible for.
     - `contractType`: Type of contract (monthly or hourly).
     - `yearsOfWork`: Number of years the teacher has worked.
   - **Function:**
     - `printInformation()`: Print all details of the teacher.

5. **Class: School**
   - **Properties:**
     - `name`: School name.
     - `teachers`: A list of teachers in the school.
     - `students`: A list of students in the school.
     - `studentsAverage`: The average grade of all students.
   - **Function:**
     - `printInformation()`: Print all details of the school, including the student-teacher ratio.
