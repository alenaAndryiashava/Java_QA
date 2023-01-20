package referencebasics;

public class WindowType {
    public static final String GLASS = "GLASS";
    public static final String DOUBLE_GLASS = "DOUBLE_GLASS";
    public static final String STEKLOPAKET = "STEKLOPAKET";

    private String typeName;

    public WindowType(String typeName) {
        verifyTypeName(typeName);
        this.typeName = typeName;
    }

    public String getTypeName() {
        return typeName;
    }

    public static void verifyTypeName(String typeName) {
        if (!(typeName.equals(GLASS) ||
                typeName.equals(DOUBLE_GLASS) ||
                typeName.equals(STEKLOPAKET)
        )){
            throw new IllegalArgumentException("Unsupported type" + typeName);
        }
    }
}
