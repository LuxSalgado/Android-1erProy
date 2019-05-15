package android.example.shoppingdroid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public static final int TEXT_REQUEST = 1;
    private int numeroProducto = 0;
    TextView Producto1, Producto2, Producto3, Producto4, Producto5,
            Producto6, Producto7, Producto8, Producto9, Producto10;

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
        Intent intent = new Intent(this, AgregarProducto.class);
        startActivityForResult(intent, TEXT_REQUEST);
    }

    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        String textoProducto = data.getStringExtra(AgregarProducto.EXTRA_AGREGAR);
        if (requestCode == 1) {

            if (resultCode == RESULT_OK) {
                AsignarProductos(numeroProducto, textoProducto);
                numeroProducto++;
                Toast.makeText(getApplicationContext(), "Producto agregado exitosamente.", Toast.LENGTH_SHORT).show();
            } else
                Toast.makeText(getApplicationContext(), "No se selecciono un producto.", Toast.LENGTH_SHORT).show();


        }

    }

    private void AsignarProductos(int i, String texto) {

        switch (i) {
            case 0:
                Producto1.setText(texto);
                break;
            case 1:
                Producto2.setText(texto);
                break;
            case 2:
                Producto3.setText(texto);
                break;
            case 3:
                Producto4.setText(texto);
                break;
            case 4:
                Producto5.setText(texto);
                break;
            case 5:
                Producto6.setText(texto);
                break;
            case 6:
                Producto7.setText(texto);
                break;
            case 7:
                Producto8.setText(texto);
                break;
            case 8:
                Producto9.setText(texto);
                break;
            case 9:
                Producto10.setText(texto);
                break;
            default:
                Log.d("ERROR", "Capacidad máxima de productos");
        }

    }


}
