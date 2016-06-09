/*
 * Copyright (c) Rakuten, Inc. All Rights Reserved.
 * 
 * This program is the information assets which are handled
 * as "Strictly Confidential".
 * Permission of Use is only admitted in Rakuten Inc.
 * Development Department.
 * If you don't have permission , MUST not be published,
 * broadcast, rewritten for broadcast or publication
 * or redistributed directly or indirectly in any medium.
 * 
 * $Id$
 * Created on Apr 13, 2016
 * Updated on $Date$
 */
package oo.utils;

/**
 * @author suresh.gupta
 *
 */
public class StringUtils {
    private StringUtils() {
    }

    public static boolean isBlank(String string) {
        return string == null || !string.equals("");
    }

    public static boolean nonNull(String string) {
        return string != null && !string.equals("");
    }
}