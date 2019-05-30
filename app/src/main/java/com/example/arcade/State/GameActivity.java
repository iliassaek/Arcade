package com.example.arcade.State;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.arcade.Assets.Common;
import com.example.arcade.Assets.Level1;
import com.example.arcade.Levels.Level;
import com.example.arcade.Levels.LevelFactory;
import com.example.arcade.R;
import com.example.emobadaragaminglib.Base.Graphics;
import com.example.emobadaragaminglib.Base.Screen;
import com.example.emobadaragaminglib.Implementation.AndroidGame;
import com.example.emobadaragaminglib.Implementation.AndroidSound;

public class GameActivity extends AndroidGame {

    @Override
    public Screen getInitScreen() {
        initAssets();
        //return new Level(this);
        return LevelFactory.generateLevel(1) ;
    }

    public void initAssets(){
        Common.game = this ;
        Common.goodSound = (AndroidSound) getAudio().createSound(R.raw.good);
    }
}
