package com.example.arcade.Levels;

import com.example.arcade.Assets.Common;
import com.example.arcade.Assets.Level1;
import com.example.arcade.Assets.Level2;
import com.example.arcade.Assets.Level3;
import com.example.arcade.R;
import com.example.emobadaragaminglib.Base.Graphics;
import com.example.emobadaragaminglib.Base.Image;
import com.example.emobadaragaminglib.Components.Sprite;

public class LevelFactory {
    public static Level levelArcade = new Level(Common.game) ;
    //public static  Sprite goodMatch ; = new Sprite(Level1.goodMatch,100,100,Common.game.getGraphics().getHeight()/2, Common.game.getGraphics().getWidth()/2) ;
    public static Sprite background = new Sprite(Level2.background,0,0,Common.game.getGraphics().getHeight(), Common.game.getGraphics().getWidth()) ;


    public static Level generateLevel(int level){

        WinnableSprite goodMatch ;
        Sprite wrongSprite1 ;
        Sprite wrongSprite2 ;
        Sprite wrongSprite3 ;

        if (level == 1){

            wrongSprite1 = new Sprite(Level1.wrongMatch1,Common.game.getScreenWidth()/5,Common.game.getScreenHeight()/2,Common.game.getGraphics().getHeight()/4, Common.game.getGraphics().getWidth()/4) ;
            wrongSprite2 = new Sprite(Level1.wrongMatch2, Common.game.getScreenWidth()/2 , Common.game.getScreenHeight()/2,Common.game.getGraphics().getHeight()/4, Common.game.getGraphics().getWidth()/4) ;
            wrongSprite3 = new Sprite(Level1.wrongMatch3 , Common.game.getScreenWidth()/2 , Common.game.getScreenHeight()/6,Common.game.getGraphics().getHeight()/4, Common.game.getGraphics().getWidth()/4) ;
            goodMatch = new WinnableSprite(Level1.goodMatch,Common.game.getScreenWidth()/6,Common.game.getScreenHeight()/6,Common.game.getGraphics().getHeight()/4, Common.game.getGraphics().getWidth()/4) ;
            levelArcade.setNextLevel(2);
            levelArcade.addSprite(background);
            levelArcade.addSprite(goodMatch);
            levelArcade.addSprite(wrongSprite1);
            levelArcade.addSprite(wrongSprite2);
            levelArcade.addSprite(wrongSprite3);
            return levelArcade ;
        }


        if (level == 2 ){
            wrongSprite1 = new Sprite(Level2.wrongMatch1,Common.game.getScreenWidth()/6,Common.game.getScreenHeight()/6,Common.game.getGraphics().getHeight()/4, Common.game.getGraphics().getWidth()/4) ;
            wrongSprite2 = new Sprite(Level2.wrongMatch2, Common.game.getScreenWidth()/2 , Common.game.getScreenHeight()/2,Common.game.getGraphics().getHeight()/4, Common.game.getGraphics().getWidth()/4) ;
            wrongSprite3 = new Sprite(Level2.wrongMatch3 , Common.game.getScreenWidth()/2 , Common.game.getScreenHeight()/6,Common.game.getGraphics().getHeight()/4, Common.game.getGraphics().getWidth()/4) ;
            goodMatch = new WinnableSprite(Level2.goodMatch,Common.game.getScreenWidth()/5,Common.game.getScreenHeight()/2,Common.game.getGraphics().getHeight()/4, Common.game.getGraphics().getWidth()/4) ;
            levelArcade.setNextLevel(3);
            levelArcade.addSprite(background);
            levelArcade.addSprite(goodMatch);
            levelArcade.addSprite(wrongSprite1);
            levelArcade.addSprite(wrongSprite2);
            levelArcade.addSprite(wrongSprite3);
            return levelArcade ;
        }

        if (level == 3 ){
            wrongSprite1 = new Sprite(Level3.wrongMatch1,Common.game.getScreenWidth()/5,Common.game.getScreenHeight()/2,Common.game.getGraphics().getHeight()/4, Common.game.getGraphics().getWidth()/4) ;
            wrongSprite2 = new Sprite(Level3.wrongMatch2, Common.game.getScreenWidth()/6 , Common.game.getScreenHeight()/6,Common.game.getGraphics().getHeight()/4, Common.game.getGraphics().getWidth()/4) ;
            wrongSprite3 = new Sprite(Level3.wrongMatch3 , Common.game.getScreenWidth()/2 , Common.game.getScreenHeight()/6,Common.game.getGraphics().getHeight()/4, Common.game.getGraphics().getWidth()/4) ;
            goodMatch = new WinnableSprite(Level3.goodMatch,Common.game.getScreenWidth()/2,Common.game.getScreenHeight()/2,Common.game.getGraphics().getHeight()/4, Common.game.getGraphics().getWidth()/4) ;
            levelArcade.setNextLevel(1);
            levelArcade.addSprite(background);
            levelArcade.addSprite(goodMatch);
            levelArcade.addSprite(wrongSprite1);
            levelArcade.addSprite(wrongSprite2);
            levelArcade.addSprite(wrongSprite3);
            return levelArcade ;
        }


        levelArcade.addSprite(background);
        return levelArcade ;

    }
}
