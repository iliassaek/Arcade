package com.example.arcade.Levels;

import com.example.arcade.Assets.Common;
import com.example.emobadaragaminglib.Base.Image;
import com.example.emobadaragaminglib.Components.Sprite;

public class WinnableSprite extends Sprite {


    public WinnableSprite(Image image, int x, int y, int height, int width) {
        super(image, x, y, height, width);
    }

    public void goTolevel(int level){

        Common.onSaveGame();
        Common.goodSound.play(1);
        Common.game.setScreen(LevelFactory.generateLevel(level));
    }
}
