package defpackage;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.util.AttributeSet;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: loaded from: classes2.dex */
public final class wi5 extends zi5 {
    public float a;
    public float c;
    public float j;
    public float l;
    public float m;
    public bm n;
    public Paint.Cap q;
    public float t;
    public float v;
    public Paint.Join w;
    public bm x;

    public wi5(wi5 wi5Var) {
        super(wi5Var);
        this.v = 0.0f;
        this.l = 1.0f;
        this.j = 1.0f;
        this.t = 0.0f;
        this.a = 1.0f;
        this.m = 0.0f;
        this.q = Paint.Cap.BUTT;
        this.w = Paint.Join.MITER;
        this.c = 4.0f;
        this.n = wi5Var.n;
        this.v = wi5Var.v;
        this.l = wi5Var.l;
        this.x = wi5Var.x;
        this.r = wi5Var.r;
        this.j = wi5Var.j;
        this.t = wi5Var.t;
        this.a = wi5Var.a;
        this.m = wi5Var.m;
        this.q = wi5Var.q;
        this.w = wi5Var.w;
        this.c = wi5Var.c;
    }

    @Override // defpackage.yi5
    public final boolean g() {
        return this.x.l() || this.n.l();
    }

    public float getFillAlpha() {
        return this.j;
    }

    public int getFillColor() {
        return this.x.g;
    }

    public float getStrokeAlpha() {
        return this.l;
    }

    public int getStrokeColor() {
        return this.n.g;
    }

    public float getStrokeWidth() {
        return this.v;
    }

    public float getTrimPathEnd() {
        return this.a;
    }

    public float getTrimPathOffset() {
        return this.m;
    }

    public float getTrimPathStart() {
        return this.t;
    }

    public void setFillAlpha(float f) {
        this.j = f;
    }

    public void setFillColor(int i) {
        this.x.g = i;
    }

    public void setStrokeAlpha(float f) {
        this.l = f;
    }

    public void setStrokeColor(int i) {
        this.n.g = i;
    }

    public void setStrokeWidth(float f) {
        this.v = f;
    }

    public void setTrimPathEnd(float f) {
        this.a = f;
    }

    public void setTrimPathOffset(float f) {
        this.m = f;
    }

    public void setTrimPathStart(float f) {
        this.t = f;
    }

    public final void v(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        TypedArray typedArrayO = xq2.o(resources, theme, attributeSet, mu5.n);
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "pathData") != null) {
            String string = typedArrayO.getString(0);
            if (string != null) {
                this.y = string;
            }
            String string2 = typedArrayO.getString(2);
            if (string2 != null) {
                this.g = nc6.a(string2);
            }
            this.x = xq2.s(typedArrayO, xmlPullParser, theme, "fillColor", 1);
            float f = this.j;
            if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "fillAlpha") != null) {
                f = typedArrayO.getFloat(12, f);
            }
            this.j = f;
            int i = xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeLineCap") != null ? typedArrayO.getInt(8, -1) : -1;
            Paint.Cap cap = this.q;
            if (i == 0) {
                cap = Paint.Cap.BUTT;
            } else if (i == 1) {
                cap = Paint.Cap.ROUND;
            } else if (i == 2) {
                cap = Paint.Cap.SQUARE;
            }
            this.q = cap;
            int i2 = xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeLineJoin") != null ? typedArrayO.getInt(9, -1) : -1;
            Paint.Join join = this.w;
            if (i2 == 0) {
                join = Paint.Join.MITER;
            } else if (i2 == 1) {
                join = Paint.Join.ROUND;
            } else if (i2 == 2) {
                join = Paint.Join.BEVEL;
            }
            this.w = join;
            float f2 = this.c;
            if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeMiterLimit") != null) {
                f2 = typedArrayO.getFloat(10, f2);
            }
            this.c = f2;
            this.n = xq2.s(typedArrayO, xmlPullParser, theme, "strokeColor", 3);
            float f3 = this.l;
            if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeAlpha") != null) {
                f3 = typedArrayO.getFloat(11, f3);
            }
            this.l = f3;
            float f4 = this.v;
            if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeWidth") != null) {
                f4 = typedArrayO.getFloat(4, f4);
            }
            this.v = f4;
            float f5 = this.a;
            if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "trimPathEnd") != null) {
                f5 = typedArrayO.getFloat(6, f5);
            }
            this.a = f5;
            float f6 = this.m;
            if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "trimPathOffset") != null) {
                f6 = typedArrayO.getFloat(7, f6);
            }
            this.m = f6;
            float f7 = this.t;
            if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "trimPathStart") != null) {
                f7 = typedArrayO.getFloat(5, f7);
            }
            this.t = f7;
            int i3 = this.r;
            if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "fillType") != null) {
                i3 = typedArrayO.getInt(13, i3);
            }
            this.r = i3;
        }
        typedArrayO.recycle();
    }

    /* JADX WARN: Code duplicated, block: B:13:0x003a  */
    /* JADX WARN: Code duplicated, block: B:7:0x001e  */
    @Override // defpackage.yi5
    public final boolean y(int[] iArr) {
        boolean z;
        bm bmVar = this.x;
        boolean z2 = true;
        if (bmVar.l()) {
            ColorStateList colorStateList = (ColorStateList) bmVar.r;
            int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
            if (colorForState != bmVar.g) {
                bmVar.g = colorForState;
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        bm bmVar2 = this.n;
        if (bmVar2.l()) {
            ColorStateList colorStateList2 = (ColorStateList) bmVar2.r;
            int colorForState2 = colorStateList2.getColorForState(iArr, colorStateList2.getDefaultColor());
            if (colorForState2 != bmVar2.g) {
                bmVar2.g = colorForState2;
            } else {
                z2 = false;
            }
        } else {
            z2 = false;
        }
        return z | z2;
    }

    public wi5() {
        this.v = 0.0f;
        this.l = 1.0f;
        this.j = 1.0f;
        this.t = 0.0f;
        this.a = 1.0f;
        this.m = 0.0f;
        this.q = Paint.Cap.BUTT;
        this.w = Paint.Join.MITER;
        this.c = 4.0f;
    }
}
