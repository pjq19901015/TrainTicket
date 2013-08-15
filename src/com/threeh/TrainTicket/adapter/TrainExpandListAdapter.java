package com.threeh.trainticket.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.Button;
import android.widget.TextView;
import com.threeh.trainticket.R;
import com.threeh.trainticket.entity.DGTicketPrice;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: pjq
 * Date: 13-8-15
 * Time: 下午2:44
 * To change this template use File | Settings | File Templates.
 */
public class TrainExpandListAdapter extends BaseExpandableListAdapter {
    private List<DGTicketPrice> data;
    private LayoutInflater mInflater;
    private Context mContext;
    private String[] mHighSpeedSeatType = new String[]{"二等座","一等座"};
    private String[] mNormalSeatType =  new String[]{"硬座","软座","硬卧","软卧"};
    private String[] mHighSpeedPrice;
    private String[] mNormalPrice;
    private String[] mHighSpeedNumber;
    private String[] mNormalNumber;

    public TrainExpandListAdapter(Context context, List<DGTicketPrice> data) {
        this.data = data;
        mInflater = LayoutInflater.from(context);
        this.mContext = context;
    }

    @Override
    public int getGroupCount() {
        return data.size();
    }

    @Override
    public int getChildrenCount(int groupPosition) {
        if(isHighSpeed(groupPosition)){
            return 2;
        }
        return 4;
    }

    @Override
    public Object getGroup(int groupPosition) {
        return data.get(groupPosition);
    }

    @Override
    public Object getChild(int groupPosition, int childPosition) {
        return null;
    }

    @Override
    public long getGroupId(int groupPosition) {
        return groupPosition;
    }

    @Override
    public long getChildId(int groupPosition, int childPosition) {
        return childPosition;
    }

    @Override
    public boolean hasStableIds() {
        return true;
    }

    @Override
    public View getGroupView(int groupPosition, boolean isExpanded, View convertView, ViewGroup parent) {
        ViewHolder holder;
        if (convertView == null) {
            holder = new ViewHolder();
            convertView = this.mInflater.inflate(R.layout.train_list_item, null);
            holder.number = (TextView) convertView.findViewById(R.id.train_list_item_txt_number);
            holder.type = (TextView) convertView.findViewById(R.id.train_list_item_txt_type);
            holder.startCity = (TextView) convertView.findViewById(R.id.train_list_item_txt_startcity);
            holder.endCity = (TextView) convertView.findViewById(R.id.train_list_item_txt_endcity);
            holder.startTime = (TextView) convertView.findViewById(R.id.train_list_item_txt_starttime);
            holder.endTime = (TextView) convertView.findViewById(R.id.train_list_item_txt_endtime);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }
        holder.number.setText(data.get(groupPosition).getTrainCode());
        holder.type.setText(data.get(groupPosition).getTrainType());
        holder.startCity.setText(data.get(groupPosition).getStartCity());
        holder.endCity.setText(data.get(groupPosition).getEndCity());
        holder.startTime.setText(data.get(groupPosition).getStartTime());
        holder.endTime.setText(data.get(groupPosition).getEndTime());
        initChildData(groupPosition);
        return convertView;
    }

    @Override
    public View getChildView(int groupPosition, int childPosition, boolean isLastChild, View convertView, ViewGroup parent) {
        ChildViewHolder holder;
        if (convertView == null) {
            holder = new ChildViewHolder();
            convertView = this.mInflater.inflate(R.layout.expand_item, null);
            holder.ticketType = (TextView) convertView.findViewById(R.id.expand_item_txt_ticket_type);
            holder.ticketNumber =
                    (TextView) convertView.findViewById(R.id.expand_item_txt_ticket_number);
            holder.ticketPrice = (TextView) convertView.findViewById(R.id.expand_item_txt_ticket_price);
            holder.btnBook = (Button) convertView.findViewById(R.id.expand_item_btn_book);
            convertView.setTag(holder);
        } else {
            holder = (ChildViewHolder) convertView.getTag();
        }
        if(isHighSpeed(groupPosition)){
            holder.ticketType.setText(mHighSpeedSeatType[childPosition]);
            holder.ticketNumber.setText(mHighSpeedNumber[childPosition]);
            holder.ticketPrice.setText(mHighSpeedPrice[childPosition]);
        }else {
            holder.ticketType.setText(mNormalSeatType[childPosition]);
            holder.ticketNumber.setText(mNormalNumber[childPosition]);
            holder.ticketPrice.setText(mNormalPrice[childPosition]);
        }
        return convertView;
    }

    @Override
    public boolean isChildSelectable(int groupPosition, int childPosition) {
        return true;
    }

    /**
     * 判断该火车是否是动车组或者是高铁
     * @return
     */
    private boolean isHighSpeed(int groupPosition){
        String trainType = data.get(groupPosition).getTrainType();
        if(trainType.equals("高速动车") || trainType.equals("动车组")){
            return true;
        }
        return  false;
    }

    /**
     *初始化拓展项要显示的数据
     */
    private void initChildData(int groupPosition){
        if(isHighSpeed(groupPosition)){
            mHighSpeedNumber = new String[]{ String.valueOf(data.get(groupPosition).getRz2Yp()),
                                    String.valueOf(data.get(groupPosition).getRz1Yp())};
            mHighSpeedPrice = new String[]{ String.valueOf(data.get(groupPosition).getRz2()),
                                   String.valueOf(data.get(groupPosition).getRz1())};
        }else{
            mNormalNumber = new String[]{ String.valueOf(data.get(groupPosition).getYzYp()),
                                    String.valueOf(data.get(groupPosition).getRzYp()),
                                    String.valueOf(data.get(groupPosition).getYwYp()),
                                    String.valueOf(data.get(groupPosition).getRwYp())};
            mNormalPrice = new String[]{ String.valueOf(data.get(groupPosition).getYz()),
                                   String.valueOf(data.get(groupPosition).getRz()),
                                   String.valueOf(data.get(groupPosition).getYws()),
                                   String.valueOf(data.get(groupPosition).getRws())};
        }
    }

    class ViewHolder {
        TextView number;
        TextView type;
        TextView startCity;
        TextView endCity;
        TextView startTime;
        TextView endTime;
    }
    class ChildViewHolder{
        TextView ticketType;
        TextView ticketNumber;
        TextView ticketPrice;
        Button btnBook;
    }
}
