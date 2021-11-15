package factory.presentation;

public class CreateurOrange extends CreateurFruit {
    @Override
    public Fruit fabrique(){
        return new Orange();
    }
}
