package instanciarinterface;

public class Botao {
    
    private ManipuladorClique manipulador;

    public void setManipulador(ManipuladorClique manipulador) {
        this.manipulador = manipulador;
    }
    
    public void clique() {
        manipulador.manipularClique();
    }
    
    public void cliqueLongo() {
        manipulador.manipularCliqueLongo();
    }
    
}
