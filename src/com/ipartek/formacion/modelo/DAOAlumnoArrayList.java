
package com.ipartek.formacion.modelo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.ipartek.formacion.Person;

public class DAOAlumnoArrayList implements ICrudAble {

	private ArrayList<Person> lista;

	/*
	 * public void DAOAlumnoArrayList() { super(); lista = new ArrayList<Person>();
	 * lista.add( new Person("Antton") ); lista.add( new Person("MAriJose") );
	 * lista.add( new Person("Pepe") ); lista.add( new Person("Txeila") ); }
	 */

	public DAOAlumnoArrayList() {
		super();
		lista = new ArrayList<Person>();
		lista.add(new Person("Antonio"));
		lista.add(new Person("Maria"));
		lista.add(new Person("Leonardo"));
		lista.add(new Person("Andrea"));
	}

	public List<Person> getAll() {
		return lista;
	}

	public Person getById(int id) {
		Person resul = null;
		for (Person a : lista) {

			if (a.getId() == id) {
				resul = a;
				break;
			}
		}
		return resul;
	}

	public boolean insert(Person pojo) {

		lista.add(pojo);

		return false;
	}

	public boolean delete(int id) {
		boolean result = false;
		for (Person person : lista) {
			if (person.getId() == id) {
				result = true;
				lista.remove(id);
				break;
			}
		}
		return result;
	}

	public boolean update(Person pojo) {
		boolean encontrado = false;
		for (Person p : lista) {
			if (p.getId() == pojo.getId()) {
				encontrado = true;
				lista.remove(p.getId());
				lista.add(pojo);
				break;
			}

		}
		return false;
	}

}