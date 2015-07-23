/*
 * PaletteToolButton.cs
 * Copyright © 2011 kbinani
 *
 * This file is part of org.kbinani.cadencii.
 *
 * org.kbinani.cadencii is free software; you can redistribute it and/or
 * modify it under the terms of the GPLv3 License.
 *
 * org.kbinani.cadencii is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
 */

package org.kbinani.cadencii;

import org.kbinani.windows.forms.*;


    public class PaletteToolButton extends BToggleButton
    {
        private String mPaletteToolID;

        public PaletteToolButton( String id )
        {
super();
mPaletteToolID = id;
        }

        public String getPaletteToolID()
        {
return mPaletteToolID;
        }
    }
