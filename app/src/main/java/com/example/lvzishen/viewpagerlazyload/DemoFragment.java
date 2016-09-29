package com.example.lvzishen.viewpagerlazyload;


import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;


/**
 * A simple {@link Fragment} subclass.
 * Use the {@link DemoFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class DemoFragment extends BasePagerFragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";
    private  String TAG="";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    ImageView imageview;

    public DemoFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment DemoFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static DemoFragment newInstance(String param1, String param2) {
        DemoFragment fragment = new DemoFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.e(TAG,"onCreate");
    }
    @Override
    public void setUserVisibleHint(boolean isVisibleToUser) {
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
        if(mParam1.equals("0")){
            TAG="0";
        }else if(mParam1.equals("1")){
            TAG="1";
        }else {
            TAG="2";
        }
        Log.e(TAG,"isVisibleToUser"+isVisibleToUser);
        super.setUserVisibleHint(isVisibleToUser);
    }

//    @Override
//    protected void prepareFetchData(boolean forceUpdate) {
//        super.prepareFetchData(true);
//    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        Log.e(TAG,"onCreateView");
        View view = inflater.inflate(R.layout.fragment_demo, container, false);
        imageview = (ImageView) view.findViewById(R.id.imageview);
        return view;
    }

//    @Override
//    protected void prepareFetchData(boolean forceUpdate) {
//        super.prepareFetchData(true);
//    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Log.e(TAG,"onActivityCreated");
    }


    @Override
    public void loadData() {
        imageview.setImageResource(R.mipmap.ic_launcher);
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
        if(mParam1.equals("0")){
            TAG="0";
        }else if(mParam1.equals("1")){
            TAG="1";
        }else {
            TAG="2";
        }
        mActivity = (AppCompatActivity) context;
        Log.e(TAG,"onAttach");
    }


    @Override
    public void onStart() {
        super.onStart();
        Log.e(TAG,"onStart");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.e(TAG,"onStop");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.e(TAG,"onDestroyView");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.e(TAG,"onDestroy");
    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.e(TAG,"onDetach");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.e(TAG,"onResume");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.e(TAG,"onPause");
    }
}
