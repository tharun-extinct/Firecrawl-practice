package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class gu1 extends o73 {
    public final ja3 g;

    public gu1(ja3 ja3Var) {
        this.g = ja3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof gu1) {
            return yf2.p(this.g, ((gu1) obj).g);
        }
        return false;
    }

    public final int hashCode() {
        ja3 ja3Var = this.g;
        if (ja3Var != null) {
            return ja3Var.hashCode();
        }
        return 0;
    }

    @Override // defpackage.o73
    public final void j(i73 i73Var) {
        ((hu1) i73Var).V0(this.g);
    }

    @Override // defpackage.o73
    public final i73 l() {
        return new hu1(this.g, 1, null);
    }
}
