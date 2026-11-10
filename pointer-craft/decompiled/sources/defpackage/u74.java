package defpackage;

import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;

/* JADX INFO: loaded from: classes.dex */
public final class u74 {
    public final ColorStateList g;
    public final int r;
    public final Configuration y;

    public u74(ColorStateList colorStateList, Configuration configuration, Resources.Theme theme) {
        this.g = colorStateList;
        this.y = configuration;
        this.r = theme == null ? 0 : theme.hashCode();
    }
}
