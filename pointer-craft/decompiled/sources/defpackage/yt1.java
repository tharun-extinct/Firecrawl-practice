package defpackage;

import android.graphics.Rect;
import java.util.Comparator;

/* JADX INFO: loaded from: classes2.dex */
public final class yt1 implements Comparator {
    public final t32 n;
    public final boolean r;
    public final Rect g = new Rect();
    public final Rect y = new Rect();

    public yt1(boolean z, t32 t32Var) {
        this.r = z;
        this.n = t32Var;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        this.n.getClass();
        Rect rect = this.g;
        ((m2) obj).t(rect);
        Rect rect2 = this.y;
        ((m2) obj2).t(rect2);
        int i = rect.top;
        int i2 = rect2.top;
        if (i < i2) {
            return -1;
        }
        if (i > i2) {
            return 1;
        }
        int i3 = rect.left;
        int i4 = rect2.left;
        boolean z = this.r;
        if (i3 < i4) {
            return z ? 1 : -1;
        }
        if (i3 > i4) {
            return z ? -1 : 1;
        }
        int i5 = rect.bottom;
        int i6 = rect2.bottom;
        if (i5 < i6) {
            return -1;
        }
        if (i5 > i6) {
            return 1;
        }
        int i7 = rect.right;
        int i8 = rect2.right;
        if (i7 < i8) {
            return z ? 1 : -1;
        }
        if (i7 > i8) {
            return z ? -1 : 1;
        }
        return 0;
    }
}
