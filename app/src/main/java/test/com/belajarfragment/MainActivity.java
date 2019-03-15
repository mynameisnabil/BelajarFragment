package test.com.belajarfragment;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //todo insialisasi fragment agar bisa berinteraksi dengan Activity
        FragmentManager fragmentManager = getSupportFragmentManager();

        //todo memulai fragment managerny
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();


        //todo menginialisasi fragmentsatu
        FragmentSatu fragmentSatu = new FragmentSatu();

        //todo Menambahkan fragmentsatu ke activity_main.xml
        fragmentTransaction.add(R.id.frContent, fragmentSatu);


        //todo menambahkan state atau status ketika tombol back ditekan
        fragmentTransaction.addToBackStack("FragmentSatu");

        //todo fragment eksekusi
        fragmentTransaction.commit();
    }
}
