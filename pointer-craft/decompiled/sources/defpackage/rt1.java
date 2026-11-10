package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class rt1 {
    public final rb3 g = new rb3(new tt1[16]);
    public static final rt1 y = new rt1();
    public static final rt1 r = new rt1();
    public static final rt1 n = new rt1();

    public static void g(rt1 rt1Var) {
        rt1Var.getClass();
        if (rt1Var == y) {
            l0.z("\n    Please check whether the focusRequester is FocusRequester.Cancel or FocusRequester.Default\n    before invoking any functions on the focusRequester.\n");
            return;
        }
        if (rt1Var == r) {
            l0.z("\n    Please check whether the focusRequester is FocusRequester.Cancel or FocusRequester.Default\n    before invoking any functions on the focusRequester.\n");
            return;
        }
        rb3 rb3Var = rt1Var.g;
        int i = rb3Var.a;
        if (i == 0) {
            System.out.println((Object) "FocusRelatedWarning: \n   FocusRequester is not initialized. Here are some possible fixes:\n\n   1. Remember the FocusRequester: val focusRequester = remember { FocusRequester() }\n   2. Did you forget to add a Modifier.focusRequester() ?\n   3. Are you attempting to request focus during composition? Focus requests should be made in\n   response to some event. Eg Modifier.clickable { focusRequester.requestFocus() }\n");
            return;
        }
        Object[] objArr = rb3Var.j;
        for (int i2 = 0; i2 < i; i2++) {
            Object obj = (tt1) objArr[i2];
            if (!((i73) obj).j.h) {
                mc2.y("visitChildren called on an unattached node");
            }
            rb3 rb3Var2 = new rb3(new i73[16]);
            i73 i73Var = ((i73) obj).j;
            i73 i73Var2 = i73Var.w;
            if (i73Var2 == null) {
                k33.o(rb3Var2, i73Var);
            } else {
                rb3Var2.y(i73Var2);
            }
            while (true) {
                int i3 = rb3Var2.a;
                if (i3 == 0) {
                    break;
                }
                i73 i73VarQ = (i73) rb3Var2.w(i3 - 1);
                if ((i73VarQ.m & 1024) == 0) {
                    k33.o(rb3Var2, i73VarQ);
                } else {
                    while (i73VarQ != null) {
                        if ((i73VarQ.a & 1024) != 0) {
                            rb3 rb3Var3 = null;
                            while (i73VarQ != null) {
                                if (i73VarQ instanceof cu1) {
                                    if (((cu1) i73VarQ).Y0(7)) {
                                        break;
                                    }
                                } else if ((i73VarQ.a & 1024) != 0 && (i73VarQ instanceof p41)) {
                                    int i4 = 0;
                                    for (i73 i73Var3 = ((p41) i73VarQ).f; i73Var3 != null; i73Var3 = i73Var3.w) {
                                        if ((i73Var3.a & 1024) != 0) {
                                            i4++;
                                            if (i4 == 1) {
                                                i73VarQ = i73Var3;
                                            } else {
                                                if (rb3Var3 == null) {
                                                    rb3Var3 = new rb3(new i73[16]);
                                                }
                                                if (i73VarQ != null) {
                                                    rb3Var3.y(i73VarQ);
                                                    i73VarQ = null;
                                                }
                                                rb3Var3.y(i73Var3);
                                            }
                                        }
                                    }
                                    if (i4 == 1) {
                                    }
                                }
                                i73VarQ = k33.Q(rb3Var3);
                            }
                            break;
                        }
                        i73VarQ = i73VarQ.w;
                    }
                }
            }
        }
    }
}
