package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.StateSet;
import io.appground.blek.R;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public final class hw4 {
    public int g;
    public bx0 y;
    public int[][] r = new int[10][];
    public bx0[] n = new bx0[10];

    public static hw4 y(bx0 bx0Var) {
        hw4 hw4Var = new hw4();
        hw4Var.g(StateSet.WILD_CARD, bx0Var);
        return hw4Var;
    }

    public final void g(int[] iArr, bx0 bx0Var) {
        int i = this.g;
        if (i == 0 || iArr.length == 0) {
            this.y = bx0Var;
        }
        int[][] iArr2 = this.r;
        if (i >= iArr2.length) {
            int i2 = i + 10;
            int[][] iArr3 = new int[i2][];
            System.arraycopy(iArr2, 0, iArr3, 0, i);
            this.r = iArr3;
            bx0[] bx0VarArr = new bx0[i2];
            System.arraycopy(this.n, 0, bx0VarArr, 0, i);
            this.n = bx0VarArr;
        }
        int[][] iArr4 = this.r;
        int i3 = this.g;
        iArr4[i3] = iArr;
        this.n[i3] = bx0Var;
        this.g = i3 + 1;
    }

    public final void n(Context context, XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
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
                int[] iArr = p24.E;
                TypedArray typedArrayObtainAttributes = theme == null ? resources.obtainAttributes(attributeSet, iArr) : theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
                bx0 bx0VarT = fn4.t(typedArrayObtainAttributes, 5, new l(0.0f));
                typedArrayObtainAttributes.recycle();
                int attributeCount = attributeSet.getAttributeCount();
                int[] iArr2 = new int[attributeCount];
                int i = 0;
                for (int i2 = 0; i2 < attributeCount; i2++) {
                    int attributeNameResource = attributeSet.getAttributeNameResource(i2);
                    if (attributeNameResource != R.attr.cornerSize) {
                        int i3 = i + 1;
                        if (!attributeSet.getAttributeBooleanValue(i2, false)) {
                            attributeNameResource = -attributeNameResource;
                        }
                        iArr2[i] = attributeNameResource;
                        i = i3;
                    }
                }
                g(StateSet.trimStateSet(iArr2, i), bx0VarT);
            }
        }
    }

    public final bx0 r(int[] iArr) {
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
}
