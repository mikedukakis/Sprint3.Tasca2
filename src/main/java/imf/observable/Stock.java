package imf.observable;

import imf.listeners.EventListener;
import imf.observers.StockHolder;

import java.util.List;
import java.util.ArrayList;

public class Stock {
    private String stockName;
    private float stockValue;
    private List<EventListener> listeners;

    public Stock(String stockName, float stockValue) {
        this.stockName = stockName;
        this.stockValue = stockValue;
        this.listeners = new ArrayList<>();
    }

    public String getStockName() {
        return stockName;
    }

    public void setStockName(String stockName) {
        this.stockName = stockName;
    }

    public float getStockValue() {
        return stockValue;
    }

    public void updateStockValue(float newValue) {
        float oldValue = this.stockValue;
        this.stockValue = newValue;
        notifyListeners(oldValue, newValue);
    }

    public void addListener(EventListener listener) {
        listeners.add(listener);
    }

    public void removeListener(EventListener listener) {
        listeners.remove(listener);
    }

    public void addStockHolder(StockHolder stockHolder) {
        this.addListener(stockHolder.getEmailNotification());
    }

    private void notifyListeners(float oldValue, float newValue) {
        for (EventListener listener : listeners) {
            listener.update("Stock " + stockName + " changed from " + oldValue + " to " + newValue);
        }
    }
}