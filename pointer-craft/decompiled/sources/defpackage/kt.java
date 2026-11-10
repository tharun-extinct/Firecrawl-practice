package defpackage;

import io.appground.blek.R;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class kt implements xy1 {
    public final /* synthetic */ byte j;
    public final /* synthetic */ qr0 t;

    public /* synthetic */ kt(qr0 qr0Var, byte b) {
        this.j = b;
        this.t = qr0Var;
    }

    @Override // defpackage.xy1
    public final Object a(Object obj) {
        byte b = this.j;
        og5 og5Var = og5.g;
        qr0 qr0Var = this.t;
        switch (b) {
            case 0:
                g61 g61Var = (g61) obj;
                g61Var.getClass();
                qr0Var.v(g61Var.t);
                break;
            default:
                Character ch = (Character) obj;
                ch.charValue();
                String string = qr0Var.y.getString(R.string.message_char_not_found, ch);
                string.getClass();
                qr0Var.p(string, true);
                break;
        }
        return og5Var;
    }
}
