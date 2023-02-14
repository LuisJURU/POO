
public class Camionetas {
	
	private int PesoCarroceria = 500;
	private int pesoTotal;
	private int PrecioFinal;
	private int ruedas;
	private float largo;
	private int ancho;
	private int pesoCam;
	private String Rin;
	private int motor;
	private boolean asientoCuero, AAC;
	private String color;
	
	public Camionetas() {
		
		motor=1800;
		ruedas=4;
		largo=2000;
		ancho=300;
		pesoCam=700;
		
	}
	
	public String DimeDatoCamioneta() {
		
		return "La Camioneta tiene " +ruedas+" Ruedas\nMide: "+largo/1000+" Metros\nAncho: "
				+ancho+"cm"+"\nEl motor es de: "+motor+"\nEl peso es: "+pesoCam +" Kg";
		
	}

	public String getColor() {
		return "El Color de la Camioneta es: "+color;
	}



	public void setColor(String color) {
		this.color = color;
	}
	
	public String getRin() {
		return "El Tamaño de las Llantas es: "+Rin;
	}

	public void setRin(String Rin) {
		this.Rin = Rin;
	}
	
	public void ConfAsientos(String asientoCuero) {
		
		if(asientoCuero.equalsIgnoreCase("Si")) {
			
			this.asientoCuero=true;
			
		}else {
			
			this.asientoCuero = false;
		}
		
	}
	
	public String dimeAsientos() {
		
		if(asientoCuero==true) {
			
			return "La camioneta tiene Asientos de Cuero";
			
		}else {
			
			return "La camioneta tiene Asientos de Serie";
			
		}
		
	}

	public void setAAC(String  AAC) {
		if(AAC.equalsIgnoreCase("Si")) {
			
			this.AAC=true;
			
		}else
			
			this.AAC=false;
	}
	
	public String getAAC() {
		if(AAC==true) {
			
			return "La camioneta tiene Aire Acondicionado";
			
			
		}else {
			
			return "La camioneta tiene Climatizador";
			
		}
		
		
	}
	
	public String DimePCoche() {
		
		pesoTotal= pesoCam + PesoCarroceria;
		if(asientoCuero==true) {
			
			pesoTotal+=50;
			
		}
		if(AAC==true) {
			
			pesoTotal+=100;
			
		}
		
		return "El peso de la Camioneta es: "+pesoTotal;
		
	}
	
	public String PrecioCam() {
		
		PrecioFinal=10000;
		if(asientoCuero) {
			
			PrecioFinal+=500;
			
		}
		
		if(AAC) {
			
			PrecioFinal+=100;
			
		}
		
		return "El Precio Final es: "+PrecioFinal;
		
	}

}
