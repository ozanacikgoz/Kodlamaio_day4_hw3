package Concrete;

import Abstract.GamerCheckService;
import Abstract.GamerService;
import Entities.Gamer;

public class GamerManager implements GamerService{
    GamerCheckService gamerCheckService; // dependency injection

    public GamerManager(GamerCheckService gamerCheckService) {
        super();
        this.gamerCheckService = gamerCheckService;
    }

    @Override
    public void add(Gamer gamer) {
        if (gamerCheckService.checkIfValid(gamer)) {
            System.out.println("User with ID: " + gamer.getId() + " is added successfully.");
        }
        else {
            System.out.println("User couldn't added.");
        }
    }

    @Override
    public void delete(Gamer gamer) {
        System.out.println("User is deleted successfully.");
    }

    @Override
    public void update(Gamer gamer) {
        System.out.println("User data is updated successfully.");
    }
}
