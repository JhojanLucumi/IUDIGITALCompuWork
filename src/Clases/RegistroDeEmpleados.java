package Clases;

import java.util.ArrayList;
import java.util.List;

public class RegistroDeEmpleados {
    // Atributo
    private List<Empleado> empleados;

    // Constructor
    public RegistroDeEmpleados() {
        this.empleados = new ArrayList<>();
    }

    // Método para agregar un empleado
    public void agregarEmpleado(Empleado empleado) {
        empleados.add(empleado);
    }

    // Método para eliminar un empleado por su nombre
    public boolean eliminarEmpleado(String nombre) {
        for (Empleado empleado : empleados) {
            if (empleado.obtenerNombre().equalsIgnoreCase(nombre)) {
                empleados.remove(empleado);
                return true;  // Empleado eliminado
            }
        }
        return false;  // Empleado no encontrado
    }

    // Método para buscar un empleado por su nombre
    public Empleado buscarEmpleado(String nombre) {
        for (Empleado empleado : empleados) {
            if (empleado.obtenerNombre().equalsIgnoreCase(nombre)) {
                return empleado;
            }
        }
        return null;  // Empleado no encontrado
    }

    // Método para obtener la lista de empleados
    public List<Empleado> obtenerListaEmpleados() {
        return empleados;
    }

    // Método para calcular el promedio de los salarios
    public float calcularPromedioSalarios() {
        if (empleados.isEmpty()) {
            return 0;
        }
        float totalSalarios = 0;
        for (Empleado empleado : empleados) {
            totalSalarios += empleado.obtenerSalario();
        }
        return totalSalarios / empleados.size();
    }

    // Método para obtener la cantidad de empleados
    public int obtenerCantidadEmpleados() {
        return empleados.size();
    }
}
