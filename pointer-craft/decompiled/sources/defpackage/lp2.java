package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class lp2 implements my1 {
    public final /* synthetic */ String a;
    public final /* synthetic */ byte j;
    public final /* synthetic */ Context t;

    public /* synthetic */ lp2(Context context, String str, byte b) {
        this.j = b;
        this.t = context;
        this.a = str;
    }

    @Override // defpackage.my1
    public final Object g() {
        byte b = this.j;
        String str = this.a;
        Context context = this.t;
        switch (b) {
            case 0:
                return m50.H(context, str);
            default:
                return v13.A(context, str);
        }
    }
}
