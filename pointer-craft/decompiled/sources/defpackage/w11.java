package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class w11 implements n14 {
    public final /* synthetic */ byte g;
    public final /* synthetic */ String r;
    public final /* synthetic */ Context y;

    public /* synthetic */ w11(Context context, String str, byte b) {
        this.g = b;
        this.y = context;
        this.r = str;
    }

    @Override // defpackage.n14
    public final Object get() {
        byte b = this.g;
        String str = this.r;
        Context context = this.y;
        switch (b) {
            case 0:
                return new g52(context, str);
            default:
                return context.getSharedPreferences(str, 0);
        }
    }
}
