package abstractfactory;

public class PommeDoree implements Pomme {

    @Override
    public void est_manger() {
        System.out.println("Vous avez manger une pomme dorée, vous vous santez mieux maintenant");
    }

    @Override
    public void pourrir() {
        System.out.println("La pomme dorée ne pourri pas");
    }
}
