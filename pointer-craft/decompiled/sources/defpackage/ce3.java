package defpackage;

import android.os.Bundle;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public class ce3 extends de3 {
    public final Class q;

    public ce3(Class cls) {
        super(true);
        if (!Serializable.class.isAssignableFrom(cls)) {
            up.n(cls, " does not implement Serializable.");
            throw null;
        }
        if (cls.isEnum()) {
            up.n(cls, " is an Enum. You should use EnumType instead.");
            throw null;
        }
        this.q = cls;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ce3)) {
            return false;
        }
        return this.q.equals(((ce3) obj).q);
    }

    @Override // defpackage.de3
    public final Object g(String str, Bundle bundle) {
        bundle.getClass();
        return (Serializable) bundle.get(str);
    }

    public final int hashCode() {
        return this.q.hashCode();
    }

    @Override // defpackage.de3
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public Serializable n(String str) {
        throw new UnsupportedOperationException("Serializables don't support default values.");
    }

    @Override // defpackage.de3
    public final void v(Bundle bundle, String str, Object obj) {
        Serializable serializable = (Serializable) obj;
        str.getClass();
        serializable.getClass();
        this.q.cast(serializable);
        bundle.putSerializable(str, serializable);
    }

    @Override // defpackage.de3
    public String y() {
        return this.q.getName();
    }

    public ce3(int i, Class cls) {
        super(false);
        if (Serializable.class.isAssignableFrom(cls)) {
            this.q = cls;
        } else {
            up.n(cls, " does not implement Serializable.");
            throw null;
        }
    }
}
