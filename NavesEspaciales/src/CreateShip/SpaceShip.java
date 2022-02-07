
package CreateShip;

/**
 * Clase abstracta donde se declaran los metodos
 * y atributos usados por sus clases hijas
 * @author Jose Colina
 */
public abstract class SpaceShip implements ISpaceShip {
    /**
     * Se crean los atributos a utilizar por las clases hijas
     */
    public String name;
    public double wheight;
    public int speed;
    protected String typeFuel;
    
   /**  
    * Se crea el constructor inicializando los atributos
    * @param name nombre de la nave
    * @param wheight peso de la nave
    * @param speed velocidad de la nave
    * @param typeFuel tipo de combustible usado por la nave
    */
    public SpaceShip(String name, double wheight, int speed, String typeFuel) {
        this.name = name;
        this.wheight = wheight;
        this.speed = speed;
        this.typeFuel = typeFuel;
    }
    
    /**
     * metodo abstracto
     */
    abstract public void speedShip();
    
    /**
     * metodos get y set de la velocidad de la nave 
     * @return retornan la velocidad de la nave
     */
    public int getPower() {
        return speed;
    }

    public void setPower(int speed) {
        this.speed = speed;
    }
    
    /**
     * metodo para obtener de la información de la nave creada
     * @return retorna la informacion de la nave
     */
    public String description() {
        return "Nombre: " + name +
                "\n" + "Velocidad: " + speed + " m/s" +
                "\n" + "Peso: " + wheight + " Ton" +
                "\n" + "Tipo de Combustible: " + typeFuel;
    }
    
}
