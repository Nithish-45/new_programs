package Crud.On.Operations.Executers;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Scanner;

import Crud.On.Operations.method.Employee;

public class CRUDOps {
	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		Scanner s1=new Scanner(System.in);

		Collection<Employee> E=new ArrayList<Employee>();
		int ch;
		
		do {
			System.out.println("1. INSERT ");
			System.out.println("2. DISPLAY ");
			System.out.println("3. UPDATET ");
			System.out.println("4. SEARCH ");
			System.out.println("5. DELETE ");
			System.out.println("Enter your Choice : ");
			ch=s.nextInt();
			
			switch(ch) {
			case 1:	System.out.print("Enter Employee Number : ");
					int empNo2=s.nextInt();
					
					System.out.print("Enter Employee Name : ");
					String empName2=s1.nextLine();
					
					System.out.print("Enter Employee Salary : ");
					int salary2=s.nextInt();
					
					E.add(new Employee(empNo2,empName2,salary2));
					
					break;
					
			case 2:	System.out.println("	-------------------------------		");
					Iterator<Employee> i=E.iterator();
					while(i.hasNext()) {
						Employee e=i.next();
						System.out.println(e);
						
					}
					System.out.println("	-------------------------------		");

					break;
					
		
			
				
			case 4:
					boolean found=false;
					System.out.println("Enter Employee Number to search");
					int empNo=s.nextInt();
					System.out.println("	-------------------------------		");
					i=E.iterator();
					while(i.hasNext()) {
						Employee e=i.next();
						if(e.getEmpNo()==empNo){
						System.out.println(e);
						
						found=true;
						}
					}
					System.out.println("	-------------------------------		");
					if(!found) {
						System.out.println("Record not found");
						System.out.println("	-------------------------------		");

					}

					break;
					
			case 5: found=false;
					System.out.println("Enter Employee Number to delete ");
					empNo=s.nextInt();
					System.out.println("	-------------------------------		");
					i=E.iterator();
					while(i.hasNext()) {
						Employee e=i.next();
						if(e.getEmpNo()==empNo){
						i.remove();
						
						found=true;
						}
					}
					System.out.println("	-------------------------------		");
					if(!found) {
						System.out.println("Record not found!!");
						System.out.println("	-------------------------------		");
		
					}
					else {
							System.out.println("Record Deleted Successfully..");
							System.out.println("	-------------------------------		");
					}
		
					break;	
					
			case 3: found=false;
					System.out.println("Enter Employee Number to update");
					empNo=s.nextInt();
					System.out.println("	-------------------------------		");
					i=E.iterator();
					ListIterator<Employee>li =((ArrayList<Employee>) E).listIterator();
					while(li.hasNext()) {
						Employee e=li.next();
						if(e.getEmpNo()==empNo){
							System.out.println("Enter the new Name : ");
							empName2=s1.nextLine();
							System.out.println("Enter the Employee salary : ");
							salary2 =s.nextInt();
							
							li.set(new Employee(empNo,empName2,salary2));
							
							found=true;
						}
					}
					System.out.println("	-------------------------------		");
					if(!found) {
						System.out.println("Record not found!!");
						System.out.println("	-------------------------------		");
		
					}
					else {
							System.out.println("Record Updated Successfully..");
							System.out.println("	-------------------------------		");
					}

				
				break;
					
			}
		}while(ch!=0);
		
		s.close();
		s1.close();

	}
}
