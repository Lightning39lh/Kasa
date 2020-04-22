package com.kasa;

public class Entidadp {

    private String explicacion;
    private String japones;
    private String romanji;


    public Entidadp(String explicacion, String japones, String romanji) {
        this.explicacion = explicacion;
        this.japones = japones;
        this.romanji = romanji;
    }
    public String getExplicacion() {return explicacion;}
    public String getJapones() {return japones;}
    public String getRomanji() {return romanji;}
}
