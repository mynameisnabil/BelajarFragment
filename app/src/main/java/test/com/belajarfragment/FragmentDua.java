package test.com.belajarfragment;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentDua extends Fragment {
    private Button btnFr;



    public FragmentDua() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view = inflater.inflate(R.layout.fragment_dua, container ,false);
        ((MainActivity) getActivity()).getSupportActionBar().setTitle("Fragment Dua");
        ((MainActivity) getActivity()).getSupportActionBar().setSubtitle("Fr 2");
        ((MainActivity) getActivity()).getSupportActionBar().setDisplayHomeAsUpEnabled(false);

        //todo findview by id
        btnFr = view.findViewById(R.id.btnFr);
        setHasOptionsMenu(false);
        return view;

    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        btnFr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //todo membuat objek
                FragmentTiga fragmentTiga =  new FragmentTiga();
                //todo memulai transaksi fragment
                getFragmentManager().beginTransaction()
                        .replace(R.id.frContent, fragmentTiga)
                        ///todo menyiapkan fragment
                        .addToBackStack(null)
                        .setTransition(FragmentTransaction.TRANSIT_ENTER_MASK)
                        .commit();


            }
        });
    }
}


