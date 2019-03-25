package ru.ucoz.rezept_day.cryptocurrencyprices.utils;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

import ru.ucoz.rezept_day.cryptocurrencyprices.data.Cryptocurrency;

public class JSONUtils {


    //Ключи для получения JSON данных
    private static final String LAST_PRICE = "last";
    private static final String HIGH24HR = "high24hr";
    private static final String LOW24HR = "low24hr";

    //валютные пары
    private static final String USDT_BTC = "USDT_BTC";

    public static ArrayList<Cryptocurrency> getMoviesFromJSON(JSONObject jsonObject){
        ArrayList<Cryptocurrency> result = new ArrayList<>();
        if(jsonObject == null){
            return result;
        }
        try {
            JSONObject objectCrypto = jsonObject.getJSONObject(USDT_BTC);

            String title = "BTC/USDT";
            String lastPrice = objectCrypto.getString(LAST_PRICE);
            String high24hr = objectCrypto.getString(HIGH24HR);
            String low24hr = objectCrypto.getString(LOW24HR);

            result.add(new Cryptocurrency(title, lastPrice, high24hr, low24hr));
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return result;
    }
}
