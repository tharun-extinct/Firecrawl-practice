package defpackage;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v19 c33[], still in use, count: 1, list:
  (r0v19 c33[]) from 0x0121: CONSTRUCTOR (r0v19 c33[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] (LINE:290) call: jk1.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
/* JADX INFO: loaded from: classes.dex */
public final class c33 {
    t("NONE"),
    a("KEYBOARD_ARROW_LEFT"),
    m("KEYBOARD_ARROW_RIGHT"),
    q("KEYBOARD_ARROW_UP"),
    w("KEYBOARD_ARROW_DOWN"),
    c("FAST_FORWARD"),
    i("FAST_REWIND"),
    b("SKIP_NEXT"),
    s("SKIP_PREVIOUS"),
    p("VOLUME_UP"),
    u("VOLUME_DOWN"),
    z("VOLUME_MUTE"),
    /* JADX INFO: Fake field, exist only in values array */
    EF13("PLAY_ARROW"),
    h("PERSONAL_VIDEO"),
    o("MIC"),
    f("KEYBOARD"),
    k("POWER"),
    d("FULLSCREEN"),
    e("PLAY_PAUSE");

    public static final /* synthetic */ jk1 B;
    public final int j;

    static {
        B = new jk1(c33VarArr);
    }

    public c33(String str) {
        super(str, i);
        this.j = i;
    }

    public static c33 valueOf(String str) {
        return (c33) Enum.valueOf(c33.class, str);
    }

    public static c33[] values() {
        return (c33[]) A.clone();
    }
}
