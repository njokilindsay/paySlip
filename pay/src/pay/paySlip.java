package pay;
import java.util.Scanner;
public class paySlip {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter no: ");
		int empno = input.nextInt();
		System.out.println("Enter name: ");
		String empname= input.next();
		System.out.println("Enter designation: ");
		String des= input.next();
		System.out.println("Enter days worked: ");
		int days= input.nextInt();
		System.out.println("What is the payrate: ");
		double payrate= input.nextDouble();
		System.out.println("Enter date: ");
		String date= input.next();
		System.out.println("");
		System.out.println("ENTER EMPLOYEE NO TO GENERATE PAYSLIP : "+empno);
		System.out.println("");
		System.out.println("\t\t\t SHREE KRISHNA CHEMISTS AND DRUGGIST");
		System.out.println("\t\t\t\tSALARY MONTH 9 2013");
		System.out.println("");
		System.out.print("EMP.NO.: " +empno);
		System.out.print("\t\t EMP.NAME: " +empname);
		System.out.println("\t\t DESIGNATION: " +des);
		System.out.print("DAYS WORKED: " +days);  
		System.out.print("\t\t PAY RATE: " +payrate);
		System.out.println("\t\t GEN.DATE:" +date);
		System.out.println("______________________________________________________________________________________");
		System.out.print("EARNINGS");
		System.out.print("\t\t AMOUNT(RS.)");
		System.out.print("\t\t DEDUCTIONS");
		System.out.println("\t\t AMOUNT(RS.)");
		System.out.println("______________________________________________________________________________________");
		double bp = days * payrate;
		System.out.print("BASIC PAY");
		System.out.print("\t\t " +bp);
		double pf= bp/10;
		System.out.print("\t\t P.F.");
		System.out.println("\t\t         " +pf);
		final double pt = 0.2 * bp;
		System.out.print("\t\t\t\t\t\t PROF.TAX"); 
		System.out.print("\t\t " +pt);
		System.out.println("");
		System.out.println("______________________________________________________________________________________");
		double gross = bp;
		System.out.print("GROSS EARN.");
		System.out.print("\t\t " +gross);
		double tded = pf+pt;
		System.out.print("\t\t TOTAL DEDUCT.");
		System.out.println("\t\t " +tded);
		System.out.print("\t\t\t\t\t\t NET PAY");
		System.out.print("\t\t " +(gross-tded));
	}

}
