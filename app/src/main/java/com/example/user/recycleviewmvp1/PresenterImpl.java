package com.example.user.recycleviewmvp1;

import java.util.List;

/**
 * Created by user on 10/17/2017.
 */

public class PresenterImpl implements Presenter,Model.OnPersonDataFinishedListener{

    MainActiviy view;
    Model model;

    public PresenterImpl(MainActiviy view) {
        this.view = view;
        model = new ModelImpl();
    }

    @Override
    public void onSuccessfully(List<Person> feeditemListener) {
        view.getListPerson(feeditemListener);
    }

    @Override
    public void getListPerson() {
        model.getListFromModel(this);
    }


}
