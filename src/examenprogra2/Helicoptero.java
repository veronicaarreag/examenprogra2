/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examenprogra2;

/**
 *
 * @author mario
 */
public class Helicoptero extends VehiculoAereo{
    int cantidadMotores;
    String tipoHelicoptero;
    
    public Helicoptero(){
        super();
        super.setNombre("Helicoptero");
        super.setFuenteEnergia("Motor");
        super.setRelacionAceleracion(0.2);
    }
 
    protected void mostrar(){
        super.mostrar();
        System.out.println(" Tipo de Helicoptero ....: "+tipoHelicoptero);
        System.out.println(" Cantidad de motores: "+cantidadMotores);
    }

    protected int getCantidadMotores() {
        return cantidadMotores;
    }

    protected void setCantidadMotores(int cantidadMotores) {
        this.cantidadMotores = cantidadMotores;
    }

    protected String getTipoHelicoptero() {
        return tipoHelicoptero;
    }

    protected void setTipoHelicoptero(String tipoHelicoptero) {
        this.tipoHelicoptero = tipoHelicoptero;
    }
    
    
}
