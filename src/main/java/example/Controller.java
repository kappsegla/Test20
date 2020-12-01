package example;

//Communication based testing
class Controller {

    private final EmailGateway emailGateway;

    public Controller(EmailGateway emailGateway) {
        this.emailGateway = emailGateway;
    }

    public void GreetUser(String adress) {
        emailGateway.sendGreetingsEmail(adress);
    }
}
