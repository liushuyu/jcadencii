/*
 * BPropertyValueChangedEventArgs.cs
 * Copyright © 2011 kbinani
 *
 * This file is part of org.kbinani.windows.forms.
 *
 * org.kbinani.windows.forms is free software; you can redistribute it and/or
 * modify it under the terms of the BSD License.
 *
 * org.kbinani.windows.forms is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
 */
package org.kbinani.windows.forms;

import org.kbinani.BEventArgs;


public class BPropertyValueChangedEventArgs extends BEventArgs {
    /**
     * not supported
     */
    public Object GridItem = null;
    public Object OldValue = null;

    public BPropertyValueChangedEventArgs() {
    }
}
