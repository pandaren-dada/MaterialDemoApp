package com.app.pandarendemoapp;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Dll HuaiKhwang on 17/11/2560.
 */

public class ViewHolder extends RecyclerView.ViewHolder {

    ImageView image;
    TextView name, desc;

    public ViewHolder(View itemView) {
        super(itemView);

        image = (ImageView)itemView.findViewById(R.id.imageView_id);
        name = (TextView)itemView.findViewById(R.id.name_text);
        desc = (TextView)itemView.findViewById(R.id.desc_text);
    }
}
