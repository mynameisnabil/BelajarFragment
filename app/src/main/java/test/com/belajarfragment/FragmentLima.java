package test.com.belajarfragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentLima extends Fragment {
    private Button btnFr;
    String[] detail;


    public FragmentLima() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_lima, container, false);
        ((MainActivity) getActivity()).getSupportActionBar().setTitle("Fragment Lima");
        ((MainActivity) getActivity()).getSupportActionBar().setSubtitle("Fr 5");
        ((MainActivity) getActivity()).getSupportActionBar().setDisplayHomeAsUpEnabled(false);
        detail = getResources().getStringArray(R.array.smartphone);


        //todo findview by id
        btnFr = view.findViewById(R.id.btnFr);
        setHasOptionsMenu(false);
        return view;
        





    }

}
