package defpackage;

import android.graphics.Rect;
import android.view.WindowInsets;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class op5 extends np5 {
    public op5(tp5 tp5Var, WindowInsets windowInsets) {
        super(tp5Var, windowInsets);
    }

    @Override // defpackage.hp5, defpackage.pp5
    public List<Rect> l(int i) {
        return this.r.getBoundingRectsIgnoringVisibility(sp5.g(i));
    }

    @Override // defpackage.hp5, defpackage.pp5
    public List<Rect> x(int i) {
        return this.r.getBoundingRects(sp5.g(i));
    }

    public op5(tp5 tp5Var, op5 op5Var) {
        super(tp5Var, op5Var);
    }

    @Override // defpackage.hp5, defpackage.pp5
    public void s() {
    }
}
