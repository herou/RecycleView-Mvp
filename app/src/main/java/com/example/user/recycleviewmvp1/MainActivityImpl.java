package com.example.user.recycleviewmvp1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivityImpl extends AppCompatActivity implements MainActiviy{

    List<Person> feedItemList;
    private RecyclerView mRecyclerView;
    private MainActivityAdapter adapter;
    PresenterImpl presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        presenter = new PresenterImpl(this);
        feedItemList  = new ArrayList<Person>();

        mRecyclerView = (RecyclerView) findViewById(R.id.recycle);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        mRecyclerView.setPadding(25, 25, 25, 25);



        RecyclerView.ItemAnimator itemAnimator = new DefaultItemAnimator();
        itemAnimator.setAddDuration(1000);
        itemAnimator.setRemoveDuration(1000);
        mRecyclerView.setItemAnimator(itemAnimator);

        presenter.getListPerson();

    }

    @Override
    public void getListPerson(List<Person> feedItemList) {
        adapter = new MainActivityAdapter(getApplicationContext(), feedItemList);
        mRecyclerView.setAdapter(adapter);
        adapter.notifyDataSetChanged();
    }
}
