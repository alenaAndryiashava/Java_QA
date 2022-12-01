public class Main {
    public static void main(String[] args) {

        /*Environment qa = new Environment(10,5,"telnet://192.0.2.16:80","QA");
        Environment prod = new Environment(0,10,"https://www.w3.org/Icons/WWW/w3c_main.gif","PROD");
        Environment dev = new Environment(10,5,"foo://example.com:8042/over/there?name=ferret#nose","DEV");


        qa.deploy(0);


        try {
            prod.deploy(0);
        } catch (NotOwnerException e){
            System.out.println("Domeone tried to deploy Prod");
        }

        dev.deploy(1);

        Environment beta = new Environment(10,5,"xyz:c:/abc","BETA");
        beta.deploy(0);

         */


        Environment.createEnvironment(10,5,"telnet://192.0.2.16:80","QA").deploy(1);
        Environment.createEnvironment(10,5,"foo://example.com:8042/over/there?name=ferret#nose","DEV").deploy(1);
        try {
        Environment.createEnvironment(15,45,"https://www.w3.org/Icons/WWW/w3c_main.gif","PROD").deploy(1);
        } catch (NotOwnerException e){
            System.out.println("Domeone tried to deploy Prod");
        }

    }
}