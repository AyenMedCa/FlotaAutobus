public class AutobusesUrbanos extends Autobuses{

    private char ruta;

    public AutobusesUrbanos(Conductor conductor, Integer id, Double precio_base, char ruta) {
        super(conductor, id, precio_base);
        this.ruta = ruta;
    }

    @Override
    public Double precioDelViaje() {
        if (ruta == 'A'){
            return (getPrecio_base() * 0.10) + getPrecio_base();
        }else
            return (getPrecio_base() * 0.20) + getPrecio_base();
    }

    @Override
    public String toString() {
        return "AutobusesUrbanos{" +
                "ruta=" + ruta +
                "Precio del billete :" +precioDelViaje() + '\'' +
                '}';
    }
}
