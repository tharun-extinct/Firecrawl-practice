package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class y74 {
    public z74 a;
    public tl1 c;
    public rr g;
    public vt4 j;
    public z74 m;
    public String n;
    public long q;
    public z74 t;
    public v42 v;
    public long w;
    public i14 y;
    public int r = -1;
    public b84 l = b84.j;
    public pb5 i = pb5.x;
    public fa4 x = new fa4((byte) 15);

    public static void y(String str, z74 z74Var) {
        if (z74Var != null) {
            if (z74Var.b != null) {
                l0.t(str.concat(".networkResponse != null"));
            } else if (z74Var.s != null) {
                l0.t(str.concat(".cacheResponse != null"));
            } else {
                if (z74Var.p == null) {
                    return;
                }
                l0.t(str.concat(".priorResponse != null"));
            }
        }
    }

    public final z74 g() {
        int i = this.r;
        if (i < 0) {
            up.j("code < 0: ", this.r);
            return null;
        }
        rr rrVar = this.g;
        if (rrVar == null) {
            l0.z("request == null");
            return null;
        }
        i14 i14Var = this.y;
        if (i14Var == null) {
            l0.z("protocol == null");
            return null;
        }
        String str = this.n;
        if (str == null) {
            l0.z("message == null");
            return null;
        }
        v42 v42Var = this.v;
        fa4 fa4Var = this.x;
        fa4Var.getClass();
        return new z74(rrVar, i14Var, str, i, v42Var, ec6.n(fa4Var), this.l, this.j, this.t, this.a, this.m, this.q, this.w, this.c, this.i);
    }
}
