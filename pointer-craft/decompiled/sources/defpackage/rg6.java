package defpackage;

import android.R;
import android.os.Build;
import android.text.Spanned;
import java.text.BreakIterator;

/* JADX INFO: loaded from: classes2.dex */
public abstract class rg6 {
    public static final void g(m2 m2Var, gj4 gj4Var) {
        aj4 aj4Var = gj4Var.n;
        hb3 hb3Var = aj4Var.j;
        Object objL = aj4Var.j.l(kj4.e);
        if (objL == null) {
            objL = null;
        }
        o94 o94Var = (o94) objL;
        if (gj4Var.m().j.r(kj4.a)) {
            return;
        }
        if (o94Var != null && o94Var.g == 8) {
            return;
        }
        Object objL2 = hb3Var.l(yi4.d);
        if (objL2 == null) {
            objL2 = null;
        }
        p1 p1Var = (p1) objL2;
        if (p1Var != null) {
            m2Var.y(new f2(p1Var.g, R.id.accessibilityActionPageUp));
        }
        Object objL3 = hb3Var.l(yi4.A);
        if (objL3 == null) {
            objL3 = null;
        }
        p1 p1Var2 = (p1) objL3;
        if (p1Var2 != null) {
            m2Var.y(new f2(p1Var2.g, R.id.accessibilityActionPageDown));
        }
        Object objL4 = hb3Var.l(yi4.e);
        if (objL4 == null) {
            objL4 = null;
        }
        p1 p1Var3 = (p1) objL4;
        if (p1Var3 != null) {
            m2Var.y(new f2(p1Var3.g, R.id.accessibilityActionPageLeft));
        }
        Object objL5 = hb3Var.l(yi4.B);
        p1 p1Var4 = (p1) (objL5 != null ? objL5 : null);
        if (p1Var4 != null) {
            m2Var.y(new f2(p1Var4.g, R.id.accessibilityActionPageRight));
        }
    }

    public static final ph1 n() {
        if (!ph1.n()) {
            return null;
        }
        ph1 ph1VarG = ph1.g();
        if (ph1VarG.r() == 1) {
            return ph1VarG;
        }
        return null;
    }

    public static final int r(String str, int i) {
        ph1 ph1VarN = n();
        Integer num = null;
        if (ph1VarN != null) {
            Integer numValueOf = Integer.valueOf(ph1VarN.y(str, Math.max(0, i - 1)));
            if (numValueOf.intValue() != -1) {
                num = numValueOf;
            }
        }
        if (num != null) {
            return num.intValue();
        }
        BreakIterator characterInstance = BreakIterator.getCharacterInstance();
        characterInstance.setText(str);
        return characterInstance.preceding(i);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x002c  */
    /* JADX WARN: Code duplicated, block: B:25:0x002e  */
    public static int v(int i) {
        if (i == -1) {
            return -1;
        }
        int i2 = Build.VERSION.SDK_INT;
        int i3 = 6;
        if (i2 < 34) {
            switch (i) {
                case 21:
                case 23:
                case 26:
                    i = 6;
                    break;
                case 22:
                case 24:
                case 27:
                    i = 4;
                    break;
                case 25:
                    i = 0;
                    break;
            }
        }
        if (i2 >= 30) {
            i3 = i;
        } else if (i == 12) {
            i3 = 1;
        } else if (i != 13) {
            if (i == 16) {
                i3 = 1;
            } else if (i != 17) {
                i3 = i;
            } else {
                i3 = 0;
            }
        }
        if (i2 >= 27 || !(i3 == 7 || i3 == 8 || i3 == 9)) {
            return i3;
        }
        return -1;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0049  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.text.BreakIterator] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, ro] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static final int y(String str, int i) {
        ?? r5;
        ?? r6;
        int spanEnd;
        ph1 ph1VarN = n();
        Integer num = null;
        if (ph1VarN != null) {
            xs2.a("Not initialized yet", ph1VarN.r() == 1);
            xs2.t(str, "charSequence cannot be null");
            ?? r4 = ph1VarN.v.y;
            r4.getClass();
            if (i < 0 || i >= str.length()) {
                r6 = str;
                spanEnd = -1;
            } else if (str instanceof Spanned) {
                Spanned spanned = (Spanned) str;
                gf5[] gf5VarArr = (gf5[]) spanned.getSpans(i, i + 1, gf5.class);
                if (gf5VarArr.length > 0) {
                    spanEnd = spanned.getSpanEnd(gf5VarArr[0]);
                    r6 = str;
                } else {
                    ?? r7 = str;
                    spanEnd = ((bi1) r4.R(r7, Math.max(0, i - 16), Math.min(str.length(), i + 16), Integer.MAX_VALUE, true, new bi1(i))).a;
                    r6 = r7;
                }
            } else {
                ?? r8 = str;
                spanEnd = ((bi1) r4.R(r8, Math.max(0, i - 16), Math.min(str.length(), i + 16), Integer.MAX_VALUE, true, new bi1(i))).a;
                r6 = r8;
            }
            Integer numValueOf = Integer.valueOf(spanEnd);
            r5 = r6;
            if (spanEnd != -1) {
                num = numValueOf;
            }
        } else {
            r5 = str;
        }
        if (num != null) {
            r5 = r6;
            return num.intValue();
        }
        r5 = r6;
        ?? characterInstance = BreakIterator.getCharacterInstance();
        characterInstance.setText(r5);
        return characterInstance.following(i);
    }
}
