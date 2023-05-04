public class Estacion {
    public static void main(String[] args) {

        //Conductores
        Conductor carlos = new Conductor("Carlos",1000.0);
        Conductor ernesto = new Conductor("Ernesto", 1300.0);

        //Matriz
        Autobuses autobuses [][] = new Autobuses[2][2];

        //tipos
        AutobusesInterurbanos interU = new AutobusesInterurbanos(ernesto,2,0.5,1000.0);
        AutobusesUrbanos urbanos = new AutobusesUrbanos(carlos,1,0.4,'B');

        autobuses [0][0] = interU;
        autobuses [0][1] = urbanos;

        //Imprimir
        System.out.println(interU.toString());
        System.out.println(urbanos.toString());

    }
}
