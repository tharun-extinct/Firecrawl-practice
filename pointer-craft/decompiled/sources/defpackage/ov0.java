package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ov0 extends g90 {
    public final /* synthetic */ sv0 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ov0(sv0 sv0Var) {
        super((byte) 0);
        this.y = sv0Var;
    }

    @Override // defpackage.g90
    public final void c(String str) {
        qr0.b(this.y.y, str);
    }

    @Override // defpackage.g90
    public final void m(int i, boolean z) {
        this.y.y.q(0, i, z);
    }

    @Override // defpackage.g90
    public final void q(int i, boolean z) {
        this.y.y.w(0, i, z);
    }

    @Override // defpackage.g90
    public final void w(int i, boolean z) {
        this.y.y.c(i, z);
    }
}
