public class CoffeeMachine {

    static String espreso = "You have enough money for Espreso.";
    static String macchiato = "You have enough money for Macchiato.";
    static String caffeLatte = "You have enough money for CaffeLatte.";
    static String cappuchino = "You have enough money for Cappuchino.";

    public static String thePriceForCoffee(int numPoints) {


        if (numPoints < 80) {
            throw new IllegalArgumentException("You don't have enough money for coffee.");
        }
        else if (numPoints >= 80 & numPoints < 100) {
            return espreso;
        }
        else if (numPoints >= 100 && numPoints < 150) {
            return macchiato;
        } 
        else if (numPoints >= 150 && numPoints < 170) {
            return caffeLatte;
        }
        else if (numPoints >= 170) {
            return cappuchino;
        }
        return null;
        
    }
}
