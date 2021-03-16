package com.example.secondlife.feature.home;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.secondlife.model.Game;
import com.example.secondlife.repository.Repository;

import java.util.List;

public class HomeViewModel extends ViewModel {

    private Repository repository = new Repository();

    public MutableLiveData<List<Game>> latestGamesLiveData = new MutableLiveData<>();

    public void getLatestGames(){
        List<Game> games = repository.getLatestGames();
        latestGamesLiveData.setValue(games);
    }

    private MutableLiveData<String> mText;

    public HomeViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is home fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}