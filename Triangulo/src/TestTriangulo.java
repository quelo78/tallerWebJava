import org.junit.Test;

public class TestTriangulo {

	@Test
	public void TestDeOperaciones() {
		Triangulo Triangulo1= new Triangulo(3,7,5,9,4);
		Triangulo1.calcularPerimetro(3,7,5);
		Triangulo1.calcularArea(9,4);
		System.out.println ("El perimetro del triangulo es " + Triangulo1.calcularPerimetro(3,7,5));	
		System.out.println ("El area del triangulo es " + Triangulo1.calcularArea(9,4));	
	}
}