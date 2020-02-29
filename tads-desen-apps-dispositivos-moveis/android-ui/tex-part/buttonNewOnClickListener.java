class MainActivity {

    // Criar uma implementação anonima de OnClickListener
    private OnClickListener clickListener = new OnClickListener() {
        public void onClick(View v) {
        // fazer algumas coisa quando o botão for clicado
        }
    };

    protected void onCreate(Bundle savedInstanceState) {
        // Capturar o botão do layout
        Button button = (Button)findViewById(R.id.botao);

        // Registrar o listener onClick no botão
        button.setOnClickListener(clickListener);
    }

}