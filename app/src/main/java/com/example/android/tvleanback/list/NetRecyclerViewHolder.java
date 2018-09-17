//package com.example.android.tvleanback.list;
//
//import android.content.Context;
//import android.os.Bundle;
//import android.support.v4.app.FragmentManager;
//import android.support.v7.app.AppCompatActivity;
//import android.support.v7.widget.RecyclerView;
//import android.util.Log;
//import android.view.View;
//import android.widget.ImageView;
//import com.example.android.tvleanback.R;
//import com.example.android.tvleanback.list.data.Content;
//
//import java.util.ArrayList;
//
//
//public class NetRecyclerViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
//    public ImageView imageView;
//
//    private Context context;
//    private ArrayList<Content> contents;
//    public NetRecyclerViewHolder(View view, Context context, ArrayList<Content> contents){
//        super(view);
//        imageView = (ImageView) view.findViewById(R.id.network_imageview);
//        imageView.setOnClickListener(this);
//
//        this.context = context;
//        this.contents = contents;
//    }
//
//    @Override
//    public void onClick(View view){
//        try {
//            long mTimeStamp = System.currentTimeMillis();
//            NetImageDialogFragment netImageDialogFragment = new NetImageDialogFragment();
//            Bundle bundle = new Bundle();
//            bundle.putString("url",contents.get(getAdapterPosition()).getThumbnail());
//            bundle.putString("title",contents.get(getAdapterPosition()).getTitle());
//            bundle.putString("userNick",contents.get(getAdapterPosition()).getUserNick());
//            bundle.putString("viewCnt",contents.get(getAdapterPosition()).getViewCount());
//            bundle.putString("timeStamp",String.valueOf(mTimeStamp));
//
//            FragmentManager fragmentManager = ((AppCompatActivity)context).getSupportFragmentManager();
//            netImageDialogFragment.setArguments(bundle);
//            netImageDialogFragment.show(fragmentManager,"test");
//        }catch (Exception e){
//            e.printStackTrace();
//        }
//
//    }
//
//}
