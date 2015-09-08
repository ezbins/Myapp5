package ezbins.idv.tw.myapp5;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by shaoP on 2015/9/4.
 */
public class penguinFragment extends Fragment {

    public void penguinFragment() {};

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.multi_fragment_penguin,container,false);
        //return super.onCreateView(inflater, container, savedInstanceState);
        return view;
    }
}
