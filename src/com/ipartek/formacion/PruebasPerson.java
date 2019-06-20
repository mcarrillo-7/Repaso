package com.ipartek.formacion;

import java.text.DecimalFormat;

public class PruebasPerson {

	private static int i;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person p = new Person();
		System.out.println(p.toString());
		
		//Person p2 = new Person("Pepa", 23,'m');
		//System.out.println(p2);
		
		Employee e = new Employee();
		System.out.println(e);
		
		Employee e2 = new Employee();
		
		//crear tres personas famosas de youtube
		
		Employee y1 = new Employee("Logan Paul", 23, 'h', 14500000f);
		Employee y2 = new Employee("PewDiePie", 23, 'h', 15500000f);
		Employee y3 = new Employee("Jackseptyece", 23, 'h', 16000000f);
		
		Employee[] youtubers = new Employee[3];
		
		youtubers[0] = y1;
		youtubers[1] = y2;
		youtubers[2] = y3;
		
		Employee emp = null;
		DecimalFormat dc = new DecimalFormat("##,###,### $"); //damos formato al salario para que nos aparezca con todas las cifras
		for(i = 0; i < youtubers.length; i++) {
			
			emp = youtubers[i];
			System.out.println((i+1) + " "   + " " +  emp.getNombre() + "  " + emp.getSalario() + dc.format(emp.getSalario()));
		}
		
		//foreach: forma mas rapida y elegante de recorer una lista
		for (Employee employee : youtubers) {
			
			System.out.println(employee);
		}
	}

}
