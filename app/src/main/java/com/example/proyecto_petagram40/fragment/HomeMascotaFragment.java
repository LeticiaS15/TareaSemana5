package com.example.proyecto_petagram40.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


import com.example.proyecto_petagram40.R;
import com.example.proyecto_petagram40.adapter.MascotasAdapter;
import com.example.proyecto_petagram40.contenedor.Mascota;
import com.example.proyecto_petagram40.presenter.HomeFragmentPresenter;
import com.example.proyecto_petagram40.presenter.IHomeFragmentPresenter;

import java.util.ArrayList;

public class HomeMascotaFragment extends Fragment implements IHomeMascotaFragmentView {

    ArrayList<Mascota> misMascotas = new ArrayList<>();
    ArrayList<Mascota> mascotasGustadas = new ArrayList<>();
    private RecyclerView recyclerMascotas;
    private IHomeFragmentPresenter presenter;

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public HomeMascotaFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment HomeFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static HomeMascotaFragment newInstance(String param1, String param2) {
        HomeMascotaFragment fragment = new HomeMascotaFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_home, container, false);
        recyclerMascotas = v.findViewById(R.id.recyclerMascotas);
        createVerticalLinearLayout();
        presenter =new HomeFragmentPresenter(this, getContext());

        return v;
    }

    @Override
    public void createVerticalLinearLayout() {
        LinearLayoutManager llm = new LinearLayoutManager(getActivity());
        llm.setOrientation(LinearLayoutManager.VERTICAL);

        recyclerMascotas.setLayoutManager(llm);
    }

    @Override
    public MascotasAdapter iniciarAdaptador(ArrayList<Mascota> mascotas) {
        MascotasAdapter adaptador;
        adaptador = new MascotasAdapter(mascotas, getActivity());

        return adaptador;
    }

    @Override
    public void iniciarAdpRV(MascotasAdapter adapter) {
        recyclerMascotas.setAdapter(adapter);
    }
}