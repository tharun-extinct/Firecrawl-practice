package defpackage;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public enum ch2 {
    VOID(Void.class, null),
    INT(Integer.class, 0),
    LONG(Long.class, 0L),
    FLOAT(Float.class, Float.valueOf(0.0f)),
    DOUBLE(Double.class, Double.valueOf(0.0d)),
    BOOLEAN(Boolean.class, Boolean.FALSE),
    STRING(String.class, ""),
    BYTE_STRING(da0.class, da0.a),
    ENUM(Integer.class, null),
    MESSAGE(Object.class, null);

    public final Class j;

    ch2(Class cls, Serializable serializable) {
        this.j = cls;
    }
}
