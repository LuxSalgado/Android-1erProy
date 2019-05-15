package android.example.shoppingdroid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class AgregarProducto extends AppCompatActivity {

    private String producto;
    public static final String EXTRA_AGREGAR = "com.example.android.shoppingdroid.extra.AGREGAR";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agregar_producto);

    }

    public void agregarAlCarrito(View view) {
        String agregar = view.getContentDescription().toString();
        Intent agregarIntent = new Intent();
        agregarIntent.putExtra(EXTRA_AGREGAR, agregar);
        setResult(RESULT_OK, agregarIntent);
        finish();
    }
}
