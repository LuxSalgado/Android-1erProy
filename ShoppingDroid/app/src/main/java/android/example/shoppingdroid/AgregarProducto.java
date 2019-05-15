package android.example.shoppingdroid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class AgregarProducto extends AppCompatActivity {

    public static final String EXTRA_AGREGAR = "com.example.android.shoppingdroid.extra.AGREGAR";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agregar_producto);

    }
    /** Al hacer click en la imagen deseada se agrega el contentDescription en ella al intent y se manda el resultado*/
    public void agregarAlCarrito(View view) {
        String agregar = view.getContentDescription().toString();
        Intent agregarIntent = new Intent();
        agregarIntent.putExtra(EXTRA_AGREGAR, agregar);
        setResult(RESULT_OK, agregarIntent);
        finish();
    }
}
