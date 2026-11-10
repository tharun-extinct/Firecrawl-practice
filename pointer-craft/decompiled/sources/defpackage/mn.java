package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class mn implements my1 {
    public final /* synthetic */ byte j;
    public final /* synthetic */ Context t;

    public /* synthetic */ mn(Context context, byte b) {
        this.j = b;
        this.t = context;
    }

    @Override // defpackage.my1
    public final Object g() {
        byte b = this.j;
        og5 og5Var = og5.g;
        Context context = this.t;
        switch (b) {
            case 0:
                Uri uri = Uri.parse("https://play.google.com/store/account/orderhistory");
                uri.getClass();
                context.startActivity(new Intent("android.intent.action.VIEW", uri));
                return og5Var;
            case 1:
                if (Build.VERSION.SDK_INT >= 26) {
                    return a2.y(context.getSystemService(al0.x()));
                }
                return null;
            case 2:
                Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                intent.setData(Uri.fromParts("package", context.getPackageName(), null));
                context.startActivity(intent);
                return og5Var;
            case 3:
                return new i46(context, new i32(0));
            case 4:
                return new zv5(context, zv5.a, pj.g, j32.y);
            default:
                Uri uri2 = Uri.parse("https://play.google.com/store/account/orderhistory");
                uri2.getClass();
                context.startActivity(new Intent("android.intent.action.VIEW", uri2));
                return og5Var;
        }
    }
}
