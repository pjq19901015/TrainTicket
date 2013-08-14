package com.threeh.trainticket.adapter;

import android.content.Context;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.threeh.trainticket.R;
import com.threeh.trainticket.entity.DGTicketPrice;
import com.threeh.trainticket.entity.Train;

import java.util.List;


public class TrainListAdapter extends BaseAdapter {

    private List<DGTicketPrice> data;
    private LayoutInflater mInflater;
    private Context context;


    public TrainListAdapter(Context context, List<DGTicketPrice> data) {
        this.data = data;
        mInflater = LayoutInflater.from(context);
        this.context = context;
    }

    @Override
    public int getCount() {
        return data.size();
    }

    @Override
    public Object getItem(int position) {
        return data.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;
        if (convertView == null) {
            holder = new ViewHolder();
            convertView = this.mInflater.inflate(R.layout.train_list_item, null);
            holder.number = (TextView) convertView.findViewById(R.id.train_list_item_txt_number);
            holder.type = (TextView) convertView.findViewById(R.id.train_list_item_txt_type);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }
            holder.number.setText(data.get(position).getTrainCode());
            holder.type.setText(data.get(position).getTrainType());
        return convertView;
    }

    public class ViewHolder {
        TextView number;
        TextView type;
    }
}
