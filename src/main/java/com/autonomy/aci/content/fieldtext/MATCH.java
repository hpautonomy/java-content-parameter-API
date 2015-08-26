/*
 * Copyright 2009-2015 Hewlett-Packard Development Company, L.P.
 * Licensed under the MIT License (the "License"); you may not use this file except in compliance with the License.
 */

package com.autonomy.aci.content.fieldtext;

import com.autonomy.aci.content.internal.InternalUtils;

import java.util.Arrays;

import org.apache.commons.lang.Validate;

/**
 *
 */
public class MATCH extends Specifier {

    public MATCH(final String field, final String value, final String... values) {
        this(Arrays.asList(field), value, values);
    }

    public MATCH(final String field, final String[] values) {
        this(Arrays.asList(field), values);
    }

    public MATCH(final String field, final Iterable<String> values) {
        this(Arrays.asList(field), values);
    }

    public MATCH(final String[] fields, final String value, final String... values) {
        this(Arrays.asList(fields), value, values);
    }

    public MATCH(final String[] fields, final String[] values) {
        this(Arrays.asList(fields), values);
    }

    public MATCH(final String[] fields, final Iterable<String> values) {
        this(Arrays.asList(fields), values);
    }

    public MATCH(final Iterable<String> fields, final String value, final String... values) {
        this(fields, InternalUtils.toList(value, values));
    }

    public MATCH(final Iterable<String> fields, final String[] values) {
        this(fields, Arrays.asList(values));
    }

    public MATCH(final Iterable<String> fields, final Iterable<String> values) {
        super("MATCH", fields, values);
        Validate.isTrue(!getValues().isEmpty(), "No values specified");
    }

    public static MATCH MATCH(final String field, final String value, final String... values) {
        return new MATCH(field, value, values);
    }

    public static MATCH MATCH(final String field, final String[] values) {
        return new MATCH(field, values);
    }

    public static MATCH MATCH(final String field, final Iterable<String> values) {
        return new MATCH(field, values);
    }

    public static MATCH MATCH(final String[] fields, final String value, final String... values) {
        return new MATCH(fields, value, values);
    }

    public static MATCH MATCH(final String[] fields, final String[] values) {
        return new MATCH(fields, values);
    }

    public static MATCH MATCH(final String[] fields, final Iterable<String> values) {
        return new MATCH(fields, values);
    }

    public static MATCH MATCH(final Iterable<String> fields, final String value, final String... values) {
        return new MATCH(fields, value, values);
    }

    public static MATCH MATCH(final Iterable<String> fields, final String[] values) {
        return new MATCH(fields, values);
    }

    public static MATCH MATCH(final Iterable<String> fields, final Iterable<String> values) {
        return new MATCH(fields, values);
    }
}
