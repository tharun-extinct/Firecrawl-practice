package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ns5 extends o73 {
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ns5) && Float.compare(1.0f, 1.0f) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(1.0f);
    }

    @Override // defpackage.o73
    public final void j(i73 i73Var) {
        ((qs5) i73Var).o = 1.0f;
    }

    @Override // defpackage.o73
    public final i73 l() {
        qs5 qs5Var = new qs5();
        qs5Var.o = 1.0f;
        return qs5Var;
    }

    public final String toString() {
        return "ZIndexElement(zIndex=1.0)";
    }
}
