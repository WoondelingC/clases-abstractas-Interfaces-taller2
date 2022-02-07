package CreateShip;

import javax.swing.JOptionPane;

/**
 *
 * @author Jose Colina
 */
public class CreateShip {

    static SpaceShip space1;

    static void ShipOption(int opt) {
        switch (opt) {
            case 1 -> {
                space1 = new UnmannedShips("", 0, 0, "");
               
            }
            case 2 -> {
                space1 = new MannedShips("", 0, 0, "");
                
            }
            case 3 ->{
                space1 = new ShuttleVehicles("", 0, 0, "");
                
            }
            case 4 -> {
                space1 = new RoboticShips("", 0, 0, "");
                
            }
            default ->
                System.out.println("Buen Viaje, Adios");
        }

        space1.name = JOptionPane.showInputDialog("Ingrese el nombre de su nave");
        space1.speed = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la velocidad"));
        space1.wheight = Integer.parseInt(JOptionPane.showInputDialog("ingrese el peso de la nave"));
        space1.typeFuel = JOptionPane.showInputDialog("ingrese el tipo de combustible que usa");

        space1.speedShip();
        space1.wheigthShip();
        System.out.println("""
                            Su nave fue creada con exito
                            """ + space1.description());

    }

    ;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int option = 0;

        while (option < 5) {

            String ship = JOptionPane.showInputDialog("""
                                                      Crear una nave: 
                                                       1- Nave no tripulada 
                                                       2- Nave tripulada
                                                       3- Nave lanzadora
                                                       4- Nave robotica
                                                       5- Salir""");
            option = Integer.parseInt(ship);

            if (option < 5) {
                ShipOption(option);
            }

        }

    }

}
