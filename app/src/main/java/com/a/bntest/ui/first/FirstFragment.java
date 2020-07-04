package com.a.bntest.ui.first;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.a.bntest.R;

public class FirstFragment extends Fragment {
    private FirstViewModel viewModel;
    private View root;
    
    public View onCreateView(
            @NonNull LayoutInflater inflater,
            ViewGroup container, Bundle savedInstanceState
    ) {
        root = inflater.inflate(R.layout.fragment_first, container, false);
        //
//        viewModel = ViewModelProviders.of(this).get(FirstViewModel.class);
//        final Button button = root.findViewById(R.id.btnFirst);
//        viewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
//            @Override
//            public void onChanged(@Nullable String s) {
//                button.setText(s);
//            }
//        });
        return root;
    }
}