package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import io.appground.blek.R;

/* JADX INFO: loaded from: classes.dex */
public final class t03 extends zz4 implements bz1 {
    public final /* synthetic */ jd3 b;
    public final /* synthetic */ Intent c;
    public final /* synthetic */ qr0 i;
    public final /* synthetic */ gp p;
    public /* synthetic */ Object q;
    public final /* synthetic */ gx3 s;
    public final /* synthetic */ Context w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t03(Context context, Intent intent, qr0 qr0Var, jd3 jd3Var, gx3 gx3Var, gp gpVar, mu0 mu0Var) {
        super(2, mu0Var);
        this.w = context;
        this.c = intent;
        this.i = qr0Var;
        this.b = jd3Var;
        this.s = gx3Var;
        this.p = gpVar;
    }

    @Override // defpackage.ix
    public final mu0 b(mu0 mu0Var, Object obj) {
        t03 t03Var = new t03(this.w, this.c, this.i, this.b, this.s, this.p, mu0Var);
        t03Var.q = obj;
        return t03Var;
    }

    @Override // defpackage.bz1
    public final Object l(Object obj, Object obj2) {
        t03 t03Var = (t03) b((mu0) obj2, (ox0) obj);
        og5 og5Var = og5.g;
        t03Var.u(og5Var);
        return og5Var;
    }

    @Override // defpackage.ix
    public final Object u(Object obj) {
        Object g84Var;
        js2.o(obj);
        jd3 jd3Var = this.b;
        Intent intent = this.c;
        try {
            g84Var = Boolean.valueOf(jd3Var.r(intent));
        } catch (Throwable th) {
            g84Var = new g84(th);
        }
        Object obj2 = Boolean.FALSE;
        if (g84Var instanceof g84) {
            g84Var = obj2;
        }
        boolean zBooleanValue = ((Boolean) g84Var).booleanValue();
        gp gpVar = this.p;
        if (!zBooleanValue) {
            z6 z6Var = new z6(gpVar, (byte) 23);
            boolean zEquals = "android.intent.action.SEND".equals(intent.getAction());
            qr0 qr0Var = this.i;
            gx3 gx3Var = this.s;
            if (zEquals && "text/plain".equals(intent.getType())) {
                String stringExtra = intent.getStringExtra("android.intent.extra.shortcut.ID");
                String stringExtra2 = stringExtra != null ? (String) cj0.s0(tx4.h0(stringExtra, new String[]{"_"})) : null;
                if (stringExtra2 == null) {
                    stringExtra2 = intent.getStringExtra("io.appground.MAC_ADDRESS");
                }
                gx3.g(gx3Var, "send_intent", false, new re1((Object) intent.getStringExtra("android.intent.extra.TEXT"), (Object) stringExtra2, (Object) qr0Var, (Object) z6Var, (byte) 2), 6);
            } else if (intent.getBooleanExtra("io.appground.blek.SHOW_UPGRADE", false)) {
                gx3Var.n.l("widget", null);
            } else if (intent.hasExtra("io.appground.MAC_ADDRESS")) {
                String stringExtra3 = intent.getStringExtra("io.appground.MAC_ADDRESS");
                if (stringExtra3 != null) {
                    qr0Var.v(stringExtra3);
                }
            } else if (intent.hasExtra("from_notification")) {
                String string = qr0Var.y.getString(R.string.message_return_back);
                string.getClass();
                qr0Var.p(string, true);
            } else {
                Uri data = intent.getData();
                if (data != null && yf2.p(this.w.getContentResolver().getType(data), "application/octet-stream")) {
                    jd3.v(jd3Var, "shared?sharedLayoutId=" + Uri.encode(data.toString()));
                }
            }
        }
        gpVar.n.setValue(null);
        return og5.g;
    }
}
