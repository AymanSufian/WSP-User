package com.example.my_uni_app;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import org.jetbrains.annotations.NotNull;


public class StudentPage extends Fragment implements View.OnClickListener {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public StudentPage() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment StudentPage.
     */
    // TODO: Rename and change types and number of parameters
    public static StudentPage newInstance(String param1, String param2) {
        StudentPage fragment = new StudentPage();
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
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_student_page, container, false);
    }
    CardView cardinfo ,cardtable,cardcourcetable,calendar;
    @Override
    public void onViewCreated(@NonNull @NotNull View view, @Nullable @org.jetbrains.annotations.Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        cardinfo = view.findViewById(R.id.cardinfo);
        cardtable = view.findViewById(R.id.cardtable);
        cardcourcetable = view.findViewById(R.id.stdcourcetable);
        calendar = view.findViewById(R.id.calendar);

        cardcourcetable.setOnClickListener(this);
        cardinfo.setOnClickListener(this);
        cardtable.setOnClickListener(this);
        calendar.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent i ;
        switch (view.getId()){
            case R.id.cardinfo :
                i = new Intent(view.getContext(), stdinfo.class);
                startActivity(i);
                break;
            case R.id.cardtable:
                i = new Intent(view.getContext(), stdtable.class);
                startActivity(i);
                break;

            case R.id.stdcourcetable:
                i = new Intent(view.getContext(), stdcourcetable.class);
                startActivity(i);
                break;

            case R.id.calendar:
                i = new Intent(view.getContext(), Universitycalendar.class);
                startActivity(i);
                break;



        }
    }
}