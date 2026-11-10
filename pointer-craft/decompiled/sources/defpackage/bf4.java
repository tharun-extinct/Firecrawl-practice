package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class bf4 {
    public final String g;
    public final boolean n;
    public final ha2 r;
    public final boolean v;
    public final List x;
    public final int y;

    /* JADX WARN: Illegal instructions before constructor call */
    public bf4(String str, int i, ha2 ha2Var, boolean z, List list, int i2) {
        boolean z2 = (i2 & 32) == 0;
        uv2 uv2VarC = pw5.c();
        if (z2) {
            uv2VarC.add(ek.g);
        }
        if (!list.isEmpty()) {
            uv2VarC.add(new gk(list));
        }
        this(str, i, ha2Var, z, true, pw5.a(uv2VarC));
    }

    public bf4(String str, int i, ha2 ha2Var, boolean z, boolean z2, uv2 uv2Var) {
        this.g = str;
        this.y = i;
        this.r = ha2Var;
        this.n = z;
        this.v = z2;
        this.x = uv2Var;
    }

    public /* synthetic */ bf4(String str, int i, ha2 ha2Var) {
        this(str, i, ha2Var, false, false, (uv2) null);
    }
}
