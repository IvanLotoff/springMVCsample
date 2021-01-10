package simplespringmvc.mvc.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SingleCurrency {

    @JsonProperty("ID")
    private String iD;
    @JsonProperty("NumCode")
    private String numCode;
    @JsonProperty("CharCode")
    private String charCode;
    @JsonProperty("Nominal")
    private Integer nominal;
    @JsonProperty("Name")
    private String name;
    @JsonProperty("Value")
    private Double value;
    @JsonProperty("Previous")
    private Double previous;

    public SingleCurrency(){}

    // Standard Getters and Setters :(


    public String getiD() {
        return iD;
    }

    public void setiD(String iD) {
        this.iD = iD;
    }

    public String getNumCode() {
        return numCode;
    }

    public void setNumCode(String numCode) {
        this.numCode = numCode;
    }

    public String getCharCode() {
        return charCode;
    }

    public void setCharCode(String charCode) {
        this.charCode = charCode;
    }

    public Integer getNominal() {
        return nominal;
    }

    public void setNominal(Integer nominal) {
        this.nominal = nominal;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    public Double getPrevious() {
        return previous;
    }

    public void setPrevious(Double previous) {
        this.previous = previous;
    }
}
