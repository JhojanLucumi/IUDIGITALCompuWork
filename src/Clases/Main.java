package Clases;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // Crear instancias de Empleados
        Empleado empleado1 = new Empleado("Jhojan Camilo", 30, 3000.0f, "Desarrollador");
        Empleado empleado2 = new Empleado("Marlon Andres", 25, 2500.0f, "Analista");

        // Crear el Departamento
        Departamento departamento = new Departamento(1, "Tecnología", "Antioquia");

        // Agregar empleados al departamento
        departamento.agregarEmpleado(empleado1);
        departamento.agregarEmpleado(empleado2);

        // Crear instancia de Registro de Empleados
        RegistroDeEmpleados registro = new RegistroDeEmpleados();
        registro.agregarEmpleado(empleado1);
        registro.agregarEmpleado(empleado2);

        // Generar un reporte de desempeño individual
        Date fechaActual = new Date();
        ReporteDesempeño reporte1 = new ReporteDesempeño(fechaActual, "Excelente", empleado1);
        reporte1.generarReporteIndividual(empleado1);

        // Generar un reporte por departamento
        reporte1.generarReportePorDepartamento(departamento);

        // Mostrar el promedio de salarios en el departamento
        System.out.println("Promedio de salarios: " + registro.calcularPromedioSalarios());

        // Mostrar la cantidad de empleados
        System.out.println("Cantidad de empleados: " + registro.obtenerCantidadEmpleados());

        // Mostrar la interfaz gráfica (Formulario)
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new InterfazDeUsuario().setVisible(true);
            }
        });
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println("Jhojan Lucumi");
    }
}