/*
 * Copyright 2009-2015 Hewlett-Packard Development Company, L.P.
 * Licensed under the MIT License (the "License"); you may not use this file except in compliance with the License.
 */
package com.autonomy.aci.content.fieldtext;

import com.autonomy.aci.content.internal.InternalUtils;
import org.apache.commons.lang.Validate;

import java.util.Arrays;
import java.util.Collections;

/**
 *
 */
public class NOTSTRING extends Specifier {

    public NOTSTRING(final String field, final String value, final String... values) {
        this(Collections.singletonList(field), value, values);
    }

    public NOTSTRING(final String field, final String[] values) {
        this(Collections.singletonList(field), values);
    }

    public NOTSTRING(final String field, final Iterable<String> values) {
        this(Collections.singletonList(field), values);
    }

    public NOTSTRING(final String[] fields, final String value, final String... values) {
        this(Arrays.asList(fields), value, values);
    }

    public NOTSTRING(final String[] fields, final String[] values) {
        this(Arrays.asList(fields), values);
    }

    public NOTSTRING(final String[] fields, final Iterable<String> values) {
        this(Arrays.asList(fields), values);
    }

    public NOTSTRING(final Iterable<String> fields, final String value, final String... values) {
        this(fields, InternalUtils.toList(value, values));
    }

    public NOTSTRING(final Iterable<String> fields, final String[] values) {
        this(fields, Arrays.asList(values));
    }

    public NOTSTRING(final Iterable<String> fields, final Iterable<String> values) {
        super("NOTSTRING", fields, values);
        Validate.isTrue(!getValues().isEmpty(), "No values specified");
    }

    public static NOTSTRING NOTSTRING(final String field, final String value, final String... values) {
        return new NOTSTRING(field, value, values);
    }

    public static NOTSTRING NOTSTRING(final String field, final String[] values) {
        return new NOTSTRING(field, values);
    }

    public static NOTSTRING NOTSTRING(final String field, final Iterable<String> values) {
        return new NOTSTRING(field, values);
    }

    public static NOTSTRING NOTSTRING(final String[] fields, final String value, final String... values) {
        return new NOTSTRING(fields, value, values);
    }

    public static NOTSTRING NOTSTRING(final String[] fields, final String[] values) {
        return new NOTSTRING(fields, values);
    }

    public static NOTSTRING NOTSTRING(final String[] fields, final Iterable<String> values) {
        return new NOTSTRING(fields, values);
    }

    public static NOTSTRING NOTSTRING(final Iterable<String> fields, final String value, final String... values) {
        return new NOTSTRING(fields, value, values);
    }

    public static NOTSTRING NOTSTRING(final Iterable<String> fields, final String[] values) {
        return new NOTSTRING(fields, values);
    }

    public static NOTSTRING NOTSTRING(final Iterable<String> fields, final Iterable<String> values) {
        return new NOTSTRING(fields, values);
    }
}
