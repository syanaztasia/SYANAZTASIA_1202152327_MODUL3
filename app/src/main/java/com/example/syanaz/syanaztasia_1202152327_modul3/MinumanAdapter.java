package com.example.syanaz.syanaztasia_1202152327_modul3;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class MinumanAdapter extends RecyclerView.Adapter<MinumanAdapter.MinumanViewHolder>{

    public ArrayList<ItemMinuman> datas;
   // membuat adapter untuk mengatur data agar ditampilkan dalam recyclreview sbg single item
    public MinumanAdapter(ArrayList<ItemMinuman> datas) {
        this.datas = datas;


        Log.d("JUMLAH_ARRAYLIST","Items: "+getItemCount());
    }

    @Override
    public MinumanViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        //layout inflater digunakan untuk membuat java object view dari layout yang kita buat di xml.
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.activity_minuman_adapter, parent, false);
        return new MinumanViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MinumanViewHolder holder, int position) {
        final ItemMinuman item = datas.get(position);
        holder.bindTo(item);
//memberikan Listener kepada Button untuk menangkap event pada saat Button di klik
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent go = new Intent(view.getContext().getApplicationContext(),DetailMenu.class);
                go.putExtra("etitle",item.getNama());
                go.putExtra("edesc",item.getDeskripsi());
                go.putExtra("eimg",item.getGambar());
                view.getContext().startActivity(go);
            }
        });
    }

    @Override
    public int getItemCount() {
        return datas.size();
    }
    //menggunakan viewholder untuk menyimpan referensi dari view2 yang sudah dibuat pada item minuman
    class MinumanViewHolder extends RecyclerView.ViewHolder{

        private TextView mMinumanTitle;
        private TextView mMinumanInfo;
        private ImageView mMinumanImg;
        private Context mContext;
        private ItemMinuman mCurrentMinuman;

        public MinumanViewHolder(View itemView) {
            super(itemView);
            mMinumanTitle = (TextView)itemView.findViewById(R.id.itemTitle);
            mMinumanInfo = (TextView)itemView.findViewById(R.id.itemDeskripsi);
            mMinumanImg = (ImageView)itemView.findViewById(R.id.itemImg);
        }

        public void bindTo(ItemMinuman minuman){
            mCurrentMinuman = minuman;
            mMinumanImg.setImageResource(minuman.getGambar());
            mMinumanTitle.setText(minuman.getNama());
            mMinumanInfo.setText(minuman.getInfo());
        }
    }
}
