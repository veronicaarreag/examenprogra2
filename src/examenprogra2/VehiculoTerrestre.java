/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examenprogra2;

/**
 *
 * @author mario
 */
public class VehiculoTerrestre extends Vehiculo{
    private String tipoTerreno;
 
    public VehiculoTerrestre(){
        super();
        super.setTipoVehiculo("Terrestre");
    }
 
    protected void mostrar(){
        super.mostrar();
        System.out.println(" Tipo de terreno ..: "+tipoTerreno);
    }
    
    protected void setTipoTerreno(String tipoTerreno){
        this.tipoTerreno = tipoTerreno;
    }
    
    protected String getTipoTerreno(){
        return this.tipoTerreno;
    }
}
