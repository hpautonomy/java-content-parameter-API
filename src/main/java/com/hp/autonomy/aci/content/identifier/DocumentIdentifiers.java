/*
 * Copyright 2009-2015 Hewlett-Packard Development Company, L.P.
 * Licensed under the MIT License (the "License"); you may not use this file except in compliance with the License.
 */
package com.hp.autonomy.aci.content.identifier;

/**
 * {@code DocumentIdentifiers} can be used to identify documents in a <tt>query</tt> or <tt>getcontent</tt> action, as
 * well as in a <tt>DREREPLACE</tt>.
 *
 * <p>Example 1, filtering out documents:
 *
 * <pre>
 *    DocumentIdentifiers identifiers = ...;
 *
 *    AciParameters parameters = new AciParameters("query");
 *    parameters.add("text", "*");
 *    parameters.add(identifiers.getDontMatchParameterName(), identifiers);
 * </pre>
 *
 * Example 2, using <tt>getcontent</tt>:
 *
 * <pre>
 *    DocumentIdentifiers identifiers = ...;
 *
 *    AciParameters parameters = new AciParameters("getcontent");
 *    parameters.add(identifiers.getGetContentParameterName(), identifiers);
 * </pre>
 */
public interface DocumentIdentifiers extends QueryIdentifiers {
    String DONT_MATCH_ID = "dontmatchid";
    String DONT_MATCH_REFERENCE = "dontmatchreference";
    String STATE_DONT_MATCH_ID = "statedontmatchid";

    String ID = "id";
    String REFERENCE = "reference";
    String STATE_ID = "stateid";

    /**
     * The name of the <tt>getcontent</tt> ACI parameter to use for this set of identifiers, such as <tt>reference</tt>.
     *
     * @return The <tt>getcontent</tt> parameter name
     */
    String getGetContentParameterName();

    /**
     * The name of the 'dontmatch' parameter to use for this set of identifiers, such as <tt>dontmatchreference</tt>.
     *
     * @return The 'dontmatch' parameter name
     */
    String getDontMatchParameterName();
}