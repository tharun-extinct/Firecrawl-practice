package defpackage;

import android.content.Context;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public abstract class be2 {
    public static Context g;
    public static Boolean y;

    public static final void g(boolean z, n74 n74Var, b65 b65Var, h02 h02Var, int i) {
        int i2;
        k75 k75VarN;
        h02Var.Z(-1344558920);
        if ((i & 6) == 0) {
            i2 = (h02Var.l(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= h02Var.n(n74Var.ordinal()) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= h02Var.j(b65Var) ? 256 : 128;
        }
        if (h02Var.N(i2 & 1, (i2 & 147) != 146)) {
            int i3 = i2 & 14;
            boolean zX = (i3 == 4) | h02Var.x(b65Var);
            Object objK = h02Var.K();
            l76 l76Var = oo0.g;
            if (zX || objK == l76Var) {
                objK = new y55(b65Var, z);
                h02Var.i0(objK);
            }
            r45 r45Var = (r45) objK;
            boolean zJ = (i3 == 4) | h02Var.j(b65Var);
            Object objK2 = h02Var.K();
            if (zJ || objK2 == l76Var) {
                objK2 = new c65(b65Var, z);
                h02Var.i0(objK2);
            }
            cj3 cj3Var = (cj3) objK2;
            boolean zL = u75.l(b65Var.q().y);
            int i4 = (int) (z ? b65Var.q().y >> 32 : b65Var.q().y & 4294967295L);
            mt2 mt2Var = b65Var.n;
            float fL = 0.0f;
            if (mt2Var != null && (k75VarN = mt2Var.n()) != null) {
                j75 j75Var = k75VarN.g;
                if (i4 >= 0) {
                    i75 i75Var = j75Var.g;
                    h93 h93Var = j75Var.y;
                    if (i75Var.g.t.length() != 0) {
                        int iMin = Math.min(h93Var.n(i4), Math.min(h93Var.y - 1, h93Var.x - 1));
                        if (i4 <= h93Var.r(iMin, false)) {
                            h93Var.q(iMin);
                            ArrayList arrayList = h93Var.j;
                            hp3 hp3Var = (hp3) arrayList.get(xs2.s(iMin, arrayList));
                            fL = hp3Var.g.n.l(iMin - hp3Var.n);
                        }
                    }
                }
            }
            float f = fL;
            boolean zJ2 = h02Var.j(r45Var);
            Object objK3 = h02Var.K();
            if (zJ2 || objK3 == l76Var) {
                objK3 = new qm1(r45Var, (byte) 6);
                h02Var.i0(objK3);
            }
            gh6.y(cj3Var, z, n74Var, zL, 0L, f, b05.g(g73.g, r45Var, (PointerInputEventHandler) objK3), h02Var, (i2 << 3) & 1008);
        } else {
            h02Var.Q();
        }
        u34 u34VarP = h02Var.p();
        if (u34VarP != null) {
            u34VarP.n = new us(z, n74Var, b65Var, i);
        }
    }

    public static final boolean n(b65 b65Var, boolean z) {
        bl2 bl2VarR;
        mt2 mt2Var = b65Var.n;
        if (mt2Var == null || (bl2VarR = mt2Var.r()) == null) {
            return false;
        }
        k44 k44VarY = qf6.y(bl2VarR);
        long jA = b65Var.a(z);
        float f = k44VarY.g;
        float f2 = k44VarY.r;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jA >> 32));
        if (f > fIntBitsToFloat || fIntBitsToFloat > f2) {
            return false;
        }
        float f3 = k44VarY.y;
        float f4 = k44VarY.n;
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jA & 4294967295L));
        return f3 <= fIntBitsToFloat2 && fIntBitsToFloat2 <= f4;
    }

    public static zi r(bj bjVar) {
        return new zi(bjVar.y, bjVar.r, bjVar.g, bjVar.n);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object v(my1 my1Var, bz1 bz1Var, ou0 ou0Var) {
        q7 q7Var;
        if (ou0Var instanceof q7) {
            q7Var = (q7) ou0Var;
            int i = q7Var.q;
            if ((i & Integer.MIN_VALUE) != 0) {
                q7Var.q = i - Integer.MIN_VALUE;
            } else {
                q7Var = new q7(ou0Var);
            }
        } else {
            q7Var = new q7(ou0Var);
        }
        Object obj = q7Var.m;
        int i2 = q7Var.q;
        mu0 mu0Var = null;
        try {
            if (i2 == 0) {
                js2.o(obj);
                w7 w7Var = new w7(my1Var, bz1Var, mu0Var, (byte) 0);
                q7Var.q = 1;
                Object objB = k33.B(w7Var, q7Var);
                px0 px0Var = px0.j;
                if (objB == px0Var) {
                    return px0Var;
                }
            } else {
                if (i2 != 1) {
                    l0.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                js2.o(obj);
            }
        } catch (f7 unused) {
        }
        return og5.g;
    }

    public static ft5 y(Context context) {
        gt5 gt5Var;
        synchronized (dt5.class) {
            gt5Var = dt5.g;
            if (gt5Var == null) {
                Context applicationContext = context.getApplicationContext();
                if (applicationContext != null) {
                    context = applicationContext;
                }
                gt5Var = new gt5(context);
                dt5.g = gt5Var;
            }
        }
        return (ft5) gt5Var.j.g();
    }
}
