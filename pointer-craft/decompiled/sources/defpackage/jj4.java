package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class jj4 {
    public final um2 g;
    public final xa3 n = new xa3(2);
    public final he2 r;
    public final ti1 y;

    public jj4(um2 um2Var, ti1 ti1Var, ha3 ha3Var) {
        this.g = um2Var;
        this.y = ti1Var;
        this.r = ha3Var;
    }

    public final gj4 g() {
        return new gj4(this.y, false, this.g, new aj4());
    }

    /* JADX WARN: Code duplicated, block: B:34:0x007a  */
    /* JADX WARN: Code duplicated, block: B:42:0x008f  */
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
    public final void y(um2 um2Var, aj4 aj4Var) {
        za zaVar;
        za zaVar2;
        String str;
        String str2;
        ca5 ca5Var;
        ca5 ca5Var2;
        jo1 jo1Var;
        jo1 jo1Var2;
        xa3 xa3Var = this.n;
        Object[] objArr = xa3Var.g;
        int i = xa3Var.y;
        for (int i2 = 0; i2 < i; i2++) {
            a9 a9Var = (a9) objArr[i2];
            a9Var.getClass();
            aj4 aj4VarK = um2Var.k();
            int i3 = um2Var.t;
            ji jiVar = a9Var.j;
            ba baVar = a9Var.a;
            if (aj4Var != null) {
                Object objL = aj4Var.j.l(kj4.u);
                if (objL == null) {
                    objL = null;
                }
                zaVar = (za) objL;
            } else {
                zaVar = null;
            }
            if (aj4VarK != null) {
                Object objL2 = aj4VarK.j.l(kj4.u);
                if (objL2 == null) {
                    objL2 = null;
                }
                zaVar2 = (za) objL2;
            } else {
                zaVar2 = null;
            }
            za zaVar3 = cm1.t;
            if (!yf2.p(zaVar2, zaVar3)) {
                if (yf2.p(zaVar, zaVar3) && !yf2.p(zaVar2, zaVar3)) {
                    jiVar.N(baVar, i3, true);
                }
                if (aj4Var != null) {
                    Object objL3 = aj4Var.j.l(kj4.F);
                    if (objL3 == null) {
                        objL3 = null;
                    }
                    cj cjVar = (cj) objL3;
                    if (cjVar != null) {
                        str = cjVar.t;
                    } else {
                        str = null;
                    }
                } else {
                    str = null;
                }
                if (aj4VarK != null) {
                    Object objL4 = aj4VarK.j.l(kj4.F);
                    if (objL4 == null) {
                        objL4 = null;
                    }
                    cj cjVar2 = (cj) objL4;
                    if (cjVar2 != null) {
                        str2 = cjVar2.t;
                    } else {
                        str2 = null;
                    }
                } else {
                    str2 = null;
                }
                if (str != str2) {
                    if (str == null) {
                        jiVar.N(baVar, i3, true);
                    } else if (str2 == null) {
                        jiVar.N(baVar, i3, false);
                    } else if (yf2.p(zaVar2, cm1.a)) {
                        jiVar.G().notifyValueChanged(baVar, i3, iy5.y(str2));
                    }
                }
                if (aj4Var != null) {
                    Object objL5 = aj4Var.j.l(kj4.L);
                    if (objL5 == null) {
                        objL5 = null;
                    }
                    ca5Var = (ca5) objL5;
                } else {
                    ca5Var = null;
                }
                if (aj4VarK != null) {
                    Object objL6 = aj4VarK.j.l(kj4.L);
                    if (objL6 == null) {
                        objL6 = null;
                    }
                    ca5Var2 = (ca5) objL6;
                } else {
                    ca5Var2 = null;
                }
                if (ca5Var != ca5Var2) {
                    if (ca5Var == null) {
                        jiVar.N(baVar, i3, true);
                    } else if (ca5Var2 == null) {
                        jiVar.N(baVar, i3, false);
                    } else if (yf2.p(zaVar2, cm1.m)) {
                        int iOrdinal = ca5Var2.ordinal();
                        Boolean bool = iOrdinal != 0 ? iOrdinal != 1 ? null : Boolean.FALSE : Boolean.TRUE;
                        if (bool != null) {
                            jiVar.G().notifyValueChanged(baVar, i3, iy5.r(bool.booleanValue()));
                        }
                    }
                }
                if (aj4Var != null) {
                    Object objL7 = aj4Var.j.l(kj4.z);
                    if (objL7 == null) {
                        objL7 = null;
                    }
                    jo1Var = (jo1) objL7;
                } else {
                    jo1Var = null;
                }
                if (aj4VarK != null) {
                    Object objL8 = aj4VarK.j.l(kj4.z);
                    if (objL8 == null) {
                        objL8 = null;
                    }
                    jo1Var2 = (jo1) objL8;
                } else {
                    jo1Var2 = null;
                }
                if (!yf2.p(jo1Var, jo1Var2)) {
                    if (jo1Var == null) {
                        jiVar.N(baVar, i3, true);
                    } else if (jo1Var2 == null) {
                        jiVar.N(baVar, i3, false);
                    } else {
                        jiVar.G().notifyValueChanged(baVar, i3, ((wb) jo1Var2).g());
                    }
                }
            } else if (!yf2.p(zaVar, zaVar3)) {
                jiVar.N(baVar, i3, false);
            }
            boolean z = aj4Var != null && aj4Var.j.y(kj4.p);
            boolean z2 = aj4VarK != null && aj4VarK.j.y(kj4.p);
            if (z != z2) {
                ia3 ia3Var = a9Var.i;
                if (z2) {
                    ia3Var.g(i3);
                } else {
                    ia3Var.l(i3);
                }
            }
        }
    }
}
