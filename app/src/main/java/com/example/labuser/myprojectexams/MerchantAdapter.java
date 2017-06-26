package com.example.labuser.myprojectexams;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by labuser on 26/06/2017.
 */

public class MerchantAdapter extends ArrayAdapter<Shop> {

    private ArrayList<Shop> merchants;
    private Context context;

    public MerchantAdapter(Context context, ArrayList<Shop> objects) {
        super(context, 0, objects);
        this.merchants = objects;
        this.context = context;
    }


    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View rowView = convertView;
        ViewHolder viewHolder;
        Shop m = merchants.get(position);

        if(rowView == null){
            LayoutInflater inflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            rowView = inflater.inflate(R.layout.list_listview_item, null);
            viewHolder = new ViewHolder(rowView);
            rowView.setTag(viewHolder);
        }
        else{
            viewHolder = (ViewHolder)rowView.getTag();
        }


        viewHolder.legalNameView.setText(m.getLegalName());
        viewHolder.alternateNameView.setText(m.getAlternateName());
        viewHolder.addressView.setText(m.getAddress());


        return  rowView;
    }

    static class ViewHolder {

        public final TextView legalNameView;
        public final TextView alternateNameView;
        public final TextView addressView;

        public ViewHolder(View view){

            legalNameView = (TextView)view.findViewById(R.id.list_item_merchant_legal_name);
            addressView = (TextView)view.findViewById(R.id.list_item_merchant_address);
            alternateNameView = (TextView)view.findViewById(R.id.list_item_merchant_alternateName);
        }
    }
}

