package com.sofkau.reactiveserverdemo.collection;

import javax.validation.constraints.NotBlank;
import java.util.Objects;

public class Dato {

    private String id;
    @NotBlank
    private String informacion;

    public Dato() {
    }

    public Dato(String informacion) {
        this.informacion = informacion;
    }

    public Dato(String id, String informacion) {
        this.id = id;
        this.informacion = informacion;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getInformacion() {
        return informacion;
    }

    public void setInformacion(String informacion) {
        this.informacion = informacion;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dato dato = (Dato) o;
        return id.equals(dato.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Dato{" +
                "id='" + id + '\'' +
                ", informacion='" + informacion + '\'' +
                '}';
    }
}
