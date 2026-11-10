package defpackage;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class y36 extends y66 {
    private static final y36 zzb;
    private h76 zzd = n96.q;

    static {
        y36 y36Var = new y36();
        zzb = y36Var;
        y66.x(y36.class, y36Var);
    }

    public static void p(y36 y36Var, ArrayList arrayList) {
        h76 h76VarR = y36Var.zzd;
        if (!((x46) h76VarR).j) {
            int size = h76VarR.size();
            h76VarR = h76VarR.r(size + size);
            y36Var.zzd = h76VarR;
        }
        Charset charset = m76.g;
        int size2 = arrayList.size();
        if (h76VarR instanceof ArrayList) {
            ((ArrayList) h76VarR).ensureCapacity(h76VarR.size() + size2);
        } else if (h76VarR instanceof n96) {
            n96 n96Var = (n96) h76VarR;
            int i = n96Var.a + size2;
            int length = n96Var.t.length;
            if (i > length) {
                if (length != 0) {
                    while (length < i) {
                        length = Math.max(((length * 3) / 2) + 1, 10);
                    }
                    n96Var.t = Arrays.copyOf(n96Var.t, length);
                } else {
                    n96Var.t = new Object[Math.max(i, 10)];
                }
            }
        }
        int size3 = h76VarR.size();
        int size4 = arrayList.size();
        for (int i2 = 0; i2 < size4; i2++) {
            Object obj = arrayList.get(i2);
            if (obj == null) {
                String strW = du4.w(h76VarR.size() - size3, "Element at index ", " is null.");
                int size5 = h76VarR.size();
                while (true) {
                    size5--;
                    if (size5 < size3) {
                        l0.q(strW);
                        return;
                    }
                    h76VarR.remove(size5);
                }
            } else {
                h76VarR.add(obj);
            }
        }
    }

    public static v36 s() {
        return (v36) zzb.m();
    }

    @Override // defpackage.y66
    public final Object a(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new p96(zzb, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzd", t36.class});
        }
        if (i2 == 3) {
            return new y36();
        }
        if (i2 == 4) {
            return new v36(zzb);
        }
        if (i2 == 5) {
            return zzb;
        }
        throw null;
    }
}
