package com.example.arcade.Assets;

import com.example.arcade.R;
import com.example.emobadaragaminglib.Base.Graphics;
import com.example.emobadaragaminglib.Base.Image;

public class Level2 {
    public static Image background = Common.game.getGraphics().newImage(R.drawable.bg, Graphics.ImageFormat.ARGB8888,Common.game.getResources()) ;
    public static Image goodMatch = Common.game.getGraphics().newImage(R.drawable.lion, Graphics.ImageFormat.ARGB8888,Common.game.getResources()) ;
    public static Image wrongMatch1 = Common.game.getGraphics().newImage(R.drawable.car1, Graphics.ImageFormat.ARGB8888,Common.game.getResources()) ;
    public static Image wrongMatch2 = Common.game.getGraphics().newImage(R.drawable.car2, Graphics.ImageFormat.ARGB8888,Common.game.getResources()) ;
    public static Image wrongMatch3 = Common.game.getGraphics().newImage(R.drawable.car3, Graphics.ImageFormat.ARGB8888,Common.game.getResources()) ;
}
