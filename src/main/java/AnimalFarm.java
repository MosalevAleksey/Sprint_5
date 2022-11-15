import java.util.ArrayList;
import java.util.HashMap;

public class AnimalFarm {
    public AnimalFarm(ArrayList<String> farmAnimals) {
        this.farmAnimals = farmAnimals;
    }

    public ArrayList<String> farmAnimals;

    public HashMap<String, ArrayList<String>> countedAnimals(ArrayList<String> farmAnimals) {
        HashMap<String, ArrayList<String>> animal1 = new HashMap<String, ArrayList<String>();
        for (String anim : farmAnimals) {
            String[] split = anim.split(" ");
            ArrayList<String> catname = new ArrayList<>();
            ArrayList<String> dogname = new ArrayList<>();
            ArrayList<String> horsename = new ArrayList<>();
            ArrayList<String> cowname = new ArrayList<>();
            //проверяем заполнен ли HashMap  и если есть ключ добовляем значение
            if (animal1.isEmpty()) {
                if (animal1.containsKey(split[0])) {
                    switch (split[0].toUpperCase()) {
                        case "CAT":
                            catname.add(split[1]);
                            break;
                        case "DOG":
                            dognameqq.add(split[1]);
                            break;
                        case "HORSE":
                            horsename.add(split[1]);
                            break;
                        case "COW":
                            cowname.add(split[1]);
                            break;
                    }
                } else {// заполняем hasmap новыми значениями
                    switch (split[0].toUpperCase()) {
                        case "CAT":
                            catname.add(split[1]);
                            animal1.put(split[0], catname);
                            break;
                        case "DOG":
                            dogname.add(split[1]);
                            animal1.put(split[0], dogname);
                            break;
                        case "HORSE":
                            horsename.add(split[1]);
                            animal1.put(split[0], horsename);
                            break;
                        case "COW":
                            cowname.add(split[1]);
                            animal1.put(split[0], cowname);
                            break;
                        default:
                            System.out.println("Please correct string [" + split[0] + "] Incorrect input data.");
                    }
                }
            }
        }
        return animal1;
    }

    public ArrayList<String> uniqueNames(ArrayList<String> farmAnimals) {
        ArrayList<String> animal2 = new ArrayList<>();
        for (String anim : farmAnimals) {

            String[] split = anim.split(" ");
            if (split[1] == null) {
                System.out.println("Please correct string [" + anim + "] Incorrect input data.");
            } else if (!animal2.contains(split[1])) {
                animal2.add(split[1]);
            }
        }
        return animal2;
    }
    public void addAnimalByVidAndName(String vid, String name){
        StringBuilder sb = new StringBuilder();
        sb.append(vid);
        sb.append(" ");
        sb.append(name);
        this.farmAnimals.add(sb.toString());
    }
    public void addAnimalByVid(String vid){
        StringBuilder sb = new StringBuilder();
        sb.append(vid);
        sb.append(" ");
        sb.append("N");
        this.farmAnimals.add(sb.toString());
    }
    public void addAnimalByName(String name){
        StringBuilder sb = new StringBuilder();
        sb.append("NOT_DEFINED");
        sb.append(" ");
        sb.append(name);
        this.farmAnimals.add(sb.toString());
    }
    // Overriding toString() method of String class
    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (String farmAnimal : farmAnimals) {
            String printFarmAnimal = farmAnimal.replace(" ", ":");
            stringBuilder.append(printFarmAnimal).append("\n");
        }

        return stringBuilder.toString();
    }
    }

