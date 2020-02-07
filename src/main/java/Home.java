import java.util.ArrayList;
import java.util.List;
public class Home {
    List<Animal> list = new ArrayList<>();
    public void AdoptPet(Animal animal){
        list.add(animal);
    }
    public void makeAllSounds(){
         /*for(int i=0; i<=list.size(); i++){
                for(int )
         }*/
        for(Animal l : list){
            l.sound();
        }
    }

}