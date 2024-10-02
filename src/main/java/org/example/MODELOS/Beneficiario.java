package org.example.MODELOS;

public class Beneficiario {
    private Integer idAgencia;
    private String nombreAgencia;
    private String direccion;
    private String ciudad;
    private String pais;
    private String numeroTelefono;
    private String correoElectronico;
    private String paginaWeb;
    private Integer numeroEmpleados;
    private Double ingresosAnuales;

    public Beneficiario() {
    }

    public Beneficiario(Integer idAgencia, String nombreAgencia, String direccion, String ciudad, String pais, String numeroTelefono, String correoElectronico, String paginaWeb, Integer numeroEmpleados, Double ingresosAnuales) {
        this.idAgencia = idAgencia;
        this.nombreAgencia = nombreAgencia;
        this.direccion = direccion;
        this.ciudad = ciudad;
        this.pais = pais;
        this.numeroTelefono = numeroTelefono;
        this.correoElectronico = correoElectronico;
        this.paginaWeb = paginaWeb;
        this.numeroEmpleados = numeroEmpleados;
        this.ingresosAnuales = ingresosAnuales;
    }

    public Integer getIdAgencia() {
        return idAgencia;
    }

    public void setIdAgencia(Integer idAgencia) {
        this.idAgencia = idAgencia;
    }

    public String getNombreAgencia() {
        return nombreAgencia;
    }

    public void setNombreAgencia(String nombreAgencia) {
        this.nombreAgencia = nombreAgencia;
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

    public String getNumeroTelefono() {
        return numeroTelefono;
    }

    public void setNumeroTelefono(String numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public String getPaginaWeb() {
        return paginaWeb;
    }

    public void setPaginaWeb(String paginaWeb) {
        this.paginaWeb = paginaWeb;
    }

    public Integer getNumeroEmpleados() {
        return numeroEmpleados;
    }

    public void setNumeroEmpleados(Integer numeroEmpleados) {
        this.numeroEmpleados = numeroEmpleados;
    }

    public Double getIngresosAnuales() {
        return ingresosAnuales;
    }

    public void setIngresosAnuales(Double ingresosAnuales) {
        this.ingresosAnuales = ingresosAnuales;
    }

    @Override
    public String toString() {
        return "Beneficiario{" +
                "idAgencia=" + idAgencia +
                ", nombreAgencia='" + nombreAgencia + '\'' +
                ", direccion='" + direccion + '\'' +
                ", ciudad='" + ciudad + '\'' +
                ", pais='" + pais + '\'' +
                ", numeroTelefono='" + numeroTelefono + '\'' +
                ", correoElectronico='" + correoElectronico + '\'' +
                ", paginaWeb='" + paginaWeb + '\'' +
                ", numeroEmpleados=" + numeroEmpleados +
                ", ingresosAnuales=" + ingresosAnuales +
                '}';
    }
}
