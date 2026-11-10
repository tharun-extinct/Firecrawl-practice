package defpackage;

import android.view.GestureDetector;
import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class fa1 implements a54, j74 {
    public final /* synthetic */ byte g;
    public final Object r;
    public boolean y;

    public fa1() {
        this.g = (byte) 1;
        this.r = new cd2(new dy4());
    }

    @Override // defpackage.a54
    public final boolean g(RecyclerView recyclerView, MotionEvent motionEvent) {
        byte b = this.g;
        Object obj = this.r;
        switch (b) {
            case 0:
                if (this.y && motionEvent.getActionMasked() == 0) {
                    this.y = false;
                }
                return !this.y && ((zk1) obj).g(recyclerView, motionEvent);
            case 1:
                if (this.y && motionEvent.getActionMasked() == 0) {
                    this.y = false;
                }
                return !this.y && ((a54) ((cd2) obj).c(motionEvent)).g(recyclerView, motionEvent);
            default:
                if (this.y && motionEvent.getActionMasked() == 0) {
                    this.y = false;
                }
                return !this.y && ((GestureDetector) obj).onTouchEvent(motionEvent);
        }
    }

    @Override // defpackage.a54
    public final void n(boolean z) {
        switch (this.g) {
            case 0:
                this.y = true;
                break;
            case 1:
                if (z) {
                    this.y = z;
                    break;
                }
                break;
            default:
                if (z) {
                    this.y = z;
                    ((GestureDetector) this.r).onTouchEvent(MotionEvent.obtain(0L, 1L, 3, 0.0f, 0.0f, 0));
                    break;
                }
                break;
        }
    }

    @Override // defpackage.j74
    public final boolean r() {
        switch (this.g) {
            case 0:
                return this.y;
            case 1:
                return this.y;
            default:
                return true;
        }
    }

    @Override // defpackage.j74
    public final void reset() {
        switch (this.g) {
            case 0:
                this.y = false;
                break;
            case 1:
                this.y = false;
                break;
            default:
                this.y = false;
                ((GestureDetector) this.r).onTouchEvent(MotionEvent.obtain(0L, 1L, 3, 0.0f, 0.0f, 0));
                break;
        }
    }

    public void x(fa5 fa5Var, a54 a54Var) {
        ((HashMap) ((cd2) this.r).t).put(fa5Var, a54Var);
    }

    @Override // defpackage.a54
    public final void y(RecyclerView recyclerView, MotionEvent motionEvent) {
        byte b = this.g;
        Object obj = this.r;
        switch (b) {
            case 0:
                ((zk1) obj).g(recyclerView, motionEvent);
                break;
            case 1:
                if (!this.y) {
                    ((a54) ((cd2) obj).c(motionEvent)).y(recyclerView, motionEvent);
                }
                break;
        }
    }

    public /* synthetic */ fa1(Object obj, byte b) {
        this.g = b;
        this.r = obj;
    }

    private final void v(RecyclerView recyclerView, MotionEvent motionEvent) {
    }
}
