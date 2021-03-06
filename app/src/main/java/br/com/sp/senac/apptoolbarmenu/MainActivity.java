package br.com.sp.senac.apptoolbarmenu;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //variavel global

    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //apresentação do objeto java para objeto layout

        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

    //Inflamos o menu
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.menu_toolbar, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId()) {
            case R.id.mSalvar:
                Toast.makeText(getApplicationContext(),
                        "Cliquei no Salvar!!!",
                        Toast.LENGTH_SHORT).show();

                break;
            case R.id.mAlterar:
                Toast.makeText(getApplicationContext(),
                        "Cliquei no Alterar!!!",
                        Toast.LENGTH_SHORT).show();

                break;
            case R.id.mExcluir:
                Toast.makeText(getApplicationContext(),
                        "Cliquei no Excluir!!!",
                        Toast.LENGTH_SHORT).show();

                break;
            case R.id.mBuscar:
                Toast.makeText(getApplicationContext(),
                        "Cliquei no Buscar!!!",
                        Toast.LENGTH_SHORT).show();

                break;
            case R.id.mSair:
                Toast.makeText(getApplicationContext(),
                        "Cliquei no Sair!!!",
                        Toast.LENGTH_SHORT).show();

                break;
        }

        return super.onOptionsItemSelected(item);

    }
}
