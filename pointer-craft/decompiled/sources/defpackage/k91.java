package defpackage;

import android.view.View;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class k91 extends ri0 {
    public final /* synthetic */ l91 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k91(l91 l91Var) {
        super(1);
        this.a = l91Var;
    }

    @Override // defpackage.ri0
    public final cd2 a(yo5 yo5Var, cd2 cd2Var) {
        l91 l91Var = this.a;
        if (!l91Var.z) {
            View childAt = l91Var.getChildAt(0);
            int iMax = Math.max(0, childAt.getLeft());
            int iMax2 = Math.max(0, childAt.getTop());
            int iMax3 = Math.max(0, l91Var.getWidth() - childAt.getRight());
            int iMax4 = Math.max(0, l91Var.getHeight() - childAt.getBottom());
            if (iMax != 0 || iMax2 != 0 || iMax3 != 0 || iMax4 != 0) {
                nd2 nd2VarR = nd2.r(iMax, iMax2, iMax3, iMax4);
                int i = nd2VarR.g;
                nd2 nd2Var = (nd2) cd2Var.t;
                int i2 = nd2VarR.y;
                int i3 = nd2VarR.r;
                int i4 = nd2VarR.n;
                return new cd2((byte) 23, tp5.v(nd2Var, i, i2, i3, i4), tp5.v((nd2) cd2Var.a, i, i2, i3, i4), false);
            }
        }
        return cd2Var;
    }

    @Override // defpackage.ri0
    public final tp5 j(tp5 tp5Var, List list) {
        l91 l91Var = this.a;
        if (!l91Var.z) {
            View childAt = l91Var.getChildAt(0);
            int iMax = Math.max(0, childAt.getLeft());
            int iMax2 = Math.max(0, childAt.getTop());
            int iMax3 = Math.max(0, l91Var.getWidth() - childAt.getRight());
            int iMax4 = Math.max(0, l91Var.getHeight() - childAt.getBottom());
            if (iMax != 0 || iMax2 != 0 || iMax3 != 0 || iMax4 != 0) {
                return tp5Var.g.p(iMax, iMax2, iMax3, iMax4);
            }
        }
        return tp5Var;
    }
}
