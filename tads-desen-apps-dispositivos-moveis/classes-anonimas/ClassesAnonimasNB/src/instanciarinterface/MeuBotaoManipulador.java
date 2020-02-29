package instanciarinterface;

public class MeuBotaoManipulador implements ManipuladorClique {

    @Override
    public void manipularClique() {
        System.out.println("Clique!!");
    }

    @Override
    public void manipularCliqueLongo() {
        System.out.println("Clique longo!!");
    }
    
}
