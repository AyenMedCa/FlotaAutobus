public class Conductor {

    private String nombre;
    private Double salario;

    public Conductor(String nombre, Double salario) {
        this.nombre = nombre;
        this.salario = salario;
    }

    public String getNombre() {
        return nombre;
    }

    public Double getSalario() {
        return salario;
    }
}
