package defpackage;

import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public final class zc3 implements Comparable {
    public final boolean a;
    public final ad3 j;
    public final int m;
    public final boolean q;
    public final Bundle t;
    public final int w;

    public zc3(ad3 ad3Var, Bundle bundle, boolean z, int i, boolean z2, int i2) {
        this.j = ad3Var;
        this.t = bundle;
        this.a = z;
        this.m = i;
        this.q = z2;
        this.w = i2;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public final int compareTo(zc3 zc3Var) {
        zc3Var.getClass();
        boolean z = zc3Var.q;
        boolean z2 = zc3Var.a;
        Bundle bundle = zc3Var.t;
        boolean z3 = this.a;
        if (z3 && !z2) {
            return 1;
        }
        if (!z3 && z2) {
            return -1;
        }
        int i = this.m - zc3Var.m;
        if (i > 0) {
            return 1;
        }
        if (i < 0) {
            return -1;
        }
        Bundle bundle2 = this.t;
        if (bundle2 != null && bundle == null) {
            return 1;
        }
        if (bundle2 == null && bundle != null) {
            return -1;
        }
        if (bundle2 != null) {
            bundle2.getClass();
            int size = bundle2.size();
            bundle.getClass();
            int size2 = size - bundle.size();
            if (size2 > 0) {
                return 1;
            }
            if (size2 < 0) {
                return -1;
            }
        }
        boolean z4 = this.q;
        if (z4 && !z) {
            return 1;
        }
        if (z4 || !z) {
            return this.w - zc3Var.w;
        }
        return -1;
    }
}
