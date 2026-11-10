package defpackage;

import android.content.Context;
import android.os.Trace;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class hm0 implements gm0 {
    public final /* synthetic */ Object a;
    public final /* synthetic */ byte j;
    public final /* synthetic */ String t;

    public /* synthetic */ hm0(String str, Object obj, byte b) {
        this.j = b;
        this.t = str;
        this.a = obj;
    }

    @Override // defpackage.gm0
    public final Object c(vl vlVar) {
        byte b = this.j;
        Object obj = this.a;
        String str = this.t;
        switch (b) {
            case 0:
                ll0 ll0Var = (ll0) obj;
                try {
                    Trace.beginSection(str);
                    return ll0Var.x.c(vlVar);
                } finally {
                    Trace.endSection();
                }
            default:
                return new pu(str, ((st2) obj).y((Context) vlVar.g(Context.class)));
        }
    }
}
