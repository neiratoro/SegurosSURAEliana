package org.example.MODELOS;

public class Asegurado {
    private Long id;
    private String nombre;
    private Integer edad;
    private Double peso;
    private String direccion;
    private String numeroTelefono;
    private String correoElectronico;
    private Boolean esEmpleado;
    private String genero;
    private Double calificacionPromedio;
    private String numeroIdentificacion;
    private Integer cantidadHermanos;
    private String nivelEducativo;
    private Boolean esCasado;
    private Double salarioAnual;

    public Asegurado() {
    }

    public Asegurado(Long id, String nombre, Integer edad, Double peso, String direccion, String numeroTelefono, String correoElectronico, Boolean esEmpleado, String genero, Double calificacionPromedio, String numeroIdentificacion, Integer cantidadHermanos, String nivelEducativo, Boolean esCasado, Double salarioAnual) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
        this.direccion = direccion;
        this.numeroTelefono = numeroTelefono;
        this.correoElectronico = correoElectronico;
        this.esEmpleado = esEmpleado;
        this.genero = genero;
        this.calificacionPromedio = calificacionPromedio;
        this.numeroIdentificacion = numeroIdentificacion;
        this.cantidadHermanos = cantidadHermanos;
        this.nivelEducativo = nivelEducativo;
        this.esCasado = esCasado;
        this.salarioAnual = salarioAnual;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
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

    public Boolean getEsEmpleado() {
        return esEmpleado;
    }

    public void setEsEmpleado(Boolean esEmpleado) {
        this.esEmpleado = esEmpleado;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Double getCalificacionPromedio() {
        return calificacionPromedio;
    }

    public void setCalificacionPromedio(Double calificacionPromedio) {
        this.calificacionPromedio = calificacionPromedio;
    }

    public String getNumeroIdentificacion() {
        return numeroIdentificacion;
    }

    public void setNumeroIdentificacion(String numeroIdentificacion) {
        this.numeroIdentificacion = numeroIdentificacion;
    }

    public Integer getCantidadHermanos() {
        return cantidadHermanos;
    }

    public void setCantidadHermanos(Integer cantidadHermanos) {
        this.cantidadHermanos = cantidadHermanos;
    }

    public String getNivelEducativo() {
        return nivelEducativo;
    }

    public void setNivelEducativo(String nivelEducativo) {
        this.nivelEducativo = nivelEducativo;
    }

    public Boolean getEsCasado() {
        return esCasado;
    }

    public void setEsCasado(Boolean esCasado) {
        this.esCasado = esCasado;
    }

    public Double getSalarioAnual() {
        return salarioAnual;
    }

    public void setSalarioAnual(Double salarioAnual) {
        this.salarioAnual = salarioAnual;
    }

    @Override
    public String toString() {
        return "Asegurado{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", peso=" + peso +
                ", direccion='" + direccion + '\'' +
                ", numeroTelefono='" + numeroTelefono + '\'' +
                ", correoElectronico='" + correoElectronico + '\'' +
                ", esEmpleado=" + esEmpleado +
                ", genero='" + genero + '\'' +
                ", calificacionPromedio=" + calificacionPromedio +
                ", numeroIdentificacion='" + numeroIdentificacion + '\'' +
                ", cantidadHermanos=" + cantidadHermanos +
                ", nivelEducativo='" + nivelEducativo + '\'' +
                ", esCasado=" + esCasado +
                ", salarioAnual=" + salarioAnual +
                '}';
    }
}
