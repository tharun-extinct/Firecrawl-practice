package defpackage;

import java.io.File;

/* JADX INFO: loaded from: classes.dex */
public final class p22 extends kk2 implements my1 {
    public final /* synthetic */ my1 a;
    public final /* synthetic */ byte t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p22(my1 my1Var, byte b) {
        super(0);
        this.t = b;
        this.a = my1Var;
    }

    @Override // defpackage.my1
    public final Object g() {
        byte b = this.t;
        my1 my1Var = this.a;
        switch (b) {
            case 0:
                return my1Var.g();
            default:
                File file = (File) my1Var.g();
                file.getClass();
                String name = file.getName();
                name.getClass();
                int iZ = tx4.Z(name, '.', 0, 6);
                if (!(iZ == -1 ? "" : name.substring(iZ + 1, name.length())).equals("preferences_pb")) {
                    uo1.s(file, " does not match required extension for Preferences file: preferences_pb", "File extension for file: ");
                    return null;
                }
                File absoluteFile = file.getAbsoluteFile();
                absoluteFile.getClass();
                return absoluteFile;
        }
    }
}
