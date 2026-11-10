package defpackage;

import java.util.ListIterator;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ee6 {
    public static final sj0 g = sj0.i;
    public static ha2 y;

    public static final void g(tb4 tb4Var) {
        tb4Var.getClass();
        uv2 uv2VarC = pw5.c();
        cc4 cc4VarO = tb4Var.O("SELECT name FROM sqlite_master WHERE type = 'trigger'");
        while (cc4VarO.H()) {
            try {
                uv2VarC.add(cc4VarO.q(0));
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    c93.h(cc4VarO, th);
                    throw th2;
                }
            }
        }
        c93.h(cc4VarO, null);
        ListIterator listIterator = pw5.a(uv2VarC).listIterator(0);
        while (true) {
            tv2 tv2Var = (tv2) listIterator;
            if (!tv2Var.hasNext()) {
                return;
            }
            String str = (String) tv2Var.next();
            if (ay4.P(str, "room_fts_content_sync_", false)) {
                zq2.m(tb4Var, "DROP TRIGGER IF EXISTS ".concat(str));
            }
        }
    }
}
