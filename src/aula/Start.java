package aula;

public class Start {

	public static void main(String[] args) {

		Alumno a1 = new Alumno();
		a1.setNombre("Marcos");
		a1.setEdad(30);
		
		Alumno a2 = new Alumno();
		a2.setNombre("Marta");
		a2.setEdad(30);

		Alumno a3 = new Alumno();
		a3.setNombre("Ana");
		a3.setEdad(30);

		Alumno a4 = new Alumno();
		a4.setNombre("Pedro");
		a4.setEdad(30);

		Alumno a5 = new Alumno();
		a5.setNombre("Maria");
		a5.setEdad(30);
		
		
		Aula aula = new Aula(4);
		aula.add(a1);		
		aula.add(a2);		
		aula.add(a3);		
		aula.add(a4);		
		aula.add(a5);		
		
		
		
	}

}
