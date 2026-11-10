package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class r13 {
    public static final p13 g;
    public static final p13 y;

    static {
        b14 b14Var = b14.r;
        p13 p13Var = null;
        try {
            p13Var = (p13) Class.forName("androidx.datastore.preferences.protobuf.MapFieldSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        g = p13Var;
        y = new p13();
    }
}
