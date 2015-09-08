package ezbins.idv.tw.myapp5;

import android.app.Fragment;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
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
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.multifragment,container,false);

        frag = new koalaFragment();
        frgTransaction = getFragmentManager().beginTransaction()
                .add(R.id.showcontent,frag);
        frgTransaction.commit();

        Button kola = (Button) view.findViewById(R.id.koala);
        Button penguin = (Button) view.findViewById(R.id.penguin);
        Button other = (Button) view.findViewById(R.id.other);

        kola.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                frag = new koalaFragment();
                frgTransaction = getFragmentManager().beginTransaction()
                        .replace(R.id.showcontent, frag)
                        .addToBackStack(null);
                frgTransaction.commit();
            }
        });

        penguin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                frag = new penguinFragment();
                frgTransaction = getFragmentManager().beginTransaction()
                        .replace(R.id.showcontent,frag)
                        .addToBackStack(null);
                frgTransaction.commit();
            }
        });

        other.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                frag = new otherFragment();
                frgTransaction = getFragmentManager().beginTransaction()
                        .replace(R.id.showcontent,frag)
                        .addToBackStack(null);
                frgTransaction.commit();
            }
        });
        return view;
    }
}
