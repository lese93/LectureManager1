package kr.co.tjeit.lecturemanager.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.widget.ArrayAdapter;

import java.util.List;

import kr.co.tjeit.lecturemanager.R;
import kr.co.tjeit.lecturemanager.data.User;

/**
 * Created by user on 2017-08-31.
 */

public class StudentAdapter extends ArrayAdapter<User> {

    Context mConext;
    List<User> mList;
    LayoutInflater inf;

    public StudentAdapter(Context context, List<User> list) {
        super(context, R.layout.student_list_item, list);

        mConext = context;
        mList = list;
        inf = LayoutInflater.from(mConext);
    }

}
