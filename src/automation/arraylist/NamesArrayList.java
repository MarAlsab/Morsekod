package automation.arraylist;

import java.util.ArrayList;

public class NamesArrayList {
    private ArrayList<String> namesArrayList = new ArrayList<>();
    private boolean addMore = true;
    public void addName(String name) {
        if (!name.equals("stop") && addMore){
            namesArrayList.add(name);
        } else addMore = false;
    }

    public String writeNames() {
        String names="";
        for(String name:namesArrayList){
            names=names.concat(name).concat(" ");
        }
        return names.trim();
    }

    public void rename(int i, String name) {
        namesArrayList.set(i, name);
    }

    public void replaceFirstAndLast() {
        String firstName = namesArrayList.get(0);
        String lastName = namesArrayList.get(namesArrayList.size()-1);
        rename(0,lastName);
        rename(namesArrayList.size()-1,firstName );
    }
}
