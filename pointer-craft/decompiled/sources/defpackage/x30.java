package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes.dex */
public final class x30 {
    public static final byte[] x = new byte[7];
    public final LinkedHashMap g;
    public final uv2 n;
    public final o05 r;
    public final byte[] v;
    public final byte y;

    public x30(c62 c62Var, jd2 jd2Var) {
        c62Var.getClass();
        jd2Var.getClass();
        this.g = new LinkedHashMap();
        this.y = (byte) 2;
        o05 o05Var = new o05(new y4((byte) 16));
        this.r = new o05(new gf((Object) jd2Var, (byte) 2));
        uv2 uv2VarC = pw5.c();
        Class<c62> cls = c62.class;
        uv2VarC.add(new e40((am1) o05Var.getValue(), new v30(2, c62Var, cls, "sendReport", "sendReport(B[B)V", 0, (byte) 0)));
        uv2VarC.add(new k40((am1) o05Var.getValue(), new v30(2, c62Var, cls, "sendReport", "sendReport(B[B)V", 0, (byte) 1)));
        if (jd2Var == jd2.t) {
            uv2VarC.add(new y30(new w30(c62Var, (byte) 0)));
        }
        uv2 uv2VarA = pw5.a(uv2VarC);
        this.n = uv2VarA;
        ArrayList arrayList = new ArrayList(dj0.Y(uv2VarA, 10));
        ListIterator listIterator = uv2VarA.listIterator(0);
        while (true) {
            tv2 tv2Var = (tv2) listIterator;
            if (!tv2Var.hasNext()) {
                break;
            }
            rb0 rb0Var = (rb0) tv2Var.next();
            rb0Var.getClass();
            arrayList.add(((y52) rb0Var).y());
        }
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            uo1.u("Empty collection can't be reduced.");
            throw null;
        }
        Object next = it.next();
        while (it.hasNext()) {
            byte[] bArr = (byte[]) it.next();
            byte[] bArr2 = (byte[]) next;
            bArr2.getClass();
            bArr.getClass();
            int length = bArr2.length;
            int length2 = bArr.length;
            next = Arrays.copyOf(bArr2, length + length2);
            System.arraycopy(bArr, 0, next, length, length2);
        }
        this.v = (byte[]) next;
        uv2 uv2Var = this.n;
        uv2Var.getClass();
        ListIterator listIterator2 = uv2Var.listIterator(0);
        while (true) {
            tv2 tv2Var2 = (tv2) listIterator2;
            if (!tv2Var2.hasNext()) {
                return;
            }
            rb0 rb0Var2 = (rb0) tv2Var2.next();
            this.g.put(rb0Var2.g(), rb0Var2);
        }
    }
}
