package com.example.secondlife.feature.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.example.secondlife.R;
import com.example.secondlife.model.Game;
import com.example.secondlife.model.User;
import com.example.secondlife.network.AnnoncesService;
import com.example.secondlife.network.SwapiService;

import java.io.IOException;
import java.util.List;

import retrofit2.Response;
import retrofit2.Retrofit;

public class HomeFragment extends Fragment {

    private com.example.secondlife.feature.home.HomeViewModel homeViewModel;

    //private FragmentHomeBinding fragmentHomeBinding;

    private Retrofit retrofit = new Retrofit.Builder()
            .baseUrl("https://localhost:5001/api/annonces") //url de base pour eviter de l'écrire avant chaque post,get...
            .build();;

    //private final SwapiService swapiService = retrofit.create(SwapiService.class);
    private final AnnoncesService annoncesService = retrofit.create(AnnoncesService.class);

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        homeViewModel = new ViewModelProvider(this).get(com.example.secondlife.feature.home.HomeViewModel.class);

        /*View root = inflater.inflate(R.layout.fragment_home, container, false);
        final TextView textView = root.findViewById(R.id.text_home);
        homeViewModel.getText().observe(getViewLifecycleOwner(), text -> binding.textHome.setText(text));

        binding.button.setOnclickListener((View.OnClickListener) view -> {
            getPeople("1");       
        });*/
        return inflater.inflate((R.layout.activity_main), container, false);
        }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        homeViewModel.getLatestGames();

        homeViewModel.latestGamesLiveData.observe((LifecycleOwner) getContext(), games -> {
            ((TextView) view.findViewById(R.id.textview_games)).setText("games" + games.size());
        });

    }

    private void getAnnonces(String id) {

        try {
            Response<User> response = SwapiService.getPeople(id).execute();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}