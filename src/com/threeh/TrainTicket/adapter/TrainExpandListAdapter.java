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
    private String[] mHighSpeedPrice = new String[2];
    private String[] mNormalPrice = new String[4];
    private String[] mHighSpeedNumber = new String[2];
    private String[] mNormalNumber = new String[4];

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
        if(data.get(groupPosition).isChecked()){
            convertView.setBackgroundResource(R.drawable.list_item_focus);
        }else {
            convertView.setBackgroundResource(R.drawable.list_item_unfocus);
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

            setNoticket(holder.btnBook,mHighSpeedNumber[childPosition]);
        }else {
            holder.ticketType.setText(mNormalSeatType[childPosition]);
            holder.ticketNumber.setText(mNormalNumber[childPosition]);
            holder.ticketPrice.setText(mNormalPrice[childPosition]);

            setNoticket(holder.btnBook,mNormalNumber[childPosition]);
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
     * 初始化拓展项要显示的数据
     */
    private void initChildData(int groupPosition){
        if(isHighSpeed(groupPosition)){
            if(data.get(groupPosition).getRz2Ok() == 0){
                mHighSpeedNumber[0] = "余票:" + String.valueOf(data.get(groupPosition).getRz2Yp());
                mHighSpeedPrice[0] = "￥" + String.valueOf(data.get(groupPosition).getRz2());
            }else {
                mHighSpeedNumber[0] = "-";
                mHighSpeedPrice[0] = "-";
            }
            if(data.get(groupPosition).getRz1Ok() == 0){
                mHighSpeedNumber[1] = "余票:" + String.valueOf(data.get(groupPosition).getRz1Yp());
                mHighSpeedPrice[1] = "￥" + String.valueOf(data.get(groupPosition).getRz1());
            }else {
                mHighSpeedNumber[1] = "-";
                mHighSpeedPrice[1] = "-";
            }
        }else{
            if(data.get(groupPosition).getYzOk() == 0){
                mNormalNumber[0] = "余票:" + String.valueOf(data.get(groupPosition).getYzYp());
                mNormalPrice[0] = "￥" + String.valueOf(data.get(groupPosition).getYz());
            }else {
                mNormalNumber[0] = "-";
                mNormalPrice[0] = "-";
            }
            if(data.get(groupPosition).getRzOk() == 0){
                mNormalNumber[1] = "余票:" + String.valueOf(data.get(groupPosition).getRzYp());
                mNormalPrice[1] = "￥" + String.valueOf(data.get(groupPosition).getRz());
            }else {
                mNormalNumber[1] = "-";
                mNormalPrice[1] = "-";
            }
            if(data.get(groupPosition).getYwsOk() == 0 || data.get(groupPosition).getYwzOk() == 0 ||
                    data.get(groupPosition).getYwxOk() == 0){
                mNormalNumber[2] = "余票:" + String.valueOf(data.get(groupPosition).getYwYp());
                mNormalPrice[2] = "￥" + String.valueOf(data.get(groupPosition).getYws());
            }else {
                mNormalNumber[2] = "-";
                mNormalPrice[2] = "-";
            }
            if(data.get(groupPosition).getRwsOk() == 0 || data.get(groupPosition).getRwxOk() == 0){
                mNormalNumber[3] = "余票:" + String.valueOf(data.get(groupPosition).getRwYp());
                mNormalPrice[3] = "￥" + String.valueOf(data.get(groupPosition).getRws());
            }else {
                mNormalNumber[3] = "-";
                mNormalPrice[3] = "-";
            }
        }
    }

    /**
     * 显示无票
     * @param button
     */
    private void setNoticket(Button button,String number){
        if("-" .equals(number)){
            button.setBackgroundResource(R.drawable.no_ticket);
            button.setText("无票");
            button.setTextColor(R.color.gray);
        }else {
            button.setBackgroundResource(R.drawable.book);
            button.setText("预定");
            button.setTextColor(android.R.color.white);
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
