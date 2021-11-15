package abstractfactory;

public class OrangeMagique implements Orange{

    @Override
    public void est_manger() {
        System.out.println("Vous avez manger une orange magique");
    }

    @Override
    public void pourrir() {
        System.out.println("L'orange magique ne peut pas pourrir");
    }
}
