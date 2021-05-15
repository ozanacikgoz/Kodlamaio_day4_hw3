package Concrete;

import Abstract.GameSaleService;
import Entities.Campaign;
import Entities.Game;
import Entities.Gamer;

public class GameSaleManager implements GameSaleService {

    @Override
    public void saleGame(Game game, Gamer gamer) {
        System.out.println("Gamer with name: " + gamer.getName() + " bought the game " + game.getName() + " to " + game.getPrice() + "TL.");
    }

    @Override
    public void saleGameCampaign(Game game, Gamer gamer, Campaign campaign) {
        double price = (game.getPrice() - game.getPrice() / campaign.getDiscountPercent());
        System.out.println("Gamer with name: " + gamer.getName() + " bought the game " + game.getName() + " with discounted price to " + price + "TL.");
    }
}
