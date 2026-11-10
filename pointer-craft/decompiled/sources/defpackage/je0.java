package defpackage;

import android.graphics.Typeface;
import com.google.android.material.chip.Chip;

/* JADX INFO: loaded from: classes2.dex */
public final class je0 extends lr2 {
    public final /* synthetic */ byte v;
    public final /* synthetic */ Object x;

    public /* synthetic */ je0(Object obj, byte b) {
        this.v = b;
        this.x = obj;
    }

    @Override // defpackage.lr2
    public final void B(int i) {
        switch (this.v) {
            case 0:
                break;
            default:
                s45 s45Var = (s45) this.x;
                s45Var.n = true;
                oe0 oe0Var = (oe0) s45Var.v.get();
                if (oe0Var != null) {
                    oe0Var.G();
                    oe0Var.invalidateSelf();
                }
                break;
        }
    }

    @Override // defpackage.lr2
    public final void C(Typeface typeface, boolean z) {
        byte b = this.v;
        Object obj = this.x;
        switch (b) {
            case 0:
                Chip chip = (Chip) obj;
                oe0 oe0Var = chip.q;
                chip.setText(oe0Var.S0 ? oe0Var.U : chip.getText());
                chip.requestLayout();
                chip.invalidate();
                break;
            default:
                if (!z) {
                    s45 s45Var = (s45) obj;
                    s45Var.n = true;
                    oe0 oe0Var2 = (oe0) s45Var.v.get();
                    if (oe0Var2 != null) {
                        oe0Var2.G();
                        oe0Var2.invalidateSelf();
                    }
                    break;
                }
                break;
        }
    }

    private final void K(int i) {
    }
}
