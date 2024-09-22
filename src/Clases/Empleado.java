package Clases;

public class Empleado {
    // Atributos
    private String nombre;
    private int edad;
    private float salario;
    private String cargo;

    // Constructor
    public Empleado(String nombre, int edad, float salario, String cargo) {
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
        this.cargo = cargo;
    }

    // Métodos para obtener los valores de los atributos
    public String obtenerNombre() {
        return nombre;
    }

    public int obtenerEdad() {
        return edad;
    }

    public float obtenerSalario() {
        return salario;
    }

    public String obtenerCargo() {
        return cargo;
    }

    // Métodos para establecer los valores de los atributos
    public void establecerNombre(String nombre) {
        this.nombre = nombre;
    }

    public void establecerEdad(int edad) {
        this.edad = edad;
    }

    public void establecerSalario(float salario) {
        this.salario = salario;
    }

    public void establecerCargo(String cargo) {
        this.cargo = cargo;
    }
}

