package singleton;

/**
 * Created by daniel.gherasim on 11/6/2015.
 */
public enum print {
    INSTANCE;
    private print(){

    }
    public static print printToConsole(){System.out.println();
        return INSTANCE;
    }

}
