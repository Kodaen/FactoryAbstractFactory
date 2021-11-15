package abstractfactory;

public class CreateurFruitNormal implements Createur{

    @Override
    public Pomme creationPomme() {
        return new PommeRouge(false);
    }

    @Override
    public Orange creationOrange() {
        return new OrangeSanguine(false);
    }
}
