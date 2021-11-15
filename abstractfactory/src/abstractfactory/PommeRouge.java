package abstractfactory;

public class PommeRouge implements Pomme{
    boolean est_pourri;

    public PommeRouge(boolean est_pourri){
        this.est_pourri = est_pourri;
    }

    @Override
    public void est_manger() {
        if (this.est_pourri){
            System.out.println("Vous ne pouvez pas manger un fruit pourri");
        }
        else{
            System.out.println("Vous avez mangé une pomme");
        }
    }

    @Override
    public void pourrir() {
        this.est_pourri = true;
    }
}
