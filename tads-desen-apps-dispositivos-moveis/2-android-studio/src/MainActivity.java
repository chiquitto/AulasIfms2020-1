import android.util.Log;

class MainActivity {
  private static final String TAG = "principal";

  public void onCreate(Bundle savedInstance) {
    super.onCreate(savedInstance);
    setContentView(R.layout.activity_main_activity);

    Log.v(TAG, "Log de verbose");
    Log.d(TAG, "Log de debug");
    Log.i(TAG, "Log de informação");
    Log.w(TAG, "Log de aviso (warning)");
    Log.e(TAG, "Log de erro", new  RuntimeException("mensagem de erro"));
  }
}
