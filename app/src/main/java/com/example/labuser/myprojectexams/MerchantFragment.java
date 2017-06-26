package com.example.labuser.myprojectexams;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by labuser on 26/06/2017.
 */

public class MerchantFragment extends Fragment {

    MerchantAdapter merchantAdapter;

    public MerchantFragment() {

    }

    @Override
    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
    }

    @Override
    public void onStart() {
        super.onStart();
        fetchMerchants();
    }

    private void fetchMerchants(){
        FetchMerchantsTask fetchMerchantsTask = new FetchMerchantsTask(merchantAdapter);
        fetchMerchantsTask.execute();
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_main, container, false);
        merchantAdapter = new MerchantAdapter(getActivity(),new ArrayList<Shop>());
        ListView merchantListView = (ListView)rootView.findViewById(R.id.listview_merchants);
        merchantListView.setAdapter(merchantAdapter);

        return rootView;
    }

}