package ru.ucoz.rezept_day.cryptocurrencyprices.data;

public class Cryptocurrency {

    private String title;
    private String lastPrice;
    private String high24hr;
    private String low24hr;

    public Cryptocurrency(String title, String lastPrice, String high24hr, String low24hr) {
        this.title = title;
        this.lastPrice = lastPrice;
        this.high24hr = high24hr;
        this.low24hr = low24hr;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getLastPrice() {
        return lastPrice;
    }

    public void setLastPrice(String lastPrice) {
        this.lastPrice = lastPrice;
    }

    public String getHigh24hr() {
        return high24hr;
    }

    public void setHigh24hr(String high24hr) {
        this.high24hr = high24hr;
    }

    public String getLow24hr() {
        return low24hr;
    }

    public void setLow24hr(String low24hr) {
        this.low24hr = low24hr;
    }
}
