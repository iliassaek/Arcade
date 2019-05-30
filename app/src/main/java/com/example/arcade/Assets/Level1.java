package com.example.arcade.Assets;

import com.example.arcade.R;
import com.example.emobadaragaminglib.Base.Graphics;
import com.example.emobadaragaminglib.Base.Image;
import com.example.emobadaragaminglib.Components.Sprite;

public class Level1 {
    public static Image background = Common.game.getGraphics().newImage(R.drawable.bg, Graphics.ImageFormat.ARGB8888,Common.game.getResources()) ;
    public static Image goodMatch = Common.game.getGraphics().newImage(R.drawable.giraffe, Graphics.ImageFormat.ARGB8888,Common.game.getResources()) ;
    public static Image wrongMatch1 = Common.game.getGraphics().newImage(R.drawable.girl1, Graphics.ImageFormat.ARGB8888,Common.game.getResources()) ;
    public static Image wrongMatch2 = Common.game.getGraphics().newImage(R.drawable.girl2, Graphics.ImageFormat.ARGB8888,Common.game.getResources()) ;
    public static Image wrongMatch3 = Common.game.getGraphics().newImage(R.drawable.girl3, Graphics.ImageFormat.ARGB8888,Common.game.getResources()) ;

}
