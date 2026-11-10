package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class m74 extends h1 {
    public final boolean a(Object obj) {
        if (obj == null) {
            obj = h1.c;
        }
        if (!h1.w.e(this, null, obj)) {
            return false;
        }
        h1.v(this);
        return true;
    }

    public final boolean m(Throwable th) {
        if (!h1.w.e(this, null, new c1(th))) {
            return false;
        }
        h1.v(this);
        return true;
    }
}
