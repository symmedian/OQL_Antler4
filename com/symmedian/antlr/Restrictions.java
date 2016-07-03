package com.symmedian.antlr;

import com.symmedian.antlr.Criterion;

import java.util.Collection;

/**
 * Created by jantaljaard on 25/06/2016.
 * Copyright (C) Symmedian Pty Ltd 2007 - 2014
 */
public class Restrictions {

    public static Criterion equal(String propertyName, Object value){
        return new Criterion(propertyName + " equals " + value.toString());
    }

    public static Criterion notEqual(String propertyName, Object value){
        return new Criterion(propertyName + " equals " + value.toString());
    }

    public static Criterion like(String propertyName, String value, MatchMode matchMode) {
        return new Criterion(propertyName + " LIKE " + value.toString());
    }

    public static Criterion caseInsensitiveLike(String propertyName, String value, MatchMode matchMode) {
        return new Criterion(propertyName + " LIKE " + value.toString());
    }

    public static Criterion caseInsensitiveLike(String propertyName, Object value) {
        return new Criterion(propertyName + " LIKE " + value.toString());
    }

    public static Criterion greaterThan(String propertyName, Object value) {
        return new Criterion(propertyName + " > " + value.toString());
    }

    public static Criterion lessThan(String propertyName, Object value){
        return new Criterion(propertyName + " < " + value.toString());
    }

    public static Criterion lessThanEqual(String propertyName, Object value){
        return new Criterion(propertyName + " <= " + value.toString());
    }

    public static Criterion greaterThanEqual(String propertyName, Object value){
        return new Criterion(propertyName + " >= " + value.toString());
    }

    public static Criterion and(Criterion lhs, Criterion rhs){
        return new Criterion(lhs.toString() + " and " + rhs.toString());
    }

//    /** @deprecated */
//    public static com.symmedian.antlr.Criterion or(Expression lhs, Expression rhs);

    public static Criterion or(Criterion lhs, Criterion rhs) {
        return new Criterion(lhs.toString() + " or " + rhs.toString());
    }
//    public static Expression between(String propertyName, Object lo, Object hi) ;

    public static Criterion in(String propertyName, Object[] values) {
        return new Criterion(propertyName + " IN " + values.toString());
    }

    public static Criterion in(String propertyName, Collection values) {
        return new Criterion(propertyName + " IN " + values.toString());
    }

    private static class MatchMode {
    }
}
