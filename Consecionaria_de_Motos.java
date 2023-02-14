
public class Consecionaria_de_Motos {

	public static void main(String[] args) {
		
		Motos Yamaha = new Motos();
		Motos Suzuki = new Motos();
		Motos Yamaha_Touring = new Motos();
		
		Yamaha.setColor("Azul");
		Yamaha.ConfOff_road("Si");
		
		
		System.out.println("\t\t MOTO YAMAHA\n");
		System.out.println(Yamaha.DimeDatosMoto());
		System.out.println(Yamaha.getColor());
		System.out.println(Yamaha.DimeOff_road());
		System.out.println("El precio de la moto es: "+ Yamaha.PrecioMoto());
		
		Suzuki.setColor("Negro");
		Suzuki.ConfSports("Si");
		
		System.out.println("\n\t\t MOTO SUZUKI\n");
		System.out.println(Suzuki.DimeDatosMoto1());
		System.out.println(Suzuki.getColor());
		System.out.println(Suzuki.DimeSports());
		System.out.println("El precio de la moto es: "+ Suzuki.PrecioMoto());
		
		Yamaha_Touring.setColor("Verde");
		Yamaha_Touring.ConfTouring("Si");
		
		System.out.println("\n\t\t MOTO TOURING\n");
		System.out.println(Yamaha_Touring.DimeDatosMoto2());
		System.out.println(Yamaha_Touring.getColor());
		System.out.println(Yamaha_Touring.DimeOff_road());
		System.out.println("El precio de la moto es: "+ Yamaha_Touring.PrecioMoto());
		
	}

}
