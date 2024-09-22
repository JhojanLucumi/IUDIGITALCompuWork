package Clases;

import java.util.ArrayList;
import java.util.List;

public class Departamento {
    // Atributos
    private int idDepartamento;
    private String nombre;
    private String ubicacion;
    private List<Empleado> empleados;

    // Constructor
    public Departamento(int idDepartamento, String nombre, String ubicacion) {
        this.idDepartamento = idDepartamento;
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.empleados = new ArrayList<>();
    }

    // Métodos
    public String obtenerNombre() {
        return nombre;
    }

    public String obtenerCodigo() {
        return String.valueOf(idDepartamento);
    }

    public void agregarEmpleado(Empleado empleado) {
        empleados.add(empleado);
    }

    public void eliminarEmpleado(Empleado empleado) {
        if (empleados.contains(empleado)) {
            empleados.remove(empleado);
        } else {
            System.out.println("El empleado no se encuentra en el departamento.");
        }
    }

    // Getters
    public int getIdDepartamento() {
        return idDepartamento;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    // Método toString para una mejor representación
    @Override
    public String toString() {
        return "Departamento{" +
                "idDepartamento=" + idDepartamento +
                ", nombre='" + nombre + '\'' +
                ", ubicacion='" + ubicacion + '\'' +
                ", empleados=" + empleados.size() +
                '}';
    }
}

