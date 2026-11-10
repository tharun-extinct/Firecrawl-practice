package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.StateSet;
import android.view.ContextThemeWrapper;
import io.appground.blek.R;
import java.io.IOException;
import java.util.Objects;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public final class iw4 implements dn4 {
    public final int g;
    public final hw4 j;
    public final hw4 l;
    public final fn4[] n;
    public final int[][] r;
    public final hw4 v;
    public final hw4 x;
    public final fn4 y;

    public iw4(z82 z82Var) {
        this.g = z82Var.y;
        this.y = z82.r(z82Var);
        this.r = z82.n(z82Var);
        this.n = z82.v(z82Var);
        this.v = z82.x(z82Var);
        this.x = z82.l(z82Var);
        this.l = z82.j(z82Var);
        this.j = z82.g(z82Var);
    }

    public static iw4 l(Context context, TypedArray typedArray, int i) {
        int resourceId = typedArray.getResourceId(i, 0);
        if (resourceId != 0 && Objects.equals(context.getResources().getResourceTypeName(resourceId), "xml")) {
            return new z82(context, resourceId).m();
        }
        return null;
    }

    public static void t(z82 z82Var, Context context, XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
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
                int[] iArr = p24.k;
                TypedArray typedArrayObtainAttributes = theme == null ? resources.obtainAttributes(attributeSet, iArr) : theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
                int resourceId = typedArrayObtainAttributes.getResourceId(0, 0);
                int resourceId2 = typedArrayObtainAttributes.getResourceId(1, 0);
                l lVar = new l(0.0f);
                ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, resourceId);
                if (resourceId2 != 0) {
                    contextThemeWrapper.getTheme().applyStyle(resourceId2, true);
                }
                fn4 fn4VarG = fn4.j(contextThemeWrapper.obtainStyledAttributes(p24.E), lVar).g();
                typedArrayObtainAttributes.recycle();
                int attributeCount = attributeSet.getAttributeCount();
                int[] iArr2 = new int[attributeCount];
                int i = 0;
                for (int i2 = 0; i2 < attributeCount; i2++) {
                    int attributeNameResource = attributeSet.getAttributeNameResource(i2);
                    if (attributeNameResource != R.attr.shapeAppearance && attributeNameResource != R.attr.shapeAppearanceOverlay) {
                        int i3 = i + 1;
                        if (!attributeSet.getAttributeBooleanValue(i2, false)) {
                            attributeNameResource = -attributeNameResource;
                        }
                        iArr2[i] = attributeNameResource;
                        i = i3;
                    }
                }
                z82Var.t(StateSet.trimStateSet(iArr2, i), fn4VarG);
            }
        }
    }

    @Override // defpackage.dn4
    public final fn4 g(float f) {
        return j().g(f);
    }

    public final fn4 j() {
        fn4 fn4Var = this.y;
        hw4 hw4Var = this.j;
        hw4 hw4Var2 = this.l;
        hw4 hw4Var3 = this.x;
        hw4 hw4Var4 = this.v;
        if (hw4Var4 == null && hw4Var3 == null && hw4Var2 == null && hw4Var == null) {
            return fn4Var;
        }
        en4 en4VarM = fn4Var.m();
        if (hw4Var4 != null) {
            en4VarM.v = hw4Var4.y;
        }
        if (hw4Var3 != null) {
            en4VarM.x = hw4Var3.y;
        }
        if (hw4Var2 != null) {
            en4VarM.j = hw4Var2.y;
        }
        if (hw4Var != null) {
            en4VarM.l = hw4Var.y;
        }
        return en4VarM.g();
    }

    @Override // defpackage.dn4
    public final fn4 n() {
        return j();
    }

    @Override // defpackage.dn4
    public final fn4[] r() {
        return this.n;
    }

    @Override // defpackage.dn4
    public final fn4 v(e64 e64Var) {
        return j().v(e64Var);
    }

    @Override // defpackage.dn4
    public final boolean x() {
        hw4 hw4Var;
        hw4 hw4Var2;
        hw4 hw4Var3;
        hw4 hw4Var4;
        return this.g > 1 || ((hw4Var = this.v) != null && hw4Var.g > 1) || (((hw4Var2 = this.x) != null && hw4Var2.g > 1) || (((hw4Var3 = this.l) != null && hw4Var3.g > 1) || ((hw4Var4 = this.j) != null && hw4Var4.g > 1)));
    }

    @Override // defpackage.dn4
    public final fn4 y(int[] iArr) {
        int i;
        int i2;
        int[][] iArr2;
        int i3 = 0;
        while (true) {
            i = -1;
            i2 = this.g;
            iArr2 = this.r;
            if (i3 >= i2) {
                i3 = -1;
                break;
            }
            if (StateSet.stateSetMatches(iArr2[i3], iArr)) {
                break;
            }
            i3++;
        }
        if (i3 < 0) {
            int[] iArr3 = StateSet.WILD_CARD;
            for (int i4 = 0; i4 < i2; i4++) {
                if (StateSet.stateSetMatches(iArr2[i4], iArr3)) {
                    i = i4;
                    break;
                }
            }
            i3 = i;
        }
        fn4[] fn4VarArr = this.n;
        hw4 hw4Var = this.j;
        hw4 hw4Var2 = this.l;
        hw4 hw4Var3 = this.x;
        hw4 hw4Var4 = this.v;
        if (hw4Var4 == null && hw4Var3 == null && hw4Var2 == null && hw4Var == null) {
            return fn4VarArr[i3];
        }
        en4 en4VarM = fn4VarArr[i3].m();
        if (hw4Var4 != null) {
            en4VarM.v = hw4Var4.r(iArr);
        }
        if (hw4Var3 != null) {
            en4VarM.x = hw4Var3.r(iArr);
        }
        if (hw4Var2 != null) {
            en4VarM.j = hw4Var2.r(iArr);
        }
        if (hw4Var != null) {
            en4VarM.l = hw4Var.r(iArr);
        }
        return en4VarM.g();
    }
}
