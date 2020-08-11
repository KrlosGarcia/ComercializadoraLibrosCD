package Comercializadora;


public class Main {

   
    public static void main(String[] args) {
        Libro lbr1 = new Libro("Yo antes de ti", 20);
	Libro lbr2 = new Libro("Wigetta", 28);
		
	Cd Cd1 = new Cd("Afuera del Planeta", 18);
	Cd Cd2 = new Cd("Bajo el agua", 14);

       
	System.out.println("EL LIBRO Yo antes de ti CUESTA:" + lbr1.getValor1() +  "$");
	System.out.println("EL LIBRO Wigetta CUESTA : " + lbr2.getValor1() +  "$"); 
		
	System.out.println();
		
	System.out.println("EL VALOR DEL CD DE Afuera del Planeta ES :" +  Cd1.getValorcd1() +  "$");
	System.out.println("EL VALOR DEL CD DE Bajo el agua ES : "  + Cd2.getValorcd1() +  "$");
    }
    
}