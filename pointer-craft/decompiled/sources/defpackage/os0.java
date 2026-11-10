package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseIntArray;

/* JADX INFO: loaded from: classes2.dex */
public final class os0 {
    public static final SparseIntArray a;
    public int g;
    public String j;
    public int l;
    public float n;
    public int r;
    public int t;
    public float v;
    public float x;
    public int y;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        a = sparseIntArray;
        sparseIntArray.append(3, 1);
        sparseIntArray.append(5, 2);
        sparseIntArray.append(9, 3);
        sparseIntArray.append(2, 4);
        sparseIntArray.append(1, 5);
        sparseIntArray.append(0, 6);
        sparseIntArray.append(4, 7);
        sparseIntArray.append(8, 8);
        sparseIntArray.append(7, 9);
        sparseIntArray.append(6, 10);
    }

    public final void g(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j24.x);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            switch (a.get(index)) {
                case 1:
                    this.v = typedArrayObtainStyledAttributes.getFloat(index, this.v);
                    break;
                case 2:
                    this.r = typedArrayObtainStyledAttributes.getInt(index, this.r);
                    break;
                case 3:
                    if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                        typedArrayObtainStyledAttributes.getString(index);
                    } else {
                        String str = ya6.g[typedArrayObtainStyledAttributes.getInteger(index, 0)];
                    }
                    break;
                case 4:
                    typedArrayObtainStyledAttributes.getInt(index, 0);
                    break;
                case 5:
                    this.g = rs0.x(typedArrayObtainStyledAttributes, index, this.g);
                    break;
                case 6:
                    this.y = typedArrayObtainStyledAttributes.getInteger(index, this.y);
                    break;
                case 7:
                    this.n = typedArrayObtainStyledAttributes.getFloat(index, this.n);
                    break;
                case 8:
                    this.l = typedArrayObtainStyledAttributes.getInteger(index, this.l);
                    break;
                case 9:
                    this.x = typedArrayObtainStyledAttributes.getFloat(index, this.x);
                    break;
                case 10:
                    int i2 = typedArrayObtainStyledAttributes.peekValue(index).type;
                    if (i2 == 1) {
                        this.t = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                    } else if (i2 == 3) {
                        String string = typedArrayObtainStyledAttributes.getString(index);
                        this.j = string;
                        if (string.indexOf("/") > 0) {
                            this.t = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                        }
                    } else {
                        typedArrayObtainStyledAttributes.getInteger(index, this.t);
                    }
                    break;
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }
}
