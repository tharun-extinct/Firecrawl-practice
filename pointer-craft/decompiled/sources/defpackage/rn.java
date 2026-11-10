package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class rn implements my1 {
    public final /* synthetic */ byte j;
    public final /* synthetic */ qr0 t;

    public /* synthetic */ rn(qr0 qr0Var, byte b) {
        this.j = b;
        this.t = qr0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.my1
    public final Object g() {
        e62 e62Var;
        e62 e62Var2;
        e62 e62Var3;
        byte b = this.j;
        byte b2 = 0;
        byte b3 = 20;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        qr0 qr0Var = this.t;
        switch (b) {
            case 0:
                h62 h62Var = qr0Var.j;
                if (h62Var.n && (e62Var = h62Var.r) != null) {
                    e62Var.f(true);
                }
                break;
            case 1:
                h62 h62Var2 = qr0Var.j;
                if (h62Var2.n && (e62Var2 = h62Var2.r) != null) {
                    e62Var2.q();
                }
                break;
            case 2:
                qr0Var.getClass();
                m50.T(v70.d(qr0Var), null, new q(qr0Var, objArr == true ? 1 : 0, b3), 3);
                break;
            case 3:
                qr0Var.d.setValue(Boolean.FALSE);
                qr0Var.k = true;
                g61 g61Var = (g61) qr0Var.m.j.getValue();
                qr0Var.y.getApplicationContext().getSharedPreferences("working_devices_keyboard", 0).edit().putBoolean(g61Var != null ? g61Var.t : null, true).apply();
                break;
            case 4:
                ((ew4) qr0Var.l.q).a(null);
                break;
            case 5:
                qr0Var.p.setValue(qq0.g(qr0Var.a(), null, null, 2));
                break;
            case 6:
                dh2 dh2Var = qr0Var.B;
                if (dh2Var != null) {
                    dh2Var.x(null);
                }
                qr0Var.B = null;
                iv4 iv4Var = qr0Var.C;
                if (iv4Var != null) {
                    iv4Var.x(null);
                }
                qr0Var.C = null;
                qr0Var.e.a(null);
                qr0Var.D = "";
                m50.T(v70.d(qr0Var), null, new fr0(qr0Var, objArr2 == true ? 1 : 0, b2), 3);
                break;
            case 7:
                h62 h62Var3 = qr0Var.j;
                if (h62Var3.n && (e62Var3 = h62Var3.r) != null) {
                    e62Var3.w();
                }
                break;
            default:
                qr0Var.getClass();
                m50.T(v70.d(qr0Var), null, new q(qr0Var, objArr3 == true ? 1 : 0, b3), 3);
                break;
        }
        return og5.g;
    }
}
