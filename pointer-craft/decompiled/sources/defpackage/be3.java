package defpackage;

import android.os.Bundle;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class be3 extends de3 {
    public final Class q;

    public be3(Class cls) {
        super(true);
        if (!Serializable.class.isAssignableFrom(cls)) {
            up.n(cls, " does not implement Serializable.");
            throw null;
        }
        try {
            this.q = Class.forName("[L" + cls.getName() + ";");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !be3.class.equals(obj.getClass())) {
            return false;
        }
        return yf2.p(this.q, ((be3) obj).q);
    }

    @Override // defpackage.de3
    public final Object g(String str, Bundle bundle) {
        bundle.getClass();
        return (Serializable[]) bundle.get(str);
    }

    public final int hashCode() {
        return this.q.hashCode();
    }

    @Override // defpackage.de3
    public final Object n(String str) {
        throw new UnsupportedOperationException("Arrays don't support default values.");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.io.Serializable, java.io.Serializable[], java.lang.Object] */
    @Override // defpackage.de3
    public final void v(Bundle bundle, String str, Object obj) {
        ?? r3 = (Serializable[]) obj;
        str.getClass();
        this.q.cast(r3);
        bundle.putSerializable(str, r3);
    }

    @Override // defpackage.de3
    public final boolean x(Object obj, Object obj2) {
        return pr.K((Serializable[]) obj, (Serializable[]) obj2);
    }

    @Override // defpackage.de3
    public final String y() {
        return this.q.getName();
    }
}
