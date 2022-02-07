package CreateShip;

/**
 * clase nave robotica extediende de la clase SpaceShip
 * hereda los métodos y atributos de la clase abstracta
 * @author Yorman Colina
 */
public class RoboticShips extends SpaceShip{

    /**
     * constructor de la clase hija nave no tripulada
     * @param name nombre de la nave 
     * @param wheight peso de la nave
     * @param speed velocidad de la nave
     * @param typeFuel tipo de combustible
     */
    public RoboticShips(String name, double wheight, int speed, String typeFuel) {
        super(name, wheight, speed, typeFuel);
    }

    @Override
    public void speedShip() {
        this.speed = this.speed + 40;
    }

    @Override
    public void wheigthShip() {
        this.wheight = this.wheight;
    }


}
