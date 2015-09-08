package ezbins.idv.tw.myapp5;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by shaoP on 2015/9/4.
 */
public class koalaFragment extends Fragment {

    public void KoalaFragment() {};

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.multi_fragment_koala,container,false);
        //return super.onCreateView(inflater, container, savedInstanceState);

        return view;
    }
}
