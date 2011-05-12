/*
 * Copyright (c) SymphonySoft Limited. All rights reserved.
 * http://www.symphonysoft.com
 *
 * The software in this package is published under the terms of the BSD
 * style license a copy of which has been included with this distribution in
 * the LICENSE-MULE.txt file.
 */

package com.mirth.connect.model;

import java.util.Properties;

import org.apache.commons.lang.BooleanUtils;
import org.apache.commons.lang.math.NumberUtils;

public abstract class AbstractSettings {

    public abstract Properties getProperties();

    public abstract void setProperties(Properties properties);

    /**
     * Takes a String and returns a Boolean Object.
     * "1" = true
     * "0" = false
     * null or not a number = null
     * 
     * @param str
     * @return
     */
    protected Boolean intToBooleanObject(String str) {
        int i = NumberUtils.toInt(str, -1);
        return (i == -1 ? null : BooleanUtils.toBooleanObject(i));
    }

    /**
     * Takes a String and returns an Integer Object.
     * "1" = 1
     * null or not a number = null
     * 
     * @param str
     * @return
     */
    protected Integer toIntegerObject(String str) {
        int i = NumberUtils.toInt(str, -1);
        return (i == -1 ? null : i);
    }
    
    /**
     * Takes a String and returns a Long Object.
     * "1" = 1
     * null or not a number = null
     * 
     * @param str
     * @return
     */
    protected Long toLongObject(String str) {
        long i = NumberUtils.toLong(str, -1);
        return (i == -1 ? null : i);
    }
}