package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class xp5 extends wp5 {
    @Override // defpackage.wp5, defpackage.aq2
    public final void E(boolean z) {
        this.y.setSystemBarsAppearance(z ? 16 : 0, 16);
    }

    @Override // defpackage.wp5, defpackage.aq2
    public final void F(boolean z) {
        this.y.setSystemBarsAppearance(z ? 8 : 0, 8);
    }

    @Override // defpackage.wp5, defpackage.aq2
    public final void G(int i) {
        this.y.setSystemBarsBehavior(i);
    }

    @Override // defpackage.wp5, defpackage.aq2
    public final int s() {
        return this.y.getSystemBarsBehavior();
    }
}
