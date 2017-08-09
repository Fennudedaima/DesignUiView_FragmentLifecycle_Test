package com.hujiang.designsupportlibrarydemo;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class ListFragment1 extends Fragment {

    private RecyclerView mRecyclerView;
    private Log L;

    @Override
    public void setUserVisibleHint(boolean isVisibleToUser) {
        L.v(TAG, "setUserVisibleHint " + isVisibleToUser);
    }
    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        L.v(TAG, "onAttach");
    }
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        L.v(TAG, "onCreate");
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        mRecyclerView =(RecyclerView) inflater.inflate(R.layout.list_fragment, container, false);
        L.v(TAG, "onCreateView");
        return mRecyclerView;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(mRecyclerView.getContext()));
        mRecyclerView.setAdapter(new RecyclerViewAdapter(getActivity()));
        L.v(TAG,"onActivityCreated");
    }

    private static final String TAG = "Fragment1";



    @Override
    public void onStart() {
        super.onStart();
        L.v(TAG, "onStart");
    }



    @Override
    public void onResume() {
        super.onResume();
        L.v(TAG, "onResume");
    }

    @Override
    public void onPause() {
        super.onPause();
        L.v(TAG,"onPause");
    }

    @Override
    public void onStop() {
        super.onStop();
        L.v(TAG, "onStop");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        L.v(TAG, "onDestroy");
    }@Override
    public void onDestroyView() {
        super.onDestroyView();
        L.v(TAG, "onDestroyView");
    }

    @Override
    public void onDetach() {
        super.onDetach();
        L.v(TAG, "onDetach");
    }
}
