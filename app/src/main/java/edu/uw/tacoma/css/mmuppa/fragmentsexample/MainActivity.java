package edu.uw.tacoma.css.mmuppa.fragmentsexample;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import edu.uw.tacoma.css.mmuppa.fragmentsexample.dummy.DummyContent;

public class MainActivity extends AppCompatActivity
        implements ExampleFragment.OnExampleFragmentInteractionListener,
                    OtherFragment.OnFragmentInteractionListener,
                    ItemListFragment.OnListFragmentInteractionListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        getSupportFragmentManager()
//                .beginTransaction()
//                .add(R.id.fragment_container, new ExampleFragment())
//                .commit();

        getSupportFragmentManager()
                .beginTransaction()
                .add(R.id.fragment_container, new ItemListFragment())
                .commit();


    }

    @Override
    public void launchOtherFragment() {
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.fragment_container, OtherFragment.getOtherFragment())
                //.addToBackStack(null)
                .commit();

    }

    @Override
    public void onOtherFragmentInteraction(Uri uri) {

    }

    @Override
    public void onListFragmentInteraction(DummyContent.DummyItem item) {

    }
}
