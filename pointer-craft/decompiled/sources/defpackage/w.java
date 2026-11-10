package defpackage;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class w extends nz1 implements xy1 {
    public final /* synthetic */ byte i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w(int i, Object obj, Class cls, String str, String str2, int i2, byte b) {
        super(i, obj, cls, str, str2, i2);
        this.i = b;
    }

    @Override // defpackage.xy1
    public final Object a(Object obj) {
        Object[] objArr;
        byte b = this.i;
        og5 og5Var = og5.g;
        Object obj2 = this.t;
        switch (b) {
            case 0:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                z zVar = (z) obj2;
                ma3 ma3Var = zVar.L;
                if (zBooleanValue) {
                    zVar.a1();
                } else {
                    mu0 mu0Var = null;
                    if (zVar.k != null) {
                        Object[] objArr2 = ma3Var.r;
                        long[] jArr = ma3Var.g;
                        int length = jArr.length - 2;
                        if (length >= 0) {
                            byte b2 = 0;
                            int i = 0;
                            while (true) {
                                long j = jArr[i];
                                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i2 = 8;
                                    int i3 = 8 - ((~(i - length)) >>> 31);
                                    int i4 = 0;
                                    while (i4 < i3) {
                                        if ((255 & j) < 128) {
                                            m50.T(zVar.E0(), null, new p(zVar, (mx3) objArr2[(i << 3) + i4], mu0Var, b2), 3);
                                        }
                                        j >>= i2;
                                        i4++;
                                        i2 = i2;
                                        objArr2 = objArr2;
                                    }
                                    objArr = objArr2;
                                    if (i3 == i2) {
                                    }
                                } else {
                                    objArr = objArr2;
                                }
                                if (i != length) {
                                    i++;
                                    objArr2 = objArr;
                                }
                            }
                        }
                        mx3 mx3Var = zVar.N;
                        if (mx3Var != null) {
                            m50.T(zVar.E0(), null, new p(zVar, mx3Var, mu0Var, (byte) 1), 3);
                        }
                    }
                    ma3Var.g();
                    zVar.N = null;
                    zVar.b1();
                }
                return og5Var;
            default:
                Set set = (Set) obj;
                set.getClass();
                og2 og2Var = (og2) obj2;
                ReentrantLock reentrantLock = og2Var.n;
                reentrantLock.lock();
                try {
                    List listF0 = cj0.F0(og2Var.r.values());
                    reentrantLock.unlock();
                    Iterator it = listF0.iterator();
                    while (it.hasNext()) {
                        ((vi3) it.next()).g(set);
                    }
                    return og5Var;
                } catch (Throwable th) {
                    reentrantLock.unlock();
                    throw th;
                }
        }
    }
}
