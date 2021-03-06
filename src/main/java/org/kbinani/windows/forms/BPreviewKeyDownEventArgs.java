/*
 * BPreviewKeyDownEventArgs.cs
 * Copyright © 2009-2011 kbinani
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

import java.awt.event.KeyEvent;


public class BPreviewKeyDownEventArgs extends BEventArgs {
    private KeyEvent m_original = null;
    public boolean Alt;
    public boolean Control;
    public int KeyValue;
    public boolean Shift;

    public BPreviewKeyDownEventArgs(KeyEvent e) {
        m_original = e;

        Alt = m_original.isAltDown();
        Control = m_original.isControlDown();
        KeyValue = m_original.getKeyCode();
        Shift = m_original.isShiftDown();
    }

    public KeyEvent getRawEvent() {
        return m_original;
    }

    public char getKeyChar() {
        if (m_original == null) {
            return '\0';
        } else {
            return m_original.getKeyChar();
        }
    }

    public int getKeyCode() {
        if (m_original == null) {
            return 0;
        } else {
            return m_original.getKeyCode();
        }
    }

    public int getModifiers() {
        if (m_original == null) {
            return 0;
        } else {
            return m_original.getModifiers();
        }
    }
}
