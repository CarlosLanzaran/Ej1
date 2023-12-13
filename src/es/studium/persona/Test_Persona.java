package es.studium.persona;

public class Test_Persona
{

	public static void main(String[] args)
	{
		Persona persona1 = new Persona();
		persona1.setNombre("Carlos");
		persona1.setApellidos("Lanzarán Romero");
		persona1.setEdad(18);
		persona1.setHaPagado(false);
		persona1.setAula(1);
		
		System.out.println(persona1.getNombre() + " " + persona1.getApellidos() + " tiene " + persona1.getEdad() 
		+ " años y está en el aula " + persona1.getAula() + ". El pago del alumno es " + persona1.getHaPagado());
		
		Persona persona2 = new Persona("Rodolfo", "Segundo", 34, false, 2);
		
		System.out.println(persona2.getNombre() + " " + persona2.getApellidos() + " tiene " + persona2.getEdad() 
		+ " años y está en el aula " + persona2.getAula() + ". El pago del alumno es " + persona2.getHaPagado());
		
	}
		
}




				





















