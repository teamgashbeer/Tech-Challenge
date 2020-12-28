package adman.shadman.domain.interaction

import adman.shadman.domain.base.BaseUseCase
import adman.shadman.domain.model.CardsModel
import adman.shadman.domain.model.Result
import adman.shadman.domain.repository.CardsRepository

class CardsUseCaseImpl(val cardsRepository: CardsRepository)
    :CardsUseCase{
    override suspend fun invoke(params: Map<String, String>)=cardsRepository.getCards()

}