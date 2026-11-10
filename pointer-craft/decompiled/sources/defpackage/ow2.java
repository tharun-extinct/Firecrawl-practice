package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ow2 implements Runnable {
    public final /* synthetic */ byte j;
    public final /* synthetic */ sw2 t;

    public /* synthetic */ ow2(sw2 sw2Var, byte b) {
        this.j = b;
        this.t = sw2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.j;
        sw2 sw2Var = this.t;
        switch (b) {
            case 0:
                ef1 ef1Var = sw2Var.a;
                if (ef1Var != null) {
                    ef1Var.setListSelectionHidden(true);
                    ef1Var.requestLayout();
                }
                break;
            default:
                ef1 ef1Var2 = sw2Var.a;
                if (ef1Var2 != null && ef1Var2.isAttachedToWindow() && sw2Var.a.getCount() > sw2Var.a.getChildCount() && sw2Var.a.getChildCount() <= sw2Var.z) {
                    sw2Var.G.setInputMethodMode(2);
                    sw2Var.r();
                    break;
                }
                break;
        }
    }
}
