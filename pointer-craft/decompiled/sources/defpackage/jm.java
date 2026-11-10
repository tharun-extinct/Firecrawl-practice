package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class jm extends dw1 {
    public final /* synthetic */ sm p;
    public final /* synthetic */ pm s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jm(sm smVar, sm smVar2, pm pmVar) {
        super(smVar2);
        this.p = smVar;
        this.s = pmVar;
    }

    @Override // defpackage.dw1
    public final boolean r() {
        sm smVar = this.p;
        if (smVar.getInternalPopup().g()) {
            return true;
        }
        smVar.w.q(smVar.getTextDirection(), smVar.getTextAlignment());
        return true;
    }

    @Override // defpackage.dw1
    public final mp4 y() {
        return this.s;
    }
}
