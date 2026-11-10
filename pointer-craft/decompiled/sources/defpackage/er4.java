package defpackage;

import android.app.PendingIntent;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class er4 implements xy1 {
    public final /* synthetic */ byte j;
    public final /* synthetic */ kr4 t;

    public /* synthetic */ er4(kr4 kr4Var, byte b) {
        this.j = b;
        this.t = kr4Var;
    }

    @Override // defpackage.xy1
    public final Object a(Object obj) throws PendingIntent.CanceledException {
        boolean z;
        byte b = this.j;
        og5 og5Var = og5.g;
        kr4 kr4Var = this.t;
        switch (b) {
            case 0:
                qe2 qe2Var = (qe2) obj;
                kr4Var.s.e((int) (qe2Var.g >> 32));
                kr4Var.p.e((int) (qe2Var.g & 4294967295L));
                return og5Var;
            case 1:
                float fFloatValue = ((Float) obj).floatValue();
                ki0 ki0Var = kr4Var.t;
                float fQ = xs2.q(fFloatValue, ki0Var.g, ki0Var.y);
                pp3 pp3Var = kr4Var.a;
                if (fQ == pp3Var.d()) {
                    z = false;
                } else {
                    if (fQ != pp3Var.d()) {
                        xy1 xy1Var = kr4Var.m;
                        if (xy1Var != null) {
                            xy1Var.a(Float.valueOf(fQ));
                        } else {
                            kr4Var.r(fQ);
                        }
                    }
                    my1 my1Var = kr4Var.j;
                    if (my1Var != null) {
                        my1Var.g();
                    }
                    z = true;
                }
                return Boolean.valueOf(z);
            default:
                kr4Var.g(0.0f);
                kr4Var.h.g();
                return og5Var;
        }
    }
}
