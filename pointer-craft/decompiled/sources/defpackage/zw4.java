package defpackage;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes.dex */
public final class zw4 {
    public CharSequence g;
    public boolean m;
    public int n;
    public final int r;
    public gc0 w;
    public final TextPaint y;
    public Layout.Alignment v = Layout.Alignment.ALIGN_NORMAL;
    public int x = Integer.MAX_VALUE;
    public float l = 0.0f;
    public float j = 1.0f;
    public boolean t = true;
    public boolean a = true;
    public TextUtils.TruncateAt q = null;

    public zw4(CharSequence charSequence, TextPaint textPaint, int i) {
        this.g = charSequence;
        this.y = textPaint;
        this.r = i;
        this.n = charSequence.length();
    }

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
    public final StaticLayout g() {
        if (this.g == null) {
            this.g = "";
        }
        int iMax = Math.max(0, this.r);
        CharSequence charSequenceEllipsize = this.g;
        int i = this.x;
        TextPaint textPaint = this.y;
        if (i == 1) {
            charSequenceEllipsize = TextUtils.ellipsize(charSequenceEllipsize, textPaint, iMax, this.q);
        }
        int iMin = Math.min(charSequenceEllipsize.length(), this.n);
        this.n = iMin;
        if (this.m && this.x == 1) {
            this.v = Layout.Alignment.ALIGN_OPPOSITE;
        }
        StaticLayout.Builder builderObtain = StaticLayout.Builder.obtain(charSequenceEllipsize, 0, iMin, textPaint, iMax);
        builderObtain.setAlignment(this.v);
        builderObtain.setIncludePad(this.a);
        builderObtain.setTextDirection(this.m ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR);
        TextUtils.TruncateAt truncateAt = this.q;
        if (truncateAt != null) {
            builderObtain.setEllipsize(truncateAt);
        }
        builderObtain.setMaxLines(this.x);
        float f = this.l;
        if (f != 0.0f || this.j != 1.0f) {
            builderObtain.setLineSpacing(f, this.j);
        }
        if (this.x > 1) {
            builderObtain.setHyphenationFrequency(this.t ? 1 : 0);
        }
        gc0 gc0Var = this.w;
        if (gc0Var != null) {
            gc0Var.g(builderObtain);
        }
        return builderObtain.build();
    }
}
