package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.view.accessibility.AccessibilityNodeInfo;

/* JADX INFO: loaded from: classes2.dex */
public final class k2 implements nt5 {
    public static k2 t;
    public Object j;

    public k2() {
        this.j = new Object();
        new Handler(Looper.getMainLooper(), new ms4(this, (byte) 0));
    }

    public static k2 n(int i, int i2, int i3) {
        return new k2(AccessibilityNodeInfo.CollectionInfo.obtain(i, i2, false, i3));
    }

    public static k2 r(float f, float f2, float f3) {
        return new k2(AccessibilityNodeInfo.RangeInfo.obtain(1, f, f2, f3));
    }

    @Override // defpackage.nt5
    public Object g() {
        return this.j;
    }

    public Object y() {
        return this.j;
    }

    public /* synthetic */ k2(Object obj) {
        this.j = obj;
    }
}
