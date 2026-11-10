package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ar5 extends v94 {
    @Override // defpackage.v94
    public final void y(zx1 zx1Var) {
        zx1Var.getClass();
        zx1Var.y();
        try {
            zx1Var.w("DELETE FROM workspec WHERE state IN (2, 3, 5) AND (period_start_time + minimum_retention_duration) < " + (System.currentTimeMillis() - 86400000) + " AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))");
            zx1Var.u();
        } finally {
            zx1Var.a();
        }
    }
}
