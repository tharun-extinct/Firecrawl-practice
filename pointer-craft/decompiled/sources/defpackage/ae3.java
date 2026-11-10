package defpackage;

import android.os.Bundle;
import android.os.Parcelable;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class ae3 extends de3 {
    public final Class q;

    public ae3(Class cls) {
        super(true);
        if (Parcelable.class.isAssignableFrom(cls) || Serializable.class.isAssignableFrom(cls)) {
            this.q = cls;
        } else {
            up.n(cls, " does not implement Parcelable or Serializable.");
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !ae3.class.equals(obj.getClass())) {
            return false;
        }
        return this.q.equals(((ae3) obj).q);
    }

    @Override // defpackage.de3
    public final Object g(String str, Bundle bundle) {
        bundle.getClass();
        return bundle.get(str);
    }

    public final int hashCode() {
        return this.q.hashCode();
    }

    @Override // defpackage.de3
    public final Object n(String str) {
        throw new UnsupportedOperationException("Parcelables don't support default values.");
    }

    @Override // defpackage.de3
    public final void v(Bundle bundle, String str, Object obj) {
        str.getClass();
        this.q.cast(obj);
        if (obj == null || (obj instanceof Parcelable)) {
            bundle.putParcelable(str, (Parcelable) obj);
        } else if (obj instanceof Serializable) {
            bundle.putSerializable(str, (Serializable) obj);
        }
    }

    @Override // defpackage.de3
    public final String y() {
        return this.q.getName();
    }
}
