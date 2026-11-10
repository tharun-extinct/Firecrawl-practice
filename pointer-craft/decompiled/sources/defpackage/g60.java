package defpackage;

/* JADX INFO: loaded from: classes.dex */
final class g60 extends o73 {
    public final wf g;

    public g60(wf wfVar) {
        this.g = wfVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof g60) {
            return this.g == ((g60) obj).g;
        }
        return false;
    }

    public final int hashCode() {
        return this.g.hashCode();
    }

    @Override // defpackage.o73
    public final void j(i73 i73Var) {
        i60 i60Var = (i60) i73Var;
        wf wfVar = this.g;
        i60Var.o = wfVar;
        if (i60Var.h) {
            wfVar.a(i60Var.f);
        }
    }

    @Override // defpackage.o73
    public final i73 l() {
        return new i60(this.g);
    }
}
