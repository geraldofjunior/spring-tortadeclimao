package br.com.contrategeraldo.TortaDeClimao.Entities;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "forecast")
public class Forecast {

    enum Shift {
        MORNING,
        AFTERNOON,
        NIGHT
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private Date forecastDate;
    private Shift shift;
    private Long geoId;

    private String resumeText;
    private int minTemperature, maxTemperature;
    private int minHumidity, maxHumidity;

    private String windDirection, windStrength;

    private int iconId, iconMinTemperatureTendencyId, iconMaxTemperatureTendencyId;
    private String icon, iconMinTemperatureTendency, iconMaxTemperatureTendency;

    @Override
    public String toString() {
        String jsonString = "";
        return jsonString;
    }
}
