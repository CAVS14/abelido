
import java.util.Scanner;

public class Abelido {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        String name;
        int science;
        int history;
        int math;
        int soc;
        int arts;
        
        System.out.print("Enter name: ");
        name = scanner.nextLine();

        System.out.print("Enter marks in Science: ");
        science = scanner.nextInt();

        System.out.print("Enter marks in History: ");
        history = scanner.nextInt();

        System.out.print("Enter marks in Math: ");
        math = scanner.nextInt();

        System.out.print("Enter marks in Soc: ");
        soc = scanner.nextInt();

        System.out.print("Enter marks in Arts: ");
        arts = scanner.nextInt();

        int totalMarks = science + history + math + soc + arts;
        double percentage = (totalMarks / 500.0) * 100;

        System.out.println("\nOutput");
        System.out.println("Enter name: " + name);
        System.out.println("Enter marks in Science: " + science);
        System.out.println("Enter marks in History: " + history);
        System.out.println("Enter marks in Math: " + math);
        System.out.println("Enter marks in Soc: " + soc);
        System.out.println("Enter marks in Arts: " + arts);
        System.out.println("\nTotal Marks: " + totalMarks);
        System.out.printf("Total percentage: %.2f%%\n",percentage);
        
        String Remarks;
        String Message;
    
        if (percentage < 70) {
            Remarks = "Fail";
            Message = ("Congrats " + name + " you Failed.");
        } else if (percentage >= 70 && percentage <= 75) {
            Remarks = "Poor";
            Message = ("Congrats " + name + " you Passed with Poor.");
        } else if (percentage >= 76 && percentage <= 80) {
            Remarks = "Fair";
            Message = ("Congrats " + name + " you Passed with Fair.");
        } else if (percentage >= 81 && percentage <= 85) {
            Remarks = "Good";
            Message = ("Congrats " + name + " you Passed with Good.");
        } else if (percentage >= 86 && percentage <= 90) {
            Remarks = "Very Good";
            Message = ("Congrats " + name + " you Passed with Very Good.");
        } else {
            Remarks = "Excellent";
            Message = ("Congrats " + name + " you Passed with Excellent.");
        }
        System.out.println("Remarks: " + Remarks);
        System.out.println("\n" + Message);

    }
}