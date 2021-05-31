package com.donnnno.arcticons;

import com.google.common.collect.ImmutableMap;

import java.util.Map;

public class ThemeMap {
    private ThemeMap() {

    }

    public static final Map<Theme, Integer> DEFAULT = ImmutableMap.of(
            Theme.LIGHT, R.style.Theme_Arcticons_Light_Default,
            Theme.DARK, R.style.Theme_Arcticons_Dark_Default,
    );

    public static final Map<Theme, Integer> NO_ACTION_BAR = ImmutableMap.of(
            Theme.LIGHT, R.style.Theme_Arcticons_Light_NoActionBar,
            Theme.DARK, R.style.Theme_Arcticons_Dark_NoActionBar,
    );
}