package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class bn1 {
    public static final zm1 g = new zm1();
    public static final zm1 y;

    static {
        b14 b14Var = b14.r;
        zm1 zm1Var = null;
        try {
            zm1Var = (zm1) Class.forName("androidx.datastore.preferences.protobuf.ExtensionSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        y = zm1Var;
    }
}
