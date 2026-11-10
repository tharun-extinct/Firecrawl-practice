package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class fa2 {
    public final ArrayList a;
    public final String g;
    public final float j;
    public final float l;
    public final float n;
    public final float r;
    public final List t;
    public final float v;
    public final float x;
    public final float y;

    public fa2(String str, float f, float f2, float f3, float f4, float f5, float f6, float f7, List list, int i) {
        str = (i & 1) != 0 ? "" : str;
        f = (i & 2) != 0 ? 0.0f : f;
        f2 = (i & 4) != 0 ? 0.0f : f2;
        f3 = (i & 8) != 0 ? 0.0f : f3;
        f4 = (i & 16) != 0 ? 1.0f : f4;
        f5 = (i & 32) != 0 ? 1.0f : f5;
        f6 = (i & 64) != 0 ? 0.0f : f6;
        f7 = (i & 128) != 0 ? 0.0f : f7;
        if ((i & 256) != 0) {
            int i2 = fj5.g;
            list = pi1.j;
        }
        ArrayList arrayList = new ArrayList();
        this.g = str;
        this.y = f;
        this.r = f2;
        this.n = f3;
        this.v = f4;
        this.x = f5;
        this.l = f6;
        this.j = f7;
        this.t = list;
        this.a = arrayList;
    }
}
