package defpackage;

import android.os.SystemClock;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.g;

/* JADX INFO: loaded from: classes2.dex */
public final class wu5 implements xj3 {
    public final ck a;
    public final p32 j;
    public final long m;
    public final long q;
    public final short t;

    /* JADX WARN: Multi-variable type inference failed */
    public wu5(p32 p32Var, int i, ck ckVar, long j, long j2) {
        this.j = p32Var;
        this.t = i;
        this.a = ckVar;
        this.m = j;
        this.q = j2;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0031 A[RETURN] */
    public static pq0 g(su5 su5Var, g gVar, int i) {
        tb6 tb6Var = gVar.o;
        pq0 pq0Var = tb6Var == null ? null : tb6Var.m;
        if (pq0Var != null && pq0Var.t) {
            int[] iArr = pq0Var.m;
            int i2 = 0;
            if (iArr == null) {
                int[] iArr2 = pq0Var.w;
                if (iArr2 != null) {
                    while (i2 < iArr2.length) {
                        if (iArr2[i2] != i) {
                            i2++;
                        }
                    }
                    if (su5Var.c < pq0Var.q) {
                        return pq0Var;
                    }
                } else if (su5Var.c < pq0Var.q) {
                    return pq0Var;
                }
            } else {
                while (i2 < iArr.length) {
                    if (iArr[i2] != i) {
                        i2++;
                    } else if (su5Var.c < pq0Var.q) {
                        return pq0Var;
                    }
                }
            }
        }
        return null;
    }

    @Override // defpackage.xj3
    public final void s(nj6 nj6Var) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        long j;
        long j2;
        p32 p32Var = this.j;
        if (p32Var.n()) {
            ga4 ga4Var = (ga4) fa4.B().t;
            if (ga4Var == null || ga4Var.t) {
                su5 su5Var = (su5) p32Var.a.get(this.a);
                if (su5Var != null) {
                    g gVar = su5Var.n;
                    if (gVar instanceof g) {
                        long j3 = this.m;
                        int i6 = 0;
                        boolean z = j3 > 0;
                        short s = gVar.b;
                        if (ga4Var != null) {
                            z &= ga4Var.a;
                            i = ga4Var.m;
                            i3 = ga4Var.q;
                            i2 = ga4Var.j;
                            if (gVar.o != null && !gVar.w()) {
                                pq0 pq0VarG = g(su5Var, gVar, this.t);
                                if (pq0VarG == null) {
                                    return;
                                }
                                boolean z2 = pq0VarG.a && j3 > 0;
                                i3 = pq0VarG.q;
                                z = z2;
                            }
                        } else {
                            i = 5000;
                            i2 = 0;
                            i3 = 100;
                        }
                        int i7 = i;
                        int iElapsedRealtime = -1;
                        if (nj6Var.t()) {
                            i5 = 0;
                        } else if (nj6Var.n) {
                            i6 = -1;
                            i5 = 100;
                        } else {
                            Exception excX = nj6Var.x();
                            if (excX instanceof ak) {
                                Status status = ((ak) excX).j;
                                i4 = status.j;
                                kq0 kq0Var = status.m;
                                if (kq0Var != null) {
                                    i5 = i4;
                                    i6 = kq0Var.t;
                                }
                            } else {
                                i4 = 101;
                            }
                            i5 = i4;
                            i6 = -1;
                        }
                        if (z) {
                            long j4 = this.q;
                            long jCurrentTimeMillis = System.currentTimeMillis();
                            iElapsedRealtime = (int) (SystemClock.elapsedRealtime() - j4);
                            j2 = jCurrentTimeMillis;
                            j = j3;
                        } else {
                            j = 0;
                            j2 = 0;
                        }
                        xu5 xu5Var = new xu5(new y53(this.t, i5, i6, j, j2, null, null, s, iElapsedRealtime), i2, i7, i3);
                        uv5 uv5Var = p32Var.w;
                        uv5Var.sendMessage(uv5Var.obtainMessage(18, xu5Var));
                    }
                }
            }
        }
    }
}
