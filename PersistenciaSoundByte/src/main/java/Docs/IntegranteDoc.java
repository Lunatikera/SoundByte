/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Docs;

import java.time.LocalDate;
import org.bson.types.ObjectId;

/**
 * intregrantes doc
 * @author santi
 */
public class IntegranteDoc {
    
    /**
     * Variables
     */
    private String nombre;
    private String instrumento;
    private LocalDate fechaIngreso;
    private Boolean esActivo;
    private LocalDate fechaEgreso;

    /**
     * Consrtuctor
     */
    public IntegranteDoc() {
    }

    /**
     * Obtiene el nombre
     * @return nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * obtiene nombre
     * @param nombre nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * obtiene insrtumentos
     * @return intrumento
     */
    public String getInstrumento() {
        return instrumento;
    }

    /**
     * Asigna instrumento
     * @param instrumento instrumento 
     */
    public void setInstrumento(String instrumento) {
        this.instrumento = instrumento;
    }

    /**
     * obtiene fecha ingreso
     * @return fecha
     */
    public LocalDate getFechaIngreso() {
        return fechaIngreso;
    }

    /**
     * Asigna fecha
     * @param fechaIngreso fecha
     */
    public void setFechaIngreso(LocalDate fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    /**
     * Si es activo o no
     * @return verdadero o falso
     */
    public Boolean getEsActivo() {
        return esActivo;
    }

    /**
     * Asigna si es activo
     * @param esActivo valir a aseignar
     */
    public void setEsActivo(Boolean esActivo) {
        this.esActivo = esActivo;
    }

    /**
     * obtiene fecha de egreso
     * @return regresa la fecha
     */
    public LocalDate getFechaEgreso() {
        return fechaEgreso;
    }

    /**
     * asigna fecha
     * @param fechaEgreso fecha
     */
    public void setFechaEgreso(LocalDate fechaEgreso) {
        this.fechaEgreso = fechaEgreso;
    }
    
}
