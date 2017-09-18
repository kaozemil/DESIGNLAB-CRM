package com.company;

/**
 * Created by Emil on 2017-09-15.
 */
public class ResearchFacade {
    CostumerFinanceResearch costumerFinanceResearch = new CostumerFinanceResearch();
    CostumerSocialMediaResearch costumerSocialMediaResearch = new CostumerSocialMediaResearch();
    CostumerWeatherResearch costumerWeatherResearch = new CostumerWeatherResearch();
    Costumer costumer;

    public ResearchFacade(Costumer costumer){
        this.costumer = costumer;
        //ResearchCostumer(costumer);
    }

    public void ResearchCostumer(Costumer costumer){
        costumerFinanceResearch.financialRating(costumer.getId());
        costumerSocialMediaResearch.currentSocialMediaSummary(costumer.getId());
        costumerWeatherResearch.currentWeatherSummary(costumer.getLatitude(), costumer.getLongitude());
        //todo:Return some research view?
    }

}
