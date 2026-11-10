package defpackage;

import java.util.Iterator;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class wj2 implements xy1 {
    public final /* synthetic */ zf5 a;
    public final /* synthetic */ byte j = 1;
    public final /* synthetic */ st4 m;
    public final /* synthetic */ bz1 t;

    public /* synthetic */ wj2(bz1 bz1Var, zf5 zf5Var, st4 st4Var) {
        this.t = bz1Var;
        this.a = zf5Var;
        this.m = st4Var;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.xy1
    public final Object a(Object obj) {
        byte b = this.j;
        og5 og5Var = og5.g;
        st4 st4Var = this.m;
        zf5 zf5Var = this.a;
        bz1 bz1Var = this.t;
        switch (b) {
            case 0:
                short s = zf5Var.l;
                k63 k63Var = (k63) obj;
                k63Var.getClass();
                int iOrdinal = k63Var.ordinal();
                if (iOrdinal == 0) {
                    st4Var.add(new j63(zf5Var.x, s, false));
                    bz1Var.l(Integer.valueOf(s), Boolean.TRUE);
                    return og5Var;
                }
                Object obj2 = null;
                if (iOrdinal != 1) {
                    if (iOrdinal != 2) {
                        up.y();
                        return null;
                    }
                    hj0.b0(st4Var, new h(zf5Var, (byte) 28));
                    bz1Var.l(Integer.valueOf(s), Boolean.FALSE);
                    return og5Var;
                }
                ListIterator listIterator = st4Var.listIterator();
                while (true) {
                    tv2 tv2Var = (tv2) listIterator;
                    if (tv2Var.hasNext()) {
                        Object next = tv2Var.next();
                        if (((j63) next).y == s) {
                            obj2 = next;
                        }
                    }
                }
                j63 j63Var = (j63) obj2;
                if (j63Var == null) {
                    return og5Var;
                }
                int iIndexOf = st4Var.indexOf(j63Var);
                i63 i63Var = j63Var.g;
                int i = j63Var.y;
                i63Var.getClass();
                st4Var.set(iIndexOf, new j63(i63Var, i, true));
                return og5Var;
            default:
                Boolean bool = (Boolean) obj;
                boolean zBooleanValue = bool.booleanValue();
                bz1Var.l(Integer.valueOf(zf5Var.l), bool);
                if (!zBooleanValue) {
                    st4 st4Var2 = new st4();
                    hj0.b0(st4Var, new h(st4Var2, (byte) 29));
                    Iterator it = cj0.y0(st4Var2).iterator();
                    while (it.hasNext()) {
                        bz1Var.l(Integer.valueOf(((j63) it.next()).y), Boolean.FALSE);
                    }
                }
                return og5Var;
        }
    }

    public /* synthetic */ wj2(st4 st4Var, zf5 zf5Var, bz1 bz1Var) {
        this.m = st4Var;
        this.a = zf5Var;
        this.t = bz1Var;
    }
}
