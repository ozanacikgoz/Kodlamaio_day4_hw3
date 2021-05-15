package Concrete;

import Abstract.GamerCheckService;
import Entities.Gamer;
public class GamerCheckManager implements GamerCheckService {

    @Override
    public boolean checkIfValid(Gamer gamer) {
        if (gamer.getId() == 1234) {
            return true;
        }
        else {
            return false;
        }
    }
}
