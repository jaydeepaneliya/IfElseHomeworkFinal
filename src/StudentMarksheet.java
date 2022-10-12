public class StudentMarksheet {
    static int total;
    static double percentage;

    public static void marksheet(String name, int rollnumber, int eng, int sci, int math){
        total = eng + sci + math;
        percentage = total/3;

        System.out.println("Student Name: " + name);
        System.out.println("Roll No.: " + rollnumber);
        System.out.println("Total Marks: " + total);
        System.out.println("Percentage: " + percentage + "%");
    }

    public static void main(String[] args) {
        marksheet("Rohit", 12, 33, 37, 22);

        if(percentage >= 35){
            System.out.println("Passed");
            if(percentage>100 || percentage<0){
                System.out.println("Invalid input");
            } else if (percentage>=80 && percentage<=100) {
                System.out.println("A+");
            } else if (percentage>=60) {
                System.out.println("A");
            } else if (percentage>=50){
                System.out.println("B");
            } else {
                System.out.println("C");
            }
        }
            else{
            System.out.println("Failed");
        }
    }


}
