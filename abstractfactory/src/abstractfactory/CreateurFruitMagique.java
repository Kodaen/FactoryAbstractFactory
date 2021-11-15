package abstractfactory;

public class CreateurFruitMagique implements Createur {

    @Override
    public Pomme creationPomme() {
        return new PommeDoree();
    }

    @Override
    public Orange creationOrange() {
        return new OrangeMagique();
    }
}