package defpackage;

import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class xo4 {
    public final boolean g;
    public final p8 n;
    public no1 r;
    public no1 v;
    public no1 x;
    public final xy1 y;

    public xo4(boolean z, my1 my1Var, my1 my1Var2, yo4 yo4Var, xy1 xy1Var) {
        this.g = z;
        this.y = xy1Var;
        if (z && yo4Var == yo4.a) {
            l0.u("The initial value must not be set to PartiallyExpanded if skipPartiallyExpanded is set to true.");
            throw null;
        }
        this.r = wo4.g;
        this.n = new p8(yo4Var, new tz2(my1Var, (byte) 6), my1Var2, new m63(this, (byte) 4), xy1Var);
        this.v = m50.a0();
        this.x = m50.a0();
    }

    public static Object g(xo4 xo4Var, yo4 yo4Var, no1 no1Var, zz4 zz4Var) {
        Object objY = xo4Var.n.y(yo4Var, ub3.j, new ve1(xo4Var, ((pp3) xo4Var.n.w).d(), no1Var, null, (byte) 1), zz4Var);
        return objY == px0.j ? objY : og5.g;
    }

    public final boolean n() {
        return ((tp3) this.n.l).getValue() != yo4.j;
    }

    public final Object r(zz4 zz4Var) {
        Object objG;
        xy1 xy1Var = this.y;
        yo4 yo4Var = yo4.j;
        return (((Boolean) xy1Var.a(yo4Var)).booleanValue() && (objG = g(this, yo4Var, this.x, zz4Var)) == px0.j) ? objG : og5.g;
    }

    public final Object v(zz4 zz4Var) {
        Object objG;
        if (this.g) {
            l0.z("Attempted to animate to partial expanded when skipPartiallyExpanded was enabled. Set skipPartiallyExpanded to false to use this function.");
            return null;
        }
        xy1 xy1Var = this.y;
        yo4 yo4Var = yo4.a;
        return (((Boolean) xy1Var.a(yo4Var)).booleanValue() && (objG = g(this, yo4Var, this.x, zz4Var)) == px0.j) ? objG : og5.g;
    }

    public final Object x(zz4 zz4Var) {
        Object objG;
        Map map = this.n.n().g;
        yo4 yo4Var = yo4.a;
        if (!map.containsKey(yo4Var)) {
            yo4Var = yo4.t;
        }
        return (((Boolean) this.y.a(yo4Var)).booleanValue() && (objG = g(this, yo4Var, this.v, zz4Var)) == px0.j) ? objG : og5.g;
    }

    public final Object y(zz4 zz4Var) {
        Object objG;
        xy1 xy1Var = this.y;
        yo4 yo4Var = yo4.t;
        return (((Boolean) xy1Var.a(yo4Var)).booleanValue() && (objG = g(this, yo4Var, this.v, zz4Var)) == px0.j) ? objG : og5.g;
    }
}
