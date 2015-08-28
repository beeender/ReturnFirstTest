package oo.xxx.returnfirst;

import io.realm.RealmObject;

/**
 * Created by cc on 8/28/15.
 */
public class Model extends RealmObject {
    private int i;

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }
}
