package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class d32 extends nb3 {
    @Override // defpackage.nb3
    public final nb3 C(xy1 xy1Var, xy1 xy1Var2) {
        return (nb3) ((at4) it4.y(new ue1(new of(xy1Var, xy1Var2, (byte) 1), (byte) 1)));
    }

    @Override // defpackage.nb3
    public final xs2 f() {
        throw new IllegalStateException("Cannot apply the global snapshot directly. Call Snapshot.advanceGlobalSnapshot");
    }

    @Override // defpackage.nb3, defpackage.at4
    public final at4 h(xy1 xy1Var) {
        return (e34) ((at4) it4.y(new ue1(new x60(xy1Var, (byte) 2), (byte) 1)));
    }

    @Override // defpackage.nb3, defpackage.at4
    public final void m() {
        gg6.r();
        throw null;
    }

    @Override // defpackage.nb3, defpackage.at4
    public final void q() {
        gg6.r();
        throw null;
    }

    @Override // defpackage.nb3, defpackage.at4
    public final void r() {
        synchronized (it4.r) {
            i();
        }
    }

    @Override // defpackage.nb3, defpackage.at4
    public final void w() {
        it4.r();
    }
}
