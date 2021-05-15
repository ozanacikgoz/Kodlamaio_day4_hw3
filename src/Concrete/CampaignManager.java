package Concrete;

import Abstract.CampaignService;
import Entities.Campaign;

public class CampaignManager implements CampaignService {
    @Override
    public void add(Campaign campaign) {
        System.out.println(campaign.getName() + " is added.");
    }

    @Override
    public void update(Campaign campaign) {
        System.out.println(campaign.getName() + " is updated.");
    }

    @Override
    public void delete(Campaign campaign) {
        System.out.println(campaign.getName() + " is deleted.");
    }
}
