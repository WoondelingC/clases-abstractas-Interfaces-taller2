package CreateShip;

/**
 * clase hija que implementa los metodos y atributos heredados de la clase padre
 * y creados en la misma clase
 * 
 * @author Yorman Colina
 */
public class ShuttleVehicles extends SpaceShip {
    /**
     * varible privada que indica el peso de la carga transportada por la nave
     */
    private int wheightOfLoad = 100;

    /**
     * constructor de la clase hija nave no tripulada
     * @param name nombre de la nave 
     * @param wheight peso de la nave
     * @param speed velocidad de la nave
     * @param typeFuel tipo de combustible
     */
    public ShuttleVehicles(String name, double wheight, int speed, String typeFuel) {
        super(name, wheight, speed, typeFuel);
    }
    
    /**
     * Sobreescritura de metodos abstractos
     * acá se les da el comportamiento a los metodos
     */
    @Override
    public void speedShip() {
        this.speed = this.speed + 10;
    }
    
    /**
     * a diferencia del comportamiento del metodo en las otras clases
     * acá se observa que se le suma el peso de la carga transportada
     */
    @Override
    public void wheigthShip() {
        this.wheight = this.wheight + wheightOfLoad;
    }

}
