package Comercializadora;


public class Cd {
    private String Titulo;
    private String Interprete;
    private int Añopublicacion;
    private double Valorcd;
    private double Descuento = 10;
	
    public Cd(String titulo, double valorCd) {
        super();
        Titulo = titulo;
        Valorcd = valorCd;
    }
	
    public String getTitulo() {
        return Titulo;
    }
    public void setTitulo(String titulo) {
        Titulo = titulo;
    }
    public String getInterprete() {
        return Interprete;
    }
    public void setInterprete(String interprete) {
        Interprete = interprete;
    }
    public int getAñopublicacion() {
        return Añopublicacion;
    }
    public void setAniopublicacion(int añopublicacion) {
        Añopublicacion = añopublicacion;
    }
    public double getValorcd() {
        return Valorcd;
    }
    public void setValorcd(double valorcd) {
        Valorcd = valorcd;
    } 
    public double getValorcd1() {
        double total_pagar = 0;
        total_pagar = Valorcd * 0.09 - Descuento / 100 ;
		
        return Valorcd + total_pagar;
    }
}