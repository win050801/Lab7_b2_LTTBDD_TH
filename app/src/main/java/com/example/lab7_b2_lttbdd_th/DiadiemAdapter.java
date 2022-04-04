package com.example.lab7_b2_lttbdd_th;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;

import java.util.ArrayList;

public class DiadiemAdapter extends BaseAdapter {
    Context context;
    private int idLayout;
    private ArrayList<Diadiem> arrayList ;

    public DiadiemAdapter(Context context, int idLayout, ArrayList<Diadiem> arrayList) {
        this.context = context;
        this.idLayout = idLayout;
        this.arrayList = arrayList;
    }

    @Override
    public int getCount() {
        return arrayList.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        view = LayoutInflater.from(context).inflate(idLayout,viewGroup,false);
        TextView txt =view.findViewById(R.id.txtDiadiem);
        TextView txtstt = view.findViewById(R.id.txtStt);
        ConstraintLayout constraintLayout = view.findViewById(R.id.iditem);

        txt.setText(arrayList.get(i).getDiadiem());
        txtstt.setText(""+i+1);



        return view;
    }
}
