package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class v54 {
    public static final w54 g;

    static {
        w54 w54Var = null;
        try {
            w54Var = (w54) Class.forName("kotlin.reflect.jvm.internal.ReflectionFactoryImpl").newInstance();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
        }
        if (w54Var == null) {
            w54Var = new w54();
        }
        g = w54Var;
    }

    public static tf0 g(Class cls) {
        g.getClass();
        return new tf0(cls);
    }
}
