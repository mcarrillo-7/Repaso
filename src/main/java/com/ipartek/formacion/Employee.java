package com.ipartek.formacion;

import java.util.Date;

public class Employee extends Person {

	public final float SALARIO_MINIMO = 937.05f;

	private int nEmpleado;

	private Date fechaEmpleado;

	private float salario;

	//sobreescribir este metodo con nombre, edad, sexo y salario
	public Employee() {
		super();
		this.nEmpleado = 0;
		this.fechaEmpleado = new Date();
		this.salario = SALARIO_MINIMO;
		// TODO Auto-generated constructor stub
	}
	
	

	public Employee(String nombre, int edad, char sexo,
			float salario) {
		//super(nombre, edad, sexo);
		this.nEmpleado = 0;
		this.fechaEmpleado = new Date();
		this.salario = salario;
	}



	public int getnEmpleado() {
		return nEmpleado;
	}

	public void setnEmpleado(int nEmpleado) {
		this.nEmpleado = nEmpleado;
	}

	public Date getFechaEmpleado() {
		return fechaEmpleado;
	}

	public void setFechaEmpleado(Date fechaEmpleado) {
		this.fechaEmpleado = fechaEmpleado;
	}

	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}



	@Override
	public String toString() {
		return super.toString() + "Employee [SALARIO_MINIMO=" + SALARIO_MINIMO + ", nEmpleado=" + nEmpleado + ", fechaEmpleado="
				+ fechaEmpleado + ", salario=" + salario + "]";
	}
	
	//Employee youtuber1 = new Employee("Superwomen", 20, 170f, 59f, "verdes", 'm', 12, "07/07/2018", 8000000f);
}
