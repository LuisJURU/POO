
public class Consecionario_de_Camionetas {

	public static void main(String[] args) {
		
		Camionetas Camioneta1 = new Camionetas();
		
		Camioneta1.setColor("Rojo");
		Camioneta1.ConfAsientos("Si");
		Camioneta1.setAAC("Si");
		Camioneta1.setRin("22");
		
		
		System.out.println(Camioneta1.getColor());
		System.out.println(Camioneta1.DimeDatoCamioneta());
		System.out.println(Camioneta1.getRin());
		System.out.println(Camioneta1.getAAC());
		System.out.println(Camioneta1.dimeAsientos());
		System.out.println(Camioneta1.PrecioCam());

		
		
	}

}
