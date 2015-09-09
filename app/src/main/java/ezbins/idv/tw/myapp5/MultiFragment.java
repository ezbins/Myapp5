package ezbins.idv.tw.myapp5;

import android.app.Fragment;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by shaoP on 2015/9/4.
 */
public class MultiFragment extends Fragment {

    Fragment frag;
    FragmentTransaction frgTransaction;
    public void MultiFragment() {

    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setHasOptionsMenu(true);
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.multifragment,container,false);
        frag = new koalaFragment();
        frgTransaction = getFragmentManager().beginTransaction()
                .add(R.id.showcontent,frag);
        frgTransaction.commit();

        return view;
    }

}
