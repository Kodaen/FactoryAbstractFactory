package factory.presentation;

public class Utilisateur {
    public static void main(String args[]){
        CreateurOrange createurOrange = new CreateurOrange();
        CreateurPomme createurPomme = new CreateurPomme();

        Fruit pomme = createurPomme.fabrique();
        Fruit orange = createurOrange.fabrique();

        pomme.pourrir();
        orange.etre_manger(orange);
        pomme.etre_manger(pomme);
    }
}