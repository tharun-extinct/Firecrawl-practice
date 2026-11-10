package defpackage;

import android.os.Build;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zc6 {
    public static final sj0 g = sj0.m;
    public static final in4 y = in4.a;
    public static final sj0 r = sj0.t;
    public static final nf5 n = nf5.a;

    public static final void g(String str, h02 h02Var, int i) {
        h02Var.Z(-223312906);
        int i2 = (h02Var.x(str) ? 4 : 2) | i;
        if (h02Var.N(i2 & 1, (i2 & 3) != 2)) {
            j73 j73VarR = mq4.r(g73.g, 1.0f);
            t33 t33VarR = z50.r(hi0.w, false);
            int iHashCode = Long.hashCode(h02Var.T);
            tr3 tr3VarQ = h02Var.q();
            j73 j73VarW = m50.W(h02Var, j73VarR);
            jo0.n.getClass();
            h02Var.b0();
            if (h02Var.S) {
                h02Var.m(um2.Z);
            } else {
                h02Var.l0();
            }
            xs2.E(tg1.w, h02Var, t33VarR);
            xs2.E(tg1.q, h02Var, tr3VarQ);
            xs2.E(tg1.c, h02Var, Integer.valueOf(iHashCode));
            xs2.D(h02Var);
            xs2.E(tg1.m, h02Var, j73VarW);
            uz4.g(null, ((un4) h02Var.a(vn4.g)).v, ((rj0) h02Var.a(tj0.g)).b, 0L, 6.0f, 6.0f, null, ue5.m0(197268725, new wo(str, (byte) 5), h02Var), h02Var, 12804096, 73);
            h02Var.b(true);
        } else {
            h02Var.Q();
        }
        u34 u34VarP = h02Var.p();
        if (u34VarP != null) {
            u34VarP.n = new wo(str, i, (byte) 6);
        }
    }

    public static String r(String str, Object... objArr) {
        int length;
        int length2;
        int iIndexOf;
        String strA;
        int i = 0;
        int i2 = 0;
        while (true) {
            length = objArr.length;
            if (i2 >= length) {
                break;
            }
            Object obj = objArr[i2];
            if (obj == null) {
                strA = "null";
            } else {
                try {
                    strA = obj.toString();
                } catch (Exception e) {
                    String strI = du4.i(obj.getClass().getName(), "@", Integer.toHexString(System.identityHashCode(obj)));
                    Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for ".concat(strI), (Throwable) e);
                    strA = xi3.a("<", strI, " threw ", e.getClass().getName(), ">");
                }
            }
            objArr[i2] = strA;
            i2++;
        }
        StringBuilder sb = new StringBuilder(str.length() + (length * 16));
        int i3 = 0;
        while (true) {
            length2 = objArr.length;
            if (i >= length2 || (iIndexOf = str.indexOf("%s", i3)) == -1) {
                break;
            }
            sb.append((CharSequence) str, i3, iIndexOf);
            sb.append(objArr[i]);
            i++;
            i3 = iIndexOf + 2;
        }
        sb.append((CharSequence) str, i3, str.length());
        if (i < length2) {
            sb.append(" [");
            sb.append(objArr[i]);
            for (int i4 = i + 1; i4 < objArr.length; i4++) {
                sb.append(", ");
                sb.append(objArr[i4]);
            }
            sb.append(']');
        }
        return sb.toString();
    }

    public static boolean y() {
        return Build.VERSION.SDK_INT >= 26;
    }
}
