public abstract class  Autobuses {

   private Conductor conductor;
   private Integer id;
   private Double precio_base;

    public Autobuses() {
    }

    public Conductor getConductor() {
        return conductor;
    }

    public Integer getId() {
        return id;
    }

    public Double getPrecio_base() {
        return precio_base;
    }

    public Autobuses(Conductor conductor, Integer id, Double precio_base) {
        this.conductor = conductor;
        this.id = id;
        this.precio_base = precio_base;
    }

    public abstract Double precioDelViaje();

    @Override
    public String toString() {
        return "Autobuses{" +
                "conductor=" + conductor +
                ", id=" + id +
                ", precio_base=" + precio_base +
                '}';
    }
}
