package defpackage;

import android.os.Bundle;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class zd3 extends de3 {
    public final Class q;

    public zd3(Class cls) {
        super(true);
        if (!Parcelable.class.isAssignableFrom(cls)) {
            up.n(cls, " does not implement Parcelable.");
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
        if (obj == null || !zd3.class.equals(obj.getClass())) {
            return false;
        }
        return yf2.p(this.q, ((zd3) obj).q);
    }

    public final int hashCode() {
        return this.q.hashCode();
    }

    @Override // defpackage.de3
    public final void v(Bundle bundle, String str, Object obj) {
        Parcelable[] parcelableArr = (Parcelable[]) obj;
        str.getClass();
        this.q.cast(parcelableArr);
        bundle.putParcelableArray(str, parcelableArr);
    }

    @Override // defpackage.de3
    public final boolean x(Object obj, Object obj2) {
        return pr.K((Parcelable[]) obj, (Parcelable[]) obj2);
    }

    @Override // defpackage.de3
    public final String y() {
        return this.q.getName();
    }
}
