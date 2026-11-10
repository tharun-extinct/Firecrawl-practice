package defpackage;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public abstract class v46 {
    protected transient int zza;

    public abstract void g(u56 u56Var);

    public abstract int n();

    public abstract int r(r96 r96Var);

    public final byte[] y() {
        try {
            int iN = n();
            byte[] bArr = new byte[iN];
            u56 u56Var = new u56(iN, bArr);
            g(u56Var);
            if (iN - u56Var.n == 0) {
                return bArr;
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e) {
            uo1.w(du4.i("Serializing ", getClass().getName(), " to a byte array threw an IOException (should never happen)."), e);
            return null;
        }
    }
}
