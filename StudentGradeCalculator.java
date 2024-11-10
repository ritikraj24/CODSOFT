import java.util.Scanner;
public class StudentGradeCalculator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        //Input Marks for Each Subject

        System.out.print("Enter Hindi/Sanskrit Marks: ");
        int HindiOrSanskrit = sc.nextInt();
        System.out.print("Enter English Marks: ");
        int English = sc.nextInt();
        System.out.print("Enter Mathematics Marks: ");
        int Mathematics = sc.nextInt();
        System.out.print("Enter Science Marks: ");
        int Science = sc.nextInt();
        System.out.print("Enter Social Studies Marks: ");
        int SocialStudies = sc.nextInt();

        // Calculate Total Marks and Average Percentage

        float TotalMarks = HindiOrSanskrit + English + Mathematics + Science + SocialStudies;
        System.out.println("Total Marks = "+ TotalMarks );
        float Percentage = (TotalMarks/5);
        System.out.println("Average Percentage: "+ Percentage +"%");

        //Check if any subject marks is less than 35
        
        boolean hasFailed = (HindiOrSanskrit < 35 || English < 35 || Mathematics < 35 || Science < 35 || SocialStudies < 35);

        // Display "Fail" if any mark is less than 35, if not then proceed to grading

        if(hasFailed){
            System.out.println("Grade: Fail");
            System.out.println("Remark: Needs Improvement");
        }
        else{

            //Display Grade and Remarks based on Percentage

         if(Percentage>90){
            System.out.println("Grade: A");
            System.out.println("Remark: Outstanding");
        } else if(Percentage > 80 && Percentage <= 90){
            System.out.println("Grade: B");
            System.out.println("Remark: Excellent");
        } else if(Percentage > 70 && Percentage <= 80){
            System.out.println("Grade: C");
            System.out.println("Remark: Very Good");
        } else if(Percentage > 60 && Percentage <= 70){
            System.out.println("Grade: D");
            System.out.println("Remark: Good");
        } else if(Percentage > 50 && Percentage <= 60){
            System.out.println("Grade: E");
            System.out.println("Remark: Average");
        } else if(Percentage > 35 && Percentage <= 50){
            System.out.println("Grade: F");
            System.out.println("Remark: Below Average");
        } 
        }
    }
}