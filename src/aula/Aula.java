package aula;

import java.util.Arrays;

public class Aula {

	private Alumno[] alumnos;
	private int cuantos;
	
	
	public Aula (int huecos) {
		
		this.alumnos = new Alumno[huecos];
		this.cuantos = 0;
	}

	
	
	public void add(Alumno alumno) {
		
		if(cuantos<alumnos.length) {
			alumnos[cuantos] = alumno;
			cuantos++;
		}
		System.out.println(this);
	}



	@Override
	public String toString() {
		return "Aula [\nalumnos=" + Arrays.toString(alumnos) + "\ncuantos=" + cuantos + "]\n";
	}
	
	
	
	
	
	
	
}
