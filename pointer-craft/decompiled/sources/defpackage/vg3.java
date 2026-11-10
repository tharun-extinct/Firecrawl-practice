package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class vg3 {
    public static final tg3 g;
    public static final tg3 y;

    static {
        b14 b14Var = b14.r;
        tg3 tg3Var = null;
        try {
            tg3Var = (tg3) Class.forName("androidx.datastore.preferences.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        g = tg3Var;
        y = new tg3();
    }
}
