package defpackage;

import android.view.View;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class g90 {
    public final Object g;

    public g90(byte b) {
        switch (b) {
            case 2:
                ha3 ha3Var = ie2.g;
                this.g = new ha3();
                break;
            case 3:
                this.g = new Object();
                break;
            case 4:
                this.g = kq2.M(Boolean.FALSE);
                break;
            default:
                this.g = new LinkedHashMap();
                break;
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:32:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:44:0x0103  */
    /* JADX WARN: Code duplicated, block: B:48:0x0130  */
    /* JADX WARN: Code duplicated, block: B:7:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:48:0x0130 -> B:49:0x0136). Please report as a decompilation issue!!! */
    /*  JADX ERROR: StackOverflowError in pass: RegionMakerVisitor
        java.lang.StackOverflowError
        	at jadx.core.utils.BlockUtils.traverseSuccessorsUntil(BlockUtils.java:731)
        	at jadx.core.utils.BlockUtils.traverseSuccessorsUntil(BlockUtils.java:749)
        */
    public java.lang.Object a(int r18, defpackage.o04 r19, boolean r20, defpackage.ou0 r21) {
        /*
            Method dump skipped, instruction units count: 384
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.g90.a(int, o04, boolean, ou0):java.lang.Object");
    }

    public abstract void c(String str);

    public abstract void g(wj4 wj4Var);

    public abstract void i(Object obj);

    public abstract void j(yc0 yc0Var);

    public abstract xy1 l(wj4 wj4Var);

    public abstract void m(int i, boolean z);

    public abstract Object n();

    public abstract void q(int i, boolean z);

    public abstract void r();

    public void t(n04 n04Var, boolean z) {
        byte b = n04Var.t;
        if (b == 1) {
            w((b == 1 ? (k04) n04Var.a : null).t, z);
            return;
        }
        if (b != 2) {
            if (b == 3) {
                if (z) {
                    c((b == 3 ? (m04) n04Var.a : null).t);
                    return;
                }
                return;
            } else {
                if (b == 5 && z) {
                    b(b == 5 ? ((Integer) n04Var.a).intValue() : 0);
                    return;
                }
                return;
            }
        }
        int[] iArr = (b == 2 ? (l04) n04Var.a : null).t;
        boolean z2 = (b == 2 ? (l04) n04Var.a : null).a;
        if (!z && iArr.length != 0) {
            int[] iArr2 = new int[iArr.length];
            int length = iArr.length - 1;
            if (length >= 0) {
                int i = 0;
                while (true) {
                    iArr2[length - i] = iArr[i];
                    if (i == length) {
                        break;
                    } else {
                        i++;
                    }
                }
            }
            iArr = iArr2;
        }
        for (int i2 : iArr) {
            if (z2) {
                m(i2, z);
            } else {
                q(i2, z);
            }
        }
    }

    public abstract Object v();

    public abstract void w(int i, boolean z);

    public boolean x() {
        su4 su4VarS;
        qu4 qu4Var = (qu4) this.g;
        View view = qu4Var.r.O;
        if (view != null) {
            su4.j.getClass();
            su4VarS = d93.s(view);
        } else {
            su4VarS = null;
        }
        su4 su4Var = qu4Var.g;
        if (su4VarS == su4Var) {
            return true;
        }
        su4 su4Var2 = su4.a;
        return (su4VarS == su4Var2 || su4Var == su4Var2) ? false : true;
    }

    public abstract void y();

    public void p() {
    }

    public g90(qu4 qu4Var) {
        qu4Var.getClass();
        this.g = qu4Var;
    }

    public void b(int i) {
    }

    public void s(nc5 nc5Var) {
    }
}
