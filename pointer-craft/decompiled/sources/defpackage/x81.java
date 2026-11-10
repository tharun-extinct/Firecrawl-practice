package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class x81 extends RuntimeException {
    public final go0 j;

    public x81(go0 go0Var) {
        this.j = go0Var;
        if (go0Var.y) {
            return;
        }
        int[] iArr = {201, 202, 204, 206, 207, 125, -127, 126665345, 200};
        List list = go0Var.g;
        int size = list.size();
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            io0 io0Var = (io0) list.get(i);
            if (!pr.I(iArr, io0Var.g)) {
                if (io0Var.g == 100) {
                    int i3 = i + 2;
                    if (i3 < size && ((io0) list.get(i3)).g == 1000) {
                        break;
                    } else {
                        hj0.e0(arrayList);
                    }
                } else {
                    arrayList.add(io0Var);
                }
            }
            i = i2;
        }
        int size2 = arrayList.size();
        StackTraceElement[] stackTraceElementArr = new StackTraceElement[size2];
        for (int i4 = 0; i4 < size2; i4++) {
            stackTraceElementArr[i4] = new StackTraceElement("$$compose", xi3.j("m$", ((io0) arrayList.get(i4)).g), "SourceFile", 1);
        }
        setStackTrace(stackTraceElementArr);
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        go0 go0Var = this.j;
        if (!go0Var.y) {
            return "Composition stack when thrown:";
        }
        StringBuilder sb = new StringBuilder("Composition stack when thrown:\n");
        uv2 uv2VarC = pw5.c();
        List list = go0Var.g;
        list.getClass();
        r84 r84Var = new r84(list);
        int iG = r84Var.g();
        for (int i = 0; i < iG; i++) {
            ((io0) r84Var.get(i)).getClass();
        }
        uv2 uv2VarA = pw5.a(uv2VarC);
        uv2VarA.getClass();
        r84 r84Var2 = new r84(uv2VarA);
        int iG2 = r84Var2.g();
        for (int i2 = 0; i2 < iG2; i2++) {
            String str = (String) r84Var2.get(i2);
            sb.append("\tat ");
            sb.append(str);
            sb.append('\n');
        }
        return sb.toString();
    }
}
