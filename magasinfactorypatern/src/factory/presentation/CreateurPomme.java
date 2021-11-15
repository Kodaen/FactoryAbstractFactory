package factory.presentation;

public class CreateurPomme extends CreateurFruit {
    @Override
    public Fruit fabrique(){
        return new Pomme();
    }
}
