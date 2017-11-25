package com.app.materialdemoapp.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.app.materialdemoapp.R;
import com.app.materialdemoapp.User;
import com.app.materialdemoapp.ViewHolder;

import java.util.List;

/**
 * Created by Dll HuaiKhwang on 17/11/2560.
 */

public class RecyclerAdapter extends RecyclerView.Adapter<ViewHolder> {

    private List<User> users;
    private Context mContext;

    public RecyclerAdapter(Context context, List<User> users) {
        this.users = users;
        mContext = context;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, final int position) {

        User sampleuser = users.get(position);

        holder.name.setText(sampleuser.userName);
        holder.desc.setText(sampleuser.userDesc);
        holder.image.setImageResource(sampleuser.userImg);
        holder.mLinearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(mContext, "item" + position + "clicked", Toast.LENGTH_SHORT).show();
            }
        });

    }

    @Override
    public int getItemCount() {
        return users.size();
    }
}
