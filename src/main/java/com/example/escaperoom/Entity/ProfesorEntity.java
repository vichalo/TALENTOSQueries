package com.example.escaperoom.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "profesor", schema = "scaperoom", catalog = "")
public class ProfesorEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "idProfesor")
    private long idProfesor;
    @Basic
    @Column(name = "nombre")
    private String nombre;

    public long getIdProfesor() {
        return idProfesor;
    }

    public void setIdProfesor(long idProfesor) {
        this.idProfesor = idProfesor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ProfesorEntity that = (ProfesorEntity) o;

        if (idProfesor != that.idProfesor) return false;
        if (nombre != null ? !nombre.equals(that.nombre) : that.nombre != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (idProfesor ^ (idProfesor >>> 32));
        result = 31 * result + (nombre != null ? nombre.hashCode() : 0);
        return result;
    }
}
