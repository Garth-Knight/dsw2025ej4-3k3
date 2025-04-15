/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

/**
 *
 * @author azind
 */
public class Pais {
    private String nombre;
    private String iso2;

    public Pais(String nombre, String iso2) {
        this.nombre = nombre;
        this.iso2 = iso2; // el iso es un codigo de 2 caracteres unico para cada pais, Ejemplo: Japon tiene JP, Argentina tiene AR
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getIso2() {
        return iso2;
    }

    public void setIso2(String iso2) {
        this.iso2 = iso2;
    }
    
}
