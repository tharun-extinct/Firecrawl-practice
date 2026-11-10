package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class dk4 extends fk4 {
    public static bk4 K(Iterator it) {
        it.getClass();
        return new zr0(new ij0(it, (byte) 1));
    }

    public static bk4 L(Object obj, xy1 xy1Var) {
        return obj == null ? ui1.g : new f12(new gd4(obj, (byte) 3), xy1Var);
    }

    public static String M(bk4 bk4Var, String str) {
        bk4Var.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "");
        int i = 0;
        for (Object obj : bk4Var) {
            i++;
            if (i > 1) {
                sb.append((CharSequence) str);
            }
            sp2.n(sb, obj, null);
        }
        sb.append((CharSequence) "");
        return sb.toString();
    }

    public static Object N(bk4 bk4Var) {
        bk4Var.getClass();
        Iterator it = bk4Var.iterator();
        if (!it.hasNext()) {
            l0.s("Sequence is empty.");
            return null;
        }
        Object next = it.next();
        while (it.hasNext()) {
            next = it.next();
        }
        return next;
    }

    public static List O(bk4 bk4Var) {
        Iterator it = bk4Var.iterator();
        if (!it.hasNext()) {
            return pi1.j;
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return pw5.k(next);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(next);
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }
}
