package com.example.user.recycleviewmvp1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Toast;

import net.idik.lib.slimadapter.SlimAdapter;
import net.idik.lib.slimadapter.SlimInjector;
import net.idik.lib.slimadapter.viewinjector.IViewInjector;

import java.util.ArrayList;
import java.util.List;

public class MainActivityImpl extends AppCompatActivity implements MainActiviy{

    List<Person> feedItemList;
    private RecyclerView mRecyclerView;
    PresenterImpl presenter;
    private SlimAdapter slimAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        presenter = new PresenterImpl(this);
        feedItemList  = new ArrayList<Person>();

        mRecyclerView = (RecyclerView) findViewById(R.id.recycle);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        mRecyclerView.setPadding(25, 25, 25, 25);


        slimAdapter = SlimAdapter.create();
        RecyclerView.ItemAnimator itemAnimator = new DefaultItemAnimator();
        itemAnimator.setAddDuration(1000);
        itemAnimator.setRemoveDuration(1000);
        mRecyclerView.setItemAnimator(itemAnimator);
        presenter.getListPerson();

    }

    @Override
    public void getListPerson(List<Person> feedItemList) {
        slimAdapter.register(R.layout.adapter_layout, new SlimInjector<Person>() {
                    @Override
                    public void onInject(final Person data, IViewInjector injector) {
                        injector.text(R.id.nameLastname, data.getId()+" "+data.getEmri()+" "+data.getMbiemri());
                    }
        })
                .attachTo(mRecyclerView)
                .updateData(feedItemList);
    }
}
