package sistemaDeEncuestas1;

public class Main {

	public static void main(String[] args) {
		//Iteraciones
		Consultora c = new Consultora();

		Empleado e1 = new Empleado("Juan", "44768512", 100000); c.addEmpleado(e1);
		Empleado e2 = new Empleado("Maria", "44768513", 120000); c.addEmpleado(e2);

		Persona p1 = new Persona("Pedro", "44768514"); 
		Persona p2 = new Persona("Ana", "44768515"); 
		Persona p3 = new Persona("Luis", "44768516"); 

		Formulario f1 = new Formulario("Feedback");
			Pregunta preg1 = new Pregunta("¿Cómo calificaría el servicio?"); 	f1.addPregunta(preg1);
			Pregunta preg2 = new Pregunta("¿Recomendaría nuestro producto?"); f1.addPregunta(preg2);
			Pregunta preg3 = new Pregunta("¿Qué mejoras sugeriría?"); f1.addPregunta(preg3);
			
			Encuesta en1 = new Encuesta(f1, p1, e1); c.addEncuesta(en1);
			Encuesta en2 = new Encuesta(f1, p2, e1); c.addEncuesta(en2);
			Encuesta en3 = new Encuesta(f1, p3, e2); c.addEncuesta(en3);
				//Prueba para error con el formulario 1, f1.
				Encuesta en7 = new Encuesta(f1, p1, e2); c.addEncuesta(en7);

		Formulario f2 = new Formulario("Comprención");
			Pregunta preg4 = new Pregunta("¿Qué entendió de la presentación?"); 	f2.addPregunta(preg4);
			Pregunta preg5 = new Pregunta("¿Es más importante el frio o el calor?"); f2.addPregunta(preg5);
			
			Encuesta en4 = new Encuesta(f2, p1, e2); c.addEncuesta(en4);
			Encuesta en5 = new Encuesta(f2, p2, e1); c.addEncuesta(en5);
			Encuesta en6 = new Encuesta(f2, p3, e2); c.addEncuesta(en6);


		//ENCUESTAR
		c.encuestar(en1);	c.encuestar(en2);	c.encuestar(en3);	c.encuestar(en4);	c.encuestar(en5);	c.encuestar(en6);	c.encuestar(en7);
		
		//Prueba de datos
		//System.out.println(c);

	}

}
