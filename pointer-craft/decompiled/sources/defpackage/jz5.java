package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;

/* JADX INFO: loaded from: classes2.dex */
public abstract class jz5 {
    public static ha2 b;
    public static final nm0 g = new nm0(-1111583204, false, new sm0(25));
    public static final nm0 y = new nm0(-828556521, false, new an0(2));
    public static final nm0 r = new nm0(-1300553930, false, new an0(3));
    public static final nm0 n = new nm0(399463655, false, new at(15));
    public static final nm0 v = new nm0(1471227509, false, new at(16));
    public static final nm0 x = new nm0(-1579129419, false, new sm0(26));
    public static final nm0 l = new nm0(394389020, false, new tm0(1));
    public static final nm0 j = new nm0(1641686618, false, new sm0(27));
    public static final nm0 t = new nm0(-1899582591, false, new tm0(2));
    public static final nm0 a = new nm0(692070956, false, new sm0(28));
    public static final nm0 m = new nm0(-1132253997, false, new tm0(3));
    public static final nm0 q = new nm0(484853436, false, new sm0(29));
    public static final nm0 w = new nm0(-775137903, false, new an0(0));
    public static final nm0 c = new nm0(1974217976, false, new tm0(4));
    public static final nm0 i = new nm0(-1721378297, false, new an0(1));

    public static final Object g(o41 o41Var, my1 my1Var, ou0 ou0Var) {
        Object obj;
        gh3 gh3VarU;
        Object objW0;
        ah3 ah3Var;
        if (((i73) o41Var).j.h) {
            i73 i73Var = (i73) o41Var;
            if (!i73Var.j.h) {
                mc2.y("visitAncestors called on an unattached node");
            }
            i73 i73Var2 = i73Var.j.q;
            um2 um2VarV = k33.V(o41Var);
            loop0: while (true) {
                obj = null;
                if (um2VarV == null) {
                    break;
                }
                if ((um2VarV.M.x.m & 524288) != 0) {
                    while (i73Var2 != null) {
                        if ((i73Var2.a & 524288) != 0) {
                            i73 i73VarQ = i73Var2;
                            rb3 rb3Var = null;
                            while (i73VarQ != null) {
                                if (i73VarQ instanceof h60) {
                                    obj = i73VarQ;
                                    break loop0;
                                }
                                if ((i73VarQ.a & 524288) != 0 && (i73VarQ instanceof p41)) {
                                    int i2 = 0;
                                    for (i73 i73Var3 = ((p41) i73VarQ).f; i73Var3 != null; i73Var3 = i73Var3.w) {
                                        if ((i73Var3.a & 524288) != 0) {
                                            i2++;
                                            if (i2 == 1) {
                                                i73VarQ = i73Var3;
                                            } else {
                                                if (rb3Var == null) {
                                                    rb3Var = new rb3(new i73[16]);
                                                }
                                                if (i73VarQ != null) {
                                                    rb3Var.y(i73VarQ);
                                                    i73VarQ = null;
                                                }
                                                rb3Var.y(i73Var3);
                                            }
                                        }
                                    }
                                    if (i2 == 1) {
                                    }
                                }
                                i73VarQ = k33.Q(rb3Var);
                            }
                        }
                        i73Var2 = i73Var2.q;
                    }
                }
                um2VarV = um2VarV.o();
                i73Var2 = (um2VarV == null || (ah3Var = um2VarV.M) == null) ? null : ah3Var.v;
            }
            h60 h60Var = (h60) obj;
            if (h60Var != null && (objW0 = h60Var.w0((gh3VarU = k33.U(o41Var)), new p2(my1Var, gh3VarU, (byte) 13), ou0Var)) == px0.j) {
                return objW0;
            }
        }
        return og5.g;
    }

    public static ux2 y(Context context) {
        ux2 ux2Var = ux2.y;
        if (Build.VERSION.SDK_INT < 33) {
            return ux2.g(Resources.getSystem().getConfiguration().getLocales().toLanguageTags());
        }
        Object systemService = context.getSystemService("locale");
        return systemService != null ? ux2.n(h2.j(systemService)) : ux2Var;
    }
}
