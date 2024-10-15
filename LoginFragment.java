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

public class LoginFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_login, container, false);

        Button loginButton = view.findViewById(R.id.loginButton);
        TextView registerText = view.findViewById(R.id.registerText);
        ViewPager2 viewPager = getActivity().findViewById(R.id.viewPager);

        loginButton.setOnClickListener(v -> {
            // Simulate login and move to Welcome screen
            ((MainActivity) getActivity()).navigateToWelcome();
        });

        registerText.setOnClickListener(v -> {
            // Switch to Register tab
            viewPager.setCurrentItem(1);
        });

        return view;
    }
}
