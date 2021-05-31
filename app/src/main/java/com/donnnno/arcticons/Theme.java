package com.donnnno.arcticons;

public enum Theme {
    LIGHT,
    DARK,
    SYSTEM,

    private static Theme[] _values;

    static {
        _values = values();
    }

    public static Theme fromInteger(int x) {
        return _values[x];
    }
    }
