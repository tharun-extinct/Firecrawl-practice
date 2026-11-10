package defpackage;

import io.appground.blek.data.room.AppDatabase;
import java.io.IOException;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes2.dex */
public final class yv0 extends pl5 {
    public iv4 l;
    public final ji n;
    public final tg1 r;
    public final ew4 v;
    public final f34 x;
    public final AppDatabase y;

    public yv0(AppDatabase appDatabase, tg1 tg1Var, ji jiVar) {
        appDatabase.getClass();
        tg1Var.getClass();
        jiVar.getClass();
        this.y = appDatabase;
        this.r = tg1Var;
        this.n = jiVar;
        ew4 ew4VarW = y94.w(new tv0(null, null, null, null, null, false));
        this.v = ew4VarW;
        this.x = pw5.j(ew4VarW);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public final Object l(String str, ou0 ou0Var) {
        xv0 xv0Var;
        Object value;
        tv0 tv0Var;
        zl2 zl2Var;
        zl2 zl2Var2;
        String str2;
        Object value2;
        Object value3;
        if (ou0Var instanceof xv0) {
            xv0Var = (xv0) ou0Var;
            int i = xv0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                xv0Var.c = i - Integer.MIN_VALUE;
            } else {
                xv0Var = new xv0(this, ou0Var);
            }
        } else {
            xv0Var = new xv0(this, ou0Var);
        }
        Object objL = xv0Var.q;
        int i2 = xv0Var.c;
        zl2 zl2Var3 = zl2.t;
        ew4 ew4Var = this.v;
        try {
            if (i2 == 0) {
                js2.o(objL);
                ji jiVar = this.n;
                xv0Var.m = str;
                xv0Var.c = 1;
                objL = jiVar.L(str, xv0Var);
                px0 px0Var = px0.j;
                if (objL == px0Var) {
                    return px0Var;
                }
                str2 = str;
            } else {
                if (i2 != 1) {
                    l0.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                String str3 = xv0Var.m;
                js2.o(objL);
                str2 = str3;
            }
            q04 q04Var = (q04) objL;
            if (q04Var != null) {
                q04Var.q = q04Var.q;
                byte[] bArrT = np3.t(q04Var);
                p04 p04VarZ = q04Var.z();
                p04VarZ.getClass();
                p04 p04VarJ = rp2.j(p04VarZ);
                q04Var.t = (byte) 6;
                q04Var.a = p04VarJ;
                do {
                    value3 = ew4Var.getValue();
                } while (!ew4Var.t(value3, tv0.g((tv0) value3, q04Var, null, str2, bArrT, null, false, 2)));
            } else {
                do {
                    value2 = ew4Var.getValue();
                } while (!ew4Var.t(value2, tv0.g((tv0) value2, null, null, null, null, zl2Var3, false, 15)));
            }
        } catch (Exception e) {
            do {
                value = ew4Var.getValue();
                tv0Var = (tv0) value;
                zl2.j.getClass();
                if (e instanceof IOException) {
                    zl2Var = zl2.a;
                } else if (e instanceof NoSuchElementException) {
                    zl2Var2 = zl2Var3;
                } else {
                    zl2Var = zl2.q;
                }
                zl2Var2 = zl2Var;
            } while (!ew4Var.t(value, tv0.g(tv0Var, null, null, null, null, zl2Var2, false, 15)));
        }
        return og5.g;
    }

    public final f34 v() {
        return this.x;
    }

    public final void x(Integer num, String str) {
        iv4 iv4Var = this.l;
        mu0 mu0Var = null;
        if (iv4Var != null) {
            iv4Var.x(null);
        }
        this.l = m50.T(v70.d(this), null, new rz(this, str, num, mu0Var, (byte) 2), 3);
    }
}
