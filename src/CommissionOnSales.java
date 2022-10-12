import java.util.Scanner;

public class CommissionOnSales {
    static int salesAmount = 20000;

    public static void saleCommission(String salesId, String sellerName, int basicSalary){


        System.out.println("Sales ID: " + salesId);
        System.out.println("Seller Name: " + sellerName);
        System.out.println("Basic Salary: " + basicSalary);


        if (salesAmount >= 50000){
            System.out.println("Sales Commission is " + salesAmount*35/100);
        } else if (salesAmount >= 30000) {
            System.out.println("Sales commission is "+ salesAmount*30/100);
        } else if (salesAmount >= 20000) {
            System.out.println("Sales commission is "+ salesAmount*10/100);
        } else if (salesAmount >= 10000) {
            System.out.println("Sales commission is "+ salesAmount*5/100);
        } else {
            System.out.println("Sales commission is "+ salesAmount*2/100);
        }
    }

    public static void main(String []args){

        saleCommission("ABC001", "Ravi", 50000);



    }

}
