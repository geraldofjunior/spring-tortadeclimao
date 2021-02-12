package br.com.contrategeraldo.TortaDeClimao.Entities;

import javax.persistence.*;
import java.sql.Time;
import java.util.Date;

@Entity
@Table(name = "forecast")
public class Forecast {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private int townId;
    private Date forecastDate;
    private String weekday;
    private int currentTemp;
    private int maxTemp;
    private int minTemp;
    private String conditionDescription;
    private String conditionSlug;
    private String currently;
    private int humidity;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getTownId() {
        return townId;
    }
    public void setTownId(int townId) {
        this.townId = townId;
    }
    public Date getForecastDate() {
        return forecastDate;
    }
    public void setForecastDate(Date forecastDate) {
        this.forecastDate = forecastDate;
    }
    public String getWeekday() {
        return weekday;
    }
    public void setWeekday(String weekday) {
        this.weekday = weekday;
    }
    public int getCurrentTemp() { return currentTemp; }
    public void setCurrentTemp(int currentTemp) {
        this.currentTemp = currentTemp;
    }
    public int getMaxTemp() {
        return maxTemp;
    }
    public void setMaxTemp(int maxTemp) {
        this.maxTemp = maxTemp;
    }
    public int getMinTemp() {
        return minTemp;
    }
    public void setMinTemp(int minTemp) {
        this.minTemp = minTemp;
    }
    public String getConditionDescription() {
        return conditionDescription;
    }
    public void setConditionDescription(String conditionDescription) {this.conditionDescription = conditionDescription;}
    public String getConditionSlug() {
        return conditionSlug;
    }
    public void setConditionSlug(String conditionSlug) {
        this.conditionSlug = conditionSlug;
    }
    public String getCurrently() {
        return currently;
    }
    public void setCurrently(String currently) {
        this.currently = currently;
    }
    public int getHumidity() {
        return humidity;
    }
    public void setHumidity(int humidity) {
        this.humidity = humidity;
    }
}
