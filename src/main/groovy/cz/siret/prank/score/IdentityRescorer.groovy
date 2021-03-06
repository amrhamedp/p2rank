package cz.siret.prank.score


import cz.siret.prank.domain.Pocket
import cz.siret.prank.domain.Prediction
import cz.siret.prank.features.api.ProcessedItemContext

/**
 * keeps the original order (useful for analysis of results of methods)
 */
class IdentityRescorer extends PocketRescorer {


    @Override
    void rescorePockets(Prediction prediction, ProcessedItemContext context) {

        int invrank = prediction.pockets.size()
        prediction.pockets.each { Pocket pocket ->
            // some pocket types may not have pocket.score available, so scoring with inverse rank
            pocket.newScore = invrank--
        }

    }

}