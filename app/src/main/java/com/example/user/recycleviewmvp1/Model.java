package com.example.user.recycleviewmvp1;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by user on 10/17/2017.
 */

public interface Model {

    interface OnPersonDataFinishedListener{
        void onSuccessfully(List<Person> feeditemListener);
    }
   void getListFromModel(OnPersonDataFinishedListener onPersonDataFinishedListener);
}
