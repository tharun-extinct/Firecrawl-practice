package defpackage;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.LinearGradient;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.util.AttributeSet;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes2.dex */
public abstract class hg6 {
    public static Shader g(Resources resources, XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        float f;
        float f2;
        Shader.TileMode tileMode;
        Shader.TileMode tileMode2;
        String name = xmlResourceParser.getName();
        if (!name.equals("gradient")) {
            throw new XmlPullParserException(xmlResourceParser.getPositionDescription() + ": invalid gradient color tag " + name);
        }
        TypedArray typedArrayO = xq2.o(resources, theme, attributeSet, l24.v);
        float f3 = xmlResourceParser.getAttributeValue("http://schemas.android.com/apk/res/android", "startX") != null ? typedArrayO.getFloat(8, 0.0f) : 0.0f;
        float f4 = xmlResourceParser.getAttributeValue("http://schemas.android.com/apk/res/android", "startY") != null ? typedArrayO.getFloat(9, 0.0f) : 0.0f;
        float f5 = xmlResourceParser.getAttributeValue("http://schemas.android.com/apk/res/android", "endX") != null ? typedArrayO.getFloat(10, 0.0f) : 0.0f;
        float f6 = xmlResourceParser.getAttributeValue("http://schemas.android.com/apk/res/android", "endY") != null ? typedArrayO.getFloat(11, 0.0f) : 0.0f;
        float f7 = xmlResourceParser.getAttributeValue("http://schemas.android.com/apk/res/android", "centerX") != null ? typedArrayO.getFloat(3, 0.0f) : 0.0f;
        float f8 = xmlResourceParser.getAttributeValue("http://schemas.android.com/apk/res/android", "centerY") != null ? typedArrayO.getFloat(4, 0.0f) : 0.0f;
        int i = xmlResourceParser.getAttributeValue("http://schemas.android.com/apk/res/android", "type") != null ? typedArrayO.getInt(2, 0) : 0;
        int color = xmlResourceParser.getAttributeValue("http://schemas.android.com/apk/res/android", "startColor") != null ? typedArrayO.getColor(0, 0) : 0;
        boolean z = xmlResourceParser.getAttributeValue("http://schemas.android.com/apk/res/android", "centerColor") != null;
        int color2 = xmlResourceParser.getAttributeValue("http://schemas.android.com/apk/res/android", "centerColor") != null ? typedArrayO.getColor(7, 0) : 0;
        int color3 = xmlResourceParser.getAttributeValue("http://schemas.android.com/apk/res/android", "endColor") != null ? typedArrayO.getColor(1, 0) : 0;
        int i2 = xmlResourceParser.getAttributeValue("http://schemas.android.com/apk/res/android", "tileMode") != null ? typedArrayO.getInt(6, 0) : 0;
        float f9 = xmlResourceParser.getAttributeValue("http://schemas.android.com/apk/res/android", "gradientRadius") != null ? typedArrayO.getFloat(5, 0.0f) : 0.0f;
        typedArrayO.recycle();
        int depth = xmlResourceParser.getDepth() + 1;
        ArrayList arrayList = new ArrayList(20);
        float f10 = f9;
        ArrayList arrayList2 = new ArrayList(20);
        while (true) {
            int next = xmlResourceParser.next();
            f = f5;
            if (next == 1) {
                f2 = f6;
                break;
            }
            int depth2 = xmlResourceParser.getDepth();
            f2 = f6;
            if (depth2 < depth && next == 3) {
                break;
            }
            if (next == 2 && depth2 <= depth && xmlResourceParser.getName().equals("item")) {
                TypedArray typedArrayO2 = xq2.o(resources, theme, attributeSet, l24.x);
                boolean zHasValue = typedArrayO2.hasValue(0);
                boolean zHasValue2 = typedArrayO2.hasValue(1);
                if (!zHasValue || !zHasValue2) {
                    throw new XmlPullParserException(xmlResourceParser.getPositionDescription() + ": <item> tag requires a 'color' attribute and a 'offset' attribute!");
                }
                int color4 = typedArrayO2.getColor(0, 0);
                float f11 = typedArrayO2.getFloat(1, 0.0f);
                typedArrayO2.recycle();
                arrayList2.add(Integer.valueOf(color4));
                arrayList.add(Float.valueOf(f11));
            }
            f5 = f;
            f6 = f2;
        }
        rk4 rk4Var = arrayList2.size() > 0 ? new rk4(arrayList2, arrayList) : null;
        if (rk4Var == null) {
            rk4Var = z ? new rk4(color, color2, color3) : new rk4(color, color3);
        }
        if (i != 1) {
            if (i == 2) {
                return new SweepGradient(f7, f8, (int[]) rk4Var.t, (float[]) rk4Var.a);
            }
            int[] iArr = (int[]) rk4Var.t;
            float[] fArr = (float[]) rk4Var.a;
            if (i2 != 1) {
                tileMode2 = i2 != 2 ? Shader.TileMode.CLAMP : Shader.TileMode.MIRROR;
            } else {
                tileMode2 = Shader.TileMode.REPEAT;
            }
            return new LinearGradient(f3, f4, f, f2, iArr, fArr, tileMode2);
        }
        if (f10 <= 0.0f) {
            throw new XmlPullParserException("<gradient> tag requires 'gradientRadius' attribute with radial type");
        }
        int[] iArr2 = (int[]) rk4Var.t;
        float[] fArr2 = (float[]) rk4Var.a;
        if (i2 != 1) {
            tileMode = i2 != 2 ? Shader.TileMode.CLAMP : Shader.TileMode.MIRROR;
        } else {
            tileMode = Shader.TileMode.REPEAT;
        }
        return new RadialGradient(f7, f8, f10, iArr2, fArr2, tileMode);
    }

    public static k84 y() {
        return new k84();
    }
}
