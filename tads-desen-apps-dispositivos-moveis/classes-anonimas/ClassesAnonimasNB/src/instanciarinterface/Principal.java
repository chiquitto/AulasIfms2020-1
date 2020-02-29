package instanciarinterface;

public class Principal {

    public static void main(String[] args) {
        
        Botao b = new Botao(){
            @Override
            public void clique() {
                System.out.println("Acao padrao");
            }
        };
        b.clique();

        //exemplo1();
        //exemplo2();
        //exemplo3();

    }

    private static void exemplo1() {
        Botao b = new Botao();
        b.setManipulador(new MeuBotaoManipulador());

        // Usuario clica no botao
        b.clique();
        b.cliqueLongo();
    }

    private static void exemplo2() {
        Botao b = new Botao();

        ManipuladorClique m = new ManipuladorClique() {
            public void manipularClique() {
                System.out.println("Clique!!");
            }

            public void manipularCliqueLongo() {
                System.out.println("Clique longo!!");
            }
        };

        b.setManipulador(m);

        // Usuario clica no botao
        b.clique();
        b.cliqueLongo();
    }

    private static void exemplo3() {
        Botao b = new Botao();

        b.setManipulador(new ManipuladorClique() {
            public void manipularClique() {
                System.out.println("Clique!!");
            }

            public void manipularCliqueLongo() {
                System.out.println("Clique longo!!");
            }
        });

        // Usuario clica no botao
        b.clique();
        b.cliqueLongo();
    }

}
