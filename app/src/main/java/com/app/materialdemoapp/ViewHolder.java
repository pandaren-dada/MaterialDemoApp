package com.app.materialdemoapp;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by Dll HuaiKhwang on 17/11/2560.
 */

public class ViewHolder extends RecyclerView.ViewHolder {

    public ImageView image;
    public TextView name, desc;
    public LinearLayout mLinearLayout;

    public ViewHolder(View itemView) {
        super(itemView);

        image = (ImageView)itemView.findViewById(R.id.imageView_id);
        name = (TextView)itemView.findViewById(R.id.name_text);
        desc = (TextView)itemView.findViewById(R.id.desc_text);
        mLinearLayout = (LinearLayout)itemView.findViewById(R.id.recyclerItem_id);
    }
}
