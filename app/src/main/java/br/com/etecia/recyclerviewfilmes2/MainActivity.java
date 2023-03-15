package br.com.etecia.recyclerviewfilmes2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<Filmes> listaFilmes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Criando a base de dados para carregamento da lista de filmes
        listaFilmes = new ArrayList<>();

        listaFilmes.add(
                new Filmes("Interestelar",
                        "Sei la mano",
                        "Drama",
                        R.drawable.inter)
        );

        //Criando a classe adaptador e passando os parâmetros
        MyAdapter adapter = new MyAdapter(getApplicationContext(), );
    }
}