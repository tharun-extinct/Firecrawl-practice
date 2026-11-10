package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class q13 {
    public static final o13 g;
    public static final o13 y;

    static {
        z04 z04Var = z04.r;
        o13 o13Var = null;
        try {
            o13Var = (o13) Class.forName("androidx.glance.appwidget.protobuf.MapFieldSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        g = o13Var;
        y = new o13();
    }
}
