package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class yv2 {
    public static final wv2 g;
    public static final wv2 y;

    static {
        z04 z04Var = z04.r;
        wv2 wv2Var = null;
        try {
            wv2Var = (wv2) Class.forName("androidx.glance.appwidget.protobuf.ListFieldSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        g = wv2Var;
        y = new wv2();
    }
}
