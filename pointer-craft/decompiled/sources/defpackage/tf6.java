package defpackage;

import android.os.Build;
import android.view.accessibility.AccessibilityEvent;

/* JADX INFO: loaded from: classes2.dex */
public abstract class tf6 {
    public static void y(AccessibilityEvent accessibilityEvent, boolean z) {
        if (Build.VERSION.SDK_INT >= 34) {
            t1.a(accessibilityEvent, z);
        }
    }
}
