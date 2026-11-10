package defpackage;

import android.R;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class sn1 extends w44 implements a54 {
    public static final int[] C = {R.attr.state_pressed};
    public static final int[] D = new int[0];
    public byte A;
    public final ml B;
    public final int a;
    public float b;
    public int c;
    public final ValueAnimator e;
    public final int g;
    public int i;
    public final Drawable j;
    public final StateListDrawable l;
    public int m;
    public final Drawable n;
    public int q;
    public final StateListDrawable r;
    public final int t;
    public final RecyclerView u;
    public final int v;
    public float w;
    public final int x;
    public final int y;
    public int s = 0;
    public int p = 0;
    public boolean z = false;
    public boolean h = false;
    public byte o = 0;
    public byte f = 0;
    public final int[] k = new int[2];
    public final int[] d = new int[2];

    public sn1(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i, int i2, int i3) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.e = valueAnimatorOfFloat;
        this.A = (byte) 0;
        ml mlVar = new ml((Object) this, (byte) 7);
        this.B = mlVar;
        qn1 qn1Var = new qn1(this);
        this.r = stateListDrawable;
        this.n = drawable;
        this.l = stateListDrawable2;
        this.j = drawable2;
        this.v = Math.max(i, stateListDrawable.getIntrinsicWidth());
        this.x = Math.max(i, drawable.getIntrinsicWidth());
        this.t = Math.max(i, stateListDrawable2.getIntrinsicWidth());
        this.a = Math.max(i, drawable2.getIntrinsicWidth());
        this.g = i2;
        this.y = i3;
        stateListDrawable.setAlpha(255);
        drawable.setAlpha(255);
        valueAnimatorOfFloat.addListener(new rn1(this));
        valueAnimatorOfFloat.addUpdateListener(new c50(this, (byte) 1));
        RecyclerView recyclerView2 = this.u;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            recyclerView2.g0(this);
            RecyclerView recyclerView3 = this.u;
            recyclerView3.k.remove(this);
            if (recyclerView3.d == this) {
                recyclerView3.d = null;
            }
            ArrayList arrayList = this.u.q0;
            if (arrayList != null) {
                arrayList.remove(qn1Var);
            }
            this.u.removeCallbacks(mlVar);
        }
        this.u = recyclerView;
        recyclerView.t(this);
        this.u.k.add(this);
        this.u.a(qn1Var);
    }

    public static int t(float f, float f2, int[] iArr, int i, int i2, int i3) {
        int i4 = iArr[1] - iArr[0];
        if (i4 != 0) {
            int i5 = i - i3;
            int i6 = (int) (((f2 - f) / i4) * i5);
            int i7 = i2 + i6;
            if (i7 < i5 && i7 >= 0) {
                return i6;
            }
        }
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(int i) {
        RecyclerView recyclerView = this.u;
        ml mlVar = this.B;
        StateListDrawable stateListDrawable = this.r;
        if (i == 2 && this.o != 2) {
            stateListDrawable.setState(C);
            recyclerView.removeCallbacks(mlVar);
        }
        if (i == 0) {
            recyclerView.invalidate();
        } else {
            m();
        }
        if (this.o == 2 && i != 2) {
            stateListDrawable.setState(D);
            recyclerView.removeCallbacks(mlVar);
            recyclerView.postDelayed(mlVar, 1200L);
        } else if (i == 1) {
            recyclerView.removeCallbacks(mlVar);
            recyclerView.postDelayed(mlVar, 1500L);
        }
        this.o = i;
    }

    @Override // defpackage.a54
    public final boolean g(RecyclerView recyclerView, MotionEvent motionEvent) {
        byte b = this.o;
        if (b != 1) {
            return b == 2;
        }
        boolean zJ = j(motionEvent.getX(), motionEvent.getY());
        boolean zL = l(motionEvent.getX(), motionEvent.getY());
        if (motionEvent.getAction() != 0) {
            return false;
        }
        if (!zJ && !zL) {
            return false;
        }
        if (zL) {
            this.f = (byte) 1;
            this.b = (int) motionEvent.getX();
        } else if (zJ) {
            this.f = (byte) 2;
            this.w = (int) motionEvent.getY();
        }
        a(2);
        return true;
    }

    public final boolean j(float f, float f2) {
        int layoutDirection = this.u.getLayoutDirection();
        int i = this.v;
        if (layoutDirection == 1) {
            if (f > i) {
                return false;
            }
        } else if (f < this.s - i) {
            return false;
        }
        int i2 = this.q;
        int i3 = this.m / 2;
        return f2 >= ((float) (i2 - i3)) && f2 <= ((float) (i3 + i2));
    }

    public final boolean l(float f, float f2) {
        if (f2 < this.p - this.t) {
            return false;
        }
        int i = this.i;
        int i2 = this.c;
        return f >= ((float) (i - (i2 / 2))) && f <= ((float) ((i2 / 2) + i));
    }

    public final void m() {
        byte b = this.A;
        ValueAnimator valueAnimator = this.e;
        if (b != 0) {
            if (b != 3) {
                return;
            } else {
                valueAnimator.cancel();
            }
        }
        this.A = (byte) 1;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f);
        valueAnimator.setDuration(500L);
        valueAnimator.setStartDelay(0L);
        valueAnimator.start();
    }

    @Override // defpackage.w44
    public final void x(Canvas canvas, RecyclerView recyclerView) {
        int i = this.s;
        RecyclerView recyclerView2 = this.u;
        if (i != recyclerView2.getWidth() || this.p != recyclerView2.getHeight()) {
            this.s = recyclerView2.getWidth();
            this.p = recyclerView2.getHeight();
            a(0);
            return;
        }
        if (this.A != 0) {
            if (this.z) {
                int i2 = this.s;
                int i3 = this.v;
                int i4 = i2 - i3;
                int i5 = this.q;
                int i6 = this.m;
                int i7 = i5 - (i6 / 2);
                StateListDrawable stateListDrawable = this.r;
                stateListDrawable.setBounds(0, 0, i3, i6);
                int i8 = this.x;
                int i9 = this.p;
                Drawable drawable = this.n;
                drawable.setBounds(0, 0, i8, i9);
                if (recyclerView2.getLayoutDirection() == 1) {
                    drawable.draw(canvas);
                    canvas.translate(i3, i7);
                    canvas.scale(-1.0f, 1.0f);
                    stateListDrawable.draw(canvas);
                    canvas.scale(-1.0f, 1.0f);
                    canvas.translate(-i3, -i7);
                } else {
                    canvas.translate(i4, 0.0f);
                    drawable.draw(canvas);
                    canvas.translate(0.0f, i7);
                    stateListDrawable.draw(canvas);
                    canvas.translate(-i4, -i7);
                }
            }
            if (this.h) {
                int i10 = this.p;
                int i11 = this.t;
                int i12 = i10 - i11;
                int i13 = this.i;
                int i14 = this.c;
                int i15 = i13 - (i14 / 2);
                StateListDrawable stateListDrawable2 = this.l;
                stateListDrawable2.setBounds(0, 0, i14, i11);
                int i16 = this.s;
                int i17 = this.a;
                Drawable drawable2 = this.j;
                drawable2.setBounds(0, 0, i16, i17);
                canvas.translate(0.0f, i12);
                drawable2.draw(canvas);
                canvas.translate(i15, 0.0f);
                stateListDrawable2.draw(canvas);
                canvas.translate(-i15, -i12);
            }
        }
    }

    @Override // defpackage.a54
    public final void y(RecyclerView recyclerView, MotionEvent motionEvent) {
        if (this.o == 0) {
            return;
        }
        if (motionEvent.getAction() == 0) {
            boolean zJ = j(motionEvent.getX(), motionEvent.getY());
            boolean zL = l(motionEvent.getX(), motionEvent.getY());
            if (zJ || zL) {
                if (zL) {
                    this.f = (byte) 1;
                    this.b = (int) motionEvent.getX();
                } else if (zJ) {
                    this.f = (byte) 2;
                    this.w = (int) motionEvent.getY();
                }
                a(2);
                return;
            }
            return;
        }
        if (motionEvent.getAction() == 1 && this.o == 2) {
            this.w = 0.0f;
            this.b = 0.0f;
            a(1);
            this.f = (byte) 0;
            return;
        }
        if (motionEvent.getAction() == 2 && this.o == 2) {
            m();
            byte b = this.f;
            RecyclerView recyclerView2 = this.u;
            int i = this.y;
            if (b == 1) {
                float x = motionEvent.getX();
                int[] iArr = this.d;
                iArr[0] = i;
                int i2 = this.s - i;
                iArr[1] = i2;
                float fMax = Math.max(i, Math.min(i2, x));
                if (Math.abs(this.i - fMax) >= 2.0f) {
                    int iT = t(this.b, fMax, iArr, recyclerView2.computeHorizontalScrollRange(), recyclerView2.computeHorizontalScrollOffset(), this.s);
                    if (iT != 0) {
                        recyclerView2.scrollBy(iT, 0);
                    }
                    this.b = fMax;
                }
            }
            if (this.f == 2) {
                float y = motionEvent.getY();
                int[] iArr2 = this.k;
                iArr2[0] = i;
                int i3 = this.p - i;
                iArr2[1] = i3;
                float fMax2 = Math.max(i, Math.min(i3, y));
                if (Math.abs(this.q - fMax2) < 2.0f) {
                    return;
                }
                int iT2 = t(this.w, fMax2, iArr2, recyclerView2.computeVerticalScrollRange(), recyclerView2.computeVerticalScrollOffset(), this.p);
                if (iT2 != 0) {
                    recyclerView2.scrollBy(0, iT2);
                }
                this.w = fMax2;
            }
        }
    }

    @Override // defpackage.a54
    public final void n(boolean z) {
    }
}
