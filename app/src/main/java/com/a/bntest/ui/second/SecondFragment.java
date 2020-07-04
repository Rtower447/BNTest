package com.a.bntest.ui.second;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.a.bntest.R;
import com.a.bntest.ui.first.FirstViewModel;

public class SecondFragment extends Fragment {
    private FirstViewModel viewModel;
    private View root;
    
    public View onCreateView(
            @NonNull LayoutInflater inflater,
            ViewGroup container, Bundle savedInstanceState
    ) {
        viewModel = ViewModelProviders.of(this).get(FirstViewModel.class);
        root = inflater.inflate(R.layout.fragment_first, container, false);
        final Button button = root.findViewById(R.id.btnFirst);
        viewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                button.setText(s);
            }
        });
        return root;
    }
}