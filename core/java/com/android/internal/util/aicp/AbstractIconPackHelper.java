package com.android.internal.util.aicp;

import android.content.pm.ActivityInfo;
import android.content.res.Resources;

public interface AbstractIconPackHelper {
    boolean isIconPackLoaded();
    int getResourceIdForActivityIcon(ActivityInfo info);
    Resources getIconPackResources();
}
