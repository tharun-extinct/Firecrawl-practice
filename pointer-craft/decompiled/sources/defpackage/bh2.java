package defpackage;

import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public enum bh2 {
    VOID(Void.class, null),
    INT(Integer.class, 0),
    LONG(Long.class, 0L),
    FLOAT(Float.class, Float.valueOf(0.0f)),
    DOUBLE(Double.class, Double.valueOf(0.0d)),
    BOOLEAN(Boolean.class, Boolean.FALSE),
    STRING(String.class, ""),
    BYTE_STRING(ea0.class, ea0.t),
    ENUM(Integer.class, null),
    MESSAGE(Object.class, null);

    public final Class j;

    bh2(Class cls, Serializable serializable) {
        this.j = cls;
    }
}
