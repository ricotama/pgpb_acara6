package com.example.penugasanacara6;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.widget.ViewPager2;

public class RegisterFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_register, container, false);

        TextView loginText = view.findViewById(R.id.loginText);
        Button registerButton = view.findViewById(R.id.registerButton);
        ViewPager2 viewPager = getActivity().findViewById(R.id.viewPager);

        // Handle "Already have an account? Login" click
        loginText.setOnClickListener(v -> {
            // Switch to Login tab
            viewPager.setCurrentItem(0);
        });

        // Handle Register button click
        registerButton.setOnClickListener(v -> {
            // Simulate registration logic here (you can add your registration logic)
            // After registration, switch back to the Login tab
            viewPager.setCurrentItem(0);
        });

        return view;
    }
}
