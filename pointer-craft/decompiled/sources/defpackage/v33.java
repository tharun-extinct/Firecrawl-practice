package defpackage;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public interface v33 extends rf2 {
    u33 U(int i, int i2, Map map, xy1 xy1Var, xy1 xy1Var2);

    default u33 k0(int i, int i2, Map map, xy1 xy1Var) {
        return U(i, i2, map, null, xy1Var);
    }
}
