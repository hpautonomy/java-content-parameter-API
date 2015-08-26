/*
 * Copyright 2009-2015 Hewlett-Packard Development Company, L.P.
 * Licensed under the MIT License (the "License"); you may not use this file except in compliance with the License.
 */
package com.autonomy.aci.content.identifier.stateid;

/**
 * An abstract base-class that partially implements the {@link StateRange} interface using sensible defaults.
 */
public abstract class AbstractStateRange implements StateRange {
    @Override
    public boolean equals(final Object object) {
        return object == this || object instanceof StateRange && toString().equals(object.toString());
    }

    @Override
    public int hashCode() {
        return toString().hashCode();
    }

    @Override
    public abstract String toString();

    /**
     * Simple implementation that tests for emptiness using {@code size() == 0}. In most cases this should be
     * overridden with a better implementation.
     *
     * @return {@code true} if and only if size is 0.
     */
    @Override
    public boolean isEmpty() {
        return size() == 0;
    }
}
