package defpackage;

import android.content.Context;
import android.content.SharedPreferences;

/* JADX INFO: loaded from: classes2.dex */
public final class qw0 implements gr1 {
    public final /* synthetic */ Object a;
    public final /* synthetic */ byte j;
    public final /* synthetic */ Object m;
    public final /* synthetic */ Object q;
    public final /* synthetic */ Object t;

    public qw0(gr1 gr1Var, rw3 rw3Var, rw3 rw3Var2, vy0 vy0Var, SharedPreferences sharedPreferences) {
        this.j = (byte) 1;
        this.t = gr1Var;
        this.a = rw3Var;
        this.m = rw3Var2;
        this.q = sharedPreferences;
    }

    /* JADX WARN: Code duplicated, block: B:118:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:79:0x011d  */
    /* JADX WARN: Code duplicated, block: B:98:0x016a  */
    /* JADX WARN: Code duplicated, block: B:9:0x002c  */
    @Override // defpackage.gr1
    public final Object c(Object obj, mu0 mu0Var) {
        ry0 ry0Var;
        Object g84Var;
        p04 p04Var;
        jm4 jm4Var;
        gr1 gr1Var;
        Object objR;
        Object objA;
        byte b = this.j;
        px0 px0Var = px0.j;
        og5 og5Var = og5.g;
        Object obj2 = this.m;
        Object obj3 = this.t;
        boolean z = false;
        byte b2 = 1;
        Object obj4 = this.a;
        Object obj5 = this.q;
        switch (b) {
            case 0:
                b65 b65Var = (b65) obj2;
                mt2 mt2Var = (mt2) obj3;
                if (((Boolean) obj).booleanValue() && mt2Var.y()) {
                    vd6.j((v65) obj4, mt2Var, b65Var.q(), (ma2) obj5, b65Var.y);
                } else {
                    vd6.v(mt2Var);
                }
                return og5Var;
            case 1:
                if (mu0Var instanceof ry0) {
                    ry0Var = (ry0) mu0Var;
                    int i = ry0Var.q;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        ry0Var.q = i - Integer.MIN_VALUE;
                    } else {
                        ry0Var = new ry0(this, mu0Var);
                    }
                } else {
                    ry0Var = new ry0(this, mu0Var);
                }
                Object obj6 = ry0Var.m;
                int i2 = ry0Var.q;
                if (i2 == 0) {
                    js2.o(obj6);
                    gr1 gr1Var2 = (gr1) obj3;
                    db3 db3Var = (db3) obj;
                    String str = (String) db3Var.r((rw3) obj4);
                    if (str != null) {
                        try {
                            byte[] bArrG = ex.g(ex.v, str);
                            p04 p04Var2 = new p04();
                            np3.l(p04Var2, bArrG);
                            g84Var = p04Var2;
                        } catch (Throwable th) {
                            g84Var = new g84(th);
                        }
                        boolean z2 = g84Var instanceof g84;
                        Object obj7 = g84Var;
                        if (z2) {
                            obj7 = null;
                        }
                        p04Var = (p04) obj7;
                        if (p04Var != null) {
                            r04[] r04VarArr = p04Var.a;
                            r04VarArr.getClass();
                            if (r04VarArr.length == 0) {
                                p04Var = null;
                            }
                        } else {
                            p04Var = null;
                        }
                    } else {
                        p04Var = null;
                    }
                    String str2 = (String) db3Var.r((rw3) obj2);
                    yy0 yy0Var = new yy0(p04Var, str2, str2 != null ? jr2.E((String) db3Var.r(jr2.i(str2))) : null, vy0.l((SharedPreferences) obj5, str2));
                    ry0Var.q = 1;
                    if (gr1Var2.c(yy0Var, ry0Var) == px0Var) {
                        return px0Var;
                    }
                    break;
                } else {
                    if (i2 != 1) {
                        l0.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    js2.o(obj6);
                }
                return og5Var;
            case 2:
                ue2 ue2Var = (ue2) obj;
                s54 s54Var = (s54) obj2;
                s54 s54Var2 = (s54) obj4;
                s54 s54Var3 = (s54) obj3;
                if (ue2Var instanceof mx3) {
                    s54Var3.j++;
                } else if ((ue2Var instanceof nx3) || (ue2Var instanceof lx3)) {
                    s54Var3.j--;
                } else if (ue2Var instanceof p72) {
                    s54Var2.j++;
                } else if (ue2Var instanceof q72) {
                    s54Var2.j--;
                } else if (ue2Var instanceof gt1) {
                    s54Var.j++;
                } else if (ue2Var instanceof ht1) {
                    s54Var.j--;
                }
                byte b3 = 0;
                boolean z3 = s54Var3.j > 0;
                boolean z4 = s54Var2.j > 0;
                boolean z5 = s54Var.j > 0;
                j11 j11Var = (j11) obj5;
                if (j11Var.f != z3) {
                    j11Var.f = z3;
                    b3 = 1;
                }
                if (j11Var.k != z4) {
                    j11Var.k = z4;
                    b3 = 1;
                }
                if (j11Var.d != z5) {
                    j11Var.d = z5;
                } else {
                    b2 = b3;
                }
                if (b2 != 0) {
                    c93.A(j11Var);
                }
                return og5Var;
            default:
                Context context = (Context) obj5;
                rw3 rw3Var = (rw3) obj4;
                if (mu0Var instanceof jm4) {
                    jm4Var = (jm4) mu0Var;
                    int i3 = jm4Var.q;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        jm4Var.q = i3 - Integer.MIN_VALUE;
                    } else {
                        jm4Var = new jm4(this, mu0Var);
                    }
                } else {
                    jm4Var = new jm4(this, mu0Var);
                }
                Object obj8 = jm4Var.m;
                int i4 = jm4Var.q;
                if (i4 != 0) {
                    if (i4 == 1) {
                        objA = jm4Var.i;
                        gr1Var = jm4Var.w;
                        js2.o(obj8);
                    } else {
                        if (i4 != 2) {
                            l0.z("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        js2.o(obj8);
                    }
                    return og5Var;
                }
                js2.o(obj8);
                gr1Var = (gr1) obj3;
                objR = ((db3) obj).r(rw3Var);
                if (objR == null) {
                    objA = ((xy1) obj2).a(context);
                    vz0 vz0VarG = q03.g(context);
                    lm4 lm4Var = new lm4(rw3Var, objA, z ? 1 : 0, b2);
                    jm4Var.w = gr1Var;
                    jm4Var.i = objA;
                    jm4Var.q = 1;
                    if (kq2.k(vz0VarG, lm4Var, jm4Var) == px0Var) {
                        return px0Var;
                    }
                }
                jm4Var.w = null;
                jm4Var.i = null;
                jm4Var.q = 2;
                if (gr1Var.c(objR, jm4Var) == px0Var) {
                    return px0Var;
                }
                return og5Var;
                objR = objA;
                jm4Var.w = null;
                jm4Var.i = null;
                jm4Var.q = 2;
                if (gr1Var.c(objR, jm4Var) == px0Var) {
                    return px0Var;
                }
                return og5Var;
        }
    }

    public /* synthetic */ qw0(Object obj, Object obj2, Object obj3, Object obj4, byte b) {
        this.j = b;
        this.t = obj;
        this.a = obj2;
        this.m = obj3;
        this.q = obj4;
    }
}
