package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class lq extends t {
    public lq(u64 u64Var) {
        super(u64Var);
    }

    @Override // defpackage.mq
    public final void a(int i, int i2) {
        ArrayList arrayListC = c();
        if (i2 == 1) {
            arrayListC.remove(i);
        } else {
            arrayListC.subList(i, i2 + i).clear();
        }
    }

    public final ArrayList c() {
        ah1 ah1Var = (ah1) this.t;
        if (ah1Var instanceof jh1) {
            return ((jh1) ah1Var).y;
        }
        l0.z("Current node cannot accept children");
        return null;
    }

    @Override // defpackage.mq
    public final void j(int i, int i2, int i3) {
        ArrayList arrayListC = c();
        int i4 = i > i2 ? i2 : i2 - i3;
        if (i3 != 1) {
            List listSubList = arrayListC.subList(i, i3 + i);
            ArrayList arrayListG0 = cj0.G0(listSubList);
            listSubList.clear();
            arrayListC.addAll(i4, arrayListG0);
            return;
        }
        if (i == i2 + 1 || i == i2 - 1) {
            arrayListC.set(i, arrayListC.set(i2, arrayListC.get(i)));
        } else {
            arrayListC.add(i4, arrayListC.remove(i));
        }
    }

    @Override // defpackage.mq
    public final void x(int i, Object obj) {
        ah1 ah1Var = (ah1) obj;
        Object obj2 = this.t;
        obj2.getClass();
        int i2 = ((jh1) obj2).g;
        if (i2 > 0) {
            if (ah1Var instanceof jh1) {
                ((jh1) ah1Var).g = i2 - 1;
            }
            c().add(i, ah1Var);
            return;
        }
        Object obj3 = this.j;
        obj3.getClass();
        throw new IllegalArgumentException(("Too many embedded views for the current surface. The maximum depth is: " + ((jh1) obj3).g).toString());
    }

    @Override // defpackage.mq
    public final void y(int i, Object obj) {
    }
}
