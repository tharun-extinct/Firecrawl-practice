package defpackage;

import android.os.SystemClock;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class f73 implements ex0, gm0, ot4, xq, ar, ux0, mz3, di0, xb5 {
    public final /* synthetic */ byte j;
    public static final /* synthetic */ f73 t = new f73(1);
    public static final f73 a = new f73(2);
    public static final /* synthetic */ f73 m = new f73(3);
    public static final /* synthetic */ f73 q = new f73(4);
    public static final f73 w = new f73(5);
    public static final /* synthetic */ f73 c = new f73(6);
    public static final /* synthetic */ f73 i = new f73(7);

    public /* synthetic */ f73(byte b) {
        this.j = b;
    }

    @Override // defpackage.xb5
    public Object apply(Object obj) {
        return ((td6) obj).y();
    }

    @Override // defpackage.gm0
    public Object c(vl vlVar) {
        switch (this.j) {
            case 2:
                Object objJ = vlVar.j(new e24(p30.class, Executor.class));
                objJ.getClass();
                return c93.d((Executor) objJ);
            case 6:
                return new h63();
            default:
                zi6.a();
                return new l76((byte) 0);
        }
    }

    @Override // defpackage.xq, defpackage.ar
    public float g() {
        return 0.0f;
    }

    @Override // defpackage.xq
    public void j(j51 j51Var, int i2, int[] iArr, fl2 fl2Var, int[] iArr2) {
        if (fl2Var == fl2.j) {
            v70.K(i2, iArr, iArr2, false);
        } else {
            v70.K(i2, iArr, iArr2, true);
        }
    }

    @Override // defpackage.ar
    public void m(j51 j51Var, int i2, int[] iArr, int[] iArr2) {
        v70.K(i2, iArr, iArr2, false);
    }

    @Override // defpackage.di0
    public long n() {
        return SystemClock.elapsedRealtime();
    }

    @Override // defpackage.ot4
    public boolean r(Object obj, Object obj2) {
        return yf2.p(obj, obj2);
    }

    public String toString() {
        switch (this.j) {
            case 5:
                return "StructuralEqualityPolicy";
            case 8:
                return "Arrangement#Center";
            default:
                return super.toString();
        }
    }

    @Override // defpackage.mz3
    public void a() {
    }

    @Override // defpackage.ux0
    public Object y(tx0 tx0Var) throws tx0 {
        throw tx0Var;
    }

    @Override // defpackage.mz3
    public void q(int i2, Object obj) {
    }
}
