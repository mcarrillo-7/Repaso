package com.ipartek.formacion.modelo;

import java.util.List;

import com.ipartek.formacion.Person;

import java.util.ArrayList;

/**
 * Operaciones basicas de CRUD para Pojos
 * @author Curso
 *
 */
public interface ICrudAble {
	
	
	
	List<Person> getAll();//leemos
	
	Person getById(int id);//cogemos
	
	boolean insert(Person pojo);//a�adimos
	
	boolean delete(int id);//eliminamos
	
	boolean update(Person pojo);//modificamos los datos de uno

}
