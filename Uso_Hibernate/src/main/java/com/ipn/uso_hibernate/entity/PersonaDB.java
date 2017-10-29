package com.ipn.uso_hibernate.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "PERSONA_IPN")
public class PersonaDB implements Serializable {

    @Id
    @Column(name = "ID_PERSONA")
    private int idPersona;

    @Column(name = "NOMBRE")
    private String nombre;

    @Column(name = "APELLIDOS")
    private String apellidos;

    @Column
    private String celular;

    @Column
    private String correo;

    public PersonaDB() {

    }

    public PersonaDB(int idPersona, String nombre, String apellidos, String celular, String correo) {
        this.idPersona = idPersona;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.celular = celular;
        this.correo = correo;
    }

    public int getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    @Override
    public String toString() {
        return "PersonaDB{" + "idPersona=" + idPersona + ", nombre=" + nombre + ", apellidos=" + apellidos + ", celular=" + celular + ", correo=" + correo + '}';
    }
    
    w

}
