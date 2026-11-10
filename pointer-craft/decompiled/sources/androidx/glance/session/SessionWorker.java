package androidx.glance.session;

import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import defpackage.al4;
import defpackage.hx0;
import defpackage.i11;
import defpackage.l0;
import defpackage.na1;
import defpackage.p03;
import defpackage.qz0;
import defpackage.r95;
import defpackage.tk4;
import defpackage.x21;

/* JADX INFO: loaded from: classes2.dex */
public final class SessionWorker extends CoroutineWorker {
    public final WorkerParameters b;
    public final r95 p;
    public final tk4 s;
    public final hx0 u;
    public final String z;

    public SessionWorker(Context context, WorkerParameters workerParameters, tk4 tk4Var, r95 r95Var, hx0 hx0Var) {
        super(context, workerParameters);
        this.b = workerParameters;
        this.s = tk4Var;
        this.p = r95Var;
        this.u = hx0Var;
        qz0 qz0Var = this.t.y;
        tk4Var.getClass();
        Object obj = qz0Var.g.get("KEY");
        String str = obj instanceof String ? (String) obj : null;
        if (str != null) {
            this.z = str;
        } else {
            l0.z("SessionWorker must be started with a key");
            throw null;
        }
    }

    @Override // androidx.work.CoroutineWorker
    public final hx0 a() {
        return this.u;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00b6 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:45:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:47:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:51:0x00f4 A[Catch: all -> 0x0050, TRY_ENTER, TryCatch #0 {all -> 0x0050, blocks: (B:40:0x00ba, B:43:0x00d5, B:51:0x00f4, B:54:0x010d, B:15:0x004b, B:22:0x0061), top: B:72:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:53:0x010c  */
    /* JADX WARN: Code duplicated, block: B:54:0x010d A[Catch: all -> 0x0050, PHI: r1 r9 r13
  0x010d: PHI (r1v10 int) = (r1v9 int), (r1v11 int) binds: [B:15:0x004b, B:52:0x010a] A[DONT_GENERATE, DONT_INLINE]
  0x010d: PHI (r9v6 eq) = (r9v5 eq), (r9v11 eq) binds: [B:15:0x004b, B:52:0x010a] A[DONT_GENERATE, DONT_INLINE]
  0x010d: PHI (r13v16 java.lang.Object) = (r13v2 java.lang.Object), (r13v21 java.lang.Object) binds: [B:15:0x004b, B:52:0x010a] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #0 {all -> 0x0050, blocks: (B:40:0x00ba, B:43:0x00d5, B:51:0x00f4, B:54:0x010d, B:15:0x004b, B:22:0x0061), top: B:72:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:57:0x0117  */
    /* JADX WARN: Code duplicated, block: B:60:0x012c  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0081, code lost:
    
        if (r13 == r8) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x012d, code lost:
    
        r9 = r13;
     */
    @Override // androidx.work.CoroutineWorker
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object t(defpackage.mu0 r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 376
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.glance.session.SessionWorker.t(mu0):java.lang.Object");
    }

    public SessionWorker(Context context, WorkerParameters workerParameters) {
        this(context, workerParameters, al4.g, null, null, 24, null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public SessionWorker(Context context, WorkerParameters workerParameters, tk4 tk4Var, r95 r95Var, hx0 hx0Var, int i, i11 i11Var) {
        tk4 tk4Var2 = (i & 4) != 0 ? al4.g : tk4Var;
        r95 r95Var2 = (i & 8) != 0 ? new r95() : r95Var;
        if ((i & 16) != 0) {
            x21 x21Var = na1.g;
            hx0Var = p03.g;
        }
        this(context, workerParameters, tk4Var2, r95Var2, hx0Var);
    }
}
