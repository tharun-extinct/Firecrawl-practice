package defpackage;

import android.os.Bundle;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public abstract class de3 {
    public static final r40 a;
    public static final r40 j;
    public static final q40 l;
    public static final q40 m;
    public static final r40 n;
    public static final q40 r;
    public static final q40 t;
    public static final q40 v;
    public static final r40 x;
    public static final r40 y;
    public final boolean g;

    static {
        byte b = 2;
        boolean z = false;
        y = new r40(b, z);
        boolean z2 = true;
        r = new q40(b, z2);
        byte b2 = 3;
        n = new r40(b2, z);
        v = new q40(b2, z2);
        byte b3 = 1;
        x = new r40(b3, z);
        l = new q40(b3, z2);
        byte b4 = 0;
        j = new r40(b4, z);
        t = new q40(b4, z2);
        byte b5 = 4;
        a = new r40(b5, z2);
        m = new q40(b5, z2);
    }

    public de3(boolean z) {
        this.g = z;
    }

    public Object g(String str, Bundle bundle) {
        bundle.getClass();
        return (Parcelable[]) bundle.get(str);
    }

    public Object n(String str) {
        throw new UnsupportedOperationException("Arrays don't support default values.");
    }

    public Object r(Object obj, String str) {
        return n(str);
    }

    public final String toString() {
        return y();
    }

    public void v(Bundle bundle, String str, Object obj) {
        str.getClass();
        bundle.putIntArray(str, (int[]) obj);
    }

    public boolean x(Object obj, Object obj2) {
        return yf2.p(obj, obj2);
    }

    public String y() {
        return "integer[]";
    }
}
