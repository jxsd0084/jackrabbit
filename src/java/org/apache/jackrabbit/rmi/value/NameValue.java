/*
 * Copyright 2004-2005 The Apache Software Foundation or its licensors,
 *                     as applicable.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.jackrabbit.rmi.value;

import java.io.Serializable;

import javax.jcr.PropertyType;
import javax.jcr.RepositoryException;
import javax.jcr.ValueFormatException;

/**
 * The <code>NameValue</code> class implements the committed value state for
 * Name values as a part of the State design pattern (Gof) used by this package.
 *
 * @author Felix Meschberger
 * @since 0.16.4.1
 */
public class NameValue extends BaseNonStreamValue
        implements Serializable, StatefulValue {

    /** The serial version UID */
    private static final long serialVersionUID = -2165655071495230179L;

    /** The name value. */
    private final String value;

    /**
     * Creates an instance for the given name <code>value</code>.
     */
    protected NameValue(String value) throws ValueFormatException {
        this.value = toName(value);
    }

    /**
     * Checks whether the string value adheres to the name syntax.
     *
     * @param value The string to check for synthactical compliance with a
     *      name value.
     *
     * @return The input value.
     *
     * @throws ValueFormatException if the string <code>value</code> is not a
     *      synthactically correct name.
     */
    protected static String toName(String value) throws ValueFormatException {
        // TODO: check syntax
        return value;
    }

    /**
     * Returns <code>PropertyType.NAME</code>.
     */
    public int getType() {
        return PropertyType.NAME;
    }

    /**
     * Returns the string representation of the Name value.
     */
    public String getString() throws ValueFormatException, RepositoryException {
        return value;
    }
}
