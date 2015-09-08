package ezbins.idv.tw.myapp5;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by shaoP on 2015/9/4.
 */
public class otherFragment extends Fragment {

    public void otherFragment() {};

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.multi_fragment_other,container,false);
        //return super.onCreateView(inflater, container, savedInstanceState);
        return view;
    }
}
