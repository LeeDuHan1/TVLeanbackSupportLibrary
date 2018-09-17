//package com.example.android.tvleanback.list;
//
//import android.os.Bundle;
//import android.support.v17.leanback.app.BrowseFragment;
//import android.util.Log;
//import android.view.LayoutInflater;
//import android.view.View;
//import android.view.ViewGroup;
//import android.widget.Toast;
//
//import com.android.volley.Request;
//import com.android.volley.RequestQueue;
//import com.android.volley.Response;
//import com.android.volley.VolleyError;
//import com.example.android.tvleanback.R;
//import com.example.android.tvleanback.constant.AfApiUrl;
//import com.example.android.tvleanback.list.data.ApiResponse;
//import com.example.android.tvleanback.volley.MyGsonRequest;
//import com.example.android.tvleanback.volley.MyVolley;
//
//import java.util.ArrayList;
//
//public class LiveListFragment extends BrowseFragment{
//    private String TAG = this.getClass().getName();
//
//    @Override
//    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
//        View view = inflater.inflate(R.layout.tab1_fragment, container, false);
//
//
//        return view;
//    }
//
//    private void requestContentData(){
//        final RequestQueue requestQueue = MyVolley.getInstance(getActivity()).getRequestQueue();
//        MyGsonRequest<ApiResponse> myReq = new MyGsonRequest<ApiResponse>(this.getActivity(),
//                Request.Method.POST,
//                AfApiUrl.Content.URL_LIVE,
//                ApiResponse.class,
//                networkSuccessListener(),
//                networkErrorListener());
//    }
//
//    private Response.Listener<ApiResponse> networkSuccessListener(){
//        final String TAG = "networkSuccesListner";
//        return new Response.Listener<ApiResponse>() {
//            @Override
//            public void onResponse(ApiResponse response) {
//                String result = null;
//                ArrayList<String> str = new ArrayList<>();
//                if (response != null) {
//                    int count = response.getData().getGroups().get(0).size();
//                    for(int i=0; i< count;i++) {
//                        recyclerAdapter.dataAdd(i,response.getData().getGroups().get(0).getContents().get(i));
//                        recyclerAdapter.notifyItemInserted(i);
//                    }
//                    Log.d("TITLE",String.valueOf(response.getData().getGroups().get(0).getContents()));
//                }
//            }
//        };
//    }
//
//    private Response.ErrorListener networkErrorListener(){
//        return new Response.ErrorListener() {
//            @Override
//            public void onErrorResponse(VolleyError error) {
//                Toast.makeText(getContext(), "network error", Toast.LENGTH_SHORT).show();
//            }
//        };
//    }
//}
