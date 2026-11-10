package defpackage;

import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class jc2 {
    public final LinkedHashMap g;

    public jc2(byte b) {
        switch (b) {
            case 1:
                this.g = new LinkedHashMap(0, 0.75f, true);
                break;
            default:
                this.g = new LinkedHashMap();
                break;
        }
    }

    public void g(tf0 tf0Var, xy1 xy1Var) {
        xy1Var.getClass();
        LinkedHashMap linkedHashMap = this.g;
        if (linkedHashMap.containsKey(tf0Var)) {
            l0.t(du4.i("A `initializer` with the same `clazz` has already been added: ", tf0Var.y(), "."));
        } else {
            linkedHashMap.put(tf0Var, new rl5(tf0Var, xy1Var));
        }
    }

    public g5 y() {
        Collection collectionValues = this.g.values();
        collectionValues.getClass();
        rl5[] rl5VarArr = (rl5[]) collectionValues.toArray(new rl5[0]);
        return new g5((rl5[]) Arrays.copyOf(rl5VarArr, rl5VarArr.length), (byte) 2);
    }
}
