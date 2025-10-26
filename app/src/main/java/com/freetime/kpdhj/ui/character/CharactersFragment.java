package com.freetime.kpdhj.ui.character;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.freetime.kpdhj.databinding.FragmentCharactersBinding;

public class CharactersFragment extends Fragment {

    private FragmentCharactersBinding binding;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        CharactersViewModel charactersViewModel =
                new ViewModelProvider(this).get(CharactersViewModel.class);

        binding = FragmentCharactersBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        Button rumiInfoButton = binding.rumiInfoButton;
        rumiInfoButton.setOnClickListener(v -> {
            Intent intent = new Intent(getActivity(), RumiActivity.class);
            startActivity(intent);
        });

        Button zoeyInfoButton = binding.zoeyInfoButton;
        zoeyInfoButton.setOnClickListener(v -> {
            Intent intent = new Intent(getActivity(), ZoeyActivity.class);
            startActivity(intent);
        });

        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}
