package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseIntArray;

/* JADX INFO: loaded from: classes2.dex */
public final class qs0 {
    public static final SparseIntArray c;
    public float a;
    public float g;
    public int j;
    public float l;
    public float m;
    public float n;
    public boolean q;
    public float r;
    public float t;
    public float v;
    public float w;
    public float x;
    public float y;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        c = sparseIntArray;
        sparseIntArray.append(6, 1);
        sparseIntArray.append(7, 2);
        sparseIntArray.append(8, 3);
        sparseIntArray.append(4, 4);
        sparseIntArray.append(5, 5);
        sparseIntArray.append(0, 6);
        sparseIntArray.append(1, 7);
        sparseIntArray.append(2, 8);
        sparseIntArray.append(3, 9);
        sparseIntArray.append(9, 10);
        sparseIntArray.append(10, 11);
        sparseIntArray.append(11, 12);
    }

    public final void g(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j24.t);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            switch (c.get(index)) {
                case 1:
                    this.g = typedArrayObtainStyledAttributes.getFloat(index, this.g);
                    break;
                case 2:
                    this.y = typedArrayObtainStyledAttributes.getFloat(index, this.y);
                    break;
                case 3:
                    this.r = typedArrayObtainStyledAttributes.getFloat(index, this.r);
                    break;
                case 4:
                    this.n = typedArrayObtainStyledAttributes.getFloat(index, this.n);
                    break;
                case 5:
                    this.v = typedArrayObtainStyledAttributes.getFloat(index, this.v);
                    break;
                case 6:
                    this.x = typedArrayObtainStyledAttributes.getDimension(index, this.x);
                    break;
                case 7:
                    this.l = typedArrayObtainStyledAttributes.getDimension(index, this.l);
                    break;
                case 8:
                    this.t = typedArrayObtainStyledAttributes.getDimension(index, this.t);
                    break;
                case 9:
                    this.a = typedArrayObtainStyledAttributes.getDimension(index, this.a);
                    break;
                case 10:
                    this.m = typedArrayObtainStyledAttributes.getDimension(index, this.m);
                    break;
                case zo2.HAS_IMAGE_COLOR_FILTER_FIELD_NUMBER /* 11 */:
                    this.q = true;
                    this.w = typedArrayObtainStyledAttributes.getDimension(index, this.w);
                    break;
                case 12:
                    this.j = rs0.x(typedArrayObtainStyledAttributes, index, this.j);
                    break;
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }
}
