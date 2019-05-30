package com.example.arcade.Levels;

import com.example.arcade.Assets.Common;
import com.example.arcade.Assets.Level1;
import com.example.arcade.Assets.Level2;
import com.example.emobadaragaminglib.Base.Game;
import com.example.emobadaragaminglib.Base.Screen;
import com.example.emobadaragaminglib.Components.Sprite;
import com.example.emobadaragaminglib.Implementation.AndroidGame;

import java.util.List;

public class Level extends Screen {

    private Sprite background ;
    private int nextLevel ;
    private List<Sprite> listOfWrongMatches ;
    private Sprite goodMatch ;

    public Level(Game game) {
        super(game);
    }

    @Override
    public void render(float deltaTime) {

    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void backButton() {

    }

    public Sprite getBackground() {
        return background;
    }

    public void setBackground(Sprite background) {
        this.background = background;
    }



    public List<Sprite> getListOfWrongMatches() {
        return listOfWrongMatches;
    }

    public void setListOfWrongMatches(List<Sprite> listOfWrongMatches) {
        this.listOfWrongMatches = listOfWrongMatches;
    }

    public Sprite getGoodMatch() {
        return goodMatch;
    }

    public void setGoodMatch(Sprite goodMatch) {
        this.goodMatch = goodMatch;
    }

    @Override
    public void handleTouchDown(int x ,int y, int pointer ){
        super.handleTouchDown(x,y,pointer);
        Sprite s = getDraggedSprite();
        if(s!=null && s.getClass()==WinnableSprite.class){
            //a way around a little problem I had
            WinnableSprite ss = (WinnableSprite) s;
            ss.goTolevel(nextLevel);
            Common.welldone +=1 ;
        }
        Common.missed += 1 ;

    }

    public int getNextLevel() {
        return nextLevel;
    }

    public void setNextLevel(int nextLevel) {
        this.nextLevel = nextLevel;
    }
}
