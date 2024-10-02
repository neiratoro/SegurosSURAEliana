package org.example.MODELOS;

public class Agencia {

    private Long idAgencia;
    private String nombreAgencia;
    private String direccion;
    private String numeroTelefono;
    private String correoElectronico;
    private String sitioWeb;
    private String numeroEmpleados;
    private Double ingresosAnuales;
    private String ciudad;
    private String pais;

    public Agencia() {
    }

    public Agencia(Long idAgencia, String nombreAgencia, String direccion, String numeroTelefono, String correoElectronico, String sitioWeb, String numeroEmpleados, Double ingresosAnuales, String ciudad, String pais) {
        this.idAgencia = idAgencia;
        this.nombreAgencia = nombreAgencia;
        this.direccion = direccion;
        this.numeroTelefono = numeroTelefono;
        this.correoElectronico = correoElectronico;
        this.sitioWeb = sitioWeb;
        this.numeroEmpleados = numeroEmpleados;
        this.ingresosAnuales = ingresosAnuales;
        this.ciudad = ciudad;
        this.pais = pais;
    }

    public Long getIdAgencia() {
        return idAgencia;
    }

    public void setIdAgencia(Long idAgencia) {
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

    public String getSitioWeb() {
        return sitioWeb;
    }

    public void setSitioWeb(String sitioWeb) {
        this.sitioWeb = sitioWeb;
    }

    public String getNumeroEmpleados() {
        return numeroEmpleados;
    }

    public void setNumeroEmpleados(String numeroEmpleados) {
        this.numeroEmpleados = numeroEmpleados;
    }

    public Double getIngresosAnuales() {
        return ingresosAnuales;
    }

    public void setIngresosAnuales(Double ingresosAnuales) {
        this.ingresosAnuales = ingresosAnuales;
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

    @Override
    public String toString() {
        return "Agencia{" +
                "idAgencia=" + idAgencia +
                ", nombreAgencia='" + nombreAgencia + '\'' +
                ", direccion='" + direccion + '\'' +
                ", numeroTelefono='" + numeroTelefono + '\'' +
                ", correoElectronico='" + correoElectronico + '\'' +
                ", sitioWeb='" + sitioWeb + '\'' +
                ", numeroEmpleados='" + numeroEmpleados + '\'' +
                ", ingresosAnuales=" + ingresosAnuales +
                ", ciudad='" + ciudad + '\'' +
                ", pais='" + pais + '\'' +
                '}';
    }
}
