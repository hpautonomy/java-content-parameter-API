/*
 * Copyright 2009-2015 Hewlett-Packard Development Company, L.P.
 * Licensed under the MIT License (the "License"); you may not use this file except in compliance with the License.
 */

package com.autonomy.aci.content.fieldtext;

import com.autonomy.aci.content.internal.InternalUtils;

import java.util.Arrays;

/**
 *
 */
public class LESS extends Specifier {

    public LESS(final String field, final Number value) {
        this(Arrays.asList(field), value);
    }

    public LESS(final String[] fields, final Number value) {
        this(Arrays.asList(fields), value);
    }

    public LESS(final Iterable<String> fields, final Number value) {
        super("LESS", fields, InternalUtils.numberToString(value));
    }

    public final double getNumericValue() {
        return Double.parseDouble(getValues().get(0));
    }

    public static LESS LESS(final String field, final Number value) {
        return new LESS(field, value);
    }

    public static LESS LESS(final String[] fields, final Number value) {
        return new LESS(fields, value);
    }

    public static LESS LESS(final Iterable<String> fields, final Number value) {
        return new LESS(fields, value);
    }
}
