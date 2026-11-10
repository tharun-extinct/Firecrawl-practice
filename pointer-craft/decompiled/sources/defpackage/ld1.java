package defpackage;

import android.animation.ObjectAnimator;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.card.MaterialCardView;
import io.appground.blek.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class ld1 {
    public static final ug2 v = new ug2((byte) 0);
    public static final ug2 x = new ug2((byte) 1);
    public final /* synthetic */ byte g;
    public Object n;
    public Object r;
    public int y;

    public ld1(byte b) {
        this.g = b;
        switch (b) {
            case 5:
                break;
            default:
                this.r = new Object[8];
                this.y = 0;
                break;
        }
    }

    public static void j(RecyclerView recyclerView, n54 n54Var, float f, float f2, boolean z) {
        View view = n54Var.g;
        if (z && view.getTag(R.id.item_touch_helper_previous_elevation) == null) {
            WeakHashMap weakHashMap = xk5.g;
            Float fValueOf = Float.valueOf(view.getElevation());
            int childCount = recyclerView.getChildCount();
            float f3 = 0.0f;
            for (int i = 0; i < childCount; i++) {
                View childAt = recyclerView.getChildAt(i);
                if (childAt != view) {
                    WeakHashMap weakHashMap2 = xk5.g;
                    float elevation = childAt.getElevation();
                    if (elevation > f3) {
                        f3 = elevation;
                    }
                }
            }
            view.setElevation(f3 + 1.0f);
            view.setTag(R.id.item_touch_helper_previous_elevation, fValueOf);
        }
        view.setTranslationX(f);
        view.setTranslationY(f2);
    }

    public static int r(int i, int i2) {
        int i3;
        int i4 = i & 789516;
        if (i4 == 0) {
            return i;
        }
        int i5 = i & (~i4);
        if (i2 == 0) {
            i3 = i4 << 2;
        } else {
            int i6 = i4 << 1;
            i5 |= (-789517) & i6;
            i3 = (i6 & 789516) << 2;
        }
        return i5 | i3;
    }

    public static int y(int i, int i2) {
        int i3;
        int i4 = i & 3158064;
        if (i4 == 0) {
            return i;
        }
        int i5 = i & (~i4);
        if (i2 == 0) {
            i3 = i4 >> 2;
        } else {
            int i6 = i4 >> 1;
            i5 |= (-3158065) & i6;
            i3 = (i6 & 3158064) >> 2;
        }
        return i5 | i3;
    }

    public void g(RecyclerView recyclerView, n54 n54Var) {
        recyclerView.getClass();
        n54Var.getClass();
        View view = n54Var.g;
        if (!(view instanceof MaterialCardView)) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(((vk2) n54Var).g, "translationZ", 16.0f, 0.0f);
            objectAnimatorOfFloat.getClass();
            objectAnimatorOfFloat.setInterpolator(new DecelerateInterpolator());
            objectAnimatorOfFloat.setDuration(150L).start();
        }
        Object tag = view.getTag(R.id.item_touch_helper_previous_elevation);
        if (tag instanceof Float) {
            float fFloatValue = ((Float) tag).floatValue();
            WeakHashMap weakHashMap = xk5.g;
            view.setElevation(fFloatValue);
        }
        view.setTag(R.id.item_touch_helper_previous_elevation, null);
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
    }

    public int l(RecyclerView recyclerView, int i, int i2, long j) {
        int dimensionPixelSize = this.y;
        if (dimensionPixelSize == -1) {
            dimensionPixelSize = recyclerView.getResources().getDimensionPixelSize(R.dimen.item_touch_helper_max_drag_scroll_per_frame);
            this.y = dimensionPixelSize;
        }
        int interpolation = (int) (v.getInterpolation(j <= 2000 ? j / 2000.0f : 1.0f) * ((int) (x.getInterpolation(Math.min(1.0f, (Math.abs(i2) * 1.0f) / i)) * ((int) Math.signum(i2)) * dimensionPixelSize)));
        if (interpolation == 0) {
            return i2 > 0 ? 1 : -1;
        }
        return interpolation;
    }

    public List n() {
        return (ArrayList) this.r;
    }

    public void t(String str, tn1 tn1Var) {
        int i = this.y + 1;
        Object[] objArrCopyOf = (Object[]) this.r;
        int length = objArrCopyOf.length;
        int i2 = i + i;
        if (i2 > length) {
            if (i2 < 0) {
                throw new AssertionError("cannot store more than MAX_VALUE elements");
            }
            int i3 = length + (length >> 1) + 1;
            if (i3 < i2) {
                int iHighestOneBit = Integer.highestOneBit(i2 - 1);
                i3 = iHighestOneBit + iHighestOneBit;
            }
            if (i3 < 0) {
                i3 = Integer.MAX_VALUE;
            }
            objArrCopyOf = Arrays.copyOf(objArrCopyOf, i3);
            this.r = objArrCopyOf;
        }
        int i4 = this.y;
        int i5 = i4 + i4;
        objArrCopyOf[i5] = str;
        objArrCopyOf[i5 + 1] = tn1Var;
        this.y = i4 + 1;
    }

    public String toString() {
        switch (this.g) {
            case 3:
                StringBuilder sb = new StringBuilder();
                if (((i14) this.r) == i14.a) {
                    sb.append("HTTP/1.0");
                } else {
                    sb.append("HTTP/1.1");
                }
                sb.append(' ');
                sb.append(this.y);
                sb.append(' ');
                sb.append((String) this.n);
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public int v(RecyclerView recyclerView, n54 n54Var) {
        recyclerView.getClass();
        n54Var.getClass();
        return 983055;
    }

    public int x() {
        return this.y;
    }

    public ld1(i14 i14Var, int i, String str) {
        this.g = (byte) 3;
        this.r = i14Var;
        this.y = i;
        this.n = str;
    }

    public ld1(ArrayList arrayList, int i, MotionEvent motionEvent) {
        this.g = (byte) 1;
        this.r = arrayList;
        this.y = i;
        this.n = motionEvent;
        if (arrayList.isEmpty()) {
            l0.u("changes cannot be empty");
            throw null;
        }
    }

    public ld1(bl5 bl5Var) {
        this.g = (byte) 2;
        this.r = bl5Var;
    }

    public ld1(wk2 wk2Var) {
        this.g = (byte) 0;
        this.y = -1;
        this.r = wk2Var;
    }
}
