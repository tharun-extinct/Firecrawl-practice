package defpackage;

import android.content.Context;
import android.view.accessibility.AccessibilityManager;

/* JADX INFO: loaded from: classes.dex */
public final class x8 implements y1 {
    public final AccessibilityManager g;

    public x8(Context context) {
        Object systemService = context.getSystemService("accessibility");
        systemService.getClass();
        this.g = (AccessibilityManager) systemService;
    }
}
