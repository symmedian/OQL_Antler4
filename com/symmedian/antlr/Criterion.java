package com.symmedian.antlr;

/**
 * Created by jantaljaard on 26/06/2016.
 * Copyright (C) Symmedian Pty Ltd 2007 - 2014
 * Stub class for Criterion
 */
public class Criterion {
    String value;

    public Criterion(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
