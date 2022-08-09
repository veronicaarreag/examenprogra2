/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examenprogra2;

/**
 *
 * @author mario
 */
public class Automovil extends VehiculoTerrestre{
     String tipoMoto;
    int cantidadLlantas;
    String material;
 
    public Automovil(){
        super();
        super.setNombre("Automóvil");
        super.setTipoTerreno("Terreno firme");
        super.setFuenteEnergia("Propulsión humana");
        super.setRelacionAceleracion(0.04);
    }
    
     protected void mostrar(){
        super.mostrar();
        System.out.println(" Tipo de automóvil ....: "+tipoMoto);
        System.out.println(" Cantidad de llanta: "+cantidadLlantas);
        System.out.println(" Material automóvil: "+material);
    }

    protected String getTipoMoto() {
        return tipoMoto;
    }

    protected void setTipoMoto(String tipoMoto) {
        this.tipoMoto = tipoMoto;
    }

    protected int getCantidadLlantas() {
        return cantidadLlantas;
    }

    protected void setCantidadLlantas(int cantidadLlantas) {
        this.cantidadLlantas = cantidadLlantas;
    }

    protected String getMaterial() {
        return material;
    }

    protected void setMaterial(String material) {
        this.material = material;
    }
     
     
}
