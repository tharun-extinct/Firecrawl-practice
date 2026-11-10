package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class j93 {
    public j51 a;
    public j75 c;
    public cj g;
    public a63 j;
    public List l;
    public k85 m;
    public boolean n;
    public rv q;
    public int r;
    public long s;
    public int v;
    public fl2 w;
    public int x;
    public ku1 y;
    public long t = qc2.g;
    public int i = -1;
    public int b = -1;

    public j93(cj cjVar, k85 k85Var, ku1 ku1Var, int i, boolean z, int i2, int i3, List list) {
        this.g = cjVar;
        this.y = ku1Var;
        this.r = i;
        this.n = z;
        this.v = i2;
        this.x = i3;
        this.l = list;
        this.m = k85Var;
    }

    public final int g(int i, fl2 fl2Var) {
        int i2 = this.i;
        int i3 = this.b;
        if (i == i2 && i2 != -1) {
            return i3;
        }
        long jG = zs0.g(0, i, 0, Integer.MAX_VALUE);
        if (this.x > 1) {
            a63 a63Var = this.j;
            k85 k85Var = this.m;
            j51 j51Var = this.a;
            j51Var.getClass();
            a63 a63VarL = ua6.l(a63Var, fl2Var, k85Var, j51Var, this.y);
            this.j = a63VarL;
            jG = a63VarL.g(this.x, jG);
        }
        int iN = js2.n(y(jG, fl2Var).v);
        int iA = ws0.a(jG);
        if (iN < iA) {
            iN = iA;
        }
        this.i = i;
        this.b = iN;
        return iN;
    }

    public final void n(j51 j51Var) {
        long jG;
        j51 j51Var2 = this.a;
        if (j51Var != null) {
            int i = qc2.y;
            jG = qc2.g(j51Var.y(), j51Var.w());
        } else {
            jG = qc2.g;
        }
        if (j51Var2 == null) {
            this.a = j51Var;
            this.t = jG;
        } else if (j51Var == null || this.t != jG) {
            this.a = j51Var;
            this.t = jG;
            this.s = (this.s << 2) | 1;
            this.q = null;
            this.c = null;
            this.b = -1;
            this.i = -1;
        }
    }

    public final boolean r(long j, fl2 fl2Var) {
        this.s = (this.s << 2) | 3;
        if (this.x > 1) {
            a63 a63Var = this.j;
            k85 k85Var = this.m;
            j51 j51Var = this.a;
            j51Var.getClass();
            a63 a63VarL = ua6.l(a63Var, fl2Var, k85Var, j51Var, this.y);
            this.j = a63VarL;
            j = a63VarL.g(this.x, j);
        }
        j75 j75Var = this.c;
        if (j75Var != null) {
            h93 h93Var = j75Var.y;
            i75 i75Var = j75Var.g;
            if (!h93Var.g.y()) {
                fl2 fl2Var2 = i75Var.j;
                long j2 = i75Var.a;
                if (fl2Var == fl2Var2 && (ws0.r(j, j2) || (ws0.t(j) == ws0.t(j2) && ws0.m(j) == ws0.m(j2) && ws0.j(j) >= h93Var.v && !h93Var.r))) {
                    j75 j75Var2 = this.c;
                    j75Var2.getClass();
                    if (ws0.r(j, j75Var2.g.a)) {
                        return false;
                    }
                    j75 j75Var3 = this.c;
                    j75Var3.getClass();
                    this.c = x(fl2Var, j, j75Var3.y);
                    return true;
                }
            }
        }
        this.c = x(fl2Var, j, y(j, fl2Var));
        return true;
    }

    public final String toString() {
        i75 i75Var;
        Object ws0Var = "null";
        String str = this.c != null ? "<TextLayoutResult>" : "null";
        String strY = qc2.y(this.t);
        long j = this.s;
        j75 j75Var = this.c;
        if (j75Var != null && (i75Var = j75Var.g) != null) {
            ws0Var = new ws0(i75Var.a);
        }
        StringBuilder sbZ = du4.z("MultiParagraphLayoutCache(textLayoutResult=", str, ", lastDensity=", strY, ", history=");
        sbZ.append(j);
        sbZ.append(", constraints=");
        sbZ.append(ws0Var);
        sbZ.append(")");
        return sbZ.toString();
    }

    public final rv v(fl2 fl2Var) {
        rv rvVar = this.q;
        if (rvVar == null || fl2Var != this.w || rvVar.y()) {
            this.w = fl2Var;
            cj cjVar = this.g;
            k85 k85VarD = v13.D(this.m, fl2Var);
            j51 j51Var = this.a;
            j51Var.getClass();
            ku1 ku1Var = this.y;
            List list = this.l;
            if (list == null) {
                list = pi1.j;
            }
            rvVar = new rv(cjVar, j51Var, ku1Var, k85VarD, list, this.n);
        }
        this.q = rvVar;
        return rvVar;
    }

    public final j75 x(fl2 fl2Var, long j, h93 h93Var) {
        float fMin = Math.min(h93Var.g.r(), h93Var.n);
        cj cjVar = this.g;
        k85 k85Var = this.m;
        List list = this.l;
        if (list == null) {
            list = pi1.j;
        }
        int i = this.v;
        boolean z = this.n;
        int i2 = this.r;
        j51 j51Var = this.a;
        j51Var.getClass();
        return new j75(new i75(cjVar, k85Var, list, i, z, i2, j51Var, fl2Var, this.y, j), h93Var, zs0.n(j, (((long) js2.n(fMin)) << 32) | (((long) js2.n(h93Var.v)) & 4294967295L)));
    }

    public final h93 y(long j, fl2 fl2Var) {
        rv rvVarV = v(fl2Var);
        long jC = sp2.c(rvVarV.r(), this.r, j, this.n);
        boolean z = this.n;
        int i = this.r;
        int i2 = this.v;
        return new h93(rvVarV, jC, ((z || !(i == 2 || i == 4 || i == 5)) && i2 >= 1) ? i2 : 1, i);
    }
}
