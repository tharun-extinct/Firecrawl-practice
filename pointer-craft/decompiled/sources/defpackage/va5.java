package defpackage;

import android.content.Context;
import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class va5 {
    public Object g;
    public Object l;
    public Object n;
    public Object r;
    public Object v;
    public Object x;
    public Object y;

    public va5(Context context, pp0 pp0Var, zl5 zl5Var, az3 az3Var, WorkDatabase workDatabase, String str) {
        new ob5();
        this.g = context.getApplicationContext();
        this.r = zl5Var;
        this.y = az3Var;
        this.n = pp0Var;
        this.v = workDatabase;
        this.x = str;
    }

    public void B(List list) {
        this.l = list;
    }

    public void a(Integer num) {
        this.y = num;
    }

    public void b(ArrayList arrayList) {
        this.x = arrayList;
    }

    public void c(n14 n14Var) {
        this.x = n14Var;
    }

    public void d(long j) {
        this.x = Long.valueOf(j);
    }

    public void e(Executor executor) {
        this.n = executor;
    }

    public void f(byte[] bArr) {
        this.n = bArr;
    }

    public qu g() {
        String strConcat = ((Long) this.g) == null ? " eventTimeMs" : "";
        if (((Long) this.r) == null) {
            strConcat = strConcat.concat(" eventUptimeMs");
        }
        if (((Long) this.x) == null) {
            strConcat = strConcat.concat(" timezoneOffsetSeconds");
        }
        if (strConcat.isEmpty()) {
            return new qu(((Long) this.g).longValue(), (Integer) this.y, ((Long) this.r).longValue(), (byte[]) this.n, (String) this.v, ((Long) this.x).longValue(), (tu) this.l);
        }
        l0.z("Missing required properties:".concat(strConcat));
        return null;
    }

    public void h(int i) {
        this.n = Integer.valueOf(i);
    }

    public void i(Executor executor) {
        this.r = executor;
    }

    public void j(n14 n14Var) {
        this.v = n14Var;
    }

    public void k(String str) {
        this.v = str;
    }

    public void l(Context context) {
        this.g = context;
    }

    public void m(long j) {
        this.g = Long.valueOf(j);
    }

    public yr5 n() {
        yr5 yr5Var = new yr5();
        yr5Var.c = new ww2();
        yr5Var.f = new ol4();
        yr5Var.k = null;
        yr5Var.j = (Context) this.g;
        yr5Var.w = (zl5) this.r;
        yr5Var.b = (az3) this.y;
        yr5Var.t = (String) this.x;
        yr5Var.a = (List) this.l;
        yr5Var.q = null;
        yr5Var.i = (pp0) this.n;
        WorkDatabase workDatabase = (WorkDatabase) this.v;
        yr5Var.s = workDatabase;
        yr5Var.p = workDatabase.k();
        yr5Var.u = workDatabase.u();
        yr5Var.z = workDatabase.d();
        return yr5Var;
    }

    public void o(String str) {
        this.v = str;
    }

    public void p() {
        this.l = c24.j;
    }

    public void q(long j) {
        this.r = Long.valueOf(j);
    }

    public jz0 r() {
        Object obj = pb1.r;
        wd6.g(Context.class, (Context) this.g);
        wd6.g(lp1.class, (lp1) this.y);
        wd6.g(Executor.class, (Executor) this.r);
        wd6.g(Executor.class, (Executor) this.n);
        wd6.g(n14.class, (n14) this.v);
        wd6.g(n14.class, (n14) this.x);
        wd6.g(rm3.class, (rm3) this.l);
        Context context = (Context) this.g;
        lp1 lp1Var = (lp1) this.y;
        Executor executor = (Executor) this.r;
        Executor executor2 = (Executor) this.n;
        n14 n14Var = (n14) this.v;
        n14 n14Var2 = (n14) this.x;
        rm3 rm3Var = (rm3) this.l;
        jz0 jz0Var = new jz0();
        jz0Var.g = pz1.g(context);
        jz0Var.y = new pz1(pz1.g(lp1Var), (byte) 0);
        jz0Var.r = pz1.g(n14Var);
        jz0Var.n = pz1.g(n14Var2);
        jz0Var.v = pz1.g(rm3Var);
        pz1 pz1VarG = pz1.g(executor);
        jz0Var.x = pz1VarG;
        xo1 xo1Var = new xo1(jz0Var.r, jz0Var.n, jz0Var.v, pz1VarG);
        pb1 pb1Var = new pb1();
        pb1Var.y = obj;
        pb1Var.g = xo1Var;
        jz0Var.l = pb1Var;
        pz1 pz1VarG2 = pz1.g(executor2);
        pz1 pz1Var = jz0Var.g;
        pz1 pz1Var2 = jz0Var.y;
        q14 q14Var = jz0Var.l;
        pz1 pz1Var3 = jz0Var.x;
        cp1 cp1Var = new cp1();
        cp1Var.g = pz1Var;
        cp1Var.r = pz1Var2;
        cp1Var.n = q14Var;
        cp1Var.v = pz1Var3;
        cp1Var.y = pz1VarG2;
        pz1 pz1Var4 = new pz1(pz1.g(new rz1(cp1Var)), (byte) 1);
        pb1 pb1Var2 = new pb1();
        pb1Var2.y = obj;
        pb1Var2.g = pz1Var4;
        jz0Var.j = pb1Var2;
        return jz0Var;
    }

    public void s(tu tuVar) {
        this.l = tuVar;
    }

    public void t(gu guVar) {
        this.r = guVar;
    }

    public void u(long j) {
        this.g = Long.valueOf(j);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x007b  */
    /* JADX WARN: Code duplicated, block: B:25:0x007d  */
    /* JADX WARN: Code duplicated, block: B:28:0x0086  */
    /* JADX WARN: Code duplicated, block: B:31:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:35:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:37:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:39:0x00db  */
    /* JADX WARN: Code duplicated, block: B:42:0x00f2 A[PHI: r5 r6 r13 r15
  0x00f2: PHI (r5v4 e44) = (r5v6 e44), (r5v2 e44) binds: [B:40:0x00ef, B:16:0x004f] A[DONT_GENERATE, DONT_INLINE]
  0x00f2: PHI (r6v2 int) = (r6v3 int), (r6v9 int) binds: [B:40:0x00ef, B:16:0x004f] A[DONT_GENERATE, DONT_INLINE]
  0x00f2: PHI (r13v0 long) = (r13v2 long), (r13v14 long) binds: [B:40:0x00ef, B:16:0x004f] A[DONT_GENERATE, DONT_INLINE]
  0x00f2: PHI (r15v0 boolean) = (r15v1 boolean), (r15v4 boolean) binds: [B:40:0x00ef, B:16:0x004f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:45:0x0104  */
    /* JADX WARN: Code duplicated, block: B:49:0x0113  */
    /* JADX WARN: Code duplicated, block: B:7:0x0023  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v27 */
    /* JADX WARN: Type inference failed for: r1v30 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x0104 -> B:46:0x0106). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public java.lang.Object v(boolean r18, defpackage.ou0 r19) {
        /*
            Method dump skipped, instruction units count: 313
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.va5.v(boolean, ou0):java.lang.Object");
    }

    public void w(lp1 lp1Var) {
        this.y = lp1Var;
    }

    public void x(rm3 rm3Var) {
        this.l = rm3Var;
    }

    public ru y() {
        String strConcat = ((Long) this.g) == null ? " requestTimeMs" : "";
        if (((Long) this.y) == null) {
            strConcat = strConcat.concat(" requestUptimeMs");
        }
        if (strConcat.isEmpty()) {
            return new ru(((Long) this.g).longValue(), ((Long) this.y).longValue(), (gu) this.r, (Integer) this.n, (String) this.v, (ArrayList) this.x, (c24) this.l);
        }
        l0.z("Missing required properties:".concat(strConcat));
        return null;
    }

    public void z(long j) {
        this.y = Long.valueOf(j);
    }

    public /* synthetic */ va5() {
    }

    public void A(ob5 ob5Var) {
    }
}
