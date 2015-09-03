
import org.junit.Test;

public class TestCuadrado{
	
	@Test
	public void TestDeOperaciones(){
		Cuadrado cuadrado1=new Cuadrado(6);
		cuadrado1.obtenerPerimetro(6);
		cuadrado1.obtenerArea(6);
		System.out.println("El perimetro del cuadrado es "+cuadrado1.obtenerPerimetro(6));
		System.out.println("El area del cuadrado es "+cuadrado1.obtenerArea(6));
	}
}