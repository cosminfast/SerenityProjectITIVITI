package org.fasttrackit.features;

import org.junit.Test;

public class SearchTest extends BaseTest{


    @Test
    public void searchForKeywordTest(){
        searchSteps.searchForKeyword("necklace");
        searchSteps.findElementInList("SILVER DESERT NECKLACE");

    }
    @Test
    public void searchForNonExistingProducts(){
        searchSteps.searchForKeyword("shirt");
        searchSteps.checkProductIsNotInList("SILVER DESERT NECKLACE");

    }
}
