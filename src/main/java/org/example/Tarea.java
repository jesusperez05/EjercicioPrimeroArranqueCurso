package org.example;

public class Tarea {
    private String descripcion;
    private boolean completado;

    public Tarea(String descripcion, boolean completado) {
        setDescripcion(descripcion);
        this.completado = completado;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        if (!descripcion.isEmpty()) {
            this.descripcion = descripcion;
        }
    }

    public boolean isCompletado() {
        return completado;
    }

    public void setCompletado(boolean completado) {
        this.completado = completado;
    }

    @Override
    public String toString() {
        return descripcion + (completado ? " [COMPLETADA]" : "");
    }
}
