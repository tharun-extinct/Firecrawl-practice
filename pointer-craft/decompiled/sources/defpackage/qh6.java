package defpackage;

import android.content.Context;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class qh6 {
    public static final qj6 a;
    public static gj6 t;
    public final String g;
    public final int j;
    public final String l;
    public final io4 n;
    public final oh6 r;
    public final nj6 v;
    public final nj6 x;
    public final String y;

    static {
        Object[] objArr = {"optional-module-barcode", "com.google.android.gms.vision.barcode"};
        objArr[0].getClass();
        objArr[1].getClass();
        a = new qj6(objArr);
    }

    public qh6(Context context, io4 io4Var, oh6 oh6Var) {
        new HashMap();
        new HashMap();
        this.g = context.getPackageName();
        this.y = uk0.g(context);
        this.n = io4Var;
        this.r = oh6Var;
        bi6.A();
        this.l = "play-services-code-scanner";
        v92.E();
        this.v = v92.Q(new cp4(this, (byte) 2));
        v92.E();
        io4Var.getClass();
        this.x = v92.Q(new ph6(io4Var, (byte) 0));
        qj6 qj6Var = a;
        this.j = qj6Var.containsKey("play-services-code-scanner") ? bg1.y(context, (String) qj6Var.get("play-services-code-scanner"), false) : -1;
    }
}
