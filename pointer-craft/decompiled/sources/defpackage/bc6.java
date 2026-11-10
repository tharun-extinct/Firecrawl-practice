package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public abstract class bc6 {
    public static final char[] g = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    public static final Throwable g(Throwable th, cm3 cm3Var, pr4 pr4Var, c02 c02Var) {
        if (cm3Var == null) {
            return th;
        }
        yc6.r(th, new lt((Object) c02Var, (Object) pr4Var, (Object) cm3Var, (byte) 12));
        return th;
    }

    public static boolean n(int i) {
        int type = Character.getType(i);
        return type == 23 || type == 20 || type == 22 || type == 30 || type == 29 || type == 24 || type == 21;
    }

    public static String r(byte[] bArr) {
        int length = bArr.length;
        StringBuilder sb = new StringBuilder(length + length);
        for (int i = 0; i < length; i++) {
            int i2 = (bArr[i] & 240) >>> 4;
            char[] cArr = g;
            sb.append(cArr[i2]);
            sb.append(cArr[bArr[i] & 15]);
        }
        return sb.toString();
    }

    public static final void v(pr4 pr4Var, mq mqVar, int i) {
        while (true) {
            int i2 = pr4Var.o;
            if (i > i2 && i < pr4Var.h) {
                return;
            }
            if (i2 == 0 && i == 0) {
                return;
            }
            pr4Var.L();
            if (pr4Var.k(pr4Var.o)) {
                mqVar.p();
            }
            pr4Var.t();
        }
    }

    public static final cd2 y(cm3 cm3Var, pr4 pr4Var) {
        return new cd2((byte) 16, cm3Var, pr4Var, false);
    }
}
