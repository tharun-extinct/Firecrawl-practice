package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class gs5 implements ku2, kz1 {
    public final /* synthetic */ to0 g;

    public gs5(to0 to0Var) {
        this.g = to0Var;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof ku2) && (obj instanceof kz1)) {
            return y().equals(((kz1) obj).y());
        }
        return false;
    }

    public final int hashCode() {
        return y().hashCode();
    }

    @Override // defpackage.kz1
    public final jz1 y() {
        return new nz1(1, this.g, to0.class, "scheduleFrameEndCallback", "scheduleFrameEndCallback(Lkotlin/jvm/functions/Function0;)Landroidx/compose/runtime/CancellationHandle;", 0);
    }
}
