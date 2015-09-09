package ezbins.idv.tw.myapp5;

import android.app.ActionBar;
import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentTransaction;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Fragment frag;
    FragmentTransaction frgTransaction;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (savedInstanceState == null) {
            getFragmentManager().beginTransaction()
                    .add(R.id.menubar,new MultiFragment())
                    .commit();
        }

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){

        // Handle presses on the action bar items
        switch (item.getItemId()) {
            case R.id.koala_btn:
                frag = new koalaFragment();
                frgTransaction = getFragmentManager().beginTransaction()
                        .replace(R.id.showcontent,frag)
                        .addToBackStack(null);
                frgTransaction.commit();
                return true;

            case R.id.penguin_btn:
                 frag = new penguinFragment();
                 frgTransaction = getFragmentManager().beginTransaction()
                         .replace(R.id.showcontent, frag)
                         .addToBackStack(null);
                 frgTransaction.commit();
                 return true;

            case R.id.other_btn:
                frag = new otherFragment();
                frgTransaction = getFragmentManager().beginTransaction()
                        .replace(R.id.showcontent,frag)
                        .addToBackStack(null);
                frgTransaction.commit();
                return true;

            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
