package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class hy4 extends o73 {
    public final zb1 g;

    public hy4(zb1 zb1Var) {
        this.g = zb1Var;
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
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hy4)) {
            return false;
        }
        hy4 hy4Var = (hy4) obj;
        ud udVar = df6.g;
        return udVar.equals(udVar) && yf2.p(this.g, hy4Var.g);
    }

    public final int hashCode() {
        int iL = xi3.l(1022 * 31, 31, false);
        zb1 zb1Var = this.g;
        return iL + (zb1Var != null ? zb1Var.hashCode() : 0);
    }

    @Override // defpackage.o73
    public final void j(i73 i73Var) {
        iy4 iy4Var = (iy4) i73Var;
        ud udVar = iy4Var.f;
        ud udVar2 = df6.g;
        if (!yf2.p(udVar, udVar2)) {
            iy4Var.f = udVar2;
            if (iy4Var.k) {
                iy4Var.S0();
            }
        }
        iy4Var.o = this.g;
    }

    @Override // defpackage.o73
    public final i73 l() {
        return new iy4(df6.g, this.g);
    }

    public final String toString() {
        return "StylusHoverIconModifierElement(icon=" + df6.g + ", overrideDescendants=false, touchBoundsExpansion=" + this.g + ")";
    }
}
