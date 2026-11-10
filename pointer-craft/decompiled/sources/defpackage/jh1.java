package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public abstract class jh1 implements ah1 {
    public int g;
    public final ArrayList y;

    public jh1(int i) {
        this.g = (i & 1) != 0 ? Integer.MAX_VALUE : 50;
        this.y = new ArrayList();
    }

    public final String n() {
        return ux4.G(cj0.q0(this.y, ",\n", null, null, null, 62), "  ");
    }
}
