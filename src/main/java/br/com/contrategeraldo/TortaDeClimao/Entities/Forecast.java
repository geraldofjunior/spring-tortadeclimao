package br.com.contrategeraldo.TortaDeClimao.Entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "forecast")
@JsonIgnoreProperties(ignoreUnknown = true)
public class Forecast {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private Date date;
    private Date time;
    private String condition_code;
    private String description;
    private String weekday;
    private int temp;
    private int max;
    private int min;
    private String condition;
    private String condition_slug;
    private String slug;
    private String currently;
    private int humidity;
    private String city_name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public String getCondition_code() {
        return condition_code;
    }

    public void setCondition_code(String condition_code) {
        this.condition_code = condition_code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getWeekday() {
        return weekday;
    }

    public void setWeekday(String weekday) {
        this.weekday = weekday;
    }

    public int getTemp() {
        return temp;
    }

    public void setTemp(int temp) {
        this.temp = temp;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public String getCondition_slug() {
        return condition_slug;
    }

    public void setCondition_slug(String condition_slug) {
        this.condition_slug = condition_slug;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
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

    public String getCity_name() {
        return city_name;
    }

    public void setCity_name(String city_name) {
        this.city_name = city_name;
    }

    @Override
    public String toString() {
        String jsonString = "Forecast{" +
                "date: '" + this.date + "', " +
                "time: '" + this.time + "', " +
                "condition_code: '" + this.condition_code + "', " +
                "description: '" + this.description + "', " +
                "weekday: '" + this.weekday + "', " +
                "temp: '" + this.temp + "', " +
                "max: '" + this.max + "', " +
                "min: '" + this.min + "', " +
                "condition: '" + this.condition + "', " +
                "condition_slug: '" + this.condition_slug + "', " +
                "slug: '" + this.slug + "', " +
                "currently: '" + this.currently + "', " +
                "humidity: '" + this.humidity + "', " +
                "city_name: '" + this.city_name + "', " + "}";
        return jsonString;
    }
}
