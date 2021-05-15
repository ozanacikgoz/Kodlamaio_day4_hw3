package Abstract;

import Entities.Campaign;
import Entities.Game;
import Entities.Gamer;

public interface GameSaleService {
    void saleGame(Game game, Gamer gamer);
    void saleGameCampaign(Game game, Gamer gamer, Campaign campaign);
}
