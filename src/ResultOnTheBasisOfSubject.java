public class ResultOnTheBasisOfSubject {
    static int total;
    static double percentage;

    public static void marksheet(String name, int rollnumber, int eng, int sci, int math) {
        total = eng + sci + math;
        percentage = total / 3;

        System.out.println("Student Name: " + name);
        System.out.println("Roll No.: " + rollnumber);
        System.out.println("Total Marks: " + total);
        System.out.println("Percentage: " + percentage + "%");

    if (eng >= 35 && sci >=35 && math >= 35){
        if (percentage >= 35) {
            System.out.println("Result: Passed");
            if (percentage > 100 || percentage < 0) {
                System.out.println("Invalid input");
            } else if (percentage >= 80 && percentage <= 100) {
                System.out.println("Grade: A+");
            } else if (percentage >= 60) {
                System.out.println("Grade: A");
            } else if (percentage >= 50) {
                System.out.println("Grade: B");
            } else {
                System.out.println("Grade: C");
            }
        }
    } else {
            System.out.println("Result: Failed");
        }

    }

    public static void main(String[] args) {
        marksheet("Rohit", 12, 10, 37, 36);

        }


    }