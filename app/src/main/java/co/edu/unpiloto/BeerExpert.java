package co.edu.unpiloto;

import android.content.Context;

public class BeerExpert {

    private String light;
    private String amber;
    private String brown;
    private String dark;


    public BeerExpert (Context context) {
        light = context.getString(R.string.light);
        amber = context.getString(R.string.amber);
        brown = context.getString(R.string.brown);
        dark = context.getString(R.string.dark);
    }
    public String getBrands(String brand){
        switch(brand){
            case "Light":
                return light;
            case "Amber":
                return amber;
            case "Brown":
                return brown;
            case "Dark":
                return dark;
        }
        return null;
    }
}
