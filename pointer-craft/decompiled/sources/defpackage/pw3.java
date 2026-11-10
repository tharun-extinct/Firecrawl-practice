package defpackage;

import android.content.Context;
import android.content.SharedPreferences;

/* JADX INFO: loaded from: classes.dex */
public final class pw3 extends kk2 implements my1 {
    public final /* synthetic */ Context a;
    public final /* synthetic */ Object m;
    public final /* synthetic */ byte t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pw3(Context context, Object obj, byte b) {
        super(0);
        this.t = b;
        this.a = context;
        this.m = obj;
    }

    @Override // defpackage.my1
    public final Object g() {
        byte b = this.t;
        Object obj = this.m;
        Context context = this.a;
        switch (b) {
            case 0:
                return v13.A(context, ((qw3) obj).g);
            default:
                SharedPreferences sharedPreferences = context.getSharedPreferences((String) obj, 0);
                sharedPreferences.getClass();
                return sharedPreferences;
        }
    }
}
