package ru.ucoz.rezept_day.cryptocurrencyprices;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;

import ru.ucoz.rezept_day.cryptocurrencyprices.data.Cryptocurrency;
import ru.ucoz.rezept_day.cryptocurrencyprices.utils.JSONUtils;
import ru.ucoz.rezept_day.cryptocurrencyprices.utils.NetworkUtils;

public class MainActivity extends AppCompatActivity {

    private TextView textViewCurrency, textViewPrice;
    private Animation animation = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initUI();

        updatePrice();
    }

    private void initUI() {
        textViewCurrency = findViewById(R.id.textViewCurrency);
        textViewPrice = findViewById(R.id.textViewPrice);
    }

    public void onClickUpdatePrice(View view) {
        updatePrice();
    }

    private void updatePrice(){
        JSONObject jsonObject = NetworkUtils.getJSONFromNetwork();
        ArrayList<Cryptocurrency> usdt = JSONUtils.getMoviesFromJSON(jsonObject);

        animation = AnimationUtils.loadAnimation(this, R.anim.anim);

        textViewCurrency.setText(usdt.get(0).getTitle());
        textViewPrice.setText(usdt.get(0).getLastPrice());

        textViewPrice.startAnimation(animation);
    }
}
