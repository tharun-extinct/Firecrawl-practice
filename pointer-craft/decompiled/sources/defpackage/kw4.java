package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.StateSet;
import android.util.TypedValue;
import android.util.Xml;
import io.appground.blek.R;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes2.dex */
public final class kw4 {
    public int g;
    public fa4[] n;
    public int[][] r;
    public fa4 y;

    public static kw4 g(Context context, TypedArray typedArray) {
        int next;
        int resourceId = typedArray.getResourceId(2, 0);
        if (resourceId == 0 || !context.getResources().getResourceTypeName(resourceId).equals("xml")) {
            return null;
        }
        try {
            XmlResourceParser xml = context.getResources().getXml(resourceId);
            try {
                kw4 kw4Var = new kw4();
                kw4Var.r = new int[10][];
                kw4Var.n = new fa4[10];
                AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
                do {
                    next = xml.next();
                    if (next == 2) {
                        break;
                    }
                } while (next != 1);
                if (next != 2) {
                    throw new XmlPullParserException("No start tag found");
                }
                if (xml.getName().equals("selector")) {
                    kw4Var.n(context, xml, attributeSetAsAttributeSet, context.getTheme());
                }
                xml.close();
                return kw4Var;
            } catch (Throwable th) {
                if (xml != null) {
                    try {
                        xml.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        } catch (Resources.NotFoundException | IOException | XmlPullParserException unused) {
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0069  */
    public final void n(Context context, XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        jw4 jw4Var;
        int depth = xmlResourceParser.getDepth() + 1;
        while (true) {
            int next = xmlResourceParser.next();
            if (next == 1) {
                return;
            }
            int depth2 = xmlResourceParser.getDepth();
            if (depth2 < depth && next == 3) {
                return;
            }
            if (next == 2 && depth2 <= depth && xmlResourceParser.getName().equals("item")) {
                Resources resources = context.getResources();
                int[] iArr = p24.I;
                TypedArray typedArrayObtainAttributes = theme == null ? resources.obtainAttributes(attributeSet, iArr) : theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
                TypedValue typedValuePeekValue = typedArrayObtainAttributes.peekValue(0);
                if (typedValuePeekValue != null) {
                    int i = typedValuePeekValue.type;
                    if (i == 5) {
                        jw4Var = new jw4(2, TypedValue.complexToDimensionPixelSize(typedValuePeekValue.data, typedArrayObtainAttributes.getResources().getDisplayMetrics()));
                    } else if (i == 6) {
                        jw4Var = new jw4(1, typedValuePeekValue.getFraction(1.0f, 1.0f));
                    } else {
                        jw4Var = null;
                    }
                } else {
                    jw4Var = null;
                }
                typedArrayObtainAttributes.recycle();
                int attributeCount = attributeSet.getAttributeCount();
                int[] iArr2 = new int[attributeCount];
                int i2 = 0;
                for (int i3 = 0; i3 < attributeCount; i3++) {
                    int attributeNameResource = attributeSet.getAttributeNameResource(i3);
                    if (attributeNameResource != R.attr.widthChange) {
                        int i4 = i2 + 1;
                        if (!attributeSet.getAttributeBooleanValue(i3, false)) {
                            attributeNameResource = -attributeNameResource;
                        }
                        iArr2[i2] = attributeNameResource;
                        i2 = i4;
                    }
                }
                int[] iArrTrimStateSet = StateSet.trimStateSet(iArr2, i2);
                fa4 fa4Var = new fa4((byte) 26, false);
                fa4Var.t = jw4Var;
                int i5 = this.g;
                if (i5 == 0 || iArrTrimStateSet.length == 0) {
                    this.y = fa4Var;
                }
                int[][] iArr3 = this.r;
                if (i5 >= iArr3.length) {
                    int i6 = i5 + 10;
                    int[][] iArr4 = new int[i6][];
                    System.arraycopy(iArr3, 0, iArr4, 0, i5);
                    this.r = iArr4;
                    fa4[] fa4VarArr = new fa4[i6];
                    System.arraycopy(this.n, 0, fa4VarArr, 0, i5);
                    this.n = fa4VarArr;
                }
                int[][] iArr5 = this.r;
                int i7 = this.g;
                iArr5[i7] = iArrTrimStateSet;
                this.n[i7] = fa4Var;
                this.g = i7 + 1;
            }
        }
    }

    public final fa4 r(int[] iArr) {
        int i;
        int[][] iArr2 = this.r;
        int i2 = 0;
        while (true) {
            i = -1;
            if (i2 >= this.g) {
                i2 = -1;
                break;
            }
            if (StateSet.stateSetMatches(iArr2[i2], iArr)) {
                break;
            }
            i2++;
        }
        if (i2 < 0) {
            int[] iArr3 = StateSet.WILD_CARD;
            int[][] iArr4 = this.r;
            for (int i3 = 0; i3 < this.g; i3++) {
                if (StateSet.stateSetMatches(iArr4[i3], iArr3)) {
                    i = i3;
                    break;
                }
            }
            i2 = i;
        }
        return i2 < 0 ? this.y : this.n[i2];
    }

    public final int y(int i) {
        float fMax;
        int i2 = -i;
        for (int i3 = 0; i3 < this.g; i3++) {
            jw4 jw4Var = (jw4) this.n[i3].t;
            int i4 = jw4Var.g;
            float f = jw4Var.y;
            if (i4 == 2) {
                fMax = Math.max(i2, f);
            } else {
                if (i4 == 1) {
                    fMax = Math.max(i2, i * f);
                }
            }
            i2 = (int) fMax;
        }
        return i2;
    }
}
