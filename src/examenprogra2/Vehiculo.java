/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examenprogra2;

/**
 *
 * @author mario
 */
public class Vehiculo {
    private String nombre;
    private String tipoVehiculo;
    private String fuenteEnergia;
    private Double velocidadMaxima;
    private Double velocidadActual;
    private Double relacionAceleracion;
    private int cantidadTripulacion;
    
    public Vehiculo(){
        this.nombre = "";
        this.tipoVehiculo = "";
        this.fuenteEnergia = "";
        this.velocidadMaxima = 0.00;
        this.velocidadActual = 0.00;
        this.relacionAceleracion = 0.00;
        this.cantidadTripulacion = 0;
    }
    
    protected void acelerar(int segundos){
        for(int i=0;i<segundos;i++){
            velocidadActual=velocidadActual+(velocidadMaxima/2*relacionAceleracion);
            if(velocidadActual>velocidadMaxima){
                velocidadActual=velocidadMaxima;
                break;
            }
        }
    }
    
    protected void mostrar(){
        System.out.println(" Información del vehículo");
        System.out.println(" Nombre ...........: "+this.getNombre());
        System.out.println(" Tipo   ...........: "+this.getTipoVehiculo());
        System.out.println(" Fuente de energía : "+this.getFuenteEnergia());
        System.out.println(" Tripulación ......: "+this.getCantidadTripulacion());
        System.out.println(" Velocidad máxima .: "+this.getVelocidadMaxima());
        System.out.println(" Velocidad actual .: "+this.getVelocidadActual());
    }

    protected String getNombre() {
        return nombre;
    }

    protected void setNombre(String nombre) {
        this.nombre = nombre;
    }

    protected String getTipoVehiculo() {
        return tipoVehiculo;
    }

    protected void setTipoVehiculo(String tipoVehiculo) {
        this.tipoVehiculo = tipoVehiculo;
    }

    protected String getFuenteEnergia() {
        return fuenteEnergia;
    }

    public void setFuenteEnergia(String fuenteEnergia) {
        this.fuenteEnergia = fuenteEnergia;
    }

    protected Double getVelocidadMaxima() {
        return velocidadMaxima;
    }

    protected void setVelocidadMaxima(Double velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    protected Double getVelocidadActual() {
        return velocidadActual;
    }

    protected void setVelocidadActual(Double velocidadActual) {
        this.velocidadActual = velocidadActual;
    }

    protected Double getRelacionAceleracion() {
        return relacionAceleracion;
    }

    protected void setRelacionAceleracion(Double relacionAceleracion) {
        this.relacionAceleracion = relacionAceleracion;
    }

    protected int getCantidadTripulacion() {
        return cantidadTripulacion;
    }

    protected void setCantidadTripulacion(int cantidadTripulacion) {
        this.cantidadTripulacion = cantidadTripulacion;
    }
    
    
}
