package CreateShip;


/**
 * clase hija que extiende de la clase abstracta nave espacial
 * @author Jose Colina
 */
public class UnmannedShips extends SpaceShip {
    
    /**
     * constructor de la clase hija nave no tripulada
     * @param name nombre de la nave 
     * @param wheight peso de la nave
     * @param speed velocidad de la nave
     * @param typeFuel tipo de combustible
     */
    public UnmannedShips(String name, double wheight, int speed, String typeFuel) {
        /**
         *  acá obtenemos los atributos declarados en la clase abstracta
         */
        super(name, wheight, speed, typeFuel);
    }
    
    /**
     * Sobreescritura de metodos abstractos
     * acá se les da el comportamiento a los metodos
     */
    @Override
    public void speedShip() {
        this.speed = this.speed + 20;
    }

    @Override
    public void wheigthShip() {
        this.wheight = this.wheight;
    }
    
}
