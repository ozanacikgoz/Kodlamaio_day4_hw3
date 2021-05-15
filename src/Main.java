import Concrete.*;
import Entities.Campaign;
import Entities.Game;
import Entities.Gamer;

public class Main {
    public static void main(String[] args) {
        Gamer gamer = new Gamer(1234, "Ozan", "ackgozozan@gmail.com", "testpw");
        GamerManager gamerManager = new GamerManager(new GamerCheckManager());
        gamerManager.add(gamer);

        Game game = new Game(1234,"Battlefield 1", 55);
        GameManager gameManager = new GameManager();
        gameManager.add(game);

        Campaign campaign = new Campaign("Summer is Here Campaign", 10);
        CampaignManager campaignManager = new CampaignManager();
        campaignManager.add(campaign);

        GameSaleManager gameSaleManager = new GameSaleManager();
        gameSaleManager.saleGame(game,gamer);
        gameSaleManager.saleGameCampaign(game,gamer,campaign);
    }
}
