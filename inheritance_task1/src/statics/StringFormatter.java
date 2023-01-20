package statics;

public class StringFormatter {
    private String content;

    public StringFormatter(String content) {
        this.content = content;
    }
    public void format(int num){
        for (int i = 0; i < num; i++) {
            System.out.println(content);


        }
    }
    public void format(long num) {
        for (int i = 0; i < num; i++) {
            System.out.println(content);

        }
    }

    public void format(String prefix, int num) {
        System.out.println(prefix);
        for (int i = 0; i < num; i++) {
            System.out.println(content);
        }
    }

    public void format(String prefix, int num, String postfix) {
        System.out.println(prefix);
        for (int i = 0; i < num; i++) {
            System.out.println(content);
        }
            System.out.println(postfix);
    }

    static void  listSupportedFormats(){
        System.out.println("int num");
        System.out.println("long num");
        System.out.println("String prefix, int num");
        System.out.println("String prefix, int num, String postfix");
    }
    static void  listSupportedFormats(int num){
        for (int i = 0; i <num ; i++) {
            listSupportedFormats();
        }
    }

}
