package org.example.MODELOS;

public class Inmueble {
    private Long idInmueble;
    private String tipoInmueble; // Ej: Casa, Departamento, Terreno
    private String direccion;
    private String ciudad;
    private String pais;
    private Double precio;
    private Integer numeroHabitaciones;
    private Double tamanoMetrosCuadrados;
    private Boolean disponible;
    private Integer anioConstruccion;

    public Inmueble() {
    }

    public Inmueble(Long idInmueble, String tipoInmueble, String direccion, String ciudad, String pais, Double precio, Integer numeroHabitaciones, Double tamanoMetrosCuadrados, Boolean disponible, Integer anioConstruccion) {
        this.idInmueble = idInmueble;
        this.tipoInmueble = tipoInmueble;
        this.direccion = direccion;
        this.ciudad = ciudad;
        this.pais = pais;
        this.precio = precio;
        this.numeroHabitaciones = numeroHabitaciones;
        this.tamanoMetrosCuadrados = tamanoMetrosCuadrados;
        this.disponible = disponible;
        this.anioConstruccion = anioConstruccion;
    }

    public Long getIdInmueble() {
        return idInmueble;
    }

    public void setIdInmueble(Long idInmueble) {
        this.idInmueble = idInmueble;
    }

    public String getTipoInmueble() {
        return tipoInmueble;
    }

    public void setTipoInmueble(String tipoInmueble) {
        this.tipoInmueble = tipoInmueble;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public Integer getNumeroHabitaciones() {
        return numeroHabitaciones;
    }

    public void setNumeroHabitaciones(Integer numeroHabitaciones) {
        this.numeroHabitaciones = numeroHabitaciones;
    }

    public Double getTamanoMetrosCuadrados() {
        return tamanoMetrosCuadrados;
    }

    public void setTamanoMetrosCuadrados(Double tamanoMetrosCuadrados) {
        this.tamanoMetrosCuadrados = tamanoMetrosCuadrados;
    }

    public Boolean getDisponible() {
        return disponible;
    }

    public void setDisponible(Boolean disponible) {
        this.disponible = disponible;
    }

    public Integer getAnioConstruccion() {
        return anioConstruccion;
    }

    public void setAnioConstruccion(Integer anioConstruccion) {
        this.anioConstruccion = anioConstruccion;
    }

    @Override
    public String toString() {
        return "Inmueble{" +
                "idInmueble=" + idInmueble +
                ", tipoInmueble='" + tipoInmueble + '\'' +
                ", direccion='" + direccion + '\'' +
                ", ciudad='" + ciudad + '\'' +
                ", pais='" + pais + '\'' +
                ", precio=" + precio +
                ", numeroHabitaciones=" + numeroHabitaciones +
                ", tamanoMetrosCuadrados=" + tamanoMetrosCuadrados +
                ", disponible=" + disponible +
                ", anioConstruccion=" + anioConstruccion +
                '}';
    }
}
