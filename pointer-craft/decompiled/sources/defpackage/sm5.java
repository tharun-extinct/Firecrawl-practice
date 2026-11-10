package defpackage;

import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: loaded from: classes.dex */
public abstract class sm5 extends ds0 {
    public boolean b;
    public boolean i;

    @Override // defpackage.ds0
    public void j(AttributeSet attributeSet) {
        super.j(attributeSet);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, j24.y);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == 6) {
                    this.i = true;
                } else if (index == 22) {
                    this.b = true;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    @Override // defpackage.ds0, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.i || this.b) {
            ViewParent parent = getParent();
            if (parent instanceof ConstraintLayout) {
                ConstraintLayout constraintLayout = (ConstraintLayout) parent;
                int visibility = getVisibility();
                float elevation = getElevation();
                for (int i = 0; i < this.t; i++) {
                    View view = (View) constraintLayout.j.get(this.j[i]);
                    if (view != null) {
                        if (this.i) {
                            view.setVisibility(visibility);
                        }
                        if (this.b && elevation > 0.0f) {
                            view.setTranslationZ(view.getTranslationZ() + elevation);
                        }
                    }
                }
            }
        }
    }

    public abstract void q(tm5 tm5Var, int i, int i2);

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        n();
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        n();
    }

    @Override // defpackage.ds0
    public final void x(ConstraintLayout constraintLayout) {
        v(constraintLayout);
    }
}
