package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class vm1 {
    public static final Class g;

    static {
        Class<?> cls;
        try {
            cls = Class.forName("androidx.datastore.preferences.protobuf.ExtensionRegistry");
        } catch (ClassNotFoundException unused) {
            cls = null;
        }
        g = cls;
    }
}
