package com.bentechprotv.android.basedistante;

import org.json.JSONObject;

public class Produit {
    private String id, designation;

    public Produit(JSONObject jObject) {
        this.id = jObject.optString("id");
        this.designation = jObject.optString("designation");
    }

    public String getReference() {
        return id;
    }

    public String getDesignation() {
        return designation;
    }
}
