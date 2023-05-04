public class AutobusesInterurbanos extends Autobuses{

    private Double km;

    public AutobusesInterurbanos(Conductor conductor, Integer id, Double precio_base, Double km) {
        super(conductor, id, precio_base);
        this.km = km;
    }

    @Override
    public Double precioDelViaje() {
        return km * getPrecio_base();
    }

    @Override
    public String toString() {
        return "AutobusesInterurbanos{" +
                "km=" + km +
                "Precio del billete: " + getPrecio_base() + '\'' +
                '}';
    }
}
