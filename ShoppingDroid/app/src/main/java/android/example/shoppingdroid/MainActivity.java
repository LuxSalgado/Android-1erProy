package android.example.shoppingdroid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public static final int TEXT_REQUEST = 1;
    TextView Producto1, Producto2, Producto3, Producto4, Producto5,
             Producto6, Producto7, Producto8,Producto9, Producto10;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Init();
    }

    private void Init() {

        Producto1 = findViewById(R.id.Prod1);
        Producto2 = findViewById(R.id.Prod2);
        Producto3 = findViewById(R.id.Prod3);
        Producto4 = findViewById(R.id.Prod4);
        Producto5 = findViewById(R.id.Prod5);
        Producto6 = findViewById(R.id.Prod6);
        Producto7 = findViewById(R.id.Prod7);
        Producto8 = findViewById(R.id.Prod8);
        Producto9 = findViewById(R.id.Prod9);
        Producto10 = findViewById(R.id.Prod10);

    }

    public void abrirAgregarProducto(View view) {
        Intent intent = new Intent (this, AgregarProducto.class);
        startActivityForResult (intent, TEXT_REQUEST);
    }

    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == 1) {

            if (resultCode == RESULT_OK) {
                    /**AsignarProductos();*/
                } else
                    Toast.makeText(getApplicationContext(), "No se selecciono un producto.", Toast.LENGTH_SHORT).show();


        }

    }




}
