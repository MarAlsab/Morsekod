package automation.oopA;

public class AClass {
    // String text;
    private String textPrivate;
    public String textPublic;

    public AClass() {
        // this.text= "Detta är en text";
        // this.textPrivate = "Detta är klassen private text";
        this.setTextPrivate("Detta är klassen private text");
        this.textPublic = "Detta är en Public text";
    }

    public String getTextPrivate() {
        return textPrivate;
    }

    public void setTextPrivate(String textPrivate) {
        if (!textPrivate.contains("ö"))
            this.textPrivate = textPrivate;
    }

}
