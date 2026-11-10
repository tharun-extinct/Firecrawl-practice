package defpackage;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class ff5 {
    public static final ThreadLocal n = new ThreadLocal();
    public final int g;
    public volatile int r = 0;
    public final kb5 y;

    public ff5(kb5 kb5Var, int i) {
        this.y = kb5Var;
        this.g = i;
    }

    public final int g(int i) {
        v53 v53VarY = y();
        int iG = v53VarY.g(16);
        if (iG == 0) {
            return 0;
        }
        ByteBuffer byteBuffer = (ByteBuffer) v53VarY.m;
        int i2 = iG + v53VarY.j;
        return byteBuffer.getInt((i * 4) + byteBuffer.getInt(i2) + i2 + 4);
    }

    public final String toString() {
        int i;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(", id:");
        v53 v53VarY = y();
        int iG = v53VarY.g(4);
        sb.append(Integer.toHexString(iG != 0 ? ((ByteBuffer) v53VarY.m).getInt(iG + v53VarY.j) : 0));
        sb.append(", codepoints:");
        v53 v53VarY2 = y();
        int iG2 = v53VarY2.g(16);
        if (iG2 != 0) {
            int i2 = iG2 + v53VarY2.j;
            i = ((ByteBuffer) v53VarY2.m).getInt(((ByteBuffer) v53VarY2.m).getInt(i2) + i2);
        } else {
            i = 0;
        }
        for (int i3 = 0; i3 < i; i3++) {
            sb.append(Integer.toHexString(g(i3)));
            sb.append(" ");
        }
        return sb.toString();
    }

    public final v53 y() {
        ThreadLocal threadLocal = n;
        v53 v53Var = (v53) threadLocal.get();
        if (v53Var == null) {
            v53Var = new v53();
            threadLocal.set(v53Var);
        }
        w53 w53Var = (w53) this.y.j;
        int iG = w53Var.g(6);
        if (iG != 0) {
            int i = iG + w53Var.j;
            int i2 = (this.g * 4) + ((ByteBuffer) w53Var.m).getInt(i) + i + 4;
            int i3 = ((ByteBuffer) w53Var.m).getInt(i2) + i2;
            ByteBuffer byteBuffer = (ByteBuffer) w53Var.m;
            v53Var.m = byteBuffer;
            if (byteBuffer != null) {
                v53Var.j = i3;
                int i4 = i3 - byteBuffer.getInt(i3);
                v53Var.t = i4;
                v53Var.a = ((ByteBuffer) v53Var.m).getShort(i4);
                return v53Var;
            }
            v53Var.j = 0;
            v53Var.t = 0;
            v53Var.a = 0;
        }
        return v53Var;
    }
}
