package factory.presentation;

public class Orange implements Fruit {
    private boolean est_pourri;
    //On est obligé d'utilisé fruit et pas Orange
    @Override
    public void etre_manger(Fruit orange) {
        if (this.est_pourri){
            System.out.println("Vous ne pouvez pas manger des fruits pourris");
        }
        else {
            System.out.println("L'orange a été mangé");
            orange = null;
        }
    }

    @Override
    public void pourrir() {
        System.out.println("Je suis une orange pourri");
        this.est_pourri = true;
    }
}
