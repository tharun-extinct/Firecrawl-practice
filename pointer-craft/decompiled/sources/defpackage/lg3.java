package defpackage;

import android.util.SparseArray;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r1v0 lg3, still in use, count: 1, list:
  (r1v0 lg3) from 0x00df: INVOKE (r0v13 android.util.SparseArray), (0 int), (r1v0 lg3) VIRTUAL call: android.util.SparseArray.put(int, java.lang.Object):void A[MD:(int, E):void (c)] (LINE:224)
	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes2.dex */
public final class lg3 {
    /* JADX INFO: Fake field, exist only in values array */
    EF1("MOBILE"),
    /* JADX INFO: Fake field, exist only in values array */
    EF2("WIFI"),
    /* JADX INFO: Fake field, exist only in values array */
    EF3("MOBILE_MMS"),
    /* JADX INFO: Fake field, exist only in values array */
    EF4("MOBILE_SUPL"),
    /* JADX INFO: Fake field, exist only in values array */
    EF5("MOBILE_DUN"),
    /* JADX INFO: Fake field, exist only in values array */
    EF6("MOBILE_HIPRI"),
    /* JADX INFO: Fake field, exist only in values array */
    EF7("WIMAX"),
    /* JADX INFO: Fake field, exist only in values array */
    EF8("BLUETOOTH"),
    /* JADX INFO: Fake field, exist only in values array */
    EF9("DUMMY"),
    /* JADX INFO: Fake field, exist only in values array */
    EF10("ETHERNET"),
    /* JADX INFO: Fake field, exist only in values array */
    EF11("MOBILE_FOTA"),
    /* JADX INFO: Fake field, exist only in values array */
    EF12("MOBILE_IMS"),
    /* JADX INFO: Fake field, exist only in values array */
    EF13("MOBILE_CBS"),
    /* JADX INFO: Fake field, exist only in values array */
    EF14("WIFI_P2P"),
    /* JADX INFO: Fake field, exist only in values array */
    EF15("MOBILE_IA"),
    /* JADX INFO: Fake field, exist only in values array */
    EF1("MOBILE_EMERGENCY"),
    /* JADX INFO: Fake field, exist only in values array */
    EF2("PROXY"),
    /* JADX INFO: Fake field, exist only in values array */
    EF1("VPN"),
    t("NONE");

    public static final SparseArray a;
    public final int j;

    static {
        lg3 lg3Var = t;
        SparseArray sparseArray = new SparseArray();
        a = sparseArray;
        sparseArray.put(0, lg3Var);
        sparseArray.put(1, lg3Var);
        sparseArray.put(2, lg3Var);
        sparseArray.put(3, lg3Var);
        sparseArray.put(4, lg3Var);
        sparseArray.put(5, lg3Var);
        sparseArray.put(6, lg3Var);
        sparseArray.put(7, lg3Var);
        sparseArray.put(8, lg3Var);
        sparseArray.put(9, lg3Var);
        sparseArray.put(10, lg3Var);
        sparseArray.put(11, lg3Var);
        sparseArray.put(12, lg3Var);
        sparseArray.put(13, lg3Var);
        sparseArray.put(14, lg3Var);
        sparseArray.put(15, lg3Var);
        sparseArray.put(16, lg3Var);
        sparseArray.put(17, lg3Var);
        sparseArray.put(-1, lg3Var);
    }

    public lg3(String str) {
        super(str, i);
        this.j = i;
    }

    public static lg3 g(int i) {
        return (lg3) a.get(i);
    }

    public static lg3 valueOf(String str) {
        return (lg3) Enum.valueOf(lg3.class, str);
    }

    public static lg3[] values() {
        return (lg3[]) m.clone();
    }

    public final int y() {
        return this.j;
    }
}
