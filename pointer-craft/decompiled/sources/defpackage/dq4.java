package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class dq4 extends o73 {
    public final zu4 g;

    public dq4(zu4 zu4Var) {
        this.g = zu4Var;
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
        if (!(obj instanceof dq4) || !((dq4) obj).g.equals(this.g)) {
            return false;
        }
        k00 k00Var = hi0.t;
        return k00Var.equals(k00Var);
    }

    public final int hashCode() {
        return (Float.hashCode(-1.0f) + (Float.hashCode(-1.0f) * 31) + (this.g.hashCode() * 31)) * 31;
    }

    @Override // defpackage.o73
    public final void j(i73 i73Var) {
        ((gq4) i73Var).o = this.g;
    }

    @Override // defpackage.o73
    public final i73 l() {
        return new gq4(this.g);
    }
}
