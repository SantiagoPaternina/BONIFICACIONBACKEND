package org.example.Modelos;

public class Apartamento
{
    private Long id;
    private String ubicacion;
    private Integer valorApto;
    private String numeroHabitaciones;
    private Double metrosCuadrados;
    private Boolean tieneBalcon;
    private String tipo;

    public Apartamento() {
    }

    public Apartamento(Long id, String ubicacion, Integer valorApto, String numeroHabitaciones, Double metrosCuadrados, Boolean tieneBalcon, String tipo) {
        this.id = id;
        this.ubicacion = ubicacion;
        this.valorApto = valorApto;
        this.numeroHabitaciones = numeroHabitaciones;
        this.metrosCuadrados = metrosCuadrados;
        this.tieneBalcon = tieneBalcon;
        this.tipo = tipo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public Integer getValorApto() {
        return valorApto;
    }

    public void setValorApto(Integer valorApto) {
        this.valorApto = valorApto;
    }

    public String getNumeroHabitaciones() {
        return numeroHabitaciones;
    }

    public void setNumeroHabitaciones(String numeroHabitaciones) {
        this.numeroHabitaciones = numeroHabitaciones;
    }

    public Double getMetrosCuadrados() {
        return metrosCuadrados;
    }

    public void setMetrosCuadrados(Double metrosCuadrados) {
        this.metrosCuadrados = metrosCuadrados;
    }

    public Boolean getTieneBalcon() {
        return tieneBalcon;
    }

    public void setTieneBalcon(Boolean tieneBalcon) {
        this.tieneBalcon = tieneBalcon;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Apartamento{" +
                "id=" + id +
                ", ubicacion='" + ubicacion + '\'' +
                ", valorApto=" + valorApto +
                ", numeroHabitaciones='" + numeroHabitaciones + '\'' +
                ", metrosCuadrados=" + metrosCuadrados +
                ", tieneBalcon=" + tieneBalcon +
                ", tipo='" + tipo + '\'' +
                '}';
    }
}
