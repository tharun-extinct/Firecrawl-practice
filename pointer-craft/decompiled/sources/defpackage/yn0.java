package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes2.dex */
public final class yn0 extends RuntimeException {
    public final ga3 a;
    public final xa3 j;
    public final int m;
    public final xa3 t;

    public yn0(xa3 xa3Var, xa3 xa3Var2, ga3 ga3Var, int i, Exception exc) {
        super(exc);
        this.j = xa3Var;
        this.t = xa3Var2;
        this.a = ga3Var;
        this.m = i;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        List listK;
        List listF0;
        ck4 ck4VarD = lr2.d(new xn0(this, null));
        if (ck4VarD.hasNext()) {
            Object next = ck4VarD.next();
            if (ck4VarD.hasNext()) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(next);
                while (ck4VarD.hasNext()) {
                    arrayList.add(ck4VarD.next());
                }
                listK = arrayList;
            } else {
                listK = pw5.k(next);
            }
        } else {
            listK = pi1.j;
        }
        int size = listK.size();
        if (50 >= size) {
            listF0 = cj0.F0(listK);
        } else {
            ArrayList arrayList2 = new ArrayList(50);
            if (listK instanceof RandomAccess) {
                for (int i = size - 50; i < size; i++) {
                    arrayList2.add(listK.get(i));
                }
            } else {
                ListIterator listIterator = listK.listIterator(size - 50);
                while (listIterator.hasNext()) {
                    arrayList2.add(listIterator.next());
                }
            }
            listF0 = arrayList2;
        }
        return ux4.I("\n            |Failed to execute op number " + this.m + ":\n            |" + cj0.q0(listF0, "\n", null, null, null, 62) + "\n            ");
    }
}
