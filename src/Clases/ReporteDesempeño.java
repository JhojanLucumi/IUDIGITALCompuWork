package Clases;

import java.util.Date;

public class ReporteDesempeño {
    // Atributos
    private Date fecha;
    private String desempeño;
    private Empleado empleado;

    // Constructor
    public ReporteDesempeño(Date fecha, String desempeño, Empleado empleado) {
        this.fecha = fecha;
        this.desempeño = desempeño;
        this.empleado = empleado;
    }

    // Método para generar un reporte individual de un empleado
    public void generarReporteIndividual(Empleado empleado) {
        System.out.println("Reporte de Desempeño Individual:");
        System.out.println("Fecha: " + fecha);
        System.out.println("Empleado: " + empleado.obtenerNombre());
        System.out.println("Desempeño: " + desempeño);
    }

    // Método para generar un reporte por departamento
    public void generarReportePorDepartamento(Departamento departamento) {
        System.out.println("Reporte de Desempeño por Departamento:");
        System.out.println("Departamento: " + departamento.obtenerNombre());
        for (Empleado emp : departamento.obtenerListaEmpleados()) {
            System.out.println("Empleado: " + emp.obtenerNombre() + ", Desempeño: " + desempeño);
        }
    }

    // Getters y Setters
    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getDesempeño() {
        return desempeño;
    }

    public void setDesempeño(String desempeño) {
        this.desempeño = desempeño;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }
}

