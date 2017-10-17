package com.example.user.recycleviewmvp1;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by user on 10/17/2017.
 */

public class ModelImpl implements Model{

    List<Person> feedItemList = new ArrayList<Person>();

    @Override
    public void getListFromModel(OnPersonDataFinishedListener onPersonDataFinishedListener){
        onPersonDataFinishedListener.onSuccessfully(feedItemList());
    }

    public List<Person> feedItemList() {

        Person p1 = new Person();
        p1.setId("1");
        p1.setEmri("eljo");
        p1.setMbiemri("Prifti");

        Person p2 = new Person();
        p2.setId("2");
        p2.setEmri("eljo");
        p2.setMbiemri("Prifti");

        Person p3 = new Person();
        p3.setId("3");
        p3.setEmri("eljo");
        p3.setMbiemri("Prifti");


        feedItemList.add(p1);
        feedItemList.add(p2);
        feedItemList.add(p3);


        return feedItemList;
    }

}
