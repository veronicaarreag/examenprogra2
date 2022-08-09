/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examenprogra2;

/**
 *
 * @author mario
 */
public class Avion extends VehiculoAereo{
    int cantidadMotores;
    String tipoAvion;
 
    public Avion(){
        super();
        super.setNombre("Avión");
        super.setFuenteEnergia("Motor");
        super.setRelacionAceleracion(0.3);
    }
 
    protected void mostrar(){
        super.mostrar();
        System.out.println(" Tipo de avión ....: "+tipoAvion);
        System.out.println(" Cantidad de motores: "+cantidadMotores);
    }

    protected int getCantidadMotores() {
        return cantidadMotores;
    }

    protected void setCantidadMotores(int cantidadMotores) {
        this.cantidadMotores = cantidadMotores;
    }

    protected String getTipoAvion() {
        return tipoAvion;
    }

    protected void setTipoAvion(String tipoAvion) {
        this.tipoAvion = tipoAvion;
    }
    
    
}
