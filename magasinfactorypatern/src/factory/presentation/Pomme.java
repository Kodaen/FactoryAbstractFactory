package factory.presentation;

public class Pomme implements Fruit {
    private boolean est_pourri;

    @Override
    public void etre_manger(Fruit pomme) {
        if (this.est_pourri){
            System.out.println("Vous ne pouvez pas manger des fruits pourris");
        }
        else {
            System.out.println("La pomme a été mangé");
            pomme = null;
        }
    }

    @Override
    public void pourrir() {
        System.out.println("je suis une pomme pourri !");
        this.est_pourri = true;
    }
}
