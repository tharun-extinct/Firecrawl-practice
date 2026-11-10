package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class sc extends nz1 implements xy1 {
    public final /* synthetic */ gt2 i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sc(gt2 gt2Var) {
        super(1, mu5.class, "localToScreen", "startInput$localToScreen(Landroidx/compose/foundation/text/input/internal/LegacyPlatformTextInputServiceAdapter$LegacyPlatformTextInputNode;[F)V", 0);
        this.i = gt2Var;
    }

    @Override // defpackage.xy1
    public final Object a(Object obj) {
        float[] fArr = ((l33) obj).g;
        bl2 bl2Var = (bl2) this.i.d.getValue();
        if (bl2Var != null) {
            if (!bl2Var.W()) {
                bl2Var = null;
            }
            if (bl2Var != null) {
                bl2Var.o(fArr);
            }
        }
        return og5.g;
    }
}
