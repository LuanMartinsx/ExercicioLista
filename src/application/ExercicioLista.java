package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class ExercicioLista {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Employee> list = new ArrayList<>();
		
		System.out.print("How many employees will be registered? ");
		int n = sc.nextInt();
		double percentage;
		
		for (int i=0;i<n;i++) {
			System.out.println("employee #" + (i + 1));
			System.out.print("Id: ");
			Integer id = sc.nextInt();
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Salary: ");
			Double salary = sc.nextDouble();
			Employee emp = new Employee(id, name, salary);
			
			list.add(emp);
		}
		
		
		System.out.print("Enter the employee id that will have salary increase: ");
		int idSalary = sc.nextInt();
		Integer pos = position(list, idSalary);
		if(pos == null) {
			System.out.println("this id does not exist!");
		}
		else { 
			System.out.print("Enter the percentage: ");
			percentage = sc.nextDouble();
			list.get(pos).Increment(percentage);
		}
		
		System.out.println();
		System.out.println("List of employees");
		for (Employee emp : list) {
			System.out.println(emp);
		}
		
		

		
		
		
		
		
		
		
		
		
		sc.close();
		

	}
	/* Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
	 * esse comando equivale ao abaixo para rastrear um unico elemento na lista*/

	
	public static Integer position(List<Employee> list, int id) {
		for (int i = 0;i<list.size();i++) {
			if(list.get(i).getId() == id) {
				return i;
			}
		}
		return null;
		
	};
}
