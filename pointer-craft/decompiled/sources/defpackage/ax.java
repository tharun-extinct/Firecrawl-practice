package defpackage;

import android.content.res.TypedArray;
import android.util.AttributeSet;

/* JADX INFO: loaded from: classes2.dex */
public final class ax extends ds0 {
    public bx b;
    public int i;

    public boolean getAllowsGoneWidget() {
        return this.b.t0;
    }

    public int getMargin() {
        return this.b.u0;
    }

    public int getType() {
        return this.i;
    }

    @Override // defpackage.ds0
    public final void j(AttributeSet attributeSet) {
        super.j(attributeSet);
        bx bxVar = new bx();
        bxVar.s0 = 0;
        bxVar.t0 = true;
        bxVar.u0 = 0;
        bxVar.v0 = false;
        this.b = bxVar;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, j24.y);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == 26) {
                    setType(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == 25) {
                    this.b.t0 = typedArrayObtainStyledAttributes.getBoolean(index, true);
                } else if (index == 27) {
                    this.b.u0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        this.m = this.b;
        m();
    }

    public void setAllowsGoneWidget(boolean z) {
        this.b.t0 = z;
    }

    public void setDpMargin(int i) {
        this.b.u0 = (int) ((i * getResources().getDisplayMetrics().density) + 0.5f);
    }

    public void setMargin(int i) {
        this.b.u0 = i;
    }

    public void setType(int i) {
        this.i = i;
    }

    /* JADX WARN: Code duplicated, block: B:5:0x000a  */
    /* JADX WARN: Code duplicated, block: B:7:0x000e  */
    @Override // defpackage.ds0
    public final void t(ts0 ts0Var, boolean z) {
        int i = this.i;
        if (z) {
            if (i == 5) {
                i = 1;
            } else if (i == 6) {
                i = 0;
            }
        } else if (i == 5) {
            i = 0;
        } else if (i == 6) {
            i = 1;
        }
        if (ts0Var instanceof bx) {
            ((bx) ts0Var).s0 = i;
        }
    }
}
