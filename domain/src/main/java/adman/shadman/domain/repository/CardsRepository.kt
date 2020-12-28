package adman.shadman.domain.repository

import adman.shadman.domain.model.CardsModel
import adman.shadman.domain.model.Result

/**
 * This repo is for getting cards from network. we use this
 * in outed layers.
 */
interface CardsRepository {
    suspend fun getCards():Result<CardsModel>
}