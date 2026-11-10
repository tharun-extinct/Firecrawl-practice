package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import defpackage.bx;
import defpackage.cd2;
import defpackage.ds0;
import defpackage.eo5;
import defpackage.es0;
import defpackage.fs0;
import defpackage.gs0;
import defpackage.hk5;
import defpackage.j24;
import defpackage.kq2;
import defpackage.kv2;
import defpackage.l72;
import defpackage.lc0;
import defpackage.m42;
import defpackage.n42;
import defpackage.n52;
import defpackage.po4;
import defpackage.ro;
import defpackage.rs0;
import defpackage.t51;
import defpackage.tm5;
import defpackage.ts0;
import defpackage.us0;
import defpackage.xs0;
import defpackage.y94;
import defpackage.zo2;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public class ConstraintLayout extends ViewGroup {
    public static po4 f;
    public final us0 a;
    public int b;
    public int c;
    public final SparseArray h;
    public boolean i;
    public final SparseArray j;
    public int m;
    public final gs0 o;
    public cd2 p;
    public int q;
    public rs0 s;
    public final ArrayList t;
    public int u;
    public int w;
    public HashMap z;

    public ConstraintLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.j = new SparseArray();
        this.t = new ArrayList(4);
        this.a = new us0();
        this.m = 0;
        this.q = 0;
        this.w = Integer.MAX_VALUE;
        this.c = Integer.MAX_VALUE;
        this.i = true;
        this.b = 257;
        this.s = null;
        this.p = null;
        this.u = -1;
        this.z = new HashMap();
        this.h = new SparseArray();
        this.o = new gs0(this, this);
        x(attributeSet, 0);
    }

    private int getPaddingWidth() {
        int iMax = Math.max(0, getPaddingRight()) + Math.max(0, getPaddingLeft());
        int iMax2 = Math.max(0, getPaddingEnd()) + Math.max(0, getPaddingStart());
        return iMax2 > 0 ? iMax2 : iMax;
    }

    public static po4 getSharedValues() {
        po4 po4Var = f;
        if (po4Var != null) {
            return po4Var;
        }
        po4 po4Var2 = new po4();
        f = po4Var2;
        return po4Var2;
    }

    public static fs0 n() {
        fs0 fs0Var = new fs0(-2, -2);
        fs0Var.g = -1;
        fs0Var.y = -1;
        fs0Var.r = -1.0f;
        fs0Var.n = true;
        fs0Var.v = -1;
        fs0Var.x = -1;
        fs0Var.l = -1;
        fs0Var.j = -1;
        fs0Var.t = -1;
        fs0Var.a = -1;
        fs0Var.m = -1;
        fs0Var.q = -1;
        fs0Var.w = -1;
        fs0Var.c = -1;
        fs0Var.i = -1;
        fs0Var.b = -1;
        fs0Var.s = 0;
        fs0Var.p = 0.0f;
        fs0Var.u = -1;
        fs0Var.z = -1;
        fs0Var.h = -1;
        fs0Var.o = -1;
        fs0Var.f = Integer.MIN_VALUE;
        fs0Var.k = Integer.MIN_VALUE;
        fs0Var.d = Integer.MIN_VALUE;
        fs0Var.e = Integer.MIN_VALUE;
        fs0Var.A = Integer.MIN_VALUE;
        fs0Var.B = Integer.MIN_VALUE;
        fs0Var.C = Integer.MIN_VALUE;
        fs0Var.D = 0;
        fs0Var.E = 0.5f;
        fs0Var.F = 0.5f;
        fs0Var.G = null;
        fs0Var.H = -1.0f;
        fs0Var.I = -1.0f;
        fs0Var.J = 0;
        fs0Var.K = 0;
        fs0Var.L = 0;
        fs0Var.M = 0;
        fs0Var.N = 0;
        fs0Var.O = 0;
        fs0Var.P = 0;
        fs0Var.Q = 0;
        fs0Var.R = 1.0f;
        fs0Var.S = 1.0f;
        fs0Var.T = -1;
        fs0Var.U = -1;
        fs0Var.V = -1;
        fs0Var.W = false;
        fs0Var.X = false;
        fs0Var.Y = null;
        fs0Var.Z = 0;
        fs0Var.a0 = true;
        fs0Var.b0 = true;
        fs0Var.c0 = false;
        fs0Var.d0 = false;
        fs0Var.e0 = false;
        fs0Var.f0 = -1;
        fs0Var.g0 = -1;
        fs0Var.h0 = -1;
        fs0Var.i0 = -1;
        fs0Var.j0 = Integer.MIN_VALUE;
        fs0Var.k0 = Integer.MIN_VALUE;
        fs0Var.l0 = 0.5f;
        fs0Var.p0 = new ts0();
        return fs0Var;
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof fs0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Object tag;
        int size;
        ArrayList arrayList = this.t;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            for (int i = 0; i < size; i++) {
                ((ds0) arrayList.get(i)).getClass();
            }
        }
        super.dispatchDraw(canvas);
        if (isInEditMode()) {
            float width = getWidth();
            float height = getHeight();
            int childCount = getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                if (childAt.getVisibility() != 8 && (tag = childAt.getTag()) != null && (tag instanceof String)) {
                    String[] strArrSplit = ((String) tag).split(",");
                    if (strArrSplit.length == 4) {
                        int i3 = Integer.parseInt(strArrSplit[0]);
                        int i4 = Integer.parseInt(strArrSplit[1]);
                        int i5 = Integer.parseInt(strArrSplit[2]);
                        int i6 = (int) ((i3 / 1080.0f) * width);
                        int i7 = (int) ((i4 / 1920.0f) * height);
                        int i8 = (int) ((Integer.parseInt(strArrSplit[3]) / 1920.0f) * height);
                        Paint paint = new Paint();
                        paint.setColor(-65536);
                        float f2 = i6;
                        float f3 = i7;
                        float f4 = i6 + ((int) ((i5 / 1080.0f) * width));
                        canvas.drawLine(f2, f3, f4, f3, paint);
                        float f5 = i7 + i8;
                        canvas.drawLine(f4, f3, f4, f5, paint);
                        canvas.drawLine(f4, f5, f2, f5, paint);
                        canvas.drawLine(f2, f5, f2, f3, paint);
                        paint.setColor(-16711936);
                        canvas.drawLine(f2, f3, f4, f5, paint);
                        canvas.drawLine(f2, f5, f4, f3, paint);
                    }
                }
            }
        }
    }

    @Override // android.view.View
    public final void forceLayout() {
        this.i = true;
        super.forceLayout();
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return n();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        fs0 fs0Var = new fs0(context, attributeSet);
        fs0Var.g = -1;
        fs0Var.y = -1;
        fs0Var.r = -1.0f;
        fs0Var.n = true;
        fs0Var.v = -1;
        fs0Var.x = -1;
        fs0Var.l = -1;
        fs0Var.j = -1;
        fs0Var.t = -1;
        fs0Var.a = -1;
        fs0Var.m = -1;
        fs0Var.q = -1;
        fs0Var.w = -1;
        fs0Var.c = -1;
        fs0Var.i = -1;
        fs0Var.b = -1;
        fs0Var.s = 0;
        fs0Var.p = 0.0f;
        fs0Var.u = -1;
        fs0Var.z = -1;
        fs0Var.h = -1;
        fs0Var.o = -1;
        fs0Var.f = Integer.MIN_VALUE;
        fs0Var.k = Integer.MIN_VALUE;
        fs0Var.d = Integer.MIN_VALUE;
        fs0Var.e = Integer.MIN_VALUE;
        fs0Var.A = Integer.MIN_VALUE;
        fs0Var.B = Integer.MIN_VALUE;
        fs0Var.C = Integer.MIN_VALUE;
        fs0Var.D = 0;
        fs0Var.E = 0.5f;
        fs0Var.F = 0.5f;
        fs0Var.G = null;
        fs0Var.H = -1.0f;
        fs0Var.I = -1.0f;
        fs0Var.J = 0;
        fs0Var.K = 0;
        fs0Var.L = 0;
        fs0Var.M = 0;
        fs0Var.N = 0;
        fs0Var.O = 0;
        fs0Var.P = 0;
        fs0Var.Q = 0;
        fs0Var.R = 1.0f;
        fs0Var.S = 1.0f;
        fs0Var.T = -1;
        fs0Var.U = -1;
        fs0Var.V = -1;
        fs0Var.W = false;
        fs0Var.X = false;
        fs0Var.Y = null;
        fs0Var.Z = 0;
        fs0Var.a0 = true;
        fs0Var.b0 = true;
        fs0Var.c0 = false;
        fs0Var.d0 = false;
        fs0Var.e0 = false;
        fs0Var.f0 = -1;
        fs0Var.g0 = -1;
        fs0Var.h0 = -1;
        fs0Var.i0 = -1;
        fs0Var.j0 = Integer.MIN_VALUE;
        fs0Var.k0 = Integer.MIN_VALUE;
        fs0Var.l0 = 0.5f;
        fs0Var.p0 = new ts0();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j24.y);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            int i2 = es0.g.get(index);
            switch (i2) {
                case 1:
                    fs0Var.V = typedArrayObtainStyledAttributes.getInt(index, fs0Var.V);
                    break;
                case 2:
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, fs0Var.b);
                    fs0Var.b = resourceId;
                    if (resourceId == -1) {
                        fs0Var.b = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 3:
                    fs0Var.s = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, fs0Var.s);
                    break;
                case 4:
                    float f2 = typedArrayObtainStyledAttributes.getFloat(index, fs0Var.p) % 360.0f;
                    fs0Var.p = f2;
                    if (f2 < 0.0f) {
                        fs0Var.p = (360.0f - f2) % 360.0f;
                    }
                    break;
                case 5:
                    fs0Var.g = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, fs0Var.g);
                    break;
                case 6:
                    fs0Var.y = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, fs0Var.y);
                    break;
                case 7:
                    fs0Var.r = typedArrayObtainStyledAttributes.getFloat(index, fs0Var.r);
                    break;
                case 8:
                    int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, fs0Var.v);
                    fs0Var.v = resourceId2;
                    if (resourceId2 == -1) {
                        fs0Var.v = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 9:
                    int resourceId3 = typedArrayObtainStyledAttributes.getResourceId(index, fs0Var.x);
                    fs0Var.x = resourceId3;
                    if (resourceId3 == -1) {
                        fs0Var.x = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 10:
                    int resourceId4 = typedArrayObtainStyledAttributes.getResourceId(index, fs0Var.l);
                    fs0Var.l = resourceId4;
                    if (resourceId4 == -1) {
                        fs0Var.l = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case zo2.HAS_IMAGE_COLOR_FILTER_FIELD_NUMBER /* 11 */:
                    int resourceId5 = typedArrayObtainStyledAttributes.getResourceId(index, fs0Var.j);
                    fs0Var.j = resourceId5;
                    if (resourceId5 == -1) {
                        fs0Var.j = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 12:
                    int resourceId6 = typedArrayObtainStyledAttributes.getResourceId(index, fs0Var.t);
                    fs0Var.t = resourceId6;
                    if (resourceId6 == -1) {
                        fs0Var.t = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 13:
                    int resourceId7 = typedArrayObtainStyledAttributes.getResourceId(index, fs0Var.a);
                    fs0Var.a = resourceId7;
                    if (resourceId7 == -1) {
                        fs0Var.a = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 14:
                    int resourceId8 = typedArrayObtainStyledAttributes.getResourceId(index, fs0Var.m);
                    fs0Var.m = resourceId8;
                    if (resourceId8 == -1) {
                        fs0Var.m = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case kq2.x /* 15 */:
                    int resourceId9 = typedArrayObtainStyledAttributes.getResourceId(index, fs0Var.q);
                    fs0Var.q = resourceId9;
                    if (resourceId9 == -1) {
                        fs0Var.q = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 16:
                    int resourceId10 = typedArrayObtainStyledAttributes.getResourceId(index, fs0Var.w);
                    fs0Var.w = resourceId10;
                    if (resourceId10 == -1) {
                        fs0Var.w = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 17:
                    int resourceId11 = typedArrayObtainStyledAttributes.getResourceId(index, fs0Var.u);
                    fs0Var.u = resourceId11;
                    if (resourceId11 == -1) {
                        fs0Var.u = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 18:
                    int resourceId12 = typedArrayObtainStyledAttributes.getResourceId(index, fs0Var.z);
                    fs0Var.z = resourceId12;
                    if (resourceId12 == -1) {
                        fs0Var.z = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 19:
                    int resourceId13 = typedArrayObtainStyledAttributes.getResourceId(index, fs0Var.h);
                    fs0Var.h = resourceId13;
                    if (resourceId13 == -1) {
                        fs0Var.h = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 20:
                    int resourceId14 = typedArrayObtainStyledAttributes.getResourceId(index, fs0Var.o);
                    fs0Var.o = resourceId14;
                    if (resourceId14 == -1) {
                        fs0Var.o = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 21:
                    fs0Var.f = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, fs0Var.f);
                    break;
                case 22:
                    fs0Var.k = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, fs0Var.k);
                    break;
                case 23:
                    fs0Var.d = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, fs0Var.d);
                    break;
                case 24:
                    fs0Var.e = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, fs0Var.e);
                    break;
                case 25:
                    fs0Var.A = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, fs0Var.A);
                    break;
                case 26:
                    fs0Var.B = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, fs0Var.B);
                    break;
                case 27:
                    fs0Var.W = typedArrayObtainStyledAttributes.getBoolean(index, fs0Var.W);
                    break;
                case 28:
                    fs0Var.X = typedArrayObtainStyledAttributes.getBoolean(index, fs0Var.X);
                    break;
                case 29:
                    fs0Var.E = typedArrayObtainStyledAttributes.getFloat(index, fs0Var.E);
                    break;
                case 30:
                    fs0Var.F = typedArrayObtainStyledAttributes.getFloat(index, fs0Var.F);
                    break;
                case 31:
                    int i3 = typedArrayObtainStyledAttributes.getInt(index, 0);
                    fs0Var.L = i3;
                    if (i3 == 1) {
                        Log.e("ConstraintLayout", "layout_constraintWidth_default=\"wrap\" is deprecated.\nUse layout_width=\"WRAP_CONTENT\" and layout_constrainedWidth=\"true\" instead.");
                    }
                    break;
                case 32:
                    int i4 = typedArrayObtainStyledAttributes.getInt(index, 0);
                    fs0Var.M = i4;
                    if (i4 == 1) {
                        Log.e("ConstraintLayout", "layout_constraintHeight_default=\"wrap\" is deprecated.\nUse layout_height=\"WRAP_CONTENT\" and layout_constrainedHeight=\"true\" instead.");
                    }
                    break;
                case 33:
                    try {
                        fs0Var.N = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, fs0Var.N);
                    } catch (Exception unused) {
                        if (typedArrayObtainStyledAttributes.getInt(index, fs0Var.N) == -2) {
                            fs0Var.N = -2;
                        }
                    }
                    break;
                case 34:
                    try {
                        fs0Var.P = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, fs0Var.P);
                    } catch (Exception unused2) {
                        if (typedArrayObtainStyledAttributes.getInt(index, fs0Var.P) == -2) {
                            fs0Var.P = -2;
                        }
                    }
                    break;
                case 35:
                    fs0Var.R = Math.max(0.0f, typedArrayObtainStyledAttributes.getFloat(index, fs0Var.R));
                    fs0Var.L = 2;
                    break;
                case 36:
                    try {
                        fs0Var.O = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, fs0Var.O);
                    } catch (Exception unused3) {
                        if (typedArrayObtainStyledAttributes.getInt(index, fs0Var.O) == -2) {
                            fs0Var.O = -2;
                        }
                    }
                    break;
                case 37:
                    try {
                        fs0Var.Q = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, fs0Var.Q);
                    } catch (Exception unused4) {
                        if (typedArrayObtainStyledAttributes.getInt(index, fs0Var.Q) == -2) {
                            fs0Var.Q = -2;
                        }
                    }
                    break;
                case 38:
                    fs0Var.S = Math.max(0.0f, typedArrayObtainStyledAttributes.getFloat(index, fs0Var.S));
                    fs0Var.M = 2;
                    break;
                default:
                    switch (i2) {
                        case 44:
                            rs0.j(fs0Var, typedArrayObtainStyledAttributes.getString(index));
                            break;
                        case 45:
                            fs0Var.H = typedArrayObtainStyledAttributes.getFloat(index, fs0Var.H);
                            break;
                        case 46:
                            fs0Var.I = typedArrayObtainStyledAttributes.getFloat(index, fs0Var.I);
                            break;
                        case 47:
                            fs0Var.J = typedArrayObtainStyledAttributes.getInt(index, 0);
                            break;
                        case kq2.l /* 48 */:
                            fs0Var.K = typedArrayObtainStyledAttributes.getInt(index, 0);
                            break;
                        case 49:
                            fs0Var.T = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, fs0Var.T);
                            break;
                        case 50:
                            fs0Var.U = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, fs0Var.U);
                            break;
                        case 51:
                            fs0Var.Y = typedArrayObtainStyledAttributes.getString(index);
                            break;
                        case 52:
                            int resourceId15 = typedArrayObtainStyledAttributes.getResourceId(index, fs0Var.c);
                            fs0Var.c = resourceId15;
                            if (resourceId15 == -1) {
                                fs0Var.c = typedArrayObtainStyledAttributes.getInt(index, -1);
                            }
                            break;
                        case 53:
                            int resourceId16 = typedArrayObtainStyledAttributes.getResourceId(index, fs0Var.i);
                            fs0Var.i = resourceId16;
                            if (resourceId16 == -1) {
                                fs0Var.i = typedArrayObtainStyledAttributes.getInt(index, -1);
                            }
                            break;
                        case 54:
                            fs0Var.D = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, fs0Var.D);
                            break;
                        case 55:
                            fs0Var.C = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, fs0Var.C);
                            break;
                        default:
                            switch (i2) {
                                case 64:
                                    rs0.l(fs0Var, typedArrayObtainStyledAttributes, index, 0);
                                    break;
                                case 65:
                                    rs0.l(fs0Var, typedArrayObtainStyledAttributes, index, 1);
                                    break;
                                case 66:
                                    fs0Var.Z = typedArrayObtainStyledAttributes.getInt(index, fs0Var.Z);
                                    break;
                                case 67:
                                    fs0Var.n = typedArrayObtainStyledAttributes.getBoolean(index, fs0Var.n);
                                    break;
                            }
                            break;
                    }
                    break;
            }
        }
        typedArrayObtainStyledAttributes.recycle();
        fs0Var.g();
        return fs0Var;
    }

    public int getMaxHeight() {
        return this.c;
    }

    public int getMaxWidth() {
        return this.w;
    }

    public int getMinHeight() {
        return this.q;
    }

    public int getMinWidth() {
        return this.m;
    }

    public int getOptimizationLevel() {
        return this.a.D0;
    }

    public String getSceneString() {
        int id;
        StringBuilder sb = new StringBuilder();
        us0 us0Var = this.a;
        String resourceEntryName = us0Var.a;
        if (resourceEntryName == null) {
            int id2 = getId();
            if (id2 != -1) {
                resourceEntryName = getContext().getResources().getResourceEntryName(id2);
                us0Var.a = resourceEntryName;
            } else {
                resourceEntryName = "parent";
                us0Var.a = "parent";
            }
        }
        if (us0Var.h0 == null) {
            us0Var.h0 = resourceEntryName;
            Log.v("ConstraintLayout", " setDebugName " + us0Var.h0);
        }
        ArrayList arrayList = us0Var.q0;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ts0 ts0Var = (ts0) obj;
            View view = ts0Var.f0;
            if (view != null) {
                if (ts0Var.a == null && (id = view.getId()) != -1) {
                    ts0Var.a = getContext().getResources().getResourceEntryName(id);
                }
                if (ts0Var.h0 == null) {
                    ts0Var.h0 = ts0Var.a;
                    Log.v("ConstraintLayout", " setDebugName " + ts0Var.h0);
                }
            }
        }
        us0Var.c(sb);
        return sb.toString();
    }

    public final void m(ts0 ts0Var, fs0 fs0Var, SparseArray sparseArray, int i, int i2) {
        View view = (View) this.j.get(i);
        ts0 ts0Var2 = (ts0) sparseArray.get(i);
        if (ts0Var2 == null || view == null || !(view.getLayoutParams() instanceof fs0)) {
            return;
        }
        fs0Var.c0 = true;
        if (i2 == 6) {
            fs0 fs0Var2 = (fs0) view.getLayoutParams();
            fs0Var2.c0 = true;
            fs0Var2.p0.E = true;
        }
        ts0Var.t(6).y(ts0Var2.t(i2), fs0Var.D, fs0Var.C, true);
        ts0Var.E = true;
        ts0Var.t(3).a();
        ts0Var.t(5).a();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        boolean zIsInEditMode = isInEditMode();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            fs0 fs0Var = (fs0) childAt.getLayoutParams();
            ts0 ts0Var = fs0Var.p0;
            if (childAt.getVisibility() != 8 || fs0Var.d0 || fs0Var.e0 || zIsInEditMode) {
                int iP = ts0Var.p();
                int iU = ts0Var.u();
                childAt.layout(iP, iU, ts0Var.s() + iP, ts0Var.m() + iU);
            }
        }
        ArrayList arrayList = this.t;
        int size = arrayList.size();
        if (size > 0) {
            for (int i6 = 0; i6 < size; i6++) {
                ((ds0) arrayList.get(i6)).a();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:111:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:125:0x0227  */
    /* JADX WARN: Code duplicated, block: B:164:0x0330  */
    /* JADX WARN: Code duplicated, block: B:166:0x033a  */
    /* JADX WARN: Code duplicated, block: B:169:0x0348  */
    /* JADX WARN: Code duplicated, block: B:176:0x0366  */
    /* JADX WARN: Code duplicated, block: B:178:0x0370  */
    /* JADX WARN: Code duplicated, block: B:179:0x0380  */
    /* JADX WARN: Code duplicated, block: B:181:0x0388  */
    /* JADX WARN: Code duplicated, block: B:186:0x03ab  */
    /* JADX WARN: Code duplicated, block: B:189:0x03b3  */
    /* JADX WARN: Code duplicated, block: B:191:0x03bd  */
    /* JADX WARN: Code duplicated, block: B:192:0x03cd  */
    /* JADX WARN: Code duplicated, block: B:194:0x03d0  */
    /* JADX WARN: Code duplicated, block: B:201:0x03f2  */
    /* JADX WARN: Code duplicated, block: B:203:0x03fd  */
    /* JADX WARN: Code duplicated, block: B:205:0x0401  */
    /* JADX WARN: Code duplicated, block: B:206:0x040a  */
    /* JADX WARN: Code duplicated, block: B:208:0x0414  */
    /* JADX WARN: Code duplicated, block: B:211:0x041b  */
    /* JADX WARN: Code duplicated, block: B:214:0x0423  */
    /* JADX WARN: Code duplicated, block: B:287:0x0548  */
    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        boolean z;
        int i3;
        boolean z2;
        ts0 ts0Var;
        int i4;
        ts0 ts0Var2;
        int i5;
        int i6;
        int i7;
        ts0 ts0Var3;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        ts0 ts0Var4;
        int i14;
        int i15;
        int i16;
        ts0 ts0Var5;
        fs0 fs0Var;
        int i17;
        int i18;
        int i19;
        ts0 ts0Var6;
        int i20;
        float f2;
        ts0 ts0Var7;
        ts0 ts0Var8;
        int i21;
        ts0 ts0Var9;
        int i22;
        int i23;
        int i24;
        int i25;
        float fAbs;
        int i26;
        byte b;
        SparseArray sparseArray;
        ArrayList arrayList;
        String str;
        int iL;
        int i27;
        ts0 ts0Var10;
        ConstraintLayout constraintLayout = this;
        boolean z3 = constraintLayout.i;
        constraintLayout.i = z3;
        int i28 = 1;
        int i29 = 0;
        if (!z3) {
            int childCount = constraintLayout.getChildCount();
            for (int i30 = 0; i30 < childCount; i30++) {
                if (constraintLayout.getChildAt(i30).isLayoutRequested()) {
                    constraintLayout.i = true;
                    break;
                }
            }
        }
        boolean z4 = (constraintLayout.getContext().getApplicationInfo().flags & 4194304) != 0 && 1 == constraintLayout.getLayoutDirection();
        us0 us0Var = constraintLayout.a;
        us0Var.v0 = z4;
        if (constraintLayout.i) {
            constraintLayout.i = false;
            int childCount2 = constraintLayout.getChildCount();
            int i31 = 0;
            while (true) {
                if (i31 >= childCount2) {
                    z = false;
                    break;
                } else {
                    if (constraintLayout.getChildAt(i31).isLayoutRequested()) {
                        z = true;
                        break;
                    }
                    i31++;
                }
            }
            if (z) {
                boolean zIsInEditMode = constraintLayout.isInEditMode();
                int childCount3 = constraintLayout.getChildCount();
                for (int i32 = 0; i32 < childCount3; i32++) {
                    ts0 ts0VarV = constraintLayout.v(constraintLayout.getChildAt(i32));
                    if (ts0VarV != null) {
                        ts0VarV.C();
                    }
                }
                SparseArray sparseArray2 = constraintLayout.j;
                if (zIsInEditMode) {
                    int i33 = 0;
                    while (i33 < childCount3) {
                        View childAt = constraintLayout.getChildAt(i33);
                        try {
                            String resourceName = constraintLayout.getResources().getResourceName(childAt.getId());
                            Integer numValueOf = Integer.valueOf(childAt.getId());
                            if (resourceName != null) {
                                i27 = i28;
                                try {
                                    if (constraintLayout.z == null) {
                                        constraintLayout.z = new HashMap();
                                    }
                                    int iIndexOf = resourceName.indexOf("/");
                                    constraintLayout.z.put(iIndexOf != -1 ? resourceName.substring(iIndexOf + 1) : resourceName, numValueOf);
                                } catch (Resources.NotFoundException unused) {
                                }
                            } else {
                                i27 = i28;
                            }
                            int iIndexOf2 = resourceName.indexOf(47);
                            if (iIndexOf2 != -1) {
                                resourceName = resourceName.substring(iIndexOf2 + 1);
                            }
                            int id = childAt.getId();
                            if (id != 0) {
                                View viewFindViewById = (View) sparseArray2.get(id);
                                if (viewFindViewById == null && (viewFindViewById = constraintLayout.findViewById(id)) != null && viewFindViewById != constraintLayout && viewFindViewById.getParent() == constraintLayout) {
                                    constraintLayout.onViewAdded(viewFindViewById);
                                }
                                ts0Var10 = viewFindViewById == constraintLayout ? us0Var : viewFindViewById == null ? null : ((fs0) viewFindViewById.getLayoutParams()).p0;
                            }
                            ts0Var10.h0 = resourceName;
                        } catch (Resources.NotFoundException unused2) {
                            i27 = i28;
                        }
                        i33++;
                        i28 = i27;
                    }
                }
                int i34 = i28;
                if (constraintLayout.u != -1) {
                    for (int i35 = 0; i35 < childCount3; i35++) {
                        constraintLayout.getChildAt(i35).getId();
                    }
                }
                rs0 rs0Var = constraintLayout.s;
                if (rs0Var != null) {
                    rs0Var.g(constraintLayout);
                }
                us0Var.q0.clear();
                ArrayList arrayList2 = constraintLayout.t;
                int size = arrayList2.size();
                if (size > 0) {
                    int i36 = 0;
                    while (i36 < size) {
                        ds0 ds0Var = (ds0) arrayList2.get(i36);
                        HashMap map = ds0Var.c;
                        if (ds0Var.isInEditMode()) {
                            ds0Var.setIds(ds0Var.q);
                        }
                        n52 n52Var = ds0Var.m;
                        if (n52Var == null) {
                            sparseArray = sparseArray2;
                            arrayList = arrayList2;
                        } else {
                            n52Var.r0 = i29;
                            Arrays.fill(n52Var.q0, (Object) null);
                            int i37 = i29;
                            while (i37 < ds0Var.t) {
                                int i38 = ds0Var.j[i37];
                                View view = (View) sparseArray2.get(i38);
                                if (view == null && (iL = ds0Var.l(constraintLayout, (str = (String) map.get(Integer.valueOf(i38))))) != 0) {
                                    ds0Var.j[i37] = iL;
                                    map.put(Integer.valueOf(iL), str);
                                    view = (View) sparseArray2.get(iL);
                                }
                                View view2 = view;
                                if (view2 != null) {
                                    n52 n52Var2 = ds0Var.m;
                                    ts0 ts0VarV2 = constraintLayout.v(view2);
                                    n52Var2.getClass();
                                    if (ts0VarV2 != n52Var2 && ts0VarV2 != null) {
                                        int i39 = n52Var2.r0 + 1;
                                        ts0[] ts0VarArr = n52Var2.q0;
                                        if (i39 > ts0VarArr.length) {
                                            ts0VarArr = (ts0[]) Arrays.copyOf(ts0VarArr, ts0VarArr.length * 2);
                                            n52Var2.q0 = ts0VarArr;
                                        }
                                        int i40 = n52Var2.r0;
                                        ts0VarArr[i40] = ts0VarV2;
                                        n52Var2.r0 = i40 + 1;
                                    }
                                }
                                i37++;
                                sparseArray2 = sparseArray2;
                                arrayList2 = arrayList2;
                            }
                            sparseArray = sparseArray2;
                            arrayList = arrayList2;
                            ds0Var.m.S();
                        }
                        i36++;
                        sparseArray2 = sparseArray;
                        arrayList2 = arrayList;
                        i29 = 0;
                    }
                }
                int i41 = 2;
                for (int i42 = 0; i42 < childCount3; i42++) {
                    constraintLayout.getChildAt(i42);
                }
                SparseArray sparseArray3 = constraintLayout.h;
                sparseArray3.clear();
                sparseArray3.put(0, us0Var);
                sparseArray3.put(constraintLayout.getId(), us0Var);
                for (int i43 = 0; i43 < childCount3; i43++) {
                    View childAt2 = constraintLayout.getChildAt(i43);
                    sparseArray3.put(childAt2.getId(), constraintLayout.v(childAt2));
                }
                int i44 = 0;
                while (i44 < childCount3) {
                    View childAt3 = constraintLayout.getChildAt(i44);
                    ts0 ts0VarV3 = constraintLayout.v(childAt3);
                    if (ts0VarV3 == null) {
                        i3 = i44;
                        z2 = z;
                        i23 = i41;
                    } else {
                        fs0 fs0Var2 = (fs0) childAt3.getLayoutParams();
                        us0Var.q0.add(ts0VarV3);
                        us0 us0Var2 = ts0VarV3.T;
                        if (us0Var2 != null) {
                            us0Var2.q0.remove(ts0VarV3);
                            ts0VarV3.C();
                        }
                        ts0VarV3.T = us0Var;
                        fs0Var2.g();
                        ts0VarV3.g0 = childAt3.getVisibility();
                        ts0VarV3.f0 = childAt3;
                        if (childAt3 instanceof ds0) {
                            ((ds0) childAt3).t(ts0VarV3, us0Var.v0);
                        }
                        if (fs0Var2.d0) {
                            m42 m42Var = (m42) ts0VarV3;
                            int i45 = fs0Var2.m0;
                            int i46 = fs0Var2.n0;
                            float f3 = fs0Var2.o0;
                            if (f3 == -1.0f) {
                                b = -1;
                                if (i45 != -1) {
                                    if (i45 > -1) {
                                        m42Var.q0 = -1.0f;
                                        m42Var.r0 = i45;
                                        m42Var.s0 = -1;
                                    }
                                } else if (i46 != -1 && i46 > -1) {
                                    m42Var.q0 = -1.0f;
                                    m42Var.r0 = -1;
                                    m42Var.s0 = i46;
                                    i3 = i44;
                                    z2 = z;
                                    i23 = i41;
                                }
                                i3 = i44;
                                z2 = z;
                                i23 = i41;
                            } else if (f3 > -1.0f) {
                                m42Var.q0 = f3;
                                b = -1;
                                m42Var.r0 = -1;
                                m42Var.s0 = -1;
                                i3 = i44;
                                z2 = z;
                                i23 = i41;
                            } else {
                                i3 = i44;
                                z2 = z;
                                i23 = i41;
                            }
                        } else {
                            int i47 = fs0Var2.f0;
                            int i48 = fs0Var2.g0;
                            int i49 = fs0Var2.h0;
                            int i50 = fs0Var2.i0;
                            int i51 = fs0Var2.j0;
                            int i52 = fs0Var2.k0;
                            i3 = i44;
                            float f4 = fs0Var2.l0;
                            int i53 = fs0Var2.b;
                            z2 = z;
                            if (i53 != -1) {
                                ts0 ts0Var11 = (ts0) sparseArray3.get(i53);
                                if (ts0Var11 != null) {
                                    float f5 = fs0Var2.p;
                                    ts0VarV3.o(7, 7, fs0Var2.s, 0, ts0Var11);
                                    ts0VarV3.D = f5;
                                }
                                constraintLayout = this;
                                ts0Var6 = ts0VarV3;
                                fs0Var = fs0Var2;
                                i8 = 4;
                                i7 = 2;
                            } else {
                                if (i47 != -1) {
                                    ts0 ts0Var12 = (ts0) sparseArray3.get(i47);
                                    if (ts0Var12 != null) {
                                        ts0Var = ts0VarV3;
                                        i4 = 2;
                                        ts0Var.o(2, 2, ((ViewGroup.MarginLayoutParams) fs0Var2).leftMargin, i51, ts0Var12);
                                    } else {
                                        ts0Var = ts0VarV3;
                                        i4 = 2;
                                    }
                                } else {
                                    ts0Var = ts0VarV3;
                                    i4 = 2;
                                    if (i48 != -1 && (ts0Var2 = (ts0) sparseArray3.get(i48)) != null) {
                                        ts0Var.o(2, 4, ((ViewGroup.MarginLayoutParams) fs0Var2).leftMargin, i51, ts0Var2);
                                        i5 = 2;
                                        i6 = 4;
                                    }
                                    if (i49 != -1) {
                                        ts0Var9 = (ts0) sparseArray3.get(i49);
                                        if (ts0Var9 != null) {
                                            ts0Var.o(i6, i5, ((ViewGroup.MarginLayoutParams) fs0Var2).rightMargin, i52, ts0Var9);
                                        }
                                        i7 = i5;
                                    } else {
                                        i7 = i5;
                                        if (i50 != -1 && (ts0Var3 = (ts0) sparseArray3.get(i50)) != null) {
                                            ts0Var.o(i6, i6, ((ViewGroup.MarginLayoutParams) fs0Var2).rightMargin, i52, ts0Var3);
                                        }
                                    }
                                    i8 = i6;
                                    i9 = fs0Var2.t;
                                    if (i9 != -1) {
                                        ts0Var8 = (ts0) sparseArray3.get(i9);
                                        if (ts0Var8 != null) {
                                            i21 = 3;
                                            ts0Var.o(3, 3, ((ViewGroup.MarginLayoutParams) fs0Var2).topMargin, fs0Var2.k, ts0Var8);
                                        } else {
                                            i21 = 3;
                                        }
                                        i12 = i21;
                                        i13 = 5;
                                        i11 = -1;
                                    } else {
                                        i10 = fs0Var2.a;
                                        i11 = -1;
                                        if (i10 != -1 || (ts0Var4 = (ts0) sparseArray3.get(i10)) == null) {
                                            i12 = 3;
                                            i13 = 5;
                                        } else {
                                            ts0Var.o(3, 5, ((ViewGroup.MarginLayoutParams) fs0Var2).topMargin, fs0Var2.k, ts0Var4);
                                            i12 = 3;
                                            i13 = 5;
                                        }
                                    }
                                    i14 = fs0Var2.m;
                                    if (i14 != i11) {
                                        ts0Var7 = (ts0) sparseArray3.get(i14);
                                        if (ts0Var7 != null) {
                                            int i54 = i12;
                                            ts0Var.o(i13, i54, ((ViewGroup.MarginLayoutParams) fs0Var2).bottomMargin, fs0Var2.e, ts0Var7);
                                            i15 = i54;
                                        } else {
                                            i15 = i12;
                                        }
                                    } else {
                                        i15 = i12;
                                        i16 = fs0Var2.q;
                                        if (i16 != i11 && (ts0Var5 = (ts0) sparseArray3.get(i16)) != null) {
                                            ts0Var.o(i13, i13, ((ViewGroup.MarginLayoutParams) fs0Var2).bottomMargin, fs0Var2.e, ts0Var5);
                                        }
                                    }
                                    fs0Var = fs0Var2;
                                    i17 = fs0Var.w;
                                    if (i17 != -1) {
                                        constraintLayout = this;
                                        ts0Var6 = ts0Var;
                                        constraintLayout.m(ts0Var6, fs0Var, sparseArray3, i17, 6);
                                    } else {
                                        i18 = fs0Var.c;
                                        if (i18 != -1) {
                                            constraintLayout = this;
                                            ts0Var6 = ts0Var;
                                            constraintLayout.m(ts0Var6, fs0Var, sparseArray3, i18, i15);
                                        } else {
                                            i19 = fs0Var.i;
                                            constraintLayout = this;
                                            ts0Var6 = ts0Var;
                                            i20 = i13;
                                            if (i19 != -1) {
                                                constraintLayout.m(ts0Var6, fs0Var, sparseArray3, i19, i20);
                                            }
                                        }
                                        if (f4 >= 0.0f) {
                                            ts0Var6.d0 = f4;
                                        }
                                        f2 = fs0Var.F;
                                        if (f2 >= 0.0f) {
                                            ts0Var6.e0 = f2;
                                        }
                                    }
                                    if (f4 >= 0.0f) {
                                        ts0Var6.d0 = f4;
                                    }
                                    f2 = fs0Var.F;
                                    if (f2 >= 0.0f) {
                                        ts0Var6.e0 = f2;
                                    }
                                }
                                i5 = i4;
                                i6 = 4;
                                if (i49 != -1) {
                                    ts0Var9 = (ts0) sparseArray3.get(i49);
                                    if (ts0Var9 != null) {
                                        ts0Var.o(i6, i5, ((ViewGroup.MarginLayoutParams) fs0Var2).rightMargin, i52, ts0Var9);
                                    }
                                    i7 = i5;
                                } else {
                                    i7 = i5;
                                    if (i50 != -1) {
                                        ts0Var.o(i6, i6, ((ViewGroup.MarginLayoutParams) fs0Var2).rightMargin, i52, ts0Var3);
                                    }
                                }
                                i8 = i6;
                                i9 = fs0Var2.t;
                                if (i9 != -1) {
                                    ts0Var8 = (ts0) sparseArray3.get(i9);
                                    if (ts0Var8 != null) {
                                        i21 = 3;
                                        ts0Var.o(3, 3, ((ViewGroup.MarginLayoutParams) fs0Var2).topMargin, fs0Var2.k, ts0Var8);
                                    } else {
                                        i21 = 3;
                                    }
                                    i12 = i21;
                                    i13 = 5;
                                    i11 = -1;
                                } else {
                                    i10 = fs0Var2.a;
                                    i11 = -1;
                                    if (i10 != -1) {
                                        i12 = 3;
                                        i13 = 5;
                                    } else {
                                        i12 = 3;
                                        i13 = 5;
                                    }
                                }
                                i14 = fs0Var2.m;
                                if (i14 != i11) {
                                    ts0Var7 = (ts0) sparseArray3.get(i14);
                                    if (ts0Var7 != null) {
                                        int i55 = i12;
                                        ts0Var.o(i13, i55, ((ViewGroup.MarginLayoutParams) fs0Var2).bottomMargin, fs0Var2.e, ts0Var7);
                                        i15 = i55;
                                    } else {
                                        i15 = i12;
                                    }
                                } else {
                                    i15 = i12;
                                    i16 = fs0Var2.q;
                                    if (i16 != i11) {
                                        ts0Var.o(i13, i13, ((ViewGroup.MarginLayoutParams) fs0Var2).bottomMargin, fs0Var2.e, ts0Var5);
                                    }
                                }
                                fs0Var = fs0Var2;
                                i17 = fs0Var.w;
                                if (i17 != -1) {
                                    constraintLayout = this;
                                    ts0Var6 = ts0Var;
                                    constraintLayout.m(ts0Var6, fs0Var, sparseArray3, i17, 6);
                                } else {
                                    i18 = fs0Var.c;
                                    if (i18 != -1) {
                                        constraintLayout = this;
                                        ts0Var6 = ts0Var;
                                        constraintLayout.m(ts0Var6, fs0Var, sparseArray3, i18, i15);
                                    } else {
                                        i19 = fs0Var.i;
                                        constraintLayout = this;
                                        ts0Var6 = ts0Var;
                                        i20 = i13;
                                        if (i19 != -1) {
                                            constraintLayout.m(ts0Var6, fs0Var, sparseArray3, i19, i20);
                                        }
                                    }
                                    if (f4 >= 0.0f) {
                                        ts0Var6.d0 = f4;
                                    }
                                    f2 = fs0Var.F;
                                    if (f2 >= 0.0f) {
                                        ts0Var6.e0 = f2;
                                    }
                                }
                                if (f4 >= 0.0f) {
                                    ts0Var6.d0 = f4;
                                }
                                f2 = fs0Var.F;
                                if (f2 >= 0.0f) {
                                    ts0Var6.e0 = f2;
                                }
                            }
                            if (zIsInEditMode && ((i26 = fs0Var.T) != -1 || fs0Var.U != -1)) {
                                int i56 = fs0Var.U;
                                ts0Var6.Y = i26;
                                ts0Var6.Z = i56;
                            }
                            if (fs0Var.a0) {
                                ts0Var6.M(i34);
                                ts0Var6.O(((ViewGroup.MarginLayoutParams) fs0Var).width);
                                if (((ViewGroup.MarginLayoutParams) fs0Var).width == -2) {
                                    ts0Var6.M(i41);
                                }
                            } else if (((ViewGroup.MarginLayoutParams) fs0Var).width == -1) {
                                if (fs0Var.W) {
                                    ts0Var6.M(3);
                                } else {
                                    ts0Var6.M(4);
                                }
                                ts0Var6.t(i7).l = ((ViewGroup.MarginLayoutParams) fs0Var).leftMargin;
                                ts0Var6.t(i8).l = ((ViewGroup.MarginLayoutParams) fs0Var).rightMargin;
                            } else {
                                ts0Var6.M(3);
                                ts0Var6.O(0);
                            }
                            if (fs0Var.b0) {
                                i22 = -1;
                                ts0Var6.N(1);
                                ts0Var6.L(((ViewGroup.MarginLayoutParams) fs0Var).height);
                                if (((ViewGroup.MarginLayoutParams) fs0Var).height == -2) {
                                    ts0Var6.N(2);
                                }
                            } else {
                                i22 = -1;
                                if (((ViewGroup.MarginLayoutParams) fs0Var).height == -1) {
                                    if (fs0Var.X) {
                                        ts0Var6.N(3);
                                    } else {
                                        ts0Var6.N(4);
                                    }
                                    ts0Var6.t(3).l = ((ViewGroup.MarginLayoutParams) fs0Var).topMargin;
                                    ts0Var6.t(5).l = ((ViewGroup.MarginLayoutParams) fs0Var).bottomMargin;
                                } else {
                                    ts0Var6.N(3);
                                    ts0Var6.L(0);
                                }
                            }
                            String str2 = fs0Var.G;
                            if (str2 == null || str2.length() == 0) {
                                ts0Var6.W = 0.0f;
                            } else {
                                int length = str2.length();
                                int iIndexOf3 = str2.indexOf(44);
                                if (iIndexOf3 <= 0 || iIndexOf3 >= length - 1) {
                                    i24 = i22;
                                    i25 = 0;
                                } else {
                                    String strSubstring = str2.substring(0, iIndexOf3);
                                    i24 = strSubstring.equalsIgnoreCase("W") ? 0 : strSubstring.equalsIgnoreCase("H") ? 1 : i22;
                                    i25 = iIndexOf3 + 1;
                                }
                                int iIndexOf4 = str2.indexOf(58);
                                if (iIndexOf4 < 0 || iIndexOf4 >= length - 1) {
                                    String strSubstring2 = str2.substring(i25);
                                    if (strSubstring2.length() > 0) {
                                        fAbs = Float.parseFloat(strSubstring2);
                                    } else {
                                        fAbs = 0.0f;
                                    }
                                } else {
                                    String strSubstring3 = str2.substring(i25, iIndexOf4);
                                    String strSubstring4 = str2.substring(iIndexOf4 + 1);
                                    if (strSubstring3.length() <= 0 || strSubstring4.length() <= 0) {
                                        fAbs = 0.0f;
                                    } else {
                                        try {
                                            float f6 = Float.parseFloat(strSubstring3);
                                            float f7 = Float.parseFloat(strSubstring4);
                                            if (f6 <= 0.0f || f7 <= 0.0f) {
                                                fAbs = 0.0f;
                                            } else {
                                                fAbs = i24 == 1 ? Math.abs(f7 / f6) : Math.abs(f6 / f7);
                                            }
                                        } catch (NumberFormatException unused3) {
                                        }
                                    }
                                }
                                if (fAbs > 0.0f) {
                                    ts0Var6.W = fAbs;
                                    ts0Var6.X = i24;
                                }
                            }
                            float f8 = fs0Var.H;
                            float[] fArr = ts0Var6.k0;
                            fArr[0] = f8;
                            i34 = 1;
                            fArr[1] = fs0Var.I;
                            ts0Var6.i0 = fs0Var.J;
                            ts0Var6.j0 = fs0Var.K;
                            int i57 = fs0Var.Z;
                            if (i57 >= 0 && i57 <= 3) {
                                ts0Var6.s = i57;
                            }
                            int i58 = fs0Var.L;
                            int i59 = fs0Var.N;
                            int i60 = fs0Var.P;
                            float f9 = fs0Var.R;
                            ts0Var6.p = i58;
                            ts0Var6.h = i59;
                            if (i60 == Integer.MAX_VALUE) {
                                i60 = 0;
                            }
                            ts0Var6.o = i60;
                            ts0Var6.f = f9;
                            if (f9 > 0.0f && f9 < 1.0f && i58 == 0) {
                                ts0Var6.p = 2;
                            }
                            int i61 = fs0Var.M;
                            int i62 = fs0Var.O;
                            int i63 = fs0Var.Q;
                            float f10 = fs0Var.S;
                            ts0Var6.u = i61;
                            ts0Var6.k = i62;
                            if (i63 == Integer.MAX_VALUE) {
                                i63 = 0;
                            }
                            ts0Var6.d = i63;
                            ts0Var6.e = f10;
                            if (f10 <= 0.0f || f10 >= 1.0f || i61 != 0) {
                                i23 = 2;
                            } else {
                                i23 = 2;
                                ts0Var6.u = 2;
                            }
                        }
                    }
                    i44 = i3 + 1;
                    i41 = i23;
                    z = z2;
                }
            }
            if (z) {
                us0Var.r0.g0(us0Var);
            }
        }
        us0Var.w0.getClass();
        constraintLayout.t(us0Var, constraintLayout.b, i, i2);
        int iS = us0Var.s();
        int iM = us0Var.m();
        boolean z5 = us0Var.E0;
        boolean z6 = us0Var.F0;
        gs0 gs0Var = constraintLayout.o;
        int i64 = gs0Var.v;
        int iResolveSizeAndState = View.resolveSizeAndState(iS + gs0Var.n, i, 0);
        int iResolveSizeAndState2 = View.resolveSizeAndState(iM + i64, i2, 0) & 16777215;
        int iMin = Math.min(constraintLayout.w, iResolveSizeAndState & 16777215);
        int iMin2 = Math.min(constraintLayout.c, iResolveSizeAndState2);
        if (z5) {
            iMin |= 16777216;
        }
        if (z6) {
            iMin2 |= 16777216;
        }
        constraintLayout.setMeasuredDimension(iMin, iMin2);
    }

    @Override // android.view.ViewGroup
    public final void onViewAdded(View view) {
        super.onViewAdded(view);
        ts0 ts0VarV = v(view);
        if ((view instanceof Guideline) && !(ts0VarV instanceof m42)) {
            fs0 fs0Var = (fs0) view.getLayoutParams();
            m42 m42Var = new m42();
            fs0Var.p0 = m42Var;
            fs0Var.d0 = true;
            m42Var.S(fs0Var.V);
        }
        if (view instanceof ds0) {
            ds0 ds0Var = (ds0) view;
            ds0Var.m();
            ((fs0) view.getLayoutParams()).e0 = true;
            ArrayList arrayList = this.t;
            if (!arrayList.contains(ds0Var)) {
                arrayList.add(ds0Var);
            }
        }
        this.j.put(view.getId(), view);
        this.i = true;
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.j.remove(view.getId());
        ts0 ts0VarV = v(view);
        this.a.q0.remove(ts0VarV);
        ts0VarV.C();
        this.t.remove(view);
        this.i = true;
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        this.i = true;
        super.requestLayout();
    }

    public void setConstraintSet(rs0 rs0Var) {
        this.s = rs0Var;
    }

    @Override // android.view.View
    public void setId(int i) {
        int id = getId();
        SparseArray sparseArray = this.j;
        sparseArray.remove(id);
        super.setId(i);
        sparseArray.put(getId(), this);
    }

    public void setMaxHeight(int i) {
        if (i == this.c) {
            return;
        }
        this.c = i;
        requestLayout();
    }

    public void setMaxWidth(int i) {
        if (i == this.w) {
            return;
        }
        this.w = i;
        requestLayout();
    }

    public void setMinHeight(int i) {
        if (i == this.q) {
            return;
        }
        this.q = i;
        requestLayout();
    }

    public void setMinWidth(int i) {
        if (i == this.m) {
            return;
        }
        this.m = i;
        requestLayout();
    }

    public void setOnConstraintsChanged(xs0 xs0Var) {
        cd2 cd2Var = this.p;
        if (cd2Var != null) {
            cd2Var.getClass();
        }
    }

    public void setOptimizationLevel(int i) {
        this.b = i;
        us0 us0Var = this.a;
        us0Var.D0 = i;
        kv2.s = us0Var.W(512);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:160:0x0312  */
    /* JADX WARN: Code duplicated, block: B:162:0x032e  */
    /* JADX WARN: Code duplicated, block: B:164:0x0331  */
    /* JADX WARN: Code duplicated, block: B:168:0x0352  */
    /* JADX WARN: Code duplicated, block: B:176:0x036e  */
    /* JADX WARN: Code duplicated, block: B:402:0x039f A[SYNTHETIC] */
    public final void t(us0 us0Var, int i, int i2, int i3) {
        int iMin;
        int iMax;
        int iMin2;
        int iMax2;
        int i4;
        char c;
        boolean z;
        int i5;
        int i6;
        ArrayList arrayList;
        gs0 gs0Var;
        int i7;
        boolean zT;
        int i8;
        int i9;
        boolean zO;
        gs0 gs0Var2;
        boolean z2;
        boolean z3;
        gs0 gs0Var3;
        boolean z4;
        l72 l72Var;
        hk5 hk5Var;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        boolean z5;
        int size;
        int i17;
        int size2;
        int i18;
        eo5 eo5Var;
        eo5 eo5Var2;
        int mode = View.MeasureSpec.getMode(i2);
        int size3 = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i3);
        int size4 = View.MeasureSpec.getSize(i3);
        int iMax3 = Math.max(0, getPaddingTop());
        int iMax4 = Math.max(0, getPaddingBottom());
        int i19 = iMax3 + iMax4;
        int paddingWidth = getPaddingWidth();
        gs0 gs0Var4 = this.o;
        gs0Var4.y = iMax3;
        gs0Var4.r = iMax4;
        gs0Var4.n = paddingWidth;
        gs0Var4.v = i19;
        gs0Var4.x = i2;
        gs0Var4.l = i3;
        int iMax5 = Math.max(0, getPaddingStart());
        int iMax6 = Math.max(0, getPaddingEnd());
        int i20 = 1;
        if (iMax5 <= 0 && iMax6 <= 0) {
            iMax5 = Math.max(0, getPaddingLeft());
        } else if ((getContext().getApplicationInfo().flags & 4194304) != 0 && 1 == getLayoutDirection()) {
            iMax5 = iMax6;
        }
        int i21 = size3 - paddingWidth;
        int i22 = size4 - i19;
        int i23 = gs0Var4.v;
        int i24 = gs0Var4.n;
        int childCount = getChildCount();
        if (mode == Integer.MIN_VALUE) {
            if (childCount == 0) {
                iMax = Math.max(0, this.m);
                iMin = iMax;
            } else {
                iMin = i21;
            }
            i20 = 2;
        } else if (mode == 0) {
            if (childCount == 0) {
                iMax = Math.max(0, this.m);
                iMin = iMax;
            } else {
                iMin = 0;
            }
            i20 = 2;
        } else if (mode != 1073741824) {
            iMin = 0;
        } else {
            iMin = Math.min(this.w - i24, i21);
            i20 = 1;
        }
        if (mode2 == Integer.MIN_VALUE) {
            if (childCount == 0) {
                iMax2 = Math.max(0, this.q);
                iMin2 = iMax2;
            } else {
                iMin2 = i22;
            }
            i4 = 2;
        } else if (mode2 != 0) {
            iMin2 = mode2 != 1073741824 ? 0 : Math.min(this.c - i23, i22);
            i4 = 1;
        } else {
            if (childCount == 0) {
                iMax2 = Math.max(0, this.q);
                iMin2 = iMax2;
            } else {
                iMin2 = 0;
            }
            i4 = 2;
        }
        int iS = us0Var.s();
        t51 t51Var = us0Var.s0;
        int[] iArr = us0Var.C;
        int i25 = iMin;
        if (i25 == iS && iMin2 == us0Var.m()) {
            c = 1;
        } else {
            t51Var.y = true;
            c = 1;
        }
        us0Var.Y = 0;
        us0Var.Z = 0;
        iArr[0] = this.w - i24;
        iArr[c] = this.c - i23;
        us0Var.b0 = 0;
        us0Var.c0 = 0;
        us0Var.M(i20);
        us0Var.O(i25);
        us0Var.N(i4);
        us0Var.L(iMin2);
        int i26 = this.m - i24;
        if (i26 < 0) {
            us0Var.b0 = 0;
        } else {
            us0Var.b0 = i26;
        }
        int i27 = this.q - i23;
        if (i27 < 0) {
            us0Var.c0 = 0;
        } else {
            us0Var.c0 = i27;
        }
        us0Var.x0 = iMax5;
        us0Var.y0 = iMax3;
        ro roVar = us0Var.r0;
        us0 us0Var2 = (us0) roVar.m;
        ArrayList arrayList2 = (ArrayList) roVar.t;
        gs0 gs0Var5 = us0Var.u0;
        int size5 = us0Var.q0.size();
        int iS2 = us0Var.s();
        int iM = us0Var.m();
        boolean zK = y94.k(i, 128);
        boolean z6 = zK || y94.k(i, 64);
        if (z6) {
            int i28 = 0;
            while (true) {
                if (i28 < size5) {
                    boolean z7 = z6;
                    ts0 ts0Var = (ts0) us0Var.q0.get(i28);
                    i5 = size5;
                    int[] iArr2 = ts0Var.p0;
                    int i29 = i28;
                    boolean z8 = (iArr2[0] == 3) && (iArr2[1] == 3) && ts0Var.W > 0.0f;
                    if ((ts0Var.k() && z8) || ((ts0Var.d() && z8) || (ts0Var instanceof tm5) || ts0Var.k() || ts0Var.d())) {
                        i6 = 1073741824;
                        z = false;
                    } else {
                        i28 = i29 + 1;
                        z6 = z7;
                        size5 = i5;
                    }
                } else {
                    z = z6;
                    i5 = size5;
                    i6 = 1073741824;
                }
            }
        } else {
            z = z6;
            i5 = size5;
            i6 = 1073741824;
        }
        boolean z9 = z & ((mode == i6 && mode2 == i6) || zK);
        if (z9) {
            int iMin3 = Math.min(iArr[0], i21);
            int iMin4 = Math.min(iArr[1], i22);
            int i30 = 1073741824;
            if (mode == 1073741824) {
                if (us0Var.s() != iMin3) {
                    us0Var.O(iMin3);
                    t51Var.g = true;
                }
                i30 = 1073741824;
            }
            if (mode2 == i30 && us0Var.m() != iMin4) {
                us0Var.L(iMin4);
                t51Var.g = true;
            }
            if (mode == i30 && mode2 == i30) {
                ArrayList arrayList3 = (ArrayList) t51Var.v;
                us0 us0Var3 = (us0) t51Var.r;
                if (t51Var.g || t51Var.y) {
                    ArrayList arrayList4 = us0Var3.q0;
                    int size6 = arrayList4.size();
                    int i31 = 0;
                    while (i31 < size6) {
                        Object obj = arrayList4.get(i31);
                        int i32 = i31 + 1;
                        ts0 ts0Var2 = (ts0) obj;
                        ts0Var2.j();
                        ts0Var2.g = false;
                        ts0Var2.n.c();
                        ts0Var2.v.w();
                        arrayList4 = arrayList4;
                        i31 = i32;
                    }
                    us0Var3.j();
                    i12 = 0;
                    us0Var3.g = false;
                    us0Var3.n.c();
                    us0Var3.v.w();
                    t51Var.y = false;
                } else {
                    i12 = 0;
                }
                t51Var.y((us0) t51Var.n);
                us0Var3.Y = i12;
                int[] iArr3 = us0Var3.p0;
                us0Var3.Z = i12;
                int iA = us0Var3.a(i12);
                int iA2 = us0Var3.a(1);
                if (t51Var.g) {
                    t51Var.r();
                }
                int iP = us0Var3.p();
                gs0Var = gs0Var5;
                int iU = us0Var3.u();
                arrayList = arrayList2;
                us0Var3.n.j.n(iP);
                us0Var3.v.j.n(iU);
                t51Var.o();
                if (iA == 2 || iA2 == 2) {
                    if (zK) {
                        int size7 = arrayList3.size();
                        i13 = iU;
                        int i33 = 0;
                        while (i33 < size7) {
                            Object obj2 = arrayList3.get(i33);
                            i33++;
                            if (!((eo5) obj2).m()) {
                                zK = false;
                                break;
                            }
                        }
                    } else {
                        i13 = iU;
                    }
                    if (zK && iA == 2) {
                        us0Var3.M(1);
                        us0Var3.O(t51Var.n(us0Var3, 0));
                        us0Var3.n.v.n(us0Var3.s());
                    }
                    if (zK && iA2 == 2) {
                        i14 = 1;
                        us0Var3.N(1);
                        us0Var3.L(t51Var.n(us0Var3, 1));
                        us0Var3.v.v.n(us0Var3.m());
                    }
                    i15 = iArr3[0];
                    if (i15 != i14 || i15 == 4) {
                        int iS3 = us0Var3.s() + iP;
                        us0Var3.n.t.n(iS3);
                        us0Var3.n.v.n(iS3 - iP);
                        t51Var.o();
                        i16 = iArr3[1];
                        if (i16 != 1 || i16 == 4) {
                            int iM2 = us0Var3.m() + i13;
                            us0Var3.v.t.n(iM2);
                            us0Var3.v.v.n(iM2 - i13);
                        }
                        t51Var.o();
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    size = arrayList3.size();
                    i17 = 0;
                    while (i17 < size) {
                        Object obj3 = arrayList3.get(i17);
                        i17++;
                        eo5Var2 = (eo5) obj3;
                        if (eo5Var2.y == us0Var3 || eo5Var2.l) {
                            eo5Var2.v();
                        }
                    }
                    size2 = arrayList3.size();
                    i18 = 0;
                    while (true) {
                        if (i18 < size2) {
                            zT = true;
                            break;
                        }
                        Object obj4 = arrayList3.get(i18);
                        i18++;
                        eo5Var = (eo5) obj4;
                        if (!z5 || eo5Var.y != us0Var3) {
                            if (eo5Var.j.a || ((!eo5Var.t.a && !(eo5Var instanceof n42)) || (!eo5Var.v.a && !(eo5Var instanceof lc0) && !(eo5Var instanceof n42)))) {
                                zT = false;
                                break;
                            }
                        }
                    }
                    us0Var3.M(iA);
                    us0Var3.N(iA2);
                    i7 = 2;
                    i11 = 1073741824;
                } else {
                    i13 = iU;
                }
                i14 = 1;
                i15 = iArr3[0];
                if (i15 != i14) {
                    int iS4 = us0Var3.s() + iP;
                    us0Var3.n.t.n(iS4);
                    us0Var3.n.v.n(iS4 - iP);
                    t51Var.o();
                    i16 = iArr3[1];
                    if (i16 != 1) {
                        int iM3 = us0Var3.m() + i13;
                        us0Var3.v.t.n(iM3);
                        us0Var3.v.v.n(iM3 - i13);
                    } else {
                        int iM4 = us0Var3.m() + i13;
                        us0Var3.v.t.n(iM4);
                        us0Var3.v.v.n(iM4 - i13);
                    }
                    t51Var.o();
                    z5 = true;
                } else {
                    int iS5 = us0Var3.s() + iP;
                    us0Var3.n.t.n(iS5);
                    us0Var3.n.v.n(iS5 - iP);
                    t51Var.o();
                    i16 = iArr3[1];
                    if (i16 != 1) {
                        int iM5 = us0Var3.m() + i13;
                        us0Var3.v.t.n(iM5);
                        us0Var3.v.v.n(iM5 - i13);
                    } else {
                        int iM6 = us0Var3.m() + i13;
                        us0Var3.v.t.n(iM6);
                        us0Var3.v.v.n(iM6 - i13);
                    }
                    t51Var.o();
                    z5 = true;
                }
                size = arrayList3.size();
                i17 = 0;
                while (i17 < size) {
                    Object obj5 = arrayList3.get(i17);
                    i17++;
                    eo5Var2 = (eo5) obj5;
                    if (eo5Var2.y == us0Var3) {
                    }
                    eo5Var2.v();
                }
                size2 = arrayList3.size();
                i18 = 0;
                while (true) {
                    if (i18 < size2) {
                        zT = true;
                        break;
                    }
                    Object obj6 = arrayList3.get(i18);
                    i18++;
                    eo5Var = (eo5) obj6;
                    if (!z5) {
                    }
                    if (eo5Var.j.a) {
                    }
                    zT = false;
                    break;
                }
                us0Var3.M(iA);
                us0Var3.N(iA2);
                i7 = 2;
                i11 = 1073741824;
            } else {
                z9 = z9;
                arrayList = arrayList2;
                gs0Var = gs0Var5;
                us0 us0Var4 = (us0) t51Var.r;
                if (t51Var.g) {
                    ArrayList arrayList5 = us0Var4.q0;
                    int size8 = arrayList5.size();
                    int i34 = 0;
                    while (i34 < size8) {
                        Object obj7 = arrayList5.get(i34);
                        i34++;
                        ts0 ts0Var3 = (ts0) obj7;
                        ts0Var3.j();
                        ts0Var3.g = false;
                        l72 l72Var2 = ts0Var3.n;
                        ArrayList arrayList6 = arrayList5;
                        l72Var2.v.a = false;
                        l72Var2.l = false;
                        l72Var2.c();
                        hk5 hk5Var2 = ts0Var3.v;
                        hk5Var2.v.a = false;
                        hk5Var2.l = false;
                        hk5Var2.w();
                        arrayList5 = arrayList6;
                    }
                    i10 = 0;
                    us0Var4.j();
                    us0Var4.g = false;
                    l72 l72Var3 = us0Var4.n;
                    l72Var3.v.a = false;
                    l72Var3.l = false;
                    l72Var3.c();
                    hk5 hk5Var3 = us0Var4.v;
                    hk5Var3.v.a = false;
                    hk5Var3.l = false;
                    hk5Var3.w();
                    t51Var.r();
                } else {
                    i10 = 0;
                }
                t51Var.y((us0) t51Var.n);
                us0Var4.Y = i10;
                us0Var4.Z = i10;
                us0Var4.n.j.n(i10);
                us0Var4.v.j.n(i10);
                i11 = 1073741824;
                if (mode == 1073741824) {
                    zT = us0Var.T(i10, zK);
                    i7 = 1;
                } else {
                    i7 = 0;
                    zT = true;
                }
                if (mode2 == 1073741824) {
                    zT &= us0Var.T(1, zK);
                    i7++;
                }
            }
            if (zT) {
                us0Var.P(mode == i11, mode2 == i11);
            }
        } else {
            z9 = z9;
            arrayList = arrayList2;
            gs0Var = gs0Var5;
            i7 = 0;
            zT = false;
        }
        if (zT && i7 == 2) {
            return;
        }
        int i35 = us0Var.D0;
        if (i5 > 0) {
            int size9 = us0Var.q0.size();
            boolean zW = us0Var.W(64);
            gs0 gs0Var6 = us0Var.u0;
            for (int i36 = 0; i36 < size9; i36++) {
                ts0 ts0Var4 = (ts0) us0Var.q0.get(i36);
                if (!(ts0Var4 instanceof m42) && !(ts0Var4 instanceof bx) && !ts0Var4.F && (!zW || (l72Var = ts0Var4.n) == null || (hk5Var = ts0Var4.v) == null || !l72Var.v.a || !hk5Var.v.a)) {
                    int iA3 = ts0Var4.a(0);
                    int iA4 = ts0Var4.a(1);
                    boolean z10 = iA3 == 3 && ts0Var4.p != 1 && iA4 == 3 && ts0Var4.u != 1;
                    if (!z10 && us0Var.W(1) && !(ts0Var4 instanceof tm5)) {
                        if (iA3 == 3 && ts0Var4.p == 0 && iA4 != 3 && !ts0Var4.k()) {
                            z10 = true;
                        }
                        if (iA4 == 3 && ts0Var4.u == 0 && iA3 != 3 && !ts0Var4.k()) {
                            z10 = true;
                        }
                        if ((iA3 == 3 || iA4 == 3) && ts0Var4.W > 0.0f) {
                            z10 = true;
                        }
                    }
                    if (!z10) {
                        roVar.O(0, gs0Var6, ts0Var4);
                    }
                }
            }
            ConstraintLayout constraintLayout = gs0Var6.g;
            int childCount2 = constraintLayout.getChildCount();
            ArrayList arrayList7 = constraintLayout.t;
            for (int i37 = 0; i37 < childCount2; i37++) {
                constraintLayout.getChildAt(i37);
            }
            int size10 = arrayList7.size();
            if (size10 > 0) {
                for (int i38 = 0; i38 < size10; i38++) {
                    ((ds0) arrayList7.get(i38)).getClass();
                }
            }
        }
        roVar.g0(us0Var);
        int size11 = arrayList.size();
        if (i5 > 0) {
            roVar.c0(us0Var, 0, iS2, iM);
        }
        if (size11 > 0) {
            int[] iArr4 = us0Var.p0;
            boolean z11 = iArr4[0] == 2;
            boolean z12 = iArr4[1] == 2;
            int iMax7 = Math.max(us0Var.s(), us0Var2.b0);
            int iMax8 = Math.max(us0Var.m(), us0Var2.c0);
            int i39 = 0;
            boolean z13 = false;
            while (i39 < size11) {
                ArrayList arrayList8 = arrayList;
                ts0 ts0Var5 = (ts0) arrayList8.get(i39);
                if (ts0Var5 instanceof tm5) {
                    int iS6 = ts0Var5.s();
                    int iM7 = ts0Var5.m();
                    z2 = z12;
                    z3 = z11;
                    gs0Var3 = gs0Var;
                    boolean zO2 = z13 | roVar.O(1, gs0Var3, ts0Var5);
                    int iS7 = ts0Var5.s();
                    int iM8 = ts0Var5.m();
                    if (iS7 != iS6) {
                        ts0Var5.O(iS7);
                        if (z3 && ts0Var5.p() + ts0Var5.U > iMax7) {
                            iMax7 = Math.max(iMax7, ts0Var5.t(4).v() + ts0Var5.p() + ts0Var5.U);
                        }
                        z4 = true;
                    } else {
                        z4 = zO2;
                    }
                    if (iM8 != iM7) {
                        ts0Var5.L(iM8);
                        if (z2 && ts0Var5.u() + ts0Var5.V > iMax8) {
                            iMax8 = Math.max(iMax8, ts0Var5.t(5).v() + ts0Var5.u() + ts0Var5.V);
                        }
                        z4 = true;
                    }
                    z13 = ((tm5) ts0Var5).y0 | z4;
                } else {
                    z2 = z12;
                    z3 = z11;
                    gs0Var3 = gs0Var;
                }
                i39++;
                gs0Var = gs0Var3;
                arrayList = arrayList8;
                z11 = z3;
                z12 = z2;
            }
            boolean z14 = z12;
            boolean z15 = z11;
            ArrayList arrayList9 = arrayList;
            int i40 = 0;
            while (true) {
                gs0 gs0Var7 = gs0Var;
                if (i40 >= 2) {
                    break;
                }
                int i41 = 0;
                while (i41 < size11) {
                    ts0 ts0Var6 = (ts0) arrayList9.get(i41);
                    if (((ts0Var6 instanceof n52) && !(ts0Var6 instanceof tm5)) || (ts0Var6 instanceof m42) || ts0Var6.g0 == 8 || ((z9 && ts0Var6.n.v.a && ts0Var6.v.v.a) || (ts0Var6 instanceof tm5))) {
                        i8 = size11;
                        gs0Var2 = gs0Var7;
                        i9 = i41;
                        zO = z13;
                    } else {
                        int iS8 = ts0Var6.s();
                        int iM9 = ts0Var6.m();
                        i8 = size11;
                        int i42 = ts0Var6.a0;
                        i9 = i41;
                        zO = roVar.O(i40 == 1 ? 2 : 1, gs0Var7, ts0Var6) | z13;
                        int iS9 = ts0Var6.s();
                        gs0Var2 = gs0Var7;
                        int iM10 = ts0Var6.m();
                        if (iS9 != iS8) {
                            ts0Var6.O(iS9);
                            if (z15 && ts0Var6.p() + ts0Var6.U > iMax7) {
                                iMax7 = Math.max(iMax7, ts0Var6.t(4).v() + ts0Var6.p() + ts0Var6.U);
                            }
                            zO = true;
                        }
                        if (iM10 != iM9) {
                            ts0Var6.L(iM10);
                            if (z14 && ts0Var6.u() + ts0Var6.V > iMax8) {
                                iMax8 = Math.max(iMax8, ts0Var6.t(5).v() + ts0Var6.u() + ts0Var6.V);
                            }
                            zO = true;
                        }
                        if (ts0Var6.E && i42 != ts0Var6.a0) {
                            zO = true;
                        }
                    }
                    z13 = zO;
                    gs0Var7 = gs0Var2;
                    i41 = i9 + 1;
                    size11 = i8;
                }
                int i43 = size11;
                gs0Var = gs0Var7;
                if (!z13) {
                    break;
                }
                i40++;
                roVar.c0(us0Var, i40, iS2, iM);
                size11 = i43;
                z13 = false;
            }
        }
        us0Var.D0 = i35;
        kv2.s = us0Var.W(512);
    }

    public final ts0 v(View view) {
        if (view == this) {
            return this.a;
        }
        if (view == null) {
            return null;
        }
        if (view.getLayoutParams() instanceof fs0) {
            return ((fs0) view.getLayoutParams()).p0;
        }
        view.setLayoutParams(generateLayoutParams(view.getLayoutParams()));
        if (view.getLayoutParams() instanceof fs0) {
            return ((fs0) view.getLayoutParams()).p0;
        }
        return null;
    }

    public final void x(AttributeSet attributeSet, int i) {
        us0 us0Var = this.a;
        us0Var.f0 = this;
        gs0 gs0Var = this.o;
        us0Var.u0 = gs0Var;
        us0Var.s0.l = gs0Var;
        this.j.put(getId(), this);
        this.s = null;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, j24.y, i, 0);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i2);
                if (index == 16) {
                    this.m = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.m);
                } else if (index == 17) {
                    this.q = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.q);
                } else if (index == 14) {
                    this.w = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.w);
                } else if (index == 15) {
                    this.c = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.c);
                } else if (index == 113) {
                    this.b = typedArrayObtainStyledAttributes.getInt(index, this.b);
                } else if (index == 56) {
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, 0);
                    if (resourceId != 0) {
                        try {
                            this.p = new cd2(getContext(), resourceId);
                        } catch (Resources.NotFoundException unused) {
                            this.p = null;
                        }
                    }
                } else if (index == 34) {
                    int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, 0);
                    try {
                        rs0 rs0Var = new rs0();
                        this.s = rs0Var;
                        rs0Var.v(getContext(), resourceId2);
                    } catch (Resources.NotFoundException unused2) {
                        this.s = null;
                    }
                    this.u = resourceId2;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        us0Var.D0 = this.b;
        kv2.s = us0Var.W(512);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.j = new SparseArray();
        this.t = new ArrayList(4);
        this.a = new us0();
        this.m = 0;
        this.q = 0;
        this.w = Integer.MAX_VALUE;
        this.c = Integer.MAX_VALUE;
        this.i = true;
        this.b = 257;
        this.s = null;
        this.p = null;
        this.u = -1;
        this.z = new HashMap();
        this.h = new SparseArray();
        this.o = new gs0(this, this);
        x(attributeSet, i);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        fs0 fs0Var = new fs0(layoutParams);
        fs0Var.g = -1;
        fs0Var.y = -1;
        fs0Var.r = -1.0f;
        fs0Var.n = true;
        fs0Var.v = -1;
        fs0Var.x = -1;
        fs0Var.l = -1;
        fs0Var.j = -1;
        fs0Var.t = -1;
        fs0Var.a = -1;
        fs0Var.m = -1;
        fs0Var.q = -1;
        fs0Var.w = -1;
        fs0Var.c = -1;
        fs0Var.i = -1;
        fs0Var.b = -1;
        fs0Var.s = 0;
        fs0Var.p = 0.0f;
        fs0Var.u = -1;
        fs0Var.z = -1;
        fs0Var.h = -1;
        fs0Var.o = -1;
        fs0Var.f = Integer.MIN_VALUE;
        fs0Var.k = Integer.MIN_VALUE;
        fs0Var.d = Integer.MIN_VALUE;
        fs0Var.e = Integer.MIN_VALUE;
        fs0Var.A = Integer.MIN_VALUE;
        fs0Var.B = Integer.MIN_VALUE;
        fs0Var.C = Integer.MIN_VALUE;
        fs0Var.D = 0;
        fs0Var.E = 0.5f;
        fs0Var.F = 0.5f;
        fs0Var.G = null;
        fs0Var.H = -1.0f;
        fs0Var.I = -1.0f;
        fs0Var.J = 0;
        fs0Var.K = 0;
        fs0Var.L = 0;
        fs0Var.M = 0;
        fs0Var.N = 0;
        fs0Var.O = 0;
        fs0Var.P = 0;
        fs0Var.Q = 0;
        fs0Var.R = 1.0f;
        fs0Var.S = 1.0f;
        fs0Var.T = -1;
        fs0Var.U = -1;
        fs0Var.V = -1;
        fs0Var.W = false;
        fs0Var.X = false;
        fs0Var.Y = null;
        fs0Var.Z = 0;
        fs0Var.a0 = true;
        fs0Var.b0 = true;
        fs0Var.c0 = false;
        fs0Var.d0 = false;
        fs0Var.e0 = false;
        fs0Var.f0 = -1;
        fs0Var.g0 = -1;
        fs0Var.h0 = -1;
        fs0Var.i0 = -1;
        fs0Var.j0 = Integer.MIN_VALUE;
        fs0Var.k0 = Integer.MIN_VALUE;
        fs0Var.l0 = 0.5f;
        fs0Var.p0 = new ts0();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            ((ViewGroup.MarginLayoutParams) fs0Var).leftMargin = marginLayoutParams.leftMargin;
            ((ViewGroup.MarginLayoutParams) fs0Var).rightMargin = marginLayoutParams.rightMargin;
            ((ViewGroup.MarginLayoutParams) fs0Var).topMargin = marginLayoutParams.topMargin;
            ((ViewGroup.MarginLayoutParams) fs0Var).bottomMargin = marginLayoutParams.bottomMargin;
            fs0Var.setMarginStart(marginLayoutParams.getMarginStart());
            fs0Var.setMarginEnd(marginLayoutParams.getMarginEnd());
        }
        if (!(layoutParams instanceof fs0)) {
            return fs0Var;
        }
        fs0 fs0Var2 = (fs0) layoutParams;
        fs0Var.g = fs0Var2.g;
        fs0Var.y = fs0Var2.y;
        fs0Var.r = fs0Var2.r;
        fs0Var.n = fs0Var2.n;
        fs0Var.v = fs0Var2.v;
        fs0Var.x = fs0Var2.x;
        fs0Var.l = fs0Var2.l;
        fs0Var.j = fs0Var2.j;
        fs0Var.t = fs0Var2.t;
        fs0Var.a = fs0Var2.a;
        fs0Var.m = fs0Var2.m;
        fs0Var.q = fs0Var2.q;
        fs0Var.w = fs0Var2.w;
        fs0Var.c = fs0Var2.c;
        fs0Var.i = fs0Var2.i;
        fs0Var.b = fs0Var2.b;
        fs0Var.s = fs0Var2.s;
        fs0Var.p = fs0Var2.p;
        fs0Var.u = fs0Var2.u;
        fs0Var.z = fs0Var2.z;
        fs0Var.h = fs0Var2.h;
        fs0Var.o = fs0Var2.o;
        fs0Var.f = fs0Var2.f;
        fs0Var.k = fs0Var2.k;
        fs0Var.d = fs0Var2.d;
        fs0Var.e = fs0Var2.e;
        fs0Var.A = fs0Var2.A;
        fs0Var.B = fs0Var2.B;
        fs0Var.C = fs0Var2.C;
        fs0Var.D = fs0Var2.D;
        fs0Var.E = fs0Var2.E;
        fs0Var.F = fs0Var2.F;
        fs0Var.G = fs0Var2.G;
        fs0Var.H = fs0Var2.H;
        fs0Var.I = fs0Var2.I;
        fs0Var.J = fs0Var2.J;
        fs0Var.K = fs0Var2.K;
        fs0Var.W = fs0Var2.W;
        fs0Var.X = fs0Var2.X;
        fs0Var.L = fs0Var2.L;
        fs0Var.M = fs0Var2.M;
        fs0Var.N = fs0Var2.N;
        fs0Var.P = fs0Var2.P;
        fs0Var.O = fs0Var2.O;
        fs0Var.Q = fs0Var2.Q;
        fs0Var.R = fs0Var2.R;
        fs0Var.S = fs0Var2.S;
        fs0Var.T = fs0Var2.T;
        fs0Var.U = fs0Var2.U;
        fs0Var.V = fs0Var2.V;
        fs0Var.a0 = fs0Var2.a0;
        fs0Var.b0 = fs0Var2.b0;
        fs0Var.c0 = fs0Var2.c0;
        fs0Var.d0 = fs0Var2.d0;
        fs0Var.f0 = fs0Var2.f0;
        fs0Var.g0 = fs0Var2.g0;
        fs0Var.h0 = fs0Var2.h0;
        fs0Var.i0 = fs0Var2.i0;
        fs0Var.j0 = fs0Var2.j0;
        fs0Var.k0 = fs0Var2.k0;
        fs0Var.l0 = fs0Var2.l0;
        fs0Var.Y = fs0Var2.Y;
        fs0Var.Z = fs0Var2.Z;
        fs0Var.p0 = fs0Var2.p0;
        return fs0Var;
    }
}
