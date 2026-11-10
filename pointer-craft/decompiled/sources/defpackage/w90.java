package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class w90 implements di2 {
    public static final w90 y = new w90(x90.g);
    public final rx3 g;

    public w90(di2 di2Var) {
        di2Var.getClass();
        this.g = new rx3(di2Var.r());
    }

    @Override // defpackage.di2
    public final jk4 r() {
        return this.g;
    }

    @Override // defpackage.di2
    public final Object y(d04 d04Var) {
        byte[] bArr = new byte[0];
        v90 v90Var = new v90();
        v90Var.g = bArr;
        v90Var.y = bArr.length;
        v90Var.g(10);
        int iY = v90Var.y();
        rx3 rx3Var = this.g;
        d04 d04VarG = d04Var.g(rx3Var);
        while (true) {
            int iY2 = d04VarG.y(rx3Var);
            if (iY2 == -1) {
                return Arrays.copyOf(v90Var.g, v90Var.y);
            }
            Object objX = d04VarG.x(d04VarG.l(rx3Var.n(iY2 + iY)));
            objX.getClass();
            byte bByteValue = ((Byte) objX).byteValue();
            v90Var.g(v90Var.y() + 1);
            byte[] bArr2 = v90Var.g;
            int i = v90Var.y;
            v90Var.y = i + 1;
            bArr2[i] = bByteValue;
        }
    }
}
