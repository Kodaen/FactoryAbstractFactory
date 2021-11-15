package abstractfactory;

public class Utilisateur {


    public static void main(String args[]){
        CreateurFruitMagique createurFruitMagique = new CreateurFruitMagique();
        CreateurFruitNormal createurFruitNormal = new CreateurFruitNormal();

        Pomme pommeDoree = new CreateurFruitMagique().creationPomme();
        Pomme pommeRouge = new CreateurFruitNormal().creationPomme();

        pommeDoree.est_manger();
        pommeRouge.est_manger();

        Orange orangeSanguine = createurFruitNormal.creationOrange();
        Orange orangeMagique = createurFruitMagique.creationOrange();

        orangeSanguine.pourrir();
        orangeMagique.pourrir();

        orangeSanguine.est_manger();
        orangeMagique.est_manger();


    }
}
