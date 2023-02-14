
public class Motos {
	
	private int ruedas;
	private float largo;
	private int ancho;
	private int pesoMoto;
	private int Rin;
	private int motor;
	private int ruedas2;
	private float largo2;
	private int ancho2;
	private int pesoMoto2;
	private int Rin2;
	private int motor2;
	private int ruedas3;
	private float largo3;
	private int ancho3;
	private int pesoMoto3;
	private int Rin3;
	private int motor3;
	private String color;
	private boolean neumaticoSports;
	private boolean neumaticosTouring;
	private boolean neumaticosOff_road;

	
	public Motos() {
		//YAMAHA
		ruedas = 2;
		largo = 1800;
		ancho = 739;
		Rin = 17;
		pesoMoto = 500;
		motor= 200;
		
		//SPORTS
		ruedas2 = 2;
		largo2 = 1950;
		ancho2 = 740;
		Rin2 = 18;
		pesoMoto2 = 500;
		motor2= 200;
		
		//OFF_ROAD
		ruedas3 = 2;
		largo3 = 1800;
		ancho3 = 739;
		Rin3 = 18;
		pesoMoto3 = 500;
		motor3= 300;

	}
	
	public String DimeDatosMoto() {
		return "La Moto tiene: " + ruedas +" Ruedas\nMide: "+largo/1000+" metros\nAncho: "+ancho+
				" cm\nNumero de Ruedas: "+Rin+"\nEl motor es de: "+ motor + "cc" +"\nCon un peso de: "+pesoMoto+ " Kg";
		
	}
	
	public String DimeDatosMoto1() {
		return "La Moto tiene: " + ruedas2 +" Ruedas\nMide: "+largo2/1000+" metros\nAncho: "+ancho2+
				" cm\nNumero de Ruedas: "+Rin2+"\nEl motor es de: "+ motor2 + "cc" +"\nCon un peso de: "+pesoMoto2+ " Kg";
		
	}
	
	public String DimeDatosMoto2() {
		return "La Moto tiene: " + ruedas3 +" Ruedas\nMide: "+largo3/1000+" metros\nAncho: "+ancho3+
				" cm\nNumero de Ruedas: "+Rin3+"\nEl motor es de: "+ motor3 + "cc" +"\nCon un peso de: "+pesoMoto3+ " Kg";
		
	}

	public String getColor() {
		return "El color de la Moto es: "+color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void ConfSports(String neumaticoSports) {
		
		if(neumaticoSports.equalsIgnoreCase("Si")) {
			
			this.neumaticoSports = true;
			
		}else {
			
			this.neumaticoSports = false;
			
		}
		
	}
	
	public void ConfTouring(String neumaticosTouring) {
		
		if(neumaticosTouring.equalsIgnoreCase("Si")) {
			
			this.neumaticosTouring = true;
			
		}else {
			
			this.neumaticosTouring = false;
			
		}
		
	}
	public void ConfOff_road(String neumaticosOff_road) {
	
	if(neumaticosOff_road.equalsIgnoreCase("Si")) {
		
		this.neumaticosOff_road = true;
		
	}else {
		
		this.neumaticosOff_road = false;
		
	}
	
}

	public String DimeSports() {
		
		if(neumaticoSports == true) {
			
			return "La moto tiene Neumaticos Sports";
			
		}else {
			
			return "La moto tiene Neumaticos de Serie";
			
			
		}
		
	}
	
	public String DimeTouring() {
		
		if(neumaticosTouring == true) {
			
			return "La moto tiene Neumaticos Touring";
			
		}else {
			
			return "La moto tiene Neumaticos de Serie";
			
			
		}
		
	}
	
	public String DimeOff_road() {
		
		if(neumaticosOff_road == true) {
			
			return "La moto tiene Neumaticos Off Road";
			
		}else {
			
			return "La moto tiene Neumaticos de Serie";
			
			
		}
		
	}
	
	public int PrecioMoto() {
		
		int precioFinal=1000;
		if(neumaticosOff_road) {
			
			precioFinal+=3000;
		}
		if(neumaticoSports) {
			
			precioFinal+=5000;
		}
		if(neumaticosTouring) {
			
			precioFinal+=3500;
		}
		return precioFinal;
		
	}
	
	
	
}
