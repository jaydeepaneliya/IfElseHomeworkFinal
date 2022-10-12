import javax.swing.table.TableCellEditor;
import java.sql.SQLOutput;

public class GrossSalaryCalculation {
    static int HRA, DA, TA, PF, grossSalary;

    public static void salary(String id, String name, int basicSalary){
        HRA = basicSalary * 10/100;
        DA = basicSalary * 8/100;
        TA = basicSalary * 9/100;
        PF = basicSalary * 20/100;
        grossSalary = basicSalary + HRA + DA + TA - PF;


        System.out.println("Employee ID: "+ id);
        System.out.println("Employee Name: " + name);
        System.out.println("HRA: "+ HRA);
        System.out.println("DA: "+ DA);
        System.out.println("TA: "+ TA);
        System.out.println("PF: "+ PF);
        System.out.println("Gross Salary: "+ grossSalary);
    }

    public static void main(String[] args) {
        salary("ABC001", "Jay", 10000);

    }
}
