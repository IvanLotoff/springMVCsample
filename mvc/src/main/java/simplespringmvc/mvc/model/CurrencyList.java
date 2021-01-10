package simplespringmvc.mvc.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Map;

public class CurrencyList {
    @JsonProperty("Date")
    String date;
    @JsonProperty("PreviousDate")
    String previousDate;
    @JsonProperty("PreviousURL")
    String previousURL;
    @JsonProperty("Timestamp")
    String timestamp;
    @JsonProperty("Valute")
    Map<String, SingleCurrency> valute;

    // Standard getters and setters


    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getPreviousDate() {
        return previousDate;
    }

    public void setPreviousDate(String previousDate) {
        this.previousDate = previousDate;
    }

    public String getPreviousURL() {
        return previousURL;
    }

    public void setPreviousURL(String previousURL) {
        this.previousURL = previousURL;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public Map<String, SingleCurrency> getValute() {
        return valute;
    }

    public void setValute(Map<String, SingleCurrency> valute) {
        this.valute = valute;
    }
}