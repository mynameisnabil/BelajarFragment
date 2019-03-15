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
public class FragmentSatu extends Fragment {
    private Button btnFr;


    public FragmentSatu() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_satu, container ,false);
        ((MainActivity) getActivity()).getSupportActionBar().setTitle("Fragment Saty");
        ((MainActivity) getActivity()).getSupportActionBar().setSubtitle("Fr 1");
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
                FragmentDua fragmentDua = new FragmentDua();
                //todo memulai transaksi fragment
                getFragmentManager().beginTransaction()
                        .replace(R.id.frContent, fragmentDua)
                        ///todo menyiapkan fragment
                .addToBackStack(null)
                        .setTransition(FragmentTransaction.TRANSIT_ENTER_MASK)
                        .commit();


            }
        });
    }


}
