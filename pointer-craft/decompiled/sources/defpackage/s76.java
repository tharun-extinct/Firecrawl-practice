package defpackage;

/* JADX INFO: loaded from: classes.dex */
public enum s76 {
    VOID(Void.class),
    INT(Integer.class),
    LONG(Long.class),
    FLOAT(Float.class),
    DOUBLE(Double.class),
    BOOLEAN(Boolean.class),
    STRING(String.class),
    BYTE_STRING(l56.class),
    ENUM(Integer.class),
    MESSAGE(Object.class);

    public final Class j;

    static {
        n56 n56Var = l56.t;
    }

    s76(Class cls) {
        this.j = cls;
    }
}
