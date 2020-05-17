package com.example.servicetest;

import com.google.gson.annotations.SerializedName;

public class Jokes {

   String type;
    @SerializedName("value")
    public Value value;

    public Jokes(String type , Value value) {
        this.type = type;
        this.value = value;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Value getValue() {
        return value;
    }

    public void setValue(Value value) {
        this.value = value;
    }
}
