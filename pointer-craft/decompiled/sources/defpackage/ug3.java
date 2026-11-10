package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class ug3 {
    public static final sg3 g;
    public static final sg3 y;

    static {
        z04 z04Var = z04.r;
        sg3 sg3Var = null;
        try {
            sg3Var = (sg3) Class.forName("androidx.glance.appwidget.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        g = sg3Var;
        y = new sg3();
    }
}
