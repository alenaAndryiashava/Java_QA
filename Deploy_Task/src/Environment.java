import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.ToDoubleBiFunction;

/*Создать класс Environment
Класс должен содержать поля lastDeployTime (в милисекундах),
 upDuration (в милисекундах),
 currentUri, type в виде строк, геттеры

Класс должен содержать метод deploy(String version).
Метод обновляет текущую версию, lastDeployTime, и обнуляет upDuration,
и печатает сообщение, что новая версия успешно задеплоена.
Если текущий environment "PROD", то метод бросает исключение.
Можно создать свой класс проверяемого исключение или использовать NotOwnerException.

Поле type не может меняться после создания класса

Класс должен содержать статический метод listEnvs(),
который возвращает массив строк "QA", "PROD", "DEV".
Каждая строка является константой в данном классе.
Константой - это значит, что значение принадлежит классу, общедоступно и его нельзя поменять

 */
public class Environment {
    private static final String QA = "QA";
    private static final String PROD = "PROD";
    private static final String DEV = "DEV";
    private static final List<String> ENVS = Arrays.asList(QA, PROD, DEV);
    private int lastDeployTime;
    private int upDuration;
    private  String currentUri;
    private  final String type;

   private Environment(int lastDeployTime, int upDuration, String currentUri, String type) {
        this.lastDeployTime = lastDeployTime;
        this.upDuration = upDuration;
        this.currentUri = currentUri;
        this.type = type;
        if(!ENVS.contains(type)) {
            throw new RuntimeException("No such environment:" + type);
        }
    }

    public int getLastDeployTime() {
        return lastDeployTime;
    }

    public int getUpDuration() {
        return upDuration;
    }

    public String getCurrentUri() {
        return currentUri;
    }

    public String getType() {
        return type;
    }

    public void deploy(final int version){
        if(type.equals(PROD)) {
            throw new NotOwnerException();
        }
        lastDeployTime += upDuration;
        upDuration = 0;
        System.out.println("новая версия " + " " + (version + 1) + " успешно задеплоена");

    }

    public static List <String> listEnvs(){
        return ENVS;
    }
    static Environment createEnvironment(int lastDeployTime, int upDuration, String currentUri, String type){
         return new Environment(lastDeployTime,upDuration,currentUri,type);
    }
    // TODO: Если поле type не равно одной из констант, который возвращает метод listEnvs(),
    //  то метод бросает исключение. Можно создать свой класс исключения или использовать
    //  IllegalArgumentException.



}
