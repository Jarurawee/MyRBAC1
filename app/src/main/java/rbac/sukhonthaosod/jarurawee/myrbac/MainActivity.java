package rbac.sukhonthaosod.jarurawee.myrbac;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import rbac.sukhonthaosod.jarurawee.myrbac.fragment.MainFragment;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //All Fragment
        if (savedInstanceState == null){
            MainFragment mainFragment = new MainFragment();
            getSupportFragmentManager()
                    .beginTransaction()
                    .add(R.id.mainContainer, mainFragment)
                    .commit();
        }
    }   //Main Method
}   //Main Class
