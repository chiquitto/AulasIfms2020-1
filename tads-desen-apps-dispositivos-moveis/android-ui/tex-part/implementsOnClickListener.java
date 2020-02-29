// Implementar interface do listener
public class ExampleActivity extends Activity
implements OnClickListener {

  protected void onCreate(Bundle savedInstanceState) {
    Button button = (Button)findViewById(R.id.botao);
    button.setOnClickListener(this);
  }

  // Implementar o callback (método) do listener
  public void onClick(View v) {
    // filtrar pelo ID dos componentes
    switch (v.getId()) {
      case R.id.botao:
      // faça alguma coisa aqui
      break;
    }
  }
}