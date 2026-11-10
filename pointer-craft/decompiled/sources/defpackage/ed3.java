package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class ed3 extends bd3 {
    public final ArrayList j;
    public final String l;
    public final tf3 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ed3(tf3 tf3Var, String str) {
        super(tf3Var.y(xs2.o(id3.class)), null);
        tf3Var.getClass();
        str.getClass();
        this.j = new ArrayList();
        this.x = tf3Var;
        this.l = str;
    }

    public final dd3 r() {
        int iHashCode;
        dd3 dd3Var = (dd3) super.g();
        gd3 gd3Var = dd3Var.w;
        gd3Var.getClass();
        ArrayList arrayList = this.j;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ad3 ad3Var = (ad3) obj;
            if (ad3Var != null) {
                nu4 nu4Var = gd3Var.y;
                dd3 dd3Var2 = gd3Var.g;
                al alVar = dd3Var2.t;
                al alVar2 = ad3Var.t;
                int i2 = alVar2.g;
                String str = (String) alVar2.v;
                if (i2 == 0 && str == null) {
                    l0.u("Destinations must have an id or route. Call setId(), setRoute(), or include an android:id or app:route in your navigation XML.");
                    return null;
                }
                String str2 = (String) alVar.v;
                if (str2 != null && yf2.p(str, str2)) {
                    uo1.m("Destination ", ad3Var, " cannot have the same route as graph ", dd3Var2);
                    return null;
                }
                if (i2 == alVar.g) {
                    uo1.m("Destination ", ad3Var, " cannot have the same id as graph ", dd3Var2);
                    return null;
                }
                ad3 ad3Var2 = (ad3) c93.o(nu4Var, i2);
                if (ad3Var2 == ad3Var) {
                    continue;
                } else {
                    if (ad3Var.a != null) {
                        l0.z("Destination already has a parent set. Call NavGraph.remove() to remove the previous parent.");
                        return null;
                    }
                    if (ad3Var2 != null) {
                        ad3Var2.a = null;
                    }
                    ad3Var.a = dd3Var2;
                    nu4Var.n(alVar2.g, ad3Var);
                }
            }
        }
        String str3 = this.l;
        if (str3 == null) {
            if (this.y != null) {
                l0.z("You must set a start destination route");
                return null;
            }
            l0.z("You must set a start destination id");
            return null;
        }
        dd3 dd3Var3 = gd3Var.g;
        if (str3 != null) {
            if (str3.equals((String) dd3Var3.t.v)) {
                uo1.m("Start destination ", str3, " cannot use the same route as the graph ", dd3Var3);
            } else if (tx4.Y(str3)) {
                l0.u("Cannot have an empty start destination route");
            } else {
                int i3 = ad3.q;
                iHashCode = "android-app://androidx.navigation/".concat(str3).hashCode();
            }
            return dd3Var;
        }
        iHashCode = 0;
        gd3Var.r = iHashCode;
        gd3Var.v = str3;
        return dd3Var;
    }
}
