package defpackage;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.g;

/* JADX INFO: loaded from: classes2.dex */
public final class vm3 {
    public final g g;
    public final /* synthetic */ byte n;
    public int y = Integer.MIN_VALUE;
    public final Rect r = new Rect();

    public vm3(g gVar, byte b) {
        this.n = b;
        this.g = gVar;
    }

    public static vm3 g(g gVar, int i) {
        if (i == 0) {
            return new vm3(gVar, (byte) 0);
        }
        if (i == 1) {
            return new vm3(gVar, (byte) 1);
        }
        l0.u("invalid orientation");
        return null;
    }

    public final int a() {
        switch (this.n) {
            case 0:
                return this.g.getPaddingLeft();
            default:
                return this.g.getPaddingTop();
        }
    }

    public final int c(View view) {
        byte b = this.n;
        Rect rect = this.r;
        g gVar = this.g;
        switch (b) {
            case 0:
                gVar.U(rect, view);
                return rect.left;
            default:
                gVar.U(rect, view);
                return rect.top;
        }
    }

    public final void i(int i) {
        switch (this.n) {
            case 0:
                this.g.Z(i);
                break;
            default:
                this.g.a0(i);
                break;
        }
    }

    public final int j() {
        switch (this.n) {
            case 0:
                return this.g.getPaddingRight();
            default:
                return this.g.getPaddingBottom();
        }
    }

    public final int l() {
        int i;
        int paddingRight;
        byte b = this.n;
        g gVar = this.g;
        switch (b) {
            case 0:
                i = gVar.h;
                paddingRight = gVar.getPaddingRight();
                break;
            default:
                i = gVar.o;
                paddingRight = gVar.getPaddingBottom();
                break;
        }
        return i - paddingRight;
    }

    public final int m() {
        int paddingLeft;
        int paddingRight;
        byte b = this.n;
        g gVar = this.g;
        switch (b) {
            case 0:
                paddingLeft = gVar.h - gVar.getPaddingLeft();
                paddingRight = gVar.getPaddingRight();
                break;
            default:
                paddingLeft = gVar.o - gVar.getPaddingTop();
                paddingRight = gVar.getPaddingBottom();
                break;
        }
        return paddingLeft - paddingRight;
    }

    public final int n(View view) {
        int iM;
        int i;
        byte b = this.n;
        g gVar = this.g;
        switch (b) {
            case 0:
                y44 y44Var = (y44) view.getLayoutParams();
                gVar.getClass();
                iM = g.M(view) + ((ViewGroup.MarginLayoutParams) y44Var).topMargin;
                i = ((ViewGroup.MarginLayoutParams) y44Var).bottomMargin;
                break;
            default:
                y44 y44Var2 = (y44) view.getLayoutParams();
                gVar.getClass();
                iM = g.N(view) + ((ViewGroup.MarginLayoutParams) y44Var2).leftMargin;
                i = ((ViewGroup.MarginLayoutParams) y44Var2).rightMargin;
                break;
        }
        return iM + i;
    }

    public final int q() {
        if (Integer.MIN_VALUE == this.y) {
            return 0;
        }
        return m() - this.y;
    }

    public final int r(View view) {
        int iN;
        int i;
        byte b = this.n;
        g gVar = this.g;
        switch (b) {
            case 0:
                y44 y44Var = (y44) view.getLayoutParams();
                gVar.getClass();
                iN = g.N(view) + ((ViewGroup.MarginLayoutParams) y44Var).leftMargin;
                i = ((ViewGroup.MarginLayoutParams) y44Var).rightMargin;
                break;
            default:
                y44 y44Var2 = (y44) view.getLayoutParams();
                gVar.getClass();
                iN = g.M(view) + ((ViewGroup.MarginLayoutParams) y44Var2).topMargin;
                i = ((ViewGroup.MarginLayoutParams) y44Var2).bottomMargin;
                break;
        }
        return iN + i;
    }

    public final int t() {
        switch (this.n) {
            case 0:
                return this.g.u;
            default:
                return this.g.z;
        }
    }

    public final int v(View view) {
        int iL;
        int i;
        byte b = this.n;
        g gVar = this.g;
        switch (b) {
            case 0:
                y44 y44Var = (y44) view.getLayoutParams();
                gVar.getClass();
                iL = g.L(view);
                i = ((ViewGroup.MarginLayoutParams) y44Var).leftMargin;
                break;
            default:
                y44 y44Var2 = (y44) view.getLayoutParams();
                gVar.getClass();
                iL = g.P(view);
                i = ((ViewGroup.MarginLayoutParams) y44Var2).topMargin;
                break;
        }
        return iL - i;
    }

    public final int w(View view) {
        byte b = this.n;
        Rect rect = this.r;
        g gVar = this.g;
        switch (b) {
            case 0:
                gVar.U(rect, view);
                return rect.right;
            default:
                gVar.U(rect, view);
                return rect.bottom;
        }
    }

    public final int x() {
        switch (this.n) {
            case 0:
                return this.g.h;
            default:
                return this.g.o;
        }
    }

    public final int y(View view) {
        int iO;
        int i;
        byte b = this.n;
        g gVar = this.g;
        switch (b) {
            case 0:
                y44 y44Var = (y44) view.getLayoutParams();
                gVar.getClass();
                iO = g.O(view);
                i = ((ViewGroup.MarginLayoutParams) y44Var).rightMargin;
                break;
            default:
                y44 y44Var2 = (y44) view.getLayoutParams();
                gVar.getClass();
                iO = g.J(view);
                i = ((ViewGroup.MarginLayoutParams) y44Var2).bottomMargin;
                break;
        }
        return iO + i;
    }
}
