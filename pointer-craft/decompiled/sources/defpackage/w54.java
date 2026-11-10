package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class w54 {
    public static String g(lz1 lz1Var) {
        String string = lz1Var.getClass().getGenericInterfaces()[0].toString();
        return string.startsWith("kotlin.jvm.functions.") ? string.substring(21) : string;
    }
}
