package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class gl0 implements mu0 {
    public final /* synthetic */ byte j;
    public static final gl0 t = new gl0(0);
    public static final gl0 a = new gl0(1);

    public /* synthetic */ gl0(byte b) {
        this.j = b;
    }

    @Override // defpackage.mu0
    public final void j(Object obj) {
        switch (this.j) {
            case 0:
                throw new IllegalStateException("This continuation is already complete");
            default:
                return;
        }
    }

    public String toString() {
        switch (this.j) {
            case 0:
                return "This continuation is already complete";
            default:
                return super.toString();
        }
    }

    @Override // defpackage.mu0
    public final fx0 v() {
        switch (this.j) {
            case 0:
                throw new IllegalStateException("This continuation is already complete");
            default:
                return ni1.j;
        }
    }

    private final void g(Object obj) {
    }
}
