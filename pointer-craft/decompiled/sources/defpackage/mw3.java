package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class mw3 extends fk1 {
    public final /* synthetic */ byte m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mw3(x94 x94Var, byte b) {
        super(x94Var);
        this.m = b;
    }

    @Override // defpackage.fk1
    public final void c(gy1 gy1Var, Object obj) throws Throwable {
        switch (this.m) {
            case 0:
                lw3 lw3Var = (lw3) obj;
                String str = lw3Var.g;
                if (str == null) {
                    gy1Var.g(1);
                } else {
                    gy1Var.G(str, 1);
                }
                Long l = lw3Var.y;
                if (l == null) {
                    gy1Var.g(2);
                    return;
                } else {
                    gy1Var.n(2, l.longValue());
                    return;
                }
            case 1:
                z05 z05Var = (z05) obj;
                String str2 = z05Var.g;
                if (str2 == null) {
                    gy1Var.g(1);
                } else {
                    gy1Var.G(str2, 1);
                }
                gy1Var.n(2, z05Var.y);
                return;
            case 2:
                fj.z(obj);
                throw null;
            default:
                sr5 sr5Var = (sr5) obj;
                String str3 = sr5Var.g;
                if (str3 == null) {
                    gy1Var.g(1);
                } else {
                    gy1Var.G(str3, 1);
                }
                gy1Var.n(2, cc6.i(sr5Var.y));
                String str4 = sr5Var.r;
                if (str4 == null) {
                    gy1Var.g(3);
                } else {
                    gy1Var.G(str4, 3);
                }
                String str5 = sr5Var.n;
                if (str5 == null) {
                    gy1Var.g(4);
                } else {
                    gy1Var.G(str5, 4);
                }
                byte[] bArrY = qz0.y(sr5Var.v);
                if (bArrY == null) {
                    gy1Var.g(5);
                } else {
                    gy1Var.l(5, bArrY);
                }
                byte[] bArrY2 = qz0.y(sr5Var.x);
                if (bArrY2 == null) {
                    gy1Var.g(6);
                } else {
                    gy1Var.l(6, bArrY2);
                }
                gy1Var.n(7, sr5Var.l);
                gy1Var.n(8, sr5Var.j);
                gy1Var.n(9, sr5Var.t);
                gy1Var.n(10, sr5Var.m);
                gy1Var.n(11, cc6.n(sr5Var.q));
                gy1Var.n(12, sr5Var.w);
                gy1Var.n(13, sr5Var.c);
                gy1Var.n(14, sr5Var.i);
                gy1Var.n(15, sr5Var.b);
                gy1Var.n(16, sr5Var.s ? 1L : 0L);
                gy1Var.n(17, cc6.c(sr5Var.p));
                vs0 vs0Var = sr5Var.a;
                if (vs0Var == null) {
                    gy1Var.g(18);
                    gy1Var.g(19);
                    gy1Var.g(20);
                    gy1Var.g(21);
                    gy1Var.g(22);
                    gy1Var.g(23);
                    gy1Var.g(24);
                    gy1Var.g(25);
                    return;
                }
                gy1Var.n(18, cc6.w(vs0Var.y()));
                gy1Var.n(19, vs0Var.l() ? 1L : 0L);
                gy1Var.n(20, vs0Var.j() ? 1L : 0L);
                gy1Var.n(21, vs0Var.x() ? 1L : 0L);
                gy1Var.n(22, vs0Var.t() ? 1L : 0L);
                gy1Var.n(23, vs0Var.r());
                gy1Var.n(24, vs0Var.n());
                byte[] bArrL = cc6.l(vs0Var.g());
                if (bArrL == null) {
                    gy1Var.g(25);
                    return;
                } else {
                    gy1Var.l(25, bArrL);
                    return;
                }
        }
    }

    @Override // defpackage.t
    public final String m() {
        switch (this.m) {
            case 0:
                return "INSERT OR REPLACE INTO `Preference` (`key`,`long_value`) VALUES (?,?)";
            case 1:
                return "INSERT OR REPLACE INTO `SystemIdInfo` (`work_spec_id`,`system_id`) VALUES (?,?)";
            case 2:
                return "INSERT OR REPLACE INTO `WorkProgress` (`work_spec_id`,`progress`) VALUES (?,?)";
            default:
                return "INSERT OR IGNORE INTO `WorkSpec` (`id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`period_start_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`required_network_type`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        }
    }
}
