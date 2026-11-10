package defpackage;

import java.util.Comparator;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ee implements Comparator {
    public final /* synthetic */ byte g;

    public /* synthetic */ ee(byte b) {
        this.g = b;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.g) {
            case 0:
                return yf2.f(((ay3) obj2).g(), ((ay3) obj).g());
            case 1:
                byte[] bArr = (byte[]) obj;
                byte[] bArr2 = (byte[]) obj2;
                if (bArr.length != bArr2.length) {
                    return bArr.length - bArr2.length;
                }
                for (int i = 0; i < bArr.length; i++) {
                    byte b = bArr[i];
                    byte b2 = bArr2[i];
                    if (b != b2) {
                        return b - b2;
                    }
                }
                return 0;
            case 2:
                return yf2.f(((mg2) obj).y, ((mg2) obj2).y);
            case 3:
                me2 me2Var = (me2) obj;
                me2 me2Var2 = (me2) obj2;
                return (me2Var.t - me2Var.j) - (me2Var2.t - me2Var2.j);
            case 4:
                um2 um2Var = (um2) obj;
                um2 um2Var2 = (um2) obj2;
                float f = um2Var.N.b.M;
                float f2 = um2Var2.N.b.M;
                return f == f2 ? yf2.f(um2Var.f(), um2Var2.f()) : Float.compare(f, f2);
            default:
                return yf2.f(((ms2) obj).g, ((ms2) obj2).g);
        }
    }
}
