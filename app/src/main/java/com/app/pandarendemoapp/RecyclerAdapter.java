package com.app.pandarendemoapp;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

/**
 * Created by Dll HuaiKhwang on 17/11/2560.
 */

public class RecyclerAdapter extends RecyclerView.Adapter<ViewHolder> {

    private List<User> users;

    public RecyclerAdapter(List<User> users) {
        this.users = users;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

        User sampleuser = users.get(position);

        holder.name.setText(sampleuser.userName);
        holder.desc.setText(sampleuser.userDesc);
        holder.image.setImageResource(sampleuser.userImg);

    }

    @Override
    public int getItemCount() {
        return users.size();
    }
}
