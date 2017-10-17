package com.example.user.recycleviewmvp1;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by user on 10/17/2017.
 */

public class MainActivityAdapter extends RecyclerView.Adapter<MainActivityAdapter.ViewHolder> {

    //private Context mContext;
    //private String[] mList;

    private List<Person> feedItemList;
    private Context mContext;


    public MainActivityAdapter(Context context, List<Person> feedItemList) {
        this.feedItemList = feedItemList;
        this.mContext = context;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View itemView = inflater.inflate(R.layout.adapter_layout, parent, false);
        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, final int position) {
        //holder.titleTextView.setText(mList[position]);
        final Person feedItem = feedItemList.get(position);

        holder.nameLastname.setText("  "+feedItem.getId()+"  "+feedItem.getEmri()+" "+feedItem.getMbiemri());

    }


    @Override
    public int getItemCount() {
        return (null != feedItemList ? feedItemList.size() : 0);
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{
        private TextView nameLastname;


        public ViewHolder(View itemView) {
            super(itemView);
            nameLastname = (TextView) itemView.findViewById(R.id.nameLastname);

        }
    }
}