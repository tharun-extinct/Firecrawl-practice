package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public abstract class an1 {
    public static final ym1 g = new ym1();
    public static final ym1 y;

    static {
        z04 z04Var = z04.r;
        ym1 ym1Var = null;
        try {
            ym1Var = (ym1) Class.forName("androidx.glance.appwidget.protobuf.ExtensionSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        y = ym1Var;
    }

    public static ym1 g() {
        ym1 ym1Var = y;
        if (ym1Var != null) {
            return ym1Var;
        }
        l0.z("Protobuf runtime is not correctly loaded.");
        return null;
    }
}
