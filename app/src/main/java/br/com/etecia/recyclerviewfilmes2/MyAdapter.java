package br.com.etecia.recyclerviewfilmes2;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {

    private Context mContexto;
    private List<Filmes> lstFilmes;

    //Criando o construtor da classe com parâmetros


    public MyAdapter(Context mContexto, List<Filmes> lstFilmes) {
        this.mContexto = mContexto;
        this.lstFilmes = lstFilmes;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {


    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView Titulo;
        ImageView Imagem;
        CardView Card;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            Titulo = itemView.findViewById(R.id.idTituloFilme);
            Imagem = itemView.findViewById(R.id.idImgFilme);
            Card = itemView.findViewById(R.id.idCardFilmes);
        }
    }


}
