package com.example.arcade.Assets;

import com.example.arcade.R;
import com.example.arcade.State.MainActivity;
import com.example.emobadaragaminglib.Base.Game;
import com.example.emobadaragaminglib.Base.Image;
import com.example.emobadaragaminglib.Implementation.AndroidGame;
import com.example.emobadaragaminglib.Implementation.AndroidSound;
import com.example.ensias_auth_library.FoxyAuth;
import com.example.ensias_auth_library.models.GameStat;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Common {
    public static Date dateCreated = Calendar.getInstance().getTime();
    public static Date dateUpdated = Calendar.getInstance().getTime();
    public static int minTime_succeded = 0 ;
    public static int avgTime_succeded = 0 ;
    public static int welldone = 0 ;
    public static int missed = 0 ;
    public static Game game ;

    public static AndroidSound goodSound ;

    public static void onSaveGame() {

        DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");

        GameStat gameStat = new GameStat() ;
        gameStat.setApp_id("aitelkouch_12_T_6_26");
        gameStat.setExercise_id("T_6_26");
        gameStat.setLevel_id("1");
        gameStat.setUpdated_at(dateFormat.format(dateUpdated));
        gameStat.setCreated_at(dateFormat.format(dateCreated));
        gameStat.setSuccessful_attempts(Integer.toString(welldone));
        gameStat.setFailed_attempts(Integer.toString(missed));
        gameStat.setMin_time_succeed_sec(Integer.toString(minTime_succeded));
        gameStat.setAvg_time_succeed_sec(Integer.toString(avgTime_succeded));
        gameStat.setLongitude("11.2555");
        gameStat.setLatitude("-2.55547");
        FoxyAuth.storeGameStat(MainActivity.context,gameStat);
    }
}
