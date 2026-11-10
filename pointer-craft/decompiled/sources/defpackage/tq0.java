package defpackage;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class tq0 implements tb4, cc3 {
    public fx0 a;
    public final tb4 j;
    public Throwable m;
    public final sq0 q;
    public final cc3 t;

    public tq0(tb4 tb4Var) {
        ec3 ec3Var = new ec3();
        tb4Var.getClass();
        this.j = tb4Var;
        this.t = ec3Var;
        this.q = new sq0(this);
    }

    @Override // defpackage.tb4
    public final cc4 O(String str) {
        str.getClass();
        sq0 sq0Var = this.q;
        if (sq0Var == null) {
            return this.j.O(str);
        }
        Object objR = sq0Var.r(str);
        objR.getClass();
        return new rq0((cc4) objR);
    }

    @Override // java.lang.AutoCloseable
    public final void close() throws Exception {
        sq0 sq0Var = this.q;
        if (sq0Var != null) {
            sq0Var.x(-1);
        }
        this.j.close();
    }

    @Override // defpackage.tb4
    public final boolean p() {
        return this.j.p();
    }

    public final void t(StringBuilder sb) {
        int i;
        if (this.a == null && this.m == null) {
            sb.append("\t\tStatus: Free connection");
            sb.append('\n');
        } else {
            sb.append("\t\tStatus: Acquired connection");
            sb.append('\n');
            fx0 fx0Var = this.a;
            if (fx0Var != null) {
                sb.append("\t\tCoroutine: " + fx0Var);
                sb.append('\n');
            }
            Throwable th = this.m;
            if (th != null) {
                sb.append("\t\tAcquired:");
                sb.append('\n');
                StringWriter stringWriter = new StringWriter();
                PrintWriter printWriter = new PrintWriter(stringWriter);
                th.printStackTrace(printWriter);
                printWriter.flush();
                String string = stringWriter.toString();
                string.getClass();
                Iterator it = cj0.g0(tx4.a0(string)).iterator();
                while (it.hasNext()) {
                    sb.append("\t\t" + ((String) it.next()));
                    sb.append('\n');
                }
            }
        }
        if (this.q != null) {
            StringBuilder sb2 = new StringBuilder("\t\tPrepared Statement Cache Size: ");
            sq0 sq0Var = this.q;
            synchronized (sq0Var.r) {
                i = sq0Var.n;
            }
            sb2.append(i);
            sb.append(sb2.toString());
            sb.append('\n');
        }
    }

    public final String toString() {
        return this.j.toString();
    }

    @Override // defpackage.cc3
    public final void x(Object obj) {
        this.t.x(null);
    }

    @Override // defpackage.cc3
    public final Object y(mu0 mu0Var) {
        return this.t.y(mu0Var);
    }
}
