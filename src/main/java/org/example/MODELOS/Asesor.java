package org.example.MODELOS;

public class Asesor {
    private Long idAsesor;
    private String nombreCompleto;
    private String especialidad;
    private String numeroTelefono;
    private String correoElectronico;
    private Integer aniosExperiencia;
    private Double salario;
    private String nivelEducativo;
    private String direccion;
    private Boolean disponible;

    public Asesor() {Integer 'idInmueble', String 'tipoInmueble', String 'direccion', String 'ciudad',
            String 'pais', Double 'precio', Integer 'numeroHabitaciones',
        Double 'tamanoMetrosCuadrados', Boolean 'disponible', Integer "anioConstruccion"
    }

    public Asesor(Long idAsesor, String nombreCompleto, String especialidad, String numeroTelefono, String correoElectronico, Integer aniosExperiencia, Double salario, String nivelEducativo, String direccion, Boolean disponible) {
        this.idAsesor = idAsesor;
        this.nombreCompleto = nombreCompleto;
        this.especialidad = especialidad;
        this.numeroTelefono = numeroTelefono;
        this.correoElectronico = correoElectronico;
        this.aniosExperiencia = aniosExperiencia;
        this.salario = salario;
        this.nivelEducativo = nivelEducativo;
        this.direccion = direccion;
        this.disponible = disponible;
    }

    public Long getIdAsesor() {
        return idAsesor;
    }

    public void setIdAsesor(Long idAsesor) {
        this.idAsesor = idAsesor;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
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

    public Integer getAniosExperiencia() {
        return aniosExperiencia;
    }

    public void setAniosExperiencia(Integer aniosExperiencia) {
        this.aniosExperiencia = aniosExperiencia;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public String getNivelEducativo() {
        return nivelEducativo;
    }

    public void setNivelEducativo(String nivelEducativo) {
        this.nivelEducativo = nivelEducativo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Boolean getDisponible() {
        return disponible;
    }

    public void setDisponible(Boolean disponible) {
        this.disponible = disponible;
    }

    @Override
    public String toString() {
        return "Asesor{" +
                "idAsesor=" + idAsesor +
                ", nombreCompleto='" + nombreCompleto + '\'' +
                ", especialidad='" + especialidad + '\'' +
                ", numeroTelefono='" + numeroTelefono + '\'' +
                ", correoElectronico='" + correoElectronico + '\'' +
                ", aniosExperiencia=" + aniosExperiencia +
                ", salario=" + salario +
                ", nivelEducativo='" + nivelEducativo + '\'' +
                ", direccion='" + direccion + '\'' +
                ", disponible=" + disponible +
                '}';
    }
}
