package com.vinilaureto.cadastro;

import android.os.Build;

import androidx.annotation.RequiresApi;

import java.util.Arrays;

public enum SexoValue {
    MASCULINO ("masculino"),
    FEMENINO ("feminino");

    private String label;
    SexoValue(String label) {
        this.label = label;
    }

    @Override
    public String toString() {
        return label;
    }
}
