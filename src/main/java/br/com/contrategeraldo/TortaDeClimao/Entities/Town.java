package br.com.contrategeraldo.TortaDeClimao.Entities;

import javax.persistence.*;

@Entity
@Table(name = "town")
public class Town {
    public void setWoeid(int woeid) {
        this.woeid = woeid;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;
    private String state;
    private int woeid; // Where On Earth ID, used by the external API

    public Town() {}

    public Town(Long id, String name, String state, int woeid) {
        this.id = id;
        this.name = name;
        this.state = state;
        this.woeid = woeid;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public int getWoeid() {
        return woeid;
    }
}
