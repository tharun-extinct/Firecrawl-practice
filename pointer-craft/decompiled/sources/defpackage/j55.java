package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class j55 {
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
        if (!(obj instanceof j55)) {
            return false;
        }
        i00 i00Var = hi0.h;
        return i00Var.equals(i00Var) && i00Var.equals(i00Var);
    }

    public final int hashCode() {
        return Float.hashCode(-1.0f) + fj.y(-1.0f, Boolean.hashCode(false) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Attached(alwaysMinimize=false, minimizedAlignment=");
        i00 i00Var = hi0.h;
        sb.append(i00Var);
        sb.append(", expandedAlignment=");
        sb.append(i00Var);
        sb.append(')');
        return sb.toString();
    }
}
