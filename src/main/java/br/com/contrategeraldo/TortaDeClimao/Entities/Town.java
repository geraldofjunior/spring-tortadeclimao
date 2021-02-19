package br.com.contrategeraldo.TortaDeClimao.Entities;

import javax.persistence.*;

@Entity
@Table(name = "town")
public class Town {
    @Id
    private Long geoId;

    private String name;
    private String state;

    public Town() {}

    public void setGeoId(Long geoId) {
        this.geoId = geoId;
    }
    public Long getGeoId() {
        return this.geoId;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getState() {
        return state;
    }
    public void setState(String state) {
        this.state = state;
    }
}
