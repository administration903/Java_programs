import java.util.Scanner;

public class Employees {
int employee_no, project_id, age;
String emp_name, address;
long contact_no;
float  basic_salary,  DA, HRA, net_salary, it, gs, pf, deduction;
	public void read(){
        Scanner sc = new Scanner(System.in);
        System.out.println("\n Enter Employee number ");
	 employee_no= sc.nextInt();
	System.out.println("\n Enter Employee name ");
	 emp_name= sc.next();
	System.out.println("\n Enter address ");
	 address= sc.next();
	System.out.println("\n Enter contact number ");
	 contact_no= sc.nextLong();	
	System.out.println("\n Enter Employee salary ");
	 basic_salary= sc.nextFloat();
	System.out.println("\n Enter project ID ");
	 project_id= sc.nextInt();
	System.out.println("\n Enter Employee age ");
	 age= sc.nextInt();
	}
	
	public void d(){
		if((basic_salary>8000) && (basic_salary<10000)){
		HRA=1000;
		DA=500;
		gs= basic_salary + HRA+ DA ;
		pf=basic_salary*(10/100) ;
		net_salary= gs-pf;
		deduction= (10/100)*basic_salary+DA;
		System.out.println("\n EMPLOYEE HRA is: " + HRA);
		System.out.println("\n EMPLOYEE DEARNESS ALLOWANCE: " +DA);
		System.out.println("\n EMPLOYEE NET SALARY: " + net_salary);
		System.out.println("\n DEDUCTION IN SALARY: " +deduction);
		}
		if((basic_salary>10000) && (basic_salary<=20000)){
		HRA=800;
		DA=1000;
		pf=basic_salary*(10/100) ;
		gs= basic_salary + HRA+ DA ;
		net_salary= gs-pf;
		deduction= (10/100)*basic_salary+DA;
		System.out.println("\n EMPLOYEE HRA is: " +HRA);
		System.out.println("\n EMPLOYEE DEARNESS ALLOWANCE: "+DA);
		System.out.println("\n EMPLOYEE NET SALARY: " + net_salary);
		System.out.println("\n DEDUCTION IN SALARY: " +deduction);
		}
		else{
		HRA=500;
		DA=2000;
		gs= basic_salary + HRA+ DA ;
		pf=basic_salary*(10/100) ;
		net_salary= gs-pf;
		deduction= (10/100)*basic_salary+DA;
		System.out.println("\n EMPLOYEE HRA is: "+HRA);
		System.out.println("\n EMPLOYEE DEARNESS ALLOWANCE: " +DA);
		System.out.println("\n EMPLOYEE NET SALARY: " + net_salary);
	System.out.println("\n DEDUCTION IN SALARY: " +deduction);
		}	
		
	}
	
	

	public void display(){
	System.out.println("\n EMPLOYEE NUMBER: " +employee_no);
	System.out.println("\n EMPLOYEE NAME: " +emp_name);
	System.out.println("\n EMPLOYEE ADDRESS: " +address);
	System.out.println("\n EMPLOYEE CONTACT NUMBER: " + contact_no);
	System.out.println("\n EMPLOYEE SALARY: " +basic_salary);
	System.out.println("\n EMPLOYEE PROJECT ID: " +project_id);
	System.out.println("\n EMPLOYEE AGE: " +age);
	
	
	}
}

class Employee_dis{
	 public static void main(String args[]) {
	Employees obj= new Employees();
	obj.read();
	obj.display();
	obj.d();
	}
}