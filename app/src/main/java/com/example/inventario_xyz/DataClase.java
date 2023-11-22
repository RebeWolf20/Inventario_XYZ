package com.example.inventario_xyz;

public class DataClase {
    private String nombre_comun;
    private  String nombre_cience;
    private String desc;
    private String familia;
    private String imgURL;
    private String key;

    public DataClase(){}

    public DataClase(String title, String desc, String imgURL, String familia, String cience){

    }

    public DataClase(String nombre_comun, String nombre_cience, String desc, String familia, String imgURL, String key) {
        this.nombre_comun = nombre_comun;
        this.nombre_cience = nombre_cience;
        this.desc = desc;
        this.familia = familia;
        this.imgURL = imgURL;
        this.key = key;
    }

    public String getNombre_comun() {
        return nombre_comun;
    }

    public void setNombre_comun(String nombre_comun) {
        this.nombre_comun = nombre_comun;
    }

    public String getNombre_cience() {
        return nombre_cience;
    }

    public void setNombre_cience(String nombre_cience) {
        this.nombre_cience = nombre_cience;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getFamilia() {
        return familia;
    }

    public void setFamilia(String familia) {
        this.familia = familia;
    }

    public String getImgURL() {
        return imgURL;
    }

    public void setImgURL(String imgURL) {
        this.imgURL = imgURL;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }
}
