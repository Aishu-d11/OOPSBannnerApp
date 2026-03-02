// Program Name: DisplayStudentResult
// Purpose: Display student result details

class DisplayStudentResult {
    public static void main(String[] args) {

        // Declare variables
        String studentName = "Sam";
        int rollNumber = 1;
        double percentMarks = 99.99;
        char result = 'P';

        // Display result
        System.out.println("Student Result:");
        System.out.println(studentName + " with Roll Number " + rollNumber +
                " scored " + percentMarks + "% and Result is " + result);
    }
}