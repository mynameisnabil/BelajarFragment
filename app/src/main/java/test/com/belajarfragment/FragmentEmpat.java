package test.com.belajarfragment;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentEmpat extends Fragment {
  private Button btnFr;


    public FragmentEmpat() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_empat, container ,false);
        ((MainActivity) getActivity()).getSupportActionBar().setTitle("Fragment Empat");
        ((MainActivity) getActivity()).getSupportActionBar().setSubtitle("Fr 4");
        ((MainActivity) getActivity()).getSupportActionBar().setDisplayHomeAsUpEnabled(false);

        //todo findview by id
        btnFr = view.findViewById(R.id.btnFr);
        setHasOptionsMenu(false);
        return view;



    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        btnFr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //todo membuat objek
                FragmentLima fragmentLima =  new FragmentLima();
                //todo memulai transaksi fragment
                getFragmentManager().beginTransaction()
                        .replace(R.id.frContent, fragmentLima)
                        ///todo menyiapkan fragment
                        .addToBackStack(null)
                        .setTransition(FragmentTransaction.TRANSIT_ENTER_MASK)
                        .commit();
            }
        });
    }
}


