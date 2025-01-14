package automation.oopC;

public class CSubClass extends C{
    private String cscText;
    CSubClass() {
        System.out.println("Detta skriv ut vid objekt skapande");
    }

    CSubClass(String cscText){
        System.out.println("Detta skriv bara om du har en parametre in");
        this.cscText= cscText;
    }

    public String getCscText() {
        return cscText;
    }

    public void setCscText(String cscText) {
        this.cscText = cscText;
    }

}
