package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class cg4 extends m5 implements bz1 {
    public final /* synthetic */ byte i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cg4(fg4 fg4Var, byte b) {
        super(2, fg4Var, fg4.class, "onMouseWheelScrollStopped", "onMouseWheelScrollStopped-TH1AsA0(J)V", 4);
        this.i = b;
        switch (b) {
            case 1:
                super(2, fg4Var, fg4.class, "onTrackpadScrollStopped", "onTrackpadScrollStopped-TH1AsA0(J)V", 4);
                break;
            default:
                break;
        }
    }

    @Override // defpackage.bz1
    public final Object l(Object obj, Object obj2) {
        byte b = this.i;
        og5 og5Var = og5.g;
        Object obj3 = this.j;
        switch (b) {
            case 0:
                fg4 fg4Var = (fg4) obj3;
                m50.T(fg4Var.Q.r(), null, new eg4(fg4Var, ((vj5) obj).g, null, (byte) 1), 3);
                break;
            default:
                fg4 fg4Var2 = (fg4) obj3;
                m50.T(fg4Var2.Q.r(), null, new eg4(fg4Var2, ((vj5) obj).g, null, (byte) 2), 3);
                break;
        }
        return og5Var;
    }
}
