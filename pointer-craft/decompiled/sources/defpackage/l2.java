package defpackage;

import android.view.accessibility.AccessibilityNodeInfo;

/* JADX INFO: loaded from: classes2.dex */
public final class l2 {
    public Object g;

    public /* synthetic */ l2(Object obj) {
        this.g = obj;
    }

    public static l2 g(boolean z, int i, int i2, int i3, int i4) {
        return new l2(AccessibilityNodeInfo.CollectionItemInfo.obtain(i, i2, i3, i4, false, z));
    }
}
